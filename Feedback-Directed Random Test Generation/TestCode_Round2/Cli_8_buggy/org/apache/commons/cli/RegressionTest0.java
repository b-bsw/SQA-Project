package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_SYNTAX_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "usage: " + "'", str0, "usage: ");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_DESC_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LEFT_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_ARG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg" + "'", str0, "arg");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "usage: ", options3, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.io.PrintWriter printWriter1 = null;
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter1, (int) '4', "arg", options4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter2 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter2, (int) (short) 1, "--", "--", options6, (int) (short) 100, (int) (byte) -1, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "arg", "", options6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.Class<?> wildcardClass5 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options8, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, (int) (short) 1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "arg", options7, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "\n", options7, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderOptions(stringBuffer5, (int) (short) 100, options7, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "\n", "", options9, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter3, (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "arg", "", options9, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, 3, options8, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (-1), 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) 'a', (int) (byte) 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--" + "'", str0, "--");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) '4', 1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, (int) ' ', (int) (short) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, (int) (byte) -1, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "-", options8, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "                                                                                                 ", "arg", options12, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter2, (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) (byte) 100, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter5, (-1), options7, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "--", "\n", options8, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, 10, options8, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 3, "", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) '#', "                                                                                                 ", "\n", options10, (int) (short) 100, (int) (short) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) '#', (int) (short) 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "          ", "-", options19, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) '#', "arg", "arg", options12, (int) (short) 1, (int) (byte) 100, "", false);
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, 100, "          ", options11);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (byte) 0, "usage: ", "--", options11, (int) (short) 100, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderOptions(stringBuffer4, (int) (short) 10, options6, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, 0, "                                                                                                 ", "          ", options10, 10, (int) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (byte) 1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (byte) 10, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "--", "hi!", options10, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 0, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) '4', "-", "                                                                                                 ", options14, 0, (int) (short) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "", "--", options8, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (short) -1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "-", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(74);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 3, "                                                                                                 ", options16);
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "", options7, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.Class<?> wildcardClass5 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 3, "--", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, (int) (byte) 10, "-", "--", options8, (int) (byte) 100, (int) (short) 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        int int12 = helpFormatter0.findWrapPos("usage: ", (int) (short) 0, 3);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "", options15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter3, 97, "usage: ", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "", "hi!", options8, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) (short) 0, options11, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                          ", "\n", options14, "arg");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, (int) (byte) 100, options8, 0, 10);
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options13, true);
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(6, "", "", options12, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "                                                                          ", "\n", options14, "hi!");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) ' ', "arg", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 1, options16, (int) (short) 1, 74);
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "--", options7, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "\n", options7, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (short) 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 1, options12, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 1, 32, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, (int) '4', (int) (byte) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass6 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 0, options16, (int) 'a', (int) (short) 100);
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.Class<?> wildcardClass6 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, (int) (short) 0, "", "", options8, (int) (byte) -1, 6, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "                                                                                                 ", options10, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (int) (byte) 1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "                                                                                                 ", "hi!", options14, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (byte) 0, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 10, "                                                                                                 ");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str11 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) ' ', options14, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 100;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "", options8, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                                                          ", options10, "");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) '4', 6, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, (int) (byte) 10, options8, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "          ", options7, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, 74, options8, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, 1, 74, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "          ", options6, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass4 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, 100, options10, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("arg");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 100, options14, 74, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, 0, (int) (short) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) '4', "          ", "usage: ", options11, (int) (short) 10, 100, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) (byte) 100, options12, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (short) 1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 6, "\n", "-", options14, 6, (int) '4', "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, (int) (short) 0, (int) (short) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 0, "                                ");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultWidth = 97;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "-", " ", options12, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 3, "                                                                          ", "                                                                          ", options15, 0, (int) (byte) 1, "", true);
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "usage: ", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) 'a', "", "\n", options14, (int) 'a', (int) '4', "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, (-1), 32, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options7, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter2, 100, (-1), "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        java.lang.String str7 = helpFormatter0.rtrim("usage: ");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "usage: ", "                                ", options11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                                                                                 ", options14, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (short) -1, (int) (byte) 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (-1), "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter5, (int) ' ', options7, 6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = helpFormatter0.renderWrappedText(stringBuffer4, 97, 6, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (int) '4', "", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "-", options9, "arg");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) ' ', 100, "                                                                                                 ");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int13 = helpFormatter0.findWrapPos("", (int) (byte) 0, (int) '#');
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) ' ', options16, 0, 74);
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "                                                                                                 ", "                                                                                                 ", options17, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 10);
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, (int) (byte) 0, options15, 97, (int) '4');
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                          ", options12, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (short) 0, " ", "hi!", options19, 0, 35, "usage:");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) 'a', "          ", options9);
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (short) -1, "", options19);
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 32, options11, 100, 0);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (-1), "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 74, options11, 6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "\n";
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (short) -1, "-", "usage:", options11, 74, (int) (byte) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) 'a', 97, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "usage: ", options8, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter2, 3, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter3, (int) (byte) 1, "\n", "          ", options7, (int) (short) 100, 32, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) -1, "                                                                                                    ", "                                                                                                 ", options15, (int) (short) 1, (int) '4', "arg", false);
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass6 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 35, 100, "usage:");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setOptPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "--", "                                                                                                 ", options19, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 6, "                                                                                                    ", "                                                                                                 ", options13, (int) (byte) 0, (int) ' ', "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setDescPadding(74);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 0, 3, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                ", options17, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 35, options14, 35, (int) (byte) 100);
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "usage: ", "usage: ", options11, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", " ", options10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter3, (int) (byte) 10, options5, (int) (byte) 0, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        helpFormatter0.setDescPadding(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (int) (byte) 1, "arg", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = helpFormatter0.findWrapPos("                                                                          ", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = helpFormatter0.renderWrappedText(stringBuffer4, 100, 10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setArgName("");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) ' ', "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setOptPrefix("usage:");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) (byte) 100, "--", "\n", options9, 0, (int) (short) 100, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderWrappedText(stringBuffer5, 35, (int) 'a', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "                                                                          ", "-", options24, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (-1);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 1, "\n", "arg", options17, 35, (int) (short) 1, "hi!");
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", " ", options8, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) (short) 100, "                                                                                                 ", "", options10, (int) (byte) 1, 3, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 10, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter3, (int) (short) 0, "                                                                          ", "usage: ", options7, 32, (int) (byte) 10, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
            helpFormatter0.printHelp("                                                                                                 ", "--", options18, "                                                                                                 ");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options14);
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (byte) 0, " ");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "--";
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.setArgName("                                                                          ");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (short) 1, (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) 'a', options10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultWidth = 97;
        int int9 = helpFormatter0.getWidth();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 0, options12, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                                                 ", "          ", options13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 0, 6, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 35, options11, (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, (int) (byte) 1, (int) (byte) -1, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str11 = helpFormatter0.rtrim("                                                                          ");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 6, "--");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, (int) (byte) 100, (int) '#', "                                                                                                 ");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 6, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setDescPadding(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, 74, "                                                                                                 ", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 10, options18, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setArgName("");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) '#', (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 32, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "arg", " ", options10, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, (int) '4', options20, 10, 1);
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        int int12 = helpFormatter0.findWrapPos("usage: ", (int) (short) 0, 3);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) 'a', 1, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) (byte) -1, (-1), "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                " + "'", str10, "                                ");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, (int) (byte) -1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "hi!", "          ", options10, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "arg", options20, "");
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                          ");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, (int) (short) 1, (int) (short) -1, "-");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 97;
        helpFormatter0.defaultDescPad = 0;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                                                                                 ", options17, "                                                                                                    ", true);
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "\n", "          ", options9, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 74, " ");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) -1);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (byte) 0, "usage:", options14);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderOptions(stringBuffer5, 35, options7, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "arg", "usage:", options13, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", " ", options12, "                                                                                                 ");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "--", options7, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setWidth((-1));
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 10, 0, "-");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, 10, "-", "\n", options8, 10, (int) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "--";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                                                          ", options14, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", " ", options10, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(74);
        helpFormatter0.setOptPrefix("arg");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 97, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (short) 10;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "hi!", "          ", options12, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.defaultArgName = "\n";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (-1), "                                                                                                 ", "", options22, (int) (short) -1, (-1), " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int13 = helpFormatter0.findWrapPos("", (int) (byte) 0, (int) '#');
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 10, "-", options17);
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) 0, "arg", "usage:", options15, 10, 74, "", true);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, 6, options9, (int) 'a', 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, 0, options8, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "\n", "                                                                                                 ", options10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options12);
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 0, (int) (byte) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultOptPrefix = "usage: ";
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "\n", " ", options10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, (int) (short) 100, (int) (short) -1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "arg", "hi!", options21, " ");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "arg", "", options9, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setLongOptPrefix("usage: ");
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (short) 1, "-");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) (byte) 1, "--", "arg", options19, (int) (short) 0, 10, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 32, "arg", options21);
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
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "", "\n", options14, "\n");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, 97, options19, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str14 = helpFormatter0.rtrim("");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) (byte) 0, "-", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.setSyntaxPrefix(" ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "", options13, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, 1, "hi!", "hi!", options9, (int) (short) 10, 32, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                                                 ", "--", options22, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, " ", " ", options10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = " ";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (short) 100, 6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter21, 0, options23, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.StringBuffer stringBuffer21 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = helpFormatter0.renderOptions(stringBuffer21, 1, options23, (int) '4', 97);
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, 0, "                                                                          ", "                                                                                                 ", options19, (int) (short) 100, 3, "                                                                                                 ", false);
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = " ";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) (byte) 100, options12, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.setNewLine("usage: ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "", options12, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 3, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultDescPad = 100;
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setLeftPadding(32);
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "-", options13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        int int2 = helpFormatter0.defaultWidth;
        java.lang.String str3 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderWrappedText(stringBuffer5, (int) (byte) -1, (int) (byte) 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, (int) (byte) 1, options10, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, (int) (byte) 10, options19, (int) (byte) 0, (-1));
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setWidth(3);
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 74, options11, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultWidth = 97;
        int int9 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) ' ', "                                                                                                    ", "--", options15, 6, (int) (byte) 1, "usage: ");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, (int) (short) 100, options18, 0, 35);
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "hi!", options5, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) (short) 100, "          ", "                                ", options16, (int) (short) 0, 10, " ");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "usage:", options9, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = " ";
        helpFormatter0.defaultWidth = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (short) 0, (-1), "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 1;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 97, "", "arg", options15, 100, (int) (byte) 100, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) '4', (-1), "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 0, options11, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (byte) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) '#', 10, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultNewLine;
        int int2 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = helpFormatter0.renderOptions(stringBuffer3, 32, options5, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultWidth = 97;
        int int9 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 100, options12, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.defaultWidth = ' ';
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options13, false);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (short) 10, (int) 'a', "usage: ");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, (int) ' ', options15, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, (int) ' ', options12, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        java.lang.Class<?> wildcardClass21 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setArgName("");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (short) 0, "                                                    ", "                                                                          ", options17, (int) (byte) 1, 0, "                                                                                                 ", false);
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                                                                                    ", options9, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "usage:", "--", options10, "                                ");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "--", options9, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "hi!", "                                                    ", options10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
            helpFormatter0.printWrapped(printWriter11, (int) (short) 1, (int) (short) 100, "                                                                                                    ");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 1, "usage: ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 1, (-1), "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding((int) (short) 1);
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "-", options20, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                    " + "'", str14, "                                                                                                    ");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        helpFormatter0.setLongOptPrefix(" ");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (short) 100, options14, (int) (byte) 0, (int) (short) 1);
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (byte) -1, (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "", options18, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 0;
        int int12 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 35, options15, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 3, " ");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
            helpFormatter0.printHelp("                                                                                                    ", "arg", options14, "\n");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, (int) (short) -1, options21, (int) (short) 0, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "          ", " ", options11, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(10);
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage: ", options18, "");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setArgName("                                                    ");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 3, options14, 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultNewLine = "--";
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, 6, (int) 'a', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "usage:", options9, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (-1), "arg", "                                                                          ", options21, (int) (byte) 100, 35, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderWrappedText(stringBuffer5, (int) ' ', (int) (short) 10, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderOptions(stringBuffer6, (-1), options8, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str13 = helpFormatter0.rtrim("                                                    ");
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (short) 100, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (byte) 100, (int) 'a', "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, (int) (byte) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter3, 6, (int) (short) 0, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.lang.String str18 = helpFormatter0.createPadding(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "      " + "'", str18, "      ");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "\n";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage: ", options12, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) '#', options11, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "", options16, "                                                                                                    ", true);
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (short) -1);
        int int7 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, 32, options10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
            helpFormatter0.printUsage(printWriter17, (int) (byte) 1, "-");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, 35, "usage:", "", options10, (int) ' ', 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) 'a', options18, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (short) 10);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (short) -1, 97, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (-1), 3, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.String str17 = helpFormatter0.createPadding((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          " + "'", str17, "          ");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLeftPadding(35);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) '#', options11, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = " ";
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) (short) 1, "", "                                                                          ", options16, (int) (byte) 10, 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = '4';
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) -1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) -1;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, " ", "hi!", options11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options11, true);
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultArgName = "-";
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultDescPad = 10;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) 'a', (int) (byte) 0, "usage: ");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                    ", options17, "      ");
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) 'a', (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("arg");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (-1), "                                ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.createPadding((int) 'a');
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 35, "-", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 " + "'", str8, "                                                                                                 ");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("          ", 10, 100);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (byte) 10, (int) (byte) -1, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = helpFormatter0.findWrapPos("--", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "-", options11, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "--";
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setArgName("      ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderWrappedText(stringBuffer16, 0, (int) (byte) 10, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("          ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "arg", options10, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, (int) (short) -1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderOptions(stringBuffer16, 0, options18, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "                                                                                                    ", options7, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        helpFormatter0.setLeftPadding(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                                                          ", options23, "arg", false);
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
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) (short) 10, "                                ");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass2 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, (int) (short) 100, options11, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, (int) (byte) 10, 32, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 3, "--", "hi!", options13, 32, (int) (byte) 10, "\n", false);
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) (short) 10, "          ", "--", options9, (int) (byte) 0, 3, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultArgName = "arg";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, (int) 'a', (int) (byte) 1, "usage: ");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "          ", "usage: ", options14, "                                                    ", false);
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "", options13, "\n");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, 100, (int) 'a', "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(74);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "\n", "-", options9, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
            helpFormatter0.printHelp(printWriter11, 32, "          ", " ", options15, (-1), (int) (byte) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, (int) (short) -1, options17, 0, 0);
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(97, "                                                    ", "--", options16, "");
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int6 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 10;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                                                          ", "", options11, "      ", false);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("          ");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter5, (int) (byte) 0, options7, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.createPadding(1);
        helpFormatter0.setDescPadding((-1));
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) ' ', 35, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderOptions(stringBuffer5, 32, options7, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "                                                                                                 ", options9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = " ";
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "      ", options11, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, (int) (byte) 10, "usage: ", "                                ", options23, (int) (short) 0, (int) (byte) 10, "--");
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
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultDescPad = 35;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "", options14, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, (-1));
        helpFormatter0.setLeftPadding((int) '4');
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, (int) '#', options16, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str10 = helpFormatter0.createPadding(32);
        helpFormatter0.setLeftPadding((int) (byte) 1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options14, true);
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        helpFormatter0.setArgName("                                                                          ");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                                                          ", options11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLongOptPrefix("\n");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 0, 32, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "          ", "hi!", options19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "                                                                                                    ", options17, "                                ", false);
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "\n", options11, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getDescPadding();
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        int int2 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "usage: ";
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, (int) (byte) 100, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options17, false);
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) (short) -1, options18, 3, 0);
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (short) 1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = " ";
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.createPadding((int) (byte) 0);
        helpFormatter0.defaultArgName = "usage: ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, (int) (byte) 0, options16, 3, (int) (short) 1);
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
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) ' ', (int) (byte) 0, "\n");
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
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "hi!";
        helpFormatter0.defaultLeftPad = 32;
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str13 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, (int) ' ', (int) (byte) 100, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "          ", "", options9, "", false);
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 0;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 100, options14, (int) (short) 0, 100);
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = ' ';
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 10, (int) (short) 0, "");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        int int3 = helpFormatter0.defaultDescPad;
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setNewLine("arg");
        helpFormatter0.defaultLeftPad = (byte) -1;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "\n", options13, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, (int) (byte) 1, options17, 97, 6);
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.findWrapPos("--", (int) (short) 100, (int) (byte) 1);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "          ", options13, "--");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, (int) '4', 0, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultNewLine = "hi!";
        int int9 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (-1), "--", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                                                                                    ", options8, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str9 = helpFormatter0.rtrim("-");
        helpFormatter0.defaultDescPad = 10;
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter11, (int) (byte) 0, options13, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setNewLine("");
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (byte) 100, "usage: ", "", options13, (int) (byte) 0, (int) (byte) 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) '4', options11, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                    ";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "          ", "hi!", options14, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(6);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultWidth = 0;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        int int12 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        int int10 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                                                                                 ", "arg", options21, "usage:");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) '4', "hi!", "", options13, (int) (short) -1, 74, "usage:");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "--", "      ", options21, "                                                                                                    ");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultArgName = "--";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("                                                                                                    ");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "                                                                          ", "--", options11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.defaultDescPad = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str10 = helpFormatter0.rtrim("                                ");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 74, "                                                                                                 ", "                                ", options15, (int) '4', 97, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 6, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) (byte) 10, options12, (int) (short) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (-1);
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (short) 100, "      ", "", options13, 10, (int) (short) 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.findWrapPos("usage: ", 1, (int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 97, 10, "usage:");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (short) 0, (int) '#');
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) 'a', "                                ", "", options14, 0, 0, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding((int) (short) 1);
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 74, options13, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) 'a', "arg", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "-", "usage: ", options18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(97);
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, (int) (byte) -1, (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter4, 0, (int) (byte) 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLongOptPrefix("");
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 97, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setLongOptPrefix("--");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 32, options12, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        java.lang.String str4 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultOptPrefix = "-";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "hi!", options9, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        int int6 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "\n", "hi!", options10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.findWrapPos("-", (int) (byte) -1, (int) (short) 100);
        helpFormatter0.defaultDescPad = (byte) 100;
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setWidth((int) '4');
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultNewLine = "arg";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "\n", options20, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultNewLine = "-";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 100, (int) ' ', "arg");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
            helpFormatter0.printWrapped(printWriter13, (int) (byte) 0, 35, "                                                                                                    ");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "usage: ", options9, "--", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) (short) 10, "");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.createPadding(10);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (short) 1, "      ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int10 = helpFormatter0.findWrapPos("                                                                                                 ", 0, (int) ' ');
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 6, options14, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "--" + "'", str1, "--");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (byte) 100, "      ", "usage: ", options11, 0, (int) '#', "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        int int7 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "-", "          ", options11, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) (short) -1, "arg", "", options10, 35, 35, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(3);
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "\n", "      ", options14, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "                                                                          ", "                                ", options22, "usage: ", true);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, (int) '#', (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        java.lang.String str8 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) '#', options13, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) '#', "arg", "hi!", options15, 0, 32, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.setLeftPadding((int) 'a');
        int int7 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setSyntaxPrefix("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 'a';
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "arg", options7, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(100);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.rtrim("");
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "hi!", options12, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }
}

