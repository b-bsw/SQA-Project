package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.String str22 = commandLine0.getOptionValue(' ', "");
        java.util.Iterator iterator23 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        boolean boolean17 = commandLine0.hasOption('#');
        java.util.List list18 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('4');
        boolean boolean20 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str20 = commandLine0.getOptionValue('a', "");
        boolean boolean22 = commandLine0.hasOption("hi!");
        java.util.List list23 = commandLine0.getArgList();
        java.util.List list24 = commandLine0.getArgList();
        java.lang.Object obj26 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray28 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean5 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        boolean boolean17 = commandLine0.hasOption(' ');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        boolean boolean21 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        boolean boolean20 = commandLine0.hasOption("hi!");
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str26 = commandLine0.getOptionValue('4', "");
        java.lang.String str29 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.util.List list15 = commandLine0.getArgList();
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String str5 = commandLine0.getOptionValue('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.Object obj6 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        boolean boolean6 = commandLine0.hasOption("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        boolean boolean6 = commandLine0.hasOption("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj20 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj24 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        boolean boolean18 = commandLine0.hasOption('4');
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject(' ');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str2 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        boolean boolean18 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        java.util.List list21 = commandLine0.getArgList();
        boolean boolean23 = commandLine0.hasOption(' ');
        java.lang.String[] strArray25 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue('a', "hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
        java.lang.String str26 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean28 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray29 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionArray29);
        org.junit.Assert.assertArrayEquals(optionArray29, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.util.List list16 = commandLine0.getArgList();
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.lang.String str24 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray28 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.String str18 = commandLine0.getOptionValue('a', "");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.lang.String str23 = commandLine0.getOptionValue("");
        java.lang.Object obj25 = commandLine0.getOptionObject("hi!");
        boolean boolean27 = commandLine0.hasOption("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        java.util.List list22 = commandLine0.getArgList();
        java.lang.String str25 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray26 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        java.lang.String str6 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        boolean boolean16 = commandLine0.hasOption('a');
        commandLine0.addArg("hi!");
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption('4');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray18 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.util.List list21 = commandLine0.getArgList();
        java.util.Iterator iterator22 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str2 = commandLine0.getOptionValue("hi!");
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        boolean boolean22 = commandLine0.hasOption('4');
        java.lang.Object obj24 = commandLine0.getOptionObject('a');
        java.lang.String str26 = commandLine0.getOptionValue("");
        java.lang.String str28 = commandLine0.getOptionValue('a');
        java.lang.String str30 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        boolean boolean16 = commandLine0.hasOption(' ');
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean15 = commandLine0.hasOption('#');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Object obj18 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.util.List list21 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        boolean boolean15 = commandLine0.hasOption("hi!");
        boolean boolean17 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.String str19 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.util.List list17 = commandLine0.getArgList();
        boolean boolean19 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.util.List list17 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String[] strArray20 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray22 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray24 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray25 = commandLine0.getArgs();
        java.lang.String[] strArray27 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray27);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator16 = commandLine0.iterator();
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue('a');
        commandLine0.addArg("");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String[] strArray18 = commandLine0.getArgs();
        boolean boolean20 = commandLine0.hasOption("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('4');
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption(' ');
        java.lang.String str4 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.lang.Object obj17 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray20 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.String str18 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        java.lang.String str22 = commandLine0.getOptionValue("");
        java.lang.Object obj24 = commandLine0.getOptionObject('a');
        java.lang.Object obj26 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        boolean boolean12 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        boolean boolean20 = commandLine0.hasOption("");
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str25 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject(' ');
        java.lang.String str10 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String str16 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.String str9 = commandLine0.getOptionValue(' ');
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        boolean boolean22 = commandLine0.hasOption('4');
        java.lang.String[] strArray23 = commandLine0.getArgs();
        java.util.List list24 = commandLine0.getArgList();
        java.lang.String str26 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption(' ');
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#');
        boolean boolean12 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.String[] strArray24 = commandLine0.getOptionValues('#');
        java.util.List list25 = commandLine0.getArgList();
        boolean boolean27 = commandLine0.hasOption(' ');
        java.lang.String[] strArray28 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str20 = commandLine0.getOptionValue('a', "");
        boolean boolean22 = commandLine0.hasOption(' ');
        boolean boolean24 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption('4');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.util.List list21 = commandLine0.getArgList();
        java.lang.String[] strArray22 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption('a');
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        boolean boolean20 = commandLine0.hasOption("");
        java.util.List list21 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.util.Iterator iterator18 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.Iterator iterator21 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        commandLine0.addArg("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String str19 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        java.lang.String str22 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String str17 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String str21 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj23 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        boolean boolean20 = commandLine0.hasOption("hi!");
        java.util.List list21 = commandLine0.getArgList();
        java.lang.String str24 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String str21 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("");
        java.lang.String str9 = commandLine0.getOptionValue("", "");
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        boolean boolean6 = commandLine0.hasOption("hi!");
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject('4');
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption(' ');
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        boolean boolean6 = commandLine0.hasOption(' ');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass17 = optionArray16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption('4');
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4', "");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String str5 = commandLine0.getOptionValue('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue('a', "");
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("");
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.lang.String str21 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.String str18 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.String str9 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str11 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        boolean boolean16 = commandLine0.hasOption('#');
        boolean boolean18 = commandLine0.hasOption("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption('4');
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        boolean boolean16 = commandLine0.hasOption('#');
        java.lang.String str18 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        boolean boolean22 = commandLine0.hasOption("");
        java.lang.String str24 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray26 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("hi!");
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.util.List list23 = commandLine0.getArgList();
        java.lang.String str26 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list27 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.List list12 = commandLine0.getArgList();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String str19 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.lang.String[] strArray22 = commandLine0.getOptionValues("");
        java.lang.String str24 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass17 = list16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.String str18 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        boolean boolean21 = commandLine0.hasOption('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        boolean boolean19 = commandLine0.hasOption(' ');
        java.lang.Object obj21 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        java.lang.String[] strArray24 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean5 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        java.lang.String str23 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj25 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption(' ');
        java.lang.Object obj4 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray5 = commandLine0.getArgs();
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue('a');
        boolean boolean18 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        boolean boolean21 = commandLine0.hasOption('a');
        boolean boolean23 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray24 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        boolean boolean10 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('a', "");
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        boolean boolean12 = commandLine0.hasOption('#');
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String str19 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        boolean boolean17 = commandLine0.hasOption('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        java.lang.String str22 = commandLine0.getOptionValue("", "");
        java.lang.String str24 = commandLine0.getOptionValue('a');
        java.lang.String str27 = commandLine0.getOptionValue("hi!", "");
        boolean boolean29 = commandLine0.hasOption(' ');
        java.util.List list30 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        boolean boolean15 = commandLine0.hasOption("");
        boolean boolean17 = commandLine0.hasOption('a');
        boolean boolean19 = commandLine0.hasOption("");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        boolean boolean13 = commandLine0.hasOption("");
        boolean boolean15 = commandLine0.hasOption('a');
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.util.Iterator iterator9 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean5 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean13 = commandLine0.hasOption(' ');
        boolean boolean15 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str16 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('a', "");
        java.lang.String str19 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption('#');
        commandLine0.addArg("");
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        boolean boolean21 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('#');
        boolean boolean13 = commandLine0.hasOption('#');
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        boolean boolean17 = commandLine0.hasOption('#');
        java.lang.String str20 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.util.List list23 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        boolean boolean6 = commandLine0.hasOption("");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.lang.String str22 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str25 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str27 = commandLine0.getOptionValue("");
        java.util.List list28 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue('#');
        java.util.List list21 = commandLine0.getArgList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption('4');
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.util.List list11 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue('a');
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        boolean boolean16 = commandLine0.hasOption('a');
        boolean boolean18 = commandLine0.hasOption('a');
        java.lang.String[] strArray20 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.util.List list23 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj23 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray25 = commandLine0.getOptionValues('a');
        java.lang.String str28 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray29 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(optionArray29);
        org.junit.Assert.assertArrayEquals(optionArray29, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.lang.String str23 = commandLine0.getOptionValue('#', "");
        java.lang.String str26 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String str18 = commandLine0.getOptionValue("");
        boolean boolean20 = commandLine0.hasOption('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.String str23 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass21 = iterator20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str19 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues('#');
        java.lang.Object obj25 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        boolean boolean6 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Class<?> wildcardClass23 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String str5 = commandLine0.getOptionValue('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("");
        commandLine0.addArg("");
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        java.lang.String str24 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption(' ');
        java.lang.String str5 = commandLine0.getOptionValue('#', "");
        java.lang.String str8 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean10 = commandLine0.hasOption('4');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue('a', "hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
        java.lang.String str26 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray28 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('4');
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator18 = commandLine0.iterator();
        java.lang.String str21 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str23 = commandLine0.getOptionValue("");
        java.lang.Object obj25 = commandLine0.getOptionObject("");
        java.lang.String str27 = commandLine0.getOptionValue('a');
        java.lang.String str30 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option option31 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        boolean boolean10 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.lang.String str22 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str25 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj27 = commandLine0.getOptionObject('4');
        java.lang.String str30 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        boolean boolean15 = commandLine0.hasOption('#');
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str21 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj23 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('#');
        boolean boolean7 = commandLine0.hasOption('#');
        boolean boolean9 = commandLine0.hasOption(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String str20 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj22 = commandLine0.getOptionObject("");
        java.lang.Object obj24 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String str21 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        boolean boolean8 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        java.util.List list19 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        boolean boolean6 = commandLine0.hasOption("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue("");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue("");
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        boolean boolean17 = commandLine0.hasOption('a');
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String str21 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.lang.String str20 = commandLine0.getOptionValue('a');
        java.lang.String str23 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj25 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator26 = commandLine0.iterator();
        java.lang.String[] strArray28 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str18 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('4');
        boolean boolean22 = commandLine0.hasOption('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        boolean boolean15 = commandLine0.hasOption('a');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String str18 = commandLine0.getOptionValue("", "");
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.Object obj23 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('a');
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.util.List list16 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption('4');
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        boolean boolean16 = commandLine0.hasOption('#');
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        boolean boolean20 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue('4', "hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        java.util.List list23 = commandLine0.getArgList();
        java.lang.String str25 = commandLine0.getOptionValue('#');
        java.lang.Object obj27 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('4');
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.lang.Object obj22 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        boolean boolean17 = commandLine0.hasOption('#');
        java.lang.String str20 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.String str24 = commandLine0.getOptionValue('#', "");
        java.lang.String str26 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.String str15 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String str20 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        boolean boolean22 = commandLine0.hasOption("");
        java.lang.Object obj24 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.lang.Object obj17 = commandLine0.getOptionObject('#');
        java.lang.String str19 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str10 = commandLine0.getOptionValue('4');
        boolean boolean12 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray23 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass24 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String str21 = commandLine0.getOptionValue("hi!", "");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.String[] strArray24 = commandLine0.getOptionValues("");
        java.lang.String[] strArray25 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption(' ');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strArray13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        boolean boolean13 = commandLine0.hasOption("");
        boolean boolean15 = commandLine0.hasOption('a');
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray21 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        boolean boolean20 = commandLine0.hasOption('4');
        java.lang.String str23 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray25 = commandLine0.getOptionValues(' ');
        boolean boolean27 = commandLine0.hasOption('a');
        java.lang.Class<?> wildcardClass28 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str5 = commandLine0.getOptionValue("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        boolean boolean19 = commandLine0.hasOption('4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue('4', "");
        java.lang.String str10 = commandLine0.getOptionValue("");
        boolean boolean12 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean5 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean13 = commandLine0.hasOption(' ');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass17 = list16.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('4');
        boolean boolean4 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray7 = commandLine0.getOptionValues('#');
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        boolean boolean16 = commandLine0.hasOption('a');
        boolean boolean18 = commandLine0.hasOption('a');
        java.lang.String[] strArray19 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str23 = commandLine0.getOptionValue('#');
        java.lang.Object obj25 = commandLine0.getOptionObject(' ');
        java.lang.String str27 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        boolean boolean14 = commandLine0.hasOption("");
        boolean boolean16 = commandLine0.hasOption('#');
        java.lang.String str19 = commandLine0.getOptionValue('#', "hi!");
        java.util.List list20 = commandLine0.getArgList();
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj24 = commandLine0.getOptionObject('a');
        java.lang.String str27 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj29 = commandLine0.getOptionObject("hi!");
        java.lang.String str31 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        java.util.Iterator iterator2 = commandLine0.iterator();
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        java.util.List list23 = commandLine0.getArgList();
        java.lang.String str25 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject('#');
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        boolean boolean22 = commandLine0.hasOption('4');
        boolean boolean24 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray25 = commandLine0.getArgs();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj24 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option25 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        java.lang.Object obj4 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        boolean boolean8 = commandLine0.hasOption('#');
        commandLine0.addArg("");
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.List list14 = commandLine0.getArgList();
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.lang.String str21 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('#');
        boolean boolean4 = commandLine0.hasOption('#');
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        boolean boolean12 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.List list14 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        java.lang.String str24 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean21 = commandLine0.hasOption('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        boolean boolean21 = commandLine0.hasOption('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.util.List list13 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject('4');
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }
}

