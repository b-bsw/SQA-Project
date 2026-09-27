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
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.currentToken = "";
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.util.List list16 = defaultParser0.expectedOpts;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        defaultParser0.currentToken = "";
        boolean boolean21 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option19 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = option19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNull(option19);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options20, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean19 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.skipParsing = false;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list23 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option20);
        org.junit.Assert.assertNull(list23);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options10, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        boolean boolean10 = defaultParser0.skipParsing;
        java.lang.String str11 = defaultParser0.currentToken;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        defaultParser0.currentToken = "";
        java.lang.Class<?> wildcardClass19 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        boolean boolean5 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine30 = defaultParser0.parse(options21, strArray28, properties29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options19, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = defaultParser0.expectedOpts;
        java.lang.String str15 = defaultParser0.currentToken;
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean18 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options20, strArray27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(options19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "", "", "hi!", "" });
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.String str16 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        boolean boolean21 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        boolean boolean18 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean18 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean16 = defaultParser0.skipParsing;
        java.util.List list17 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.lang.String str6 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        java.lang.String str18 = defaultParser0.currentToken;
        java.lang.String str19 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        boolean boolean13 = defaultParser0.stopAtNonOption;
        boolean boolean14 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        boolean boolean19 = defaultParser0.skipParsing;
        java.lang.String str20 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine21 = null;
        defaultParser0.cmd = commandLine21;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean18 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list21 = null;
        defaultParser0.expectedOpts = list21;
        org.apache.commons.cli.Options options23 = null;
        defaultParser0.options = options23;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options18, strArray25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.skipParsing = false;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.skipParsing = true;
        java.lang.String str18 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option19 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(option19);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options20, strArray23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.skipParsing = false;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options5, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        boolean boolean15 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        java.util.List list18 = defaultParser0.expectedOpts;
        java.lang.String str19 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options20, strArray24, properties25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        java.lang.String str11 = defaultParser0.currentToken;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = null;
        defaultParser0.options = options19;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options20, strArray23, properties24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str16 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options17, strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        java.util.List list20 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list20);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.lang.String str16 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        java.util.List list20 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNull(list20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str10 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.CommandLine commandLine21 = null;
        defaultParser0.cmd = commandLine21;
        java.lang.String str23 = defaultParser0.currentToken;
        java.lang.String str24 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(commandLine25);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = null;
        defaultParser0.currentOption = option1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        java.util.List list21 = null;
        defaultParser0.expectedOpts = list21;
        boolean boolean23 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(option20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine4);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.util.List list14 = defaultParser0.expectedOpts;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.util.List list15 = defaultParser0.expectedOpts;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.skipParsing;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        boolean boolean16 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        java.lang.String str11 = defaultParser0.currentToken;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        boolean boolean18 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options14, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray20, properties21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.util.List list14 = defaultParser0.expectedOpts;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.lang.String str10 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        java.util.List list17 = defaultParser0.expectedOpts;
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        boolean boolean18 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        java.util.List list17 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        boolean boolean5 = defaultParser0.skipParsing;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray20, properties21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = null;
        defaultParser0.currentOption = option1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.skipParsing;
        boolean boolean18 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = commandLine19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(commandLine19);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        java.lang.String str18 = defaultParser0.currentToken;
        boolean boolean19 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        org.apache.commons.cli.Options options22 = null;
        defaultParser0.options = options22;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list12 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options17, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.util.List list13 = defaultParser0.expectedOpts;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.Option option21 = null;
        defaultParser0.currentOption = option21;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        boolean boolean11 = defaultParser0.stopAtNonOption;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.util.List list16 = defaultParser0.expectedOpts;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.apache.commons.cli.Option option19 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list22 = null;
        defaultParser0.expectedOpts = list22;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(option19);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        java.lang.String str2 = defaultParser0.currentToken;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.stopAtNonOption;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.cmd;
        org.apache.commons.cli.Options options21 = null;
        defaultParser0.options = options21;
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine20);
    }
}

