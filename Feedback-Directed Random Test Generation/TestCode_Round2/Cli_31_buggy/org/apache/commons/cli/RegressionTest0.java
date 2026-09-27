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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " " + "'", str0, " ");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = org.apache.commons.cli.Option.UNINITIALIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) false);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_SYNTAX_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "usage: " + "'", str0, "usage: ");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArg();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option(" ", false, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name ' '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_DESC_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator(' ');
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 100);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = org.apache.commons.cli.Option.UNLIMITED_VALUES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription(" ");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        boolean boolean7 = option4.hasArg();
        option4.setArgs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--" + "'", str0, "--");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("-", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '-'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        boolean boolean7 = option4.hasArg();
        // The following exception was thrown during execution in test generation
        try {
            option4.addValueForProcessing("usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option0 = org.apache.commons.cli.OptionBuilder.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify longopt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        option4.clearValues();
        boolean boolean6 = option4.acceptsArg();
        boolean boolean7 = option4.hasValueSeparator();
        option4.setDescription("[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt(" ");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        boolean boolean7 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.toString();
        java.lang.Object obj8 = option4.getType();
        boolean boolean9 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str7, "[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_ARG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg" + "'", str0, "arg");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.withValueSeparator();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArgs();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        option4.clearValues();
        boolean boolean6 = option4.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("hi!");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        java.util.List list7 = option4.getValuesList();
        java.util.List list8 = option4.getValuesList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArg();
        org.junit.Assert.assertNotNull(optionBuilder0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.toString();
        java.lang.Object obj8 = option4.getType();
        option4.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str7, "[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        option4.clearValues();
        boolean boolean6 = option4.acceptsArg();
        boolean boolean7 = option4.hasValueSeparator();
        boolean boolean8 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withArgName("usage: ");
        option4.setType((java.lang.Object) "usage: ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(true);
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.toString();
        java.lang.Object obj8 = option4.getType();
        option4.setArgs((int) (byte) 100);
        option4.addValueForProcessing("");
        boolean boolean13 = option4.requiresArg();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str7, "[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.toString();
        java.lang.Object obj8 = option4.getType();
        option4.setArgs((int) (byte) 100);
        option4.addValueForProcessing("");
        boolean boolean13 = option4.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str7, "[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        char char5 = option4.getValueSeparator();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getDescription();
        java.lang.String str7 = option4.toString();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        option12.clearValues();
        boolean boolean14 = option12.acceptsArg();
        boolean boolean15 = option12.hasValueSeparator();
        boolean boolean16 = option4.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str7, "[ option:  hi!  :: usage:  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        java.util.List list7 = option4.getValuesList();
        java.lang.String str8 = option4.toString();
        option4.setArgName("-");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:  hi!  :: usage:  ]" + "'", str8, "[ option:  hi!  :: usage:  ]");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LEFT_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("--", "--", false, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '--' contains an illegal character : '-'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        java.lang.Object obj7 = option4.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        java.lang.String str8 = option4.getValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "usage: ");
        boolean boolean5 = option4.acceptsArg();
        java.lang.String str6 = option4.getLongOpt();
        java.util.List list7 = option4.getValuesList();
        java.lang.String str8 = option4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options2 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("--");
        org.junit.Assert.assertNotNull(optionBuilder1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("hi!", "[ option:  hi!  :: usage:  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.io.PrintWriter printWriter1 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter1, 3, "", "-", options5, (int) (short) 100, 0, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

