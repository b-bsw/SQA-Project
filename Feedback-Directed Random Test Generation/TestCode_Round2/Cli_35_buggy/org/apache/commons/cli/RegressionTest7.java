package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        boolean boolean9 = options7.hasOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        java.lang.String str17 = options16.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection18 = options16.getOptionGroups();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options19.helpOptions();
        java.util.List<java.lang.String> strList22 = options19.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean24 = options19.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList25 = options19.helpOptions();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        boolean boolean28 = options26.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options26.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options26.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList31 = options26.helpOptions();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasShortOption("");
        org.apache.commons.cli.Options options45 = options39.addOption("", true, "");
        java.util.List<java.lang.String> strList47 = options45.getMatchingOptions("hi!");
        boolean boolean49 = options45.hasOption("");
        org.apache.commons.cli.Option option51 = options45.getOption("");
        org.apache.commons.cli.Options options52 = options38.addOption(option51);
        org.apache.commons.cli.Options options53 = options26.addOption(option51);
        org.apache.commons.cli.Options options54 = options19.addOption(option51);
        org.apache.commons.cli.OptionGroup optionGroup55 = options16.getOptionGroup(option51);
        org.apache.commons.cli.OptionGroup optionGroup56 = options7.getOptionGroup(option51);
        org.apache.commons.cli.Option option57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options58 = options7.addOption(option57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str17, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection18);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(optionList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNull(optionGroup56);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options6.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options6.getOptions();
        org.apache.commons.cli.Option option14 = options6.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options18 = options6.addOption("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("");
        boolean boolean14 = options10.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean16 = options10.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option18 = options10.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean20 = options10.hasOption("");
        boolean boolean22 = options10.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options10.getOptions();
        boolean boolean25 = options10.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        org.apache.commons.cli.Option option3 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasOption("");
        java.util.List list6 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", true, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        java.util.List list14 = options11.getRequiredOptions();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        boolean boolean28 = options26.hasShortOption("");
        org.apache.commons.cli.Options options32 = options26.addOption("", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasOption("");
        org.apache.commons.cli.Option option38 = options32.getOption("");
        org.apache.commons.cli.Options options39 = options21.addOption(option38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList43 = options40.helpOptions();
        java.util.List<java.lang.String> strList45 = options40.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean47 = options40.hasOption("");
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        boolean boolean50 = options48.hasShortOption("");
        org.apache.commons.cli.Options options54 = options48.addOption("", true, "");
        java.util.List<java.lang.String> strList56 = options54.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList58 = options54.getMatchingOptions("");
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        boolean boolean61 = options59.hasShortOption("");
        org.apache.commons.cli.Options options65 = options59.addOption("", true, "");
        java.util.List<java.lang.String> strList67 = options65.getMatchingOptions("hi!");
        boolean boolean69 = options65.hasOption("");
        org.apache.commons.cli.Option option71 = options65.getOption("");
        org.apache.commons.cli.Options options72 = options54.addOption(option71);
        org.apache.commons.cli.Options options73 = options40.addOption(option71);
        org.apache.commons.cli.Options options74 = options21.addOption(option71);
        org.apache.commons.cli.OptionGroup optionGroup75 = options11.getOptionGroup(option71);
        org.apache.commons.cli.Options options76 = options0.addOption(option71);
        boolean boolean78 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(optionList43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.lang.String str12 = options0.toString();
        org.apache.commons.cli.Options options16 = options0.addOption("", false, "");
        java.lang.String str17 = options0.toString();
        java.util.List list18 = options0.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str17, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        boolean boolean4 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options14.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection19 = options14.getOptionGroups();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        boolean boolean41 = options37.hasOption("");
        org.apache.commons.cli.Option option43 = options37.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup44 = options26.getOptionGroup(option43);
        org.apache.commons.cli.Options options45 = options14.addOption(option43);
        org.apache.commons.cli.Options options46 = options0.addOption(option43);
        java.util.List<org.apache.commons.cli.Option> optionList47 = options46.helpOptions();
        java.util.List<java.lang.String> strList49 = options46.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList51 = options46.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options56 = options46.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(optionGroupCollection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionList47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        boolean boolean8 = options6.hasShortOption("");
        org.apache.commons.cli.Options options12 = options6.addOption("", true, "");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Option option25 = options19.getOption("");
        org.apache.commons.cli.Options options26 = options12.addOption(option25);
        org.apache.commons.cli.Options options27 = options0.addOption(option25);
        java.util.List list28 = options27.getRequiredOptions();
        boolean boolean30 = options27.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass31 = options27.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        boolean boolean14 = options0.hasShortOption("hi!");
        java.util.List<java.lang.String> strList16 = options0.getMatchingOptions("hi!");
        java.util.List list17 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection18 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(optionGroupCollection18);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        org.apache.commons.cli.Options options12 = options0.addOption("", false, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options0.addOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options6.getOptionGroups();
        java.util.List list12 = options6.getRequiredOptions();
        java.util.List list13 = options6.getRequiredOptions();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList15 = options14.helpOptions();
        java.util.List<java.lang.String> strList17 = options14.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options18.getOptions();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasShortOption("");
        org.apache.commons.cli.Options options28 = options22.addOption("", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        boolean boolean32 = options28.hasOption("");
        org.apache.commons.cli.Option option34 = options28.getOption("");
        org.apache.commons.cli.Options options35 = options18.addOption(option34);
        org.apache.commons.cli.Options options36 = options14.addOption(option34);
        org.apache.commons.cli.Options options37 = options6.addOption(option34);
        boolean boolean39 = options37.hasLongOption("");
        java.util.List<java.lang.String> strList41 = options37.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options45 = options37.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.lang.String str3 = options0.toString();
        java.util.List list4 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasLongOption("");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        java.util.List<java.lang.String> strList18 = options16.getMatchingOptions("hi!");
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup23 = options5.getOptionGroup(option22);
        org.apache.commons.cli.Options options24 = options0.addOption(option22);
        java.util.List<org.apache.commons.cli.Option> optionList25 = options0.helpOptions();
        boolean boolean27 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean29 = options0.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.OptionGroup optionGroup30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options31 = options0.addOptionGroup(optionGroup30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(optionList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String str11 = options9.toString();
        java.util.List<java.lang.String> strList13 = options9.getMatchingOptions("");
        java.lang.String str14 = options9.toString();
        java.lang.String str15 = options9.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection16 = options9.getOptionGroups();
        org.apache.commons.cli.Option option18 = options9.getOption("");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options19.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options19.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList24 = options19.helpOptions();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasShortOption("");
        org.apache.commons.cli.Options options31 = options25.addOption("", true, "");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options31.addOption(option44);
        org.apache.commons.cli.Options options46 = options19.addOption(option44);
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList48 = options47.helpOptions();
        java.util.List<java.lang.String> strList50 = options47.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean52 = options47.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasShortOption("");
        org.apache.commons.cli.Options options59 = options53.addOption("", true, "");
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        boolean boolean62 = options60.hasShortOption("");
        org.apache.commons.cli.Options options66 = options60.addOption("", true, "");
        java.util.List<java.lang.String> strList68 = options66.getMatchingOptions("hi!");
        boolean boolean70 = options66.hasOption("");
        org.apache.commons.cli.Option option72 = options66.getOption("");
        org.apache.commons.cli.Options options73 = options59.addOption(option72);
        org.apache.commons.cli.OptionGroup optionGroup74 = options47.getOptionGroup(option72);
        org.apache.commons.cli.OptionGroup optionGroup75 = options19.getOptionGroup(option72);
        org.apache.commons.cli.OptionGroup optionGroup76 = options9.getOptionGroup(option72);
        org.apache.commons.cli.Options options77 = options6.addOption(option72);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection78 = options6.getOptionGroups();
        boolean boolean80 = options6.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options84 = options6.addOption("", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<java.lang.String> strList86 = options6.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option88 = options6.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list89 = options6.getRequiredOptions();
        java.lang.Class<?> wildcardClass90 = list89.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str14, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str15, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection16);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(optionList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionList48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNotNull(optionGroupCollection78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(options84);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNull(option88);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.lang.String str3 = options0.toString();
        java.util.List list4 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        boolean boolean9 = options5.hasLongOption("");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        java.util.List<java.lang.String> strList18 = options16.getMatchingOptions("hi!");
        boolean boolean20 = options16.hasOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup23 = options5.getOptionGroup(option22);
        org.apache.commons.cli.Options options24 = options0.addOption(option22);
        boolean boolean26 = options24.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean28 = options24.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList30 = options29.helpOptions();
        java.util.List<java.lang.String> strList32 = options29.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean34 = options29.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        boolean boolean44 = options42.hasShortOption("");
        org.apache.commons.cli.Options options48 = options42.addOption("", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        boolean boolean52 = options48.hasOption("");
        org.apache.commons.cli.Option option54 = options48.getOption("");
        org.apache.commons.cli.Options options55 = options41.addOption(option54);
        org.apache.commons.cli.OptionGroup optionGroup56 = options29.getOptionGroup(option54);
        org.apache.commons.cli.Options options57 = options24.addOption(option54);
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        boolean boolean60 = options58.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection61 = options58.getOptions();
        org.apache.commons.cli.Option option63 = options58.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list64 = options58.getRequiredOptions();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        boolean boolean67 = options65.hasShortOption("");
        org.apache.commons.cli.Options options71 = options65.addOption("", true, "");
        java.util.List<java.lang.String> strList73 = options71.getMatchingOptions("hi!");
        boolean boolean75 = options71.hasOption("");
        org.apache.commons.cli.Option option77 = options71.getOption("");
        org.apache.commons.cli.Options options78 = options58.addOption(option77);
        boolean boolean80 = options58.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option82 = options58.getOption("");
        org.apache.commons.cli.Options options83 = options57.addOption(option82);
        java.util.List list84 = options57.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(optionCollection61);
        org.junit.Assert.assertNull(option63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(list84);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Option option12 = options6.getOption("hi!");
        boolean boolean14 = options6.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list15 = options6.getRequiredOptions();
        java.util.List<java.lang.String> strList17 = options6.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean19 = options6.hasOption("[ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass20 = options6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options6.getOptionGroups();
        java.util.List list12 = options6.getRequiredOptions();
        boolean boolean14 = options6.hasShortOption("");
        boolean boolean16 = options6.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option18 = options6.getOption("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list19 = options6.getRequiredOptions();
        boolean boolean21 = options6.hasLongOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.lang.String str12 = options0.toString();
        org.apache.commons.cli.Option option14 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option16 = options0.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList18 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean20 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionCollection21);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options6.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options6.getOptionGroups();
        boolean boolean14 = options6.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option17 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasShortOption("");
        org.apache.commons.cli.Options options24 = options18.addOption("", true, "");
        java.util.List<java.lang.String> strList26 = options24.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList28 = options24.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection29 = options24.getOptionGroups();
        java.util.List list30 = options24.getRequiredOptions();
        java.util.List list31 = options24.getRequiredOptions();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList33 = options32.helpOptions();
        java.util.List<java.lang.String> strList35 = options32.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options36.getOptions();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasShortOption("");
        org.apache.commons.cli.Options options46 = options40.addOption("", true, "");
        java.util.List<java.lang.String> strList48 = options46.getMatchingOptions("hi!");
        boolean boolean50 = options46.hasOption("");
        org.apache.commons.cli.Option option52 = options46.getOption("");
        org.apache.commons.cli.Options options53 = options36.addOption(option52);
        org.apache.commons.cli.Options options54 = options32.addOption(option52);
        org.apache.commons.cli.Options options55 = options24.addOption(option52);
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasShortOption("");
        org.apache.commons.cli.Options options62 = options56.addOption("", true, "");
        java.util.List<java.lang.String> strList64 = options62.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList66 = options62.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection67 = options62.getOptionGroups();
        java.util.List list68 = options62.getRequiredOptions();
        java.util.List list69 = options62.getRequiredOptions();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        boolean boolean72 = options70.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection73 = options70.getOptions();
        org.apache.commons.cli.Options options74 = new org.apache.commons.cli.Options();
        boolean boolean76 = options74.hasShortOption("");
        org.apache.commons.cli.Options options80 = options74.addOption("", true, "");
        java.util.List<java.lang.String> strList82 = options80.getMatchingOptions("hi!");
        boolean boolean84 = options80.hasOption("");
        org.apache.commons.cli.Option option86 = options80.getOption("");
        org.apache.commons.cli.Options options87 = options70.addOption(option86);
        org.apache.commons.cli.OptionGroup optionGroup88 = options62.getOptionGroup(option86);
        org.apache.commons.cli.Options options89 = options24.addOption(option86);
        org.apache.commons.cli.Options options90 = options0.addOption(option86);
        boolean boolean92 = options90.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection93 = options90.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(optionGroupCollection29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(optionList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(optionGroupCollection67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(optionCollection73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(option86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNull(optionGroup88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(options90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(optionCollection93);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        boolean boolean4 = options2.hasShortOption("");
        org.apache.commons.cli.Options options8 = options2.addOption("", true, "");
        java.util.List<java.lang.String> strList10 = options8.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList12 = options8.getMatchingOptions("");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Option option25 = options19.getOption("");
        org.apache.commons.cli.Options options26 = options8.addOption(option25);
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList30 = options27.helpOptions();
        java.util.List<java.lang.String> strList32 = options27.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean34 = options27.hasOption("");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList45 = options41.getMatchingOptions("");
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        boolean boolean56 = options52.hasOption("");
        org.apache.commons.cli.Option option58 = options52.getOption("");
        org.apache.commons.cli.Options options59 = options41.addOption(option58);
        org.apache.commons.cli.Options options60 = options27.addOption(option58);
        org.apache.commons.cli.Options options61 = options8.addOption(option58);
        org.apache.commons.cli.Options options62 = options0.addOption(option58);
        java.util.List<java.lang.String> strList64 = options62.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str65 = options62.toString();
        java.util.List list66 = options62.getRequiredOptions();
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(option58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str65, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options11.addOption(option24);
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option24);
        java.util.List<org.apache.commons.cli.Option> optionList27 = options0.helpOptions();
        org.apache.commons.cli.Option option29 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option31 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option33 = options0.getOption("");
        boolean boolean35 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(optionList27);
        org.junit.Assert.assertNull(option29);
        org.junit.Assert.assertNull(option31);
        org.junit.Assert.assertNull(option33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options11.addOption(option24);
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option24);
        java.util.List<java.lang.String> strList28 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection29 = options0.getOptionGroups();
        java.util.List list30 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options0.getOptions();
        java.lang.String str32 = options0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(optionGroupCollection29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str32, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        boolean boolean8 = options6.hasShortOption("");
        org.apache.commons.cli.Options options12 = options6.addOption("", true, "");
        java.util.List<java.lang.String> strList14 = options12.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection17 = options12.getOptionGroups();
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasShortOption("");
        org.apache.commons.cli.Options options24 = options18.addOption("", true, "");
        java.util.List<java.lang.String> strList26 = options24.getMatchingOptions("hi!");
        boolean boolean28 = options24.hasOption("");
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        boolean boolean31 = options29.hasShortOption("");
        org.apache.commons.cli.Options options35 = options29.addOption("", true, "");
        java.util.List<java.lang.String> strList37 = options35.getMatchingOptions("hi!");
        boolean boolean39 = options35.hasOption("");
        org.apache.commons.cli.Option option41 = options35.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup42 = options24.getOptionGroup(option41);
        org.apache.commons.cli.Options options43 = options12.addOption(option41);
        org.apache.commons.cli.OptionGroup optionGroup44 = options0.getOptionGroup(option41);
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(optionGroupCollection17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNull(optionGroup42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(optionGroup44);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options11.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList15 = options11.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options11.getOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        java.util.List list20 = options17.getRequiredOptions();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList31 = options27.getMatchingOptions("");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options27.addOption(option44);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList49 = options46.helpOptions();
        java.util.List<java.lang.String> strList51 = options46.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean53 = options46.hasOption("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList64 = options60.getMatchingOptions("");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        boolean boolean67 = options65.hasShortOption("");
        org.apache.commons.cli.Options options71 = options65.addOption("", true, "");
        java.util.List<java.lang.String> strList73 = options71.getMatchingOptions("hi!");
        boolean boolean75 = options71.hasOption("");
        org.apache.commons.cli.Option option77 = options71.getOption("");
        org.apache.commons.cli.Options options78 = options60.addOption(option77);
        org.apache.commons.cli.Options options79 = options46.addOption(option77);
        org.apache.commons.cli.Options options80 = options27.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup81 = options17.getOptionGroup(option77);
        org.apache.commons.cli.Options options82 = options11.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup83 = options0.getOptionGroup(option77);
        boolean boolean85 = options0.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option87 = options0.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList89 = options0.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList90 = options0.helpOptions();
        java.util.List<java.lang.String> strList92 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(optionList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNull(optionGroup83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(option87);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(optionList90);
        org.junit.Assert.assertNotNull(strList92);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean15 = options10.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options20 = options10.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        boolean boolean23 = options20.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options11.addOption(option24);
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option24);
        java.util.List<java.lang.String> strList28 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection29 = options0.getOptionGroups();
        java.util.List list30 = options0.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options35 = options0.addOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(optionGroupCollection29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasLongOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options26 = options16.addOption("", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options31 = options16.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Option option55 = options49.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup56 = options38.getOptionGroup(option55);
        org.apache.commons.cli.Options options57 = options31.addOption(option55);
        boolean boolean59 = options57.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options57.getOptions();
        boolean boolean62 = options57.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass63 = options57.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options12.getOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasShortOption("");
        org.apache.commons.cli.Options options22 = options16.addOption("", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        boolean boolean26 = options22.hasOption("");
        org.apache.commons.cli.Option option28 = options22.getOption("");
        org.apache.commons.cli.Options options29 = options12.addOption(option28);
        org.apache.commons.cli.Options options30 = options10.addOption(option28);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection31 = options30.getOptionGroups();
        boolean boolean33 = options30.hasOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options36 = options30.addOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(optionGroupCollection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.lang.String str5 = options0.toString();
        boolean boolean7 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options8.getOptions();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options8.addOption(option24);
        org.apache.commons.cli.Options options26 = options0.addOption(option24);
        org.apache.commons.cli.Options options30 = options0.addOption("", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options33 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList34 = options33.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection35 = options33.getOptionGroups();
        java.util.List<java.lang.String> strList37 = options33.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(optionList34);
        org.junit.Assert.assertNotNull(optionGroupCollection35);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        boolean boolean8 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String str11 = options9.toString();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options12.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options12.helpOptions();
        java.lang.String str21 = options12.toString();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasShortOption("");
        org.apache.commons.cli.Options options28 = options22.addOption("", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList32 = options28.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList33 = options28.helpOptions();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options34.getOptions();
        java.lang.String str36 = options34.toString();
        java.util.List<java.lang.String> strList38 = options34.getMatchingOptions("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList42 = options39.helpOptions();
        java.util.List list43 = options39.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options39.getOptions();
        org.apache.commons.cli.Options options49 = options39.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str50 = options49.toString();
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        boolean boolean53 = options51.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection54 = options51.getOptions();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasShortOption("");
        org.apache.commons.cli.Options options61 = options55.addOption("", true, "");
        java.util.List<java.lang.String> strList63 = options61.getMatchingOptions("hi!");
        boolean boolean65 = options61.hasOption("");
        org.apache.commons.cli.Option option67 = options61.getOption("");
        org.apache.commons.cli.Options options68 = options51.addOption(option67);
        org.apache.commons.cli.Options options69 = options49.addOption(option67);
        org.apache.commons.cli.OptionGroup optionGroup70 = options34.getOptionGroup(option67);
        org.apache.commons.cli.Options options71 = options28.addOption(option67);
        org.apache.commons.cli.OptionGroup optionGroup72 = options12.getOptionGroup(option67);
        org.apache.commons.cli.Options options73 = options9.addOption(option67);
        org.apache.commons.cli.OptionGroup optionGroup74 = options0.getOptionGroup(option67);
        java.util.List list75 = options0.getRequiredOptions();
        boolean boolean77 = options0.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList78 = options0.helpOptions();
        boolean boolean80 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str21, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(optionList33);
        org.junit.Assert.assertNotNull(optionCollection35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str36, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(optionList42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str50, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(optionCollection54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(optionList78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list16 = options0.getRequiredOptions();
        boolean boolean18 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.lang.String str19 = options0.toString();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList22 = options20.helpOptions();
        boolean boolean24 = options20.hasLongOption("");
        java.lang.String str25 = options20.toString();
        boolean boolean27 = options20.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        boolean boolean30 = options28.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options28.getOptions();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options28.addOption(option44);
        org.apache.commons.cli.Options options46 = options20.addOption(option44);
        org.apache.commons.cli.Options options47 = options0.addOption(option44);
        java.util.List<java.lang.String> strList49 = options47.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.Class<?> wildcardClass50 = options47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]" + "'", str19, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str25, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        boolean boolean9 = options7.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option11 = options7.getOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options7.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options7.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(optionCollection13);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        boolean boolean12 = options10.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection13 = options10.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList14 = options10.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionGroupCollection13);
        org.junit.Assert.assertNotNull(optionList14);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options10.helpOptions();
        org.apache.commons.cli.Options options15 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection18 = options15.getOptionGroups();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options19.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options19.helpOptions();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        boolean boolean41 = options37.hasOption("");
        org.apache.commons.cli.Option option43 = options37.getOption("");
        org.apache.commons.cli.Options options44 = options30.addOption(option43);
        org.apache.commons.cli.OptionGroup optionGroup45 = options19.getOptionGroup(option43);
        org.apache.commons.cli.Options options46 = options15.addOption(option43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options49 = options15.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(optionGroupCollection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNull(optionGroup45);
        org.junit.Assert.assertNotNull(options46);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options10.helpOptions();
        org.apache.commons.cli.Options options15 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("");
        org.apache.commons.cli.Options options20 = options15.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        boolean boolean31 = options27.hasOption("");
        org.apache.commons.cli.Option option33 = options27.getOption("");
        org.apache.commons.cli.Options options34 = options15.addOption(option33);
        java.util.List list35 = options15.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options40 = options15.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList6 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options7.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options7.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options7.helpOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Option option32 = options26.getOption("");
        org.apache.commons.cli.Options options33 = options19.addOption(option32);
        org.apache.commons.cli.Options options34 = options7.addOption(option32);
        org.apache.commons.cli.Options options35 = options0.addOption(option32);
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options42 = options36.addOption("", true, "");
        java.util.List<java.lang.String> strList44 = options42.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList46 = options42.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options42.getOptionGroups();
        java.util.List list48 = options42.getRequiredOptions();
        java.util.List list49 = options42.getRequiredOptions();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList51 = options50.helpOptions();
        java.util.List<java.lang.String> strList53 = options50.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection57 = options54.getOptions();
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        boolean boolean60 = options58.hasShortOption("");
        org.apache.commons.cli.Options options64 = options58.addOption("", true, "");
        java.util.List<java.lang.String> strList66 = options64.getMatchingOptions("hi!");
        boolean boolean68 = options64.hasOption("");
        org.apache.commons.cli.Option option70 = options64.getOption("");
        org.apache.commons.cli.Options options71 = options54.addOption(option70);
        org.apache.commons.cli.Options options72 = options50.addOption(option70);
        org.apache.commons.cli.Options options73 = options42.addOption(option70);
        org.apache.commons.cli.OptionGroup optionGroup74 = options0.getOptionGroup(option70);
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(optionList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(optionCollection57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNull(optionGroup74);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        java.lang.String str25 = options6.toString();
        boolean boolean27 = options6.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean29 = options6.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean31 = options6.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList32 = options6.helpOptions();
        boolean boolean34 = options6.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list35 = options6.getRequiredOptions();
        boolean boolean37 = options6.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str38 = options6.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str38, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        boolean boolean10 = options0.hasLongOption("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options13 = options0.addOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]=[ option:  [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]  :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]=[ option:  [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]  :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options10.helpOptions();
        org.apache.commons.cli.Options options15 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection18 = options15.getOptionGroups();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options19.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options19.helpOptions();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        boolean boolean41 = options37.hasOption("");
        org.apache.commons.cli.Option option43 = options37.getOption("");
        org.apache.commons.cli.Options options44 = options30.addOption(option43);
        org.apache.commons.cli.OptionGroup optionGroup45 = options19.getOptionGroup(option43);
        org.apache.commons.cli.Options options46 = options15.addOption(option43);
        org.apache.commons.cli.Option option48 = options46.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean54 = options46.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.OptionGroup optionGroup55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options56 = options46.addOptionGroup(optionGroup55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(optionGroupCollection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNull(optionGroup45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNull(option48);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        boolean boolean9 = options7.hasOption("hi!");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        java.util.List<java.lang.String> strList18 = options16.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList20 = options16.getMatchingOptions("");
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        boolean boolean31 = options27.hasOption("");
        org.apache.commons.cli.Option option33 = options27.getOption("");
        org.apache.commons.cli.Options options34 = options16.addOption(option33);
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList38 = options35.helpOptions();
        java.util.List<java.lang.String> strList40 = options35.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean42 = options35.hasOption("");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList53 = options49.getMatchingOptions("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        boolean boolean64 = options60.hasOption("");
        org.apache.commons.cli.Option option66 = options60.getOption("");
        org.apache.commons.cli.Options options67 = options49.addOption(option66);
        org.apache.commons.cli.Options options68 = options35.addOption(option66);
        org.apache.commons.cli.Options options69 = options16.addOption(option66);
        org.apache.commons.cli.Options options70 = options7.addOption(option66);
        boolean boolean72 = options7.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options76 = options7.addOption("", true, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options81 = options7.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(optionList38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(options76);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasLongOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options26 = options16.addOption("", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options31 = options26.addOption("", false, "[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(optionGroupCollection27);
        org.junit.Assert.assertNotNull(options31);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.lang.String str6 = options0.toString();
        boolean boolean8 = options0.hasOption("");
        java.util.List list9 = options0.getRequiredOptions();
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasLongOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options26 = options16.addOption("", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List list27 = options16.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options13 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]");
        java.util.List list14 = options13.getRequiredOptions();
        boolean boolean16 = options13.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options21 = options13.addOption("", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean23 = options13.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options24.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList26 = options24.helpOptions();
        boolean boolean28 = options24.hasLongOption("");
        java.lang.String str29 = options24.toString();
        boolean boolean31 = options24.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options32.getOptions();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options42 = options36.addOption("", true, "");
        java.util.List<java.lang.String> strList44 = options42.getMatchingOptions("hi!");
        boolean boolean46 = options42.hasOption("");
        org.apache.commons.cli.Option option48 = options42.getOption("");
        org.apache.commons.cli.Options options49 = options32.addOption(option48);
        org.apache.commons.cli.Options options50 = options24.addOption(option48);
        org.apache.commons.cli.OptionGroup optionGroup51 = options13.getOptionGroup(option48);
        org.apache.commons.cli.OptionGroup optionGroup52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options53 = options13.addOptionGroup(optionGroup52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(optionList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str29, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(optionCollection35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(option48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNull(optionGroup51);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.lang.String str6 = options0.toString();
        boolean boolean8 = options0.hasOption("");
        java.util.List list9 = options0.getRequiredOptions();
        boolean boolean11 = options0.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option13 = options0.getOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.lang.String str12 = options0.toString();
        org.apache.commons.cli.Option option14 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option16 = options0.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList20 = options17.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options17.getOptions();
        org.apache.commons.cli.Option option23 = options17.getOption("hi!");
        boolean boolean25 = options17.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option27 = options17.getOption("[ Options: [ short {} ] [ long {} ]");
        java.lang.String str28 = options17.toString();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String str31 = options29.toString();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options32.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList40 = options32.helpOptions();
        java.lang.String str41 = options32.toString();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        boolean boolean44 = options42.hasShortOption("");
        org.apache.commons.cli.Options options48 = options42.addOption("", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList52 = options48.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList53 = options48.helpOptions();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options54.getOptions();
        java.lang.String str56 = options54.toString();
        java.util.List<java.lang.String> strList58 = options54.getMatchingOptions("");
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        boolean boolean61 = options59.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList62 = options59.helpOptions();
        java.util.List list63 = options59.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection64 = options59.getOptions();
        org.apache.commons.cli.Options options69 = options59.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str70 = options69.toString();
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        boolean boolean73 = options71.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection74 = options71.getOptions();
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        boolean boolean77 = options75.hasShortOption("");
        org.apache.commons.cli.Options options81 = options75.addOption("", true, "");
        java.util.List<java.lang.String> strList83 = options81.getMatchingOptions("hi!");
        boolean boolean85 = options81.hasOption("");
        org.apache.commons.cli.Option option87 = options81.getOption("");
        org.apache.commons.cli.Options options88 = options71.addOption(option87);
        org.apache.commons.cli.Options options89 = options69.addOption(option87);
        org.apache.commons.cli.OptionGroup optionGroup90 = options54.getOptionGroup(option87);
        org.apache.commons.cli.Options options91 = options48.addOption(option87);
        org.apache.commons.cli.OptionGroup optionGroup92 = options32.getOptionGroup(option87);
        org.apache.commons.cli.Options options93 = options29.addOption(option87);
        org.apache.commons.cli.OptionGroup optionGroup94 = options17.getOptionGroup(option87);
        org.apache.commons.cli.Options options95 = options0.addOption(option87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNull(option23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(option27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str28, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str31, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertNotNull(optionList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str41, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(optionList53);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str56, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(optionList62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(optionCollection64);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str70, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(optionCollection74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(option87);
        org.junit.Assert.assertNotNull(options88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNull(optionGroup90);
        org.junit.Assert.assertNotNull(options91);
        org.junit.Assert.assertNull(optionGroup92);
        org.junit.Assert.assertNotNull(options93);
        org.junit.Assert.assertNull(optionGroup94);
        org.junit.Assert.assertNotNull(options95);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        boolean boolean6 = options4.hasShortOption("");
        org.apache.commons.cli.Options options10 = options4.addOption("", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        boolean boolean14 = options10.hasOption("");
        org.apache.commons.cli.Option option16 = options10.getOption("");
        org.apache.commons.cli.Options options17 = options0.addOption(option16);
        java.lang.String str18 = options0.toString();
        java.util.List<java.lang.String> strList20 = options0.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option22 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<java.lang.String> strList24 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str18, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.util.List<java.lang.String> strList6 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list7 = options0.getRequiredOptions();
        boolean boolean9 = options0.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection10 = options0.getOptionGroups();
        java.lang.Class<?> wildcardClass11 = options0.getClass();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options7.helpOptions();
        java.lang.String str11 = options7.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options7.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options7.getOptions();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        boolean boolean16 = options14.hasShortOption("");
        boolean boolean18 = options14.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options19.helpOptions();
        java.util.List list23 = options19.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options19.getOptions();
        org.apache.commons.cli.Options options29 = options19.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str30 = options29.toString();
        boolean boolean32 = options29.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        boolean boolean35 = options33.hasShortOption("");
        org.apache.commons.cli.Options options39 = options33.addOption("", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        boolean boolean43 = options39.hasOption("");
        org.apache.commons.cli.Option option45 = options39.getOption("");
        org.apache.commons.cli.Options options46 = options29.addOption(option45);
        org.apache.commons.cli.Options options47 = options14.addOption(option45);
        org.apache.commons.cli.OptionGroup optionGroup48 = options7.getOptionGroup(option45);
        org.apache.commons.cli.Options options49 = options0.addOption(option45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options53 = options0.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str30, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(options49);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<java.lang.String> strList5 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean7 = options0.hasOption("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options14.getMatchingOptions("");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasShortOption("");
        org.apache.commons.cli.Options options25 = options19.addOption("", true, "");
        java.util.List<java.lang.String> strList27 = options25.getMatchingOptions("hi!");
        boolean boolean29 = options25.hasOption("");
        org.apache.commons.cli.Option option31 = options25.getOption("");
        org.apache.commons.cli.Options options32 = options14.addOption(option31);
        org.apache.commons.cli.Options options33 = options0.addOption(option31);
        java.util.List list34 = options0.getRequiredOptions();
        java.util.List list35 = options0.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList6 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options7.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options7.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options7.helpOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Option option32 = options26.getOption("");
        org.apache.commons.cli.Options options33 = options19.addOption(option32);
        org.apache.commons.cli.Options options34 = options7.addOption(option32);
        org.apache.commons.cli.Options options35 = options0.addOption(option32);
        java.util.List<java.lang.String> strList37 = options0.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList38 = options0.helpOptions();
        org.apache.commons.cli.Option option40 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options0.getOptions();
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(optionList38);
        org.junit.Assert.assertNull(option40);
        org.junit.Assert.assertNotNull(optionCollection41);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options14.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection19 = options14.getOptionGroups();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        boolean boolean41 = options37.hasOption("");
        org.apache.commons.cli.Option option43 = options37.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup44 = options26.getOptionGroup(option43);
        org.apache.commons.cli.Options options45 = options14.addOption(option43);
        org.apache.commons.cli.Options options46 = options0.addOption(option43);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options0.getOptionGroups();
        boolean boolean49 = options0.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection50 = options0.getOptionGroups();
        org.apache.commons.cli.OptionGroup optionGroup51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options52 = options0.addOptionGroup(optionGroup51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(optionGroupCollection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNull(optionGroup44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection50);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.List list5 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        boolean boolean8 = options0.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str9 = options0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList21 = options17.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection22 = options17.getOptionGroups();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasShortOption("");
        org.apache.commons.cli.Options options40 = options34.addOption("", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        boolean boolean44 = options40.hasOption("");
        org.apache.commons.cli.Option option46 = options40.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup47 = options29.getOptionGroup(option46);
        org.apache.commons.cli.Options options48 = options17.addOption(option46);
        org.apache.commons.cli.Options options49 = options0.addOption(option46);
        boolean boolean51 = options49.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList53 = options52.helpOptions();
        java.util.List<java.lang.String> strList55 = options52.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean57 = options52.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection58 = options52.getOptions();
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        boolean boolean61 = options59.hasShortOption("");
        org.apache.commons.cli.Options options65 = options59.addOption("", true, "");
        java.util.List<java.lang.String> strList67 = options65.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList69 = options65.getMatchingOptions("");
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        boolean boolean72 = options70.hasShortOption("");
        org.apache.commons.cli.Options options76 = options70.addOption("", true, "");
        java.util.List<java.lang.String> strList78 = options76.getMatchingOptions("hi!");
        boolean boolean80 = options76.hasOption("");
        org.apache.commons.cli.Option option82 = options76.getOption("");
        org.apache.commons.cli.Options options83 = options65.addOption(option82);
        org.apache.commons.cli.Options options84 = options52.addOption(option82);
        org.apache.commons.cli.Options options85 = options49.addOption(option82);
        boolean boolean87 = options49.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        boolean boolean89 = options49.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList90 = options49.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(optionGroupCollection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertNull(optionGroup47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(optionList53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(optionCollection58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(options84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(optionList90);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection7 = options0.getOptionGroups();
        java.lang.String str8 = options0.toString();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options9.helpOptions();
        java.util.List list13 = options9.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options9.getOptions();
        java.util.List<java.lang.String> strList16 = options9.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options9.getMatchingOptions("");
        java.util.List<java.lang.String> strList20 = options9.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection21 = options9.getOptionGroups();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options22.helpOptions();
        java.util.List<java.lang.String> strList25 = options22.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean27 = options22.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        boolean boolean30 = options28.hasShortOption("");
        org.apache.commons.cli.Options options34 = options28.addOption("", true, "");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        boolean boolean45 = options41.hasOption("");
        org.apache.commons.cli.Option option47 = options41.getOption("");
        org.apache.commons.cli.Options options48 = options34.addOption(option47);
        org.apache.commons.cli.OptionGroup optionGroup49 = options22.getOptionGroup(option47);
        org.apache.commons.cli.OptionGroup optionGroup50 = options9.getOptionGroup(option47);
        org.apache.commons.cli.OptionGroup optionGroup51 = options0.getOptionGroup(option47);
        java.util.List list52 = options0.getRequiredOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str8, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(optionGroupCollection21);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNull(optionGroup49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNull(optionGroup51);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str7 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String str11 = options9.toString();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options12.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options12.helpOptions();
        java.lang.String str21 = options12.toString();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasShortOption("");
        org.apache.commons.cli.Options options28 = options22.addOption("", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList32 = options28.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList33 = options28.helpOptions();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options34.getOptions();
        java.lang.String str36 = options34.toString();
        java.util.List<java.lang.String> strList38 = options34.getMatchingOptions("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList42 = options39.helpOptions();
        java.util.List list43 = options39.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options39.getOptions();
        org.apache.commons.cli.Options options49 = options39.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str50 = options49.toString();
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        boolean boolean53 = options51.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection54 = options51.getOptions();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasShortOption("");
        org.apache.commons.cli.Options options61 = options55.addOption("", true, "");
        java.util.List<java.lang.String> strList63 = options61.getMatchingOptions("hi!");
        boolean boolean65 = options61.hasOption("");
        org.apache.commons.cli.Option option67 = options61.getOption("");
        org.apache.commons.cli.Options options68 = options51.addOption(option67);
        org.apache.commons.cli.Options options69 = options49.addOption(option67);
        org.apache.commons.cli.OptionGroup optionGroup70 = options34.getOptionGroup(option67);
        org.apache.commons.cli.Options options71 = options28.addOption(option67);
        org.apache.commons.cli.OptionGroup optionGroup72 = options12.getOptionGroup(option67);
        org.apache.commons.cli.Options options73 = options9.addOption(option67);
        org.apache.commons.cli.Options options74 = options0.addOption(option67);
        boolean boolean76 = options74.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list77 = options74.getRequiredOptions();
        org.apache.commons.cli.OptionGroup optionGroup78 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options79 = options74.addOptionGroup(optionGroup78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str7, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str21, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(optionList33);
        org.junit.Assert.assertNotNull(optionCollection35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str36, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(optionList42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str50, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(optionCollection54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(optionGroup72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<java.lang.String> strList15 = options10.getMatchingOptions("");
        org.apache.commons.cli.Options options19 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList23 = options20.helpOptions();
        java.util.List list24 = options20.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options20.getOptions();
        org.apache.commons.cli.Options options30 = options20.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList41 = options37.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection42 = options37.getOptionGroups();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        boolean boolean64 = options60.hasOption("");
        org.apache.commons.cli.Option option66 = options60.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup67 = options49.getOptionGroup(option66);
        org.apache.commons.cli.Options options68 = options37.addOption(option66);
        org.apache.commons.cli.Options options69 = options20.addOption(option66);
        org.apache.commons.cli.Options options70 = options10.addOption(option66);
        boolean boolean72 = options10.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option74 = options10.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(optionGroupCollection42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(option74);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList6 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection7 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertNotNull(optionList6);
        org.junit.Assert.assertNotNull(optionGroupCollection7);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean17 = options15.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list18 = options15.getRequiredOptions();
        boolean boolean20 = options15.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean22 = options15.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list16 = options0.getRequiredOptions();
        boolean boolean18 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection19 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList20 = options0.helpOptions();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options21.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options21.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList26 = options21.helpOptions();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasShortOption("");
        org.apache.commons.cli.Options options33 = options27.addOption("", true, "");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasShortOption("");
        org.apache.commons.cli.Options options40 = options34.addOption("", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        boolean boolean44 = options40.hasOption("");
        org.apache.commons.cli.Option option46 = options40.getOption("");
        org.apache.commons.cli.Options options47 = options33.addOption(option46);
        org.apache.commons.cli.Options options48 = options21.addOption(option46);
        org.apache.commons.cli.Options options49 = options0.addOption(option46);
        boolean boolean51 = options49.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options55 = options49.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection19);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(optionList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Option option5 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList7 = options0.helpOptions();
        boolean boolean9 = options0.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list10 = options0.getRequiredOptions();
        boolean boolean12 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list13 = options0.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.lang.String str5 = options0.toString();
        boolean boolean7 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean12 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        org.apache.commons.cli.Options options10 = options0.addOption("", false, "hi!");
        boolean boolean12 = options10.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup37 = options19.getOptionGroup(option36);
        org.apache.commons.cli.OptionGroup optionGroup38 = options10.getOptionGroup(option36);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options10.getOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNull(optionGroup37);
        org.junit.Assert.assertNull(optionGroup38);
        org.junit.Assert.assertNotNull(optionCollection39);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        org.apache.commons.cli.Option option11 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options0.getOptions();
        boolean boolean14 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        boolean boolean28 = options26.hasShortOption("");
        org.apache.commons.cli.Options options32 = options26.addOption("", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasOption("");
        org.apache.commons.cli.Option option38 = options32.getOption("");
        org.apache.commons.cli.Options options39 = options21.addOption(option38);
        java.lang.String str40 = options21.toString();
        boolean boolean42 = options21.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        boolean boolean47 = options43.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        boolean boolean50 = options48.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList51 = options48.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList52 = options48.helpOptions();
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasShortOption("");
        org.apache.commons.cli.Options options59 = options53.addOption("", true, "");
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        boolean boolean62 = options60.hasShortOption("");
        org.apache.commons.cli.Options options66 = options60.addOption("", true, "");
        java.util.List<java.lang.String> strList68 = options66.getMatchingOptions("hi!");
        boolean boolean70 = options66.hasOption("");
        org.apache.commons.cli.Option option72 = options66.getOption("");
        org.apache.commons.cli.Options options73 = options59.addOption(option72);
        org.apache.commons.cli.OptionGroup optionGroup74 = options48.getOptionGroup(option72);
        org.apache.commons.cli.Options options75 = options43.addOption(option72);
        org.apache.commons.cli.OptionGroup optionGroup76 = options21.getOptionGroup(option72);
        org.apache.commons.cli.Options options77 = options0.addOption(option72);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection78 = options0.getOptionGroups();
        org.apache.commons.cli.Option option80 = options0.getOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(option38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str40, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(optionList51);
        org.junit.Assert.assertNotNull(optionList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNotNull(optionGroupCollection78);
        org.junit.Assert.assertNull(option80);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection14 = options10.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options10.getOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasShortOption("");
        org.apache.commons.cli.Options options22 = options16.addOption("", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList26 = options22.getMatchingOptions("");
        java.lang.String str27 = options22.toString();
        org.apache.commons.cli.Options options32 = options22.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list33 = options32.getRequiredOptions();
        java.util.List list34 = options32.getRequiredOptions();
        boolean boolean36 = options32.hasLongOption("");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        boolean boolean39 = options37.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection40 = options37.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options37.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList42 = options37.helpOptions();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        boolean boolean52 = options50.hasShortOption("");
        org.apache.commons.cli.Options options56 = options50.addOption("", true, "");
        java.util.List<java.lang.String> strList58 = options56.getMatchingOptions("hi!");
        boolean boolean60 = options56.hasOption("");
        org.apache.commons.cli.Option option62 = options56.getOption("");
        org.apache.commons.cli.Options options63 = options49.addOption(option62);
        org.apache.commons.cli.Options options64 = options37.addOption(option62);
        org.apache.commons.cli.Options options65 = options32.addOption(option62);
        org.apache.commons.cli.Options options66 = options10.addOption(option62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str27, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(optionCollection40);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(optionList42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(options66);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        boolean boolean4 = options2.hasShortOption("");
        org.apache.commons.cli.Options options8 = options2.addOption("", true, "");
        java.util.List<java.lang.String> strList10 = options8.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList12 = options8.getMatchingOptions("");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Option option25 = options19.getOption("");
        org.apache.commons.cli.Options options26 = options8.addOption(option25);
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList30 = options27.helpOptions();
        java.util.List<java.lang.String> strList32 = options27.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean34 = options27.hasOption("");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList45 = options41.getMatchingOptions("");
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        boolean boolean56 = options52.hasOption("");
        org.apache.commons.cli.Option option58 = options52.getOption("");
        org.apache.commons.cli.Options options59 = options41.addOption(option58);
        org.apache.commons.cli.Options options60 = options27.addOption(option58);
        org.apache.commons.cli.Options options61 = options8.addOption(option58);
        org.apache.commons.cli.Options options62 = options0.addOption(option58);
        org.apache.commons.cli.Options options67 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options71 = options67.addOption("", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean73 = options71.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(option58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("");
        boolean boolean14 = options10.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean16 = options10.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option18 = options10.getOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options19.helpOptions();
        java.util.List list23 = options19.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options19.getOptions();
        org.apache.commons.cli.Options options29 = options19.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList30 = options19.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList31 = options19.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options19.getOptions();
        org.apache.commons.cli.Option option34 = options19.getOption("");
        org.apache.commons.cli.Options options35 = options10.addOption(option34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(optionList31);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        boolean boolean11 = options0.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options0.getOptionGroups();
        java.lang.Class<?> wildcardClass13 = optionGroupCollection12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        boolean boolean9 = options7.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option11 = options7.getOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options7.helpOptions();
        boolean boolean14 = options7.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list15 = options7.getRequiredOptions();
        java.lang.Class<?> wildcardClass16 = options7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options10.helpOptions();
        org.apache.commons.cli.Options options15 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("");
        org.apache.commons.cli.Options options20 = options15.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean22 = options20.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]=[ option:  [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]  :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List<java.lang.String> strList8 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str9 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList10 = options0.helpOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList10);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str12 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection13 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection13);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str12 = options0.toString();
        java.util.List<java.lang.String> strList14 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str12, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        boolean boolean6 = options4.hasShortOption("");
        org.apache.commons.cli.Options options10 = options4.addOption("", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        boolean boolean14 = options10.hasOption("");
        org.apache.commons.cli.Option option16 = options10.getOption("");
        org.apache.commons.cli.Options options17 = options0.addOption(option16);
        boolean boolean19 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean21 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection22 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options0.helpOptions();
        boolean boolean25 = options0.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options28 = options0.addOption("hi!", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<java.lang.String> strList5 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean7 = options0.hasOption("");
        java.util.List list8 = options0.getRequiredOptions();
        java.lang.String str9 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList10 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options0.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options16 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        boolean boolean6 = options4.hasShortOption("");
        org.apache.commons.cli.Options options10 = options4.addOption("", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        boolean boolean14 = options10.hasOption("");
        org.apache.commons.cli.Option option16 = options10.getOption("");
        org.apache.commons.cli.Options options17 = options0.addOption(option16);
        java.util.List list18 = options17.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options17.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(optionCollection19);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options0.getOptions();
        boolean boolean14 = options0.hasOption("");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection26 = options21.getOptionGroups();
        boolean boolean28 = options21.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options33 = options21.addOption("", "", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList37 = options34.helpOptions();
        java.util.List list38 = options34.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options34.getOptions();
        org.apache.commons.cli.Options options44 = options34.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str45 = options44.toString();
        boolean boolean47 = options44.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean49 = options44.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        boolean boolean52 = options50.hasShortOption("");
        boolean boolean54 = options50.hasLongOption("");
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasShortOption("");
        org.apache.commons.cli.Options options61 = options55.addOption("", true, "");
        java.util.List<java.lang.String> strList63 = options61.getMatchingOptions("hi!");
        boolean boolean65 = options61.hasOption("");
        org.apache.commons.cli.Option option67 = options61.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup68 = options50.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup69 = options44.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup70 = options33.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup71 = options0.getOptionGroup(option67);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options0.getOptions();
        boolean boolean74 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean76 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list77 = options0.getRequiredOptions();
        boolean boolean79 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean81 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(optionGroupCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(optionList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str45, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List list3 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        boolean boolean6 = options4.hasShortOption("");
        org.apache.commons.cli.Options options10 = options4.addOption("", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList14 = options10.getMatchingOptions("");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        boolean boolean25 = options21.hasOption("");
        org.apache.commons.cli.Option option27 = options21.getOption("");
        org.apache.commons.cli.Options options28 = options10.addOption(option27);
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        boolean boolean31 = options29.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList32 = options29.helpOptions();
        java.util.List<java.lang.String> strList34 = options29.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean36 = options29.hasOption("");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        boolean boolean39 = options37.hasShortOption("");
        org.apache.commons.cli.Options options43 = options37.addOption("", true, "");
        java.util.List<java.lang.String> strList45 = options43.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList47 = options43.getMatchingOptions("");
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        boolean boolean50 = options48.hasShortOption("");
        org.apache.commons.cli.Options options54 = options48.addOption("", true, "");
        java.util.List<java.lang.String> strList56 = options54.getMatchingOptions("hi!");
        boolean boolean58 = options54.hasOption("");
        org.apache.commons.cli.Option option60 = options54.getOption("");
        org.apache.commons.cli.Options options61 = options43.addOption(option60);
        org.apache.commons.cli.Options options62 = options29.addOption(option60);
        org.apache.commons.cli.Options options63 = options10.addOption(option60);
        org.apache.commons.cli.OptionGroup optionGroup64 = options0.getOptionGroup(option60);
        boolean boolean66 = options0.hasLongOption("hi!");
        org.apache.commons.cli.Options options71 = options0.addOption("", "hi!", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str72 = options0.toString();
        java.util.List<java.lang.String> strList74 = options0.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNull(optionGroup64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str72, "[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options11.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList15 = options11.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options11.getOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        java.util.List list20 = options17.getRequiredOptions();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList31 = options27.getMatchingOptions("");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options27.addOption(option44);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList49 = options46.helpOptions();
        java.util.List<java.lang.String> strList51 = options46.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean53 = options46.hasOption("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList64 = options60.getMatchingOptions("");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        boolean boolean67 = options65.hasShortOption("");
        org.apache.commons.cli.Options options71 = options65.addOption("", true, "");
        java.util.List<java.lang.String> strList73 = options71.getMatchingOptions("hi!");
        boolean boolean75 = options71.hasOption("");
        org.apache.commons.cli.Option option77 = options71.getOption("");
        org.apache.commons.cli.Options options78 = options60.addOption(option77);
        org.apache.commons.cli.Options options79 = options46.addOption(option77);
        org.apache.commons.cli.Options options80 = options27.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup81 = options17.getOptionGroup(option77);
        org.apache.commons.cli.Options options82 = options11.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup83 = options0.getOptionGroup(option77);
        boolean boolean85 = options0.hasOption("hi!");
        org.apache.commons.cli.Options options88 = options0.addOption("", "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option90 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean92 = options0.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options97 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(optionList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNull(optionGroup83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(options88);
        org.junit.Assert.assertNull(option90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        boolean boolean8 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean10 = options0.hasLongOption("hi!");
        java.lang.Class<?> wildcardClass11 = options0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options7.helpOptions();
        java.util.List list11 = options7.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options7.getOptions();
        org.apache.commons.cli.Options options17 = options7.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str18 = options17.toString();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options19.getOptions();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Option option35 = options29.getOption("");
        org.apache.commons.cli.Options options36 = options19.addOption(option35);
        org.apache.commons.cli.Options options37 = options17.addOption(option35);
        java.util.List<java.lang.String> strList39 = options17.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList43 = options40.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList44 = options40.helpOptions();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        boolean boolean47 = options45.hasShortOption("");
        org.apache.commons.cli.Options options51 = options45.addOption("", true, "");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        boolean boolean54 = options52.hasShortOption("");
        org.apache.commons.cli.Options options58 = options52.addOption("", true, "");
        java.util.List<java.lang.String> strList60 = options58.getMatchingOptions("hi!");
        boolean boolean62 = options58.hasOption("");
        org.apache.commons.cli.Option option64 = options58.getOption("");
        org.apache.commons.cli.Options options65 = options51.addOption(option64);
        org.apache.commons.cli.OptionGroup optionGroup66 = options40.getOptionGroup(option64);
        org.apache.commons.cli.OptionGroup optionGroup67 = options17.getOptionGroup(option64);
        org.apache.commons.cli.Options options68 = options0.addOption(option64);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options68.getOptions();
        boolean boolean71 = options68.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str18, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(optionList43);
        org.junit.Assert.assertNotNull(optionList44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(optionGroup66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options25.helpOptions();
        java.util.List<java.lang.String> strList30 = options25.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean32 = options25.hasOption("");
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        boolean boolean35 = options33.hasShortOption("");
        org.apache.commons.cli.Options options39 = options33.addOption("", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList43 = options39.getMatchingOptions("");
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        boolean boolean46 = options44.hasShortOption("");
        org.apache.commons.cli.Options options50 = options44.addOption("", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        boolean boolean54 = options50.hasOption("");
        org.apache.commons.cli.Option option56 = options50.getOption("");
        org.apache.commons.cli.Options options57 = options39.addOption(option56);
        org.apache.commons.cli.Options options58 = options25.addOption(option56);
        org.apache.commons.cli.Options options59 = options6.addOption(option56);
        java.util.List<org.apache.commons.cli.Option> optionList60 = options6.helpOptions();
        org.apache.commons.cli.Option option62 = options6.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option64 = options6.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean66 = options6.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean68 = options6.hasOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList69 = options6.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection70 = options6.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(optionList60);
        org.junit.Assert.assertNull(option62);
        org.junit.Assert.assertNull(option64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(optionList69);
        org.junit.Assert.assertNotNull(optionCollection70);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options6.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean10 = options6.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options6.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection11);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options1.helpOptions();
        java.util.List<java.lang.String> strList4 = options1.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean6 = options1.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options1.getOptions();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options14.getMatchingOptions("");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasShortOption("");
        org.apache.commons.cli.Options options25 = options19.addOption("", true, "");
        java.util.List<java.lang.String> strList27 = options25.getMatchingOptions("hi!");
        boolean boolean29 = options25.hasOption("");
        org.apache.commons.cli.Option option31 = options25.getOption("");
        org.apache.commons.cli.Options options32 = options14.addOption(option31);
        org.apache.commons.cli.Options options33 = options1.addOption(option31);
        org.apache.commons.cli.OptionGroup optionGroup34 = options0.getOptionGroup(option31);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNull(optionGroup34);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options0.getOptionGroups();
        org.apache.commons.cli.Option option14 = options0.getOption("");
        java.util.List list15 = options0.getRequiredOptions();
        java.util.List<java.lang.String> strList17 = options0.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean19 = options0.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection20 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection20);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Option option5 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list6 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList8 = options7.helpOptions();
        java.util.List<java.lang.String> strList10 = options7.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options11.getOptions();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        boolean boolean25 = options21.hasOption("");
        org.apache.commons.cli.Option option27 = options21.getOption("");
        org.apache.commons.cli.Options options28 = options11.addOption(option27);
        org.apache.commons.cli.Options options29 = options7.addOption(option27);
        org.apache.commons.cli.OptionGroup optionGroup30 = options0.getOptionGroup(option27);
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList41 = options37.getMatchingOptions("");
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        boolean boolean44 = options42.hasShortOption("");
        org.apache.commons.cli.Options options48 = options42.addOption("", true, "");
        java.util.List<java.lang.String> strList50 = options48.getMatchingOptions("hi!");
        boolean boolean52 = options48.hasOption("");
        org.apache.commons.cli.Option option54 = options48.getOption("");
        org.apache.commons.cli.Options options55 = options37.addOption(option54);
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList59 = options56.helpOptions();
        java.util.List<java.lang.String> strList61 = options56.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean63 = options56.hasOption("");
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        boolean boolean66 = options64.hasShortOption("");
        org.apache.commons.cli.Options options70 = options64.addOption("", true, "");
        java.util.List<java.lang.String> strList72 = options70.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList74 = options70.getMatchingOptions("");
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        boolean boolean77 = options75.hasShortOption("");
        org.apache.commons.cli.Options options81 = options75.addOption("", true, "");
        java.util.List<java.lang.String> strList83 = options81.getMatchingOptions("hi!");
        boolean boolean85 = options81.hasOption("");
        org.apache.commons.cli.Option option87 = options81.getOption("");
        org.apache.commons.cli.Options options88 = options70.addOption(option87);
        org.apache.commons.cli.Options options89 = options56.addOption(option87);
        org.apache.commons.cli.Options options90 = options37.addOption(option87);
        org.apache.commons.cli.Options options91 = options0.addOption(option87);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection92 = options91.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNull(optionGroup30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(optionList59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(option87);
        org.junit.Assert.assertNotNull(options88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(options90);
        org.junit.Assert.assertNotNull(options91);
        org.junit.Assert.assertNotNull(optionGroupCollection92);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options13 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]");
        java.util.List list14 = options13.getRequiredOptions();
        boolean boolean16 = options13.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options21 = options13.addOption("", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "hi!");
        boolean boolean23 = options13.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection27 = options24.getOptions();
        org.apache.commons.cli.Option option29 = options24.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list30 = options24.getRequiredOptions();
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList32 = options31.helpOptions();
        java.util.List<java.lang.String> strList34 = options31.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection38 = options35.getOptions();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasShortOption("");
        org.apache.commons.cli.Options options45 = options39.addOption("", true, "");
        java.util.List<java.lang.String> strList47 = options45.getMatchingOptions("hi!");
        boolean boolean49 = options45.hasOption("");
        org.apache.commons.cli.Option option51 = options45.getOption("");
        org.apache.commons.cli.Options options52 = options35.addOption(option51);
        org.apache.commons.cli.Options options53 = options31.addOption(option51);
        org.apache.commons.cli.OptionGroup optionGroup54 = options24.getOptionGroup(option51);
        org.apache.commons.cli.OptionGroup optionGroup55 = options13.getOptionGroup(option51);
        org.apache.commons.cli.Option option57 = options13.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(optionCollection27);
        org.junit.Assert.assertNull(option29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(optionList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(optionCollection38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNull(option57);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList6 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options7.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options7.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options7.helpOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Option option32 = options26.getOption("");
        org.apache.commons.cli.Options options33 = options19.addOption(option32);
        org.apache.commons.cli.Options options34 = options7.addOption(option32);
        org.apache.commons.cli.Options options35 = options0.addOption(option32);
        boolean boolean37 = options35.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options6.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options6.getOptionGroups();
        org.apache.commons.cli.Option option14 = options6.getOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options6.getOptions();
        boolean boolean17 = options6.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        org.apache.commons.cli.Option option8 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList10 = options9.helpOptions();
        java.util.List<java.lang.String> strList12 = options9.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean14 = options9.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options9.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection16 = options9.getOptionGroups();
        java.util.List list17 = options9.getRequiredOptions();
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasShortOption("");
        org.apache.commons.cli.Options options24 = options18.addOption("", true, "");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasShortOption("");
        org.apache.commons.cli.Options options31 = options25.addOption("", true, "");
        java.util.List<java.lang.String> strList33 = options31.getMatchingOptions("hi!");
        boolean boolean35 = options31.hasOption("");
        org.apache.commons.cli.Option option37 = options31.getOption("");
        org.apache.commons.cli.Options options38 = options24.addOption(option37);
        boolean boolean40 = options24.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        boolean boolean43 = options41.hasShortOption("");
        org.apache.commons.cli.Options options47 = options41.addOption("", true, "");
        java.lang.String str48 = options47.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection49 = options47.getOptionGroups();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList51 = options50.helpOptions();
        java.util.List<java.lang.String> strList53 = options50.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean55 = options50.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList56 = options50.helpOptions();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        boolean boolean59 = options57.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options57.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection61 = options57.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList62 = options57.helpOptions();
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        boolean boolean65 = options63.hasShortOption("");
        org.apache.commons.cli.Options options69 = options63.addOption("", true, "");
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        boolean boolean72 = options70.hasShortOption("");
        org.apache.commons.cli.Options options76 = options70.addOption("", true, "");
        java.util.List<java.lang.String> strList78 = options76.getMatchingOptions("hi!");
        boolean boolean80 = options76.hasOption("");
        org.apache.commons.cli.Option option82 = options76.getOption("");
        org.apache.commons.cli.Options options83 = options69.addOption(option82);
        org.apache.commons.cli.Options options84 = options57.addOption(option82);
        org.apache.commons.cli.Options options85 = options50.addOption(option82);
        org.apache.commons.cli.OptionGroup optionGroup86 = options47.getOptionGroup(option82);
        org.apache.commons.cli.Options options87 = options24.addOption(option82);
        org.apache.commons.cli.OptionGroup optionGroup88 = options9.getOptionGroup(option82);
        org.apache.commons.cli.OptionGroup optionGroup89 = options0.getOptionGroup(option82);
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(optionGroupCollection16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str48, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection49);
        org.junit.Assert.assertNotNull(optionList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(optionList56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertNotNull(optionCollection61);
        org.junit.Assert.assertNotNull(optionList62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(option82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(options84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNull(optionGroup86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNull(optionGroup88);
        org.junit.Assert.assertNull(optionGroup89);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.lang.String str3 = options0.toString();
        java.util.List<java.lang.String> strList5 = options0.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        boolean boolean8 = options6.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList9 = options6.helpOptions();
        org.apache.commons.cli.Options options13 = options6.addOption("", true, "");
        java.util.List<org.apache.commons.cli.Option> optionList14 = options13.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options13.getOptionGroups();
        boolean boolean17 = options13.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasShortOption("");
        org.apache.commons.cli.Options options24 = options18.addOption("", true, "");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasShortOption("");
        org.apache.commons.cli.Options options31 = options25.addOption("", true, "");
        java.util.List<java.lang.String> strList33 = options31.getMatchingOptions("hi!");
        boolean boolean35 = options31.hasOption("");
        org.apache.commons.cli.Option option37 = options31.getOption("");
        org.apache.commons.cli.Options options38 = options24.addOption(option37);
        org.apache.commons.cli.OptionGroup optionGroup39 = options13.getOptionGroup(option37);
        org.apache.commons.cli.Options options40 = options0.addOption(option37);
        java.util.List<org.apache.commons.cli.Option> optionList41 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection42 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(optionList14);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNull(optionGroup39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertNotNull(optionGroupCollection42);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options6.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options6.getOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList23 = options19.getMatchingOptions("");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.Options options37 = options19.addOption(option36);
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        boolean boolean40 = options38.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList41 = options38.helpOptions();
        java.util.List<java.lang.String> strList43 = options38.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean45 = options38.hasOption("");
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList56 = options52.getMatchingOptions("");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        boolean boolean59 = options57.hasShortOption("");
        org.apache.commons.cli.Options options63 = options57.addOption("", true, "");
        java.util.List<java.lang.String> strList65 = options63.getMatchingOptions("hi!");
        boolean boolean67 = options63.hasOption("");
        org.apache.commons.cli.Option option69 = options63.getOption("");
        org.apache.commons.cli.Options options70 = options52.addOption(option69);
        org.apache.commons.cli.Options options71 = options38.addOption(option69);
        org.apache.commons.cli.Options options72 = options19.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup73 = options6.getOptionGroup(option69);
        java.util.List<org.apache.commons.cli.Option> optionList74 = options6.helpOptions();
        boolean boolean76 = options6.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options80 = options6.addOption("", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options84 = options6.addOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNotNull(optionList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(options80);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("");
        org.apache.commons.cli.Options options15 = options9.addOption("", true, "");
        java.util.List<java.lang.String> strList17 = options15.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList19 = options15.getMatchingOptions("");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options26 = options20.addOption("", true, "");
        java.util.List<java.lang.String> strList28 = options26.getMatchingOptions("hi!");
        boolean boolean30 = options26.hasOption("");
        org.apache.commons.cli.Option option32 = options26.getOption("");
        org.apache.commons.cli.Options options33 = options15.addOption(option32);
        java.lang.String str34 = options15.toString();
        boolean boolean36 = options15.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList37 = options15.helpOptions();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        boolean boolean40 = options38.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList41 = options38.helpOptions();
        java.util.List list42 = options38.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options38.getOptions();
        org.apache.commons.cli.Options options48 = options38.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str49 = options48.toString();
        boolean boolean51 = options48.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        boolean boolean54 = options52.hasShortOption("");
        org.apache.commons.cli.Options options58 = options52.addOption("", true, "");
        java.util.List<java.lang.String> strList60 = options58.getMatchingOptions("hi!");
        boolean boolean62 = options58.hasOption("");
        org.apache.commons.cli.Option option64 = options58.getOption("");
        org.apache.commons.cli.Options options65 = options48.addOption(option64);
        org.apache.commons.cli.Options options66 = options15.addOption(option64);
        org.apache.commons.cli.OptionGroup optionGroup67 = options0.getOptionGroup(option64);
        java.util.List list68 = options0.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str34, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(optionList37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str49, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<java.lang.String> strList15 = options10.getMatchingOptions("");
        org.apache.commons.cli.Options options19 = options10.addOption("", false, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList23 = options20.helpOptions();
        java.util.List list24 = options20.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options20.getOptions();
        org.apache.commons.cli.Options options30 = options20.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.util.List<java.lang.String> strList39 = options37.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList41 = options37.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection42 = options37.getOptionGroups();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        boolean boolean64 = options60.hasOption("");
        org.apache.commons.cli.Option option66 = options60.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup67 = options49.getOptionGroup(option66);
        org.apache.commons.cli.Options options68 = options37.addOption(option66);
        org.apache.commons.cli.Options options69 = options20.addOption(option66);
        org.apache.commons.cli.Options options70 = options10.addOption(option66);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection71 = options70.getOptions();
        org.apache.commons.cli.Option option73 = options70.getOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List list74 = options70.getRequiredOptions();
        boolean boolean76 = options70.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option78 = options70.getOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        boolean boolean80 = options70.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(optionGroupCollection42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(optionCollection71);
        org.junit.Assert.assertNull(option73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(option78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        org.apache.commons.cli.Options options10 = options0.addOption("", false, "hi!");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options0.getOptionGroups();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList15 = options12.helpOptions();
        java.util.List list16 = options12.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options12.getOptions();
        org.apache.commons.cli.Options options22 = options12.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options23.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection27 = options23.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList28 = options23.helpOptions();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        boolean boolean31 = options29.hasShortOption("");
        org.apache.commons.cli.Options options35 = options29.addOption("", true, "");
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options42 = options36.addOption("", true, "");
        java.util.List<java.lang.String> strList44 = options42.getMatchingOptions("hi!");
        boolean boolean46 = options42.hasOption("");
        org.apache.commons.cli.Option option48 = options42.getOption("");
        org.apache.commons.cli.Options options49 = options35.addOption(option48);
        org.apache.commons.cli.Options options50 = options23.addOption(option48);
        org.apache.commons.cli.Options options51 = options22.addOption(option48);
        org.apache.commons.cli.Options options52 = options0.addOption(option48);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasShortOption("");
        boolean boolean57 = options53.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        boolean boolean60 = options58.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList61 = options58.helpOptions();
        java.util.List list62 = options58.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection63 = options58.getOptions();
        org.apache.commons.cli.Options options68 = options58.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str69 = options68.toString();
        boolean boolean71 = options68.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        boolean boolean74 = options72.hasShortOption("");
        org.apache.commons.cli.Options options78 = options72.addOption("", true, "");
        java.util.List<java.lang.String> strList80 = options78.getMatchingOptions("hi!");
        boolean boolean82 = options78.hasOption("");
        org.apache.commons.cli.Option option84 = options78.getOption("");
        org.apache.commons.cli.Options options85 = options68.addOption(option84);
        org.apache.commons.cli.Options options86 = options53.addOption(option84);
        org.apache.commons.cli.Options options87 = options52.addOption(option84);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options90 = options87.addOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(optionCollection27);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(option48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(optionList61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(optionCollection63);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str69, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(option84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(options87);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options9.helpOptions();
        java.util.List list13 = options9.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options9.getOptions();
        java.util.List<java.lang.String> strList16 = options9.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options9.getMatchingOptions("");
        java.util.List<java.lang.String> strList20 = options9.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList21 = options9.helpOptions();
        org.apache.commons.cli.Options options24 = options9.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list25 = options9.getRequiredOptions();
        boolean boolean27 = options9.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection28 = options9.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList29 = options9.helpOptions();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        boolean boolean32 = options30.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options30.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection34 = options30.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList35 = options30.helpOptions();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options42 = options36.addOption("", true, "");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Option option55 = options49.getOption("");
        org.apache.commons.cli.Options options56 = options42.addOption(option55);
        org.apache.commons.cli.Options options57 = options30.addOption(option55);
        org.apache.commons.cli.Options options58 = options9.addOption(option55);
        org.apache.commons.cli.OptionGroup optionGroup59 = options0.getOptionGroup(option55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection28);
        org.junit.Assert.assertNotNull(optionList29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(optionCollection34);
        org.junit.Assert.assertNotNull(optionList35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNull(optionGroup59);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.lang.String str3 = options0.toString();
        boolean boolean5 = options0.hasOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        boolean boolean8 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean10 = options0.hasShortOption("");
        boolean boolean12 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean14 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options0.getOptionGroups();
        org.apache.commons.cli.Option option14 = options0.getOption("");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options21.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection27 = options21.getOptions();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        boolean boolean30 = options28.hasShortOption("");
        org.apache.commons.cli.Options options34 = options28.addOption("", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList38 = options34.getMatchingOptions("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasShortOption("");
        org.apache.commons.cli.Options options45 = options39.addOption("", true, "");
        java.util.List<java.lang.String> strList47 = options45.getMatchingOptions("hi!");
        boolean boolean49 = options45.hasOption("");
        org.apache.commons.cli.Option option51 = options45.getOption("");
        org.apache.commons.cli.Options options52 = options34.addOption(option51);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList56 = options53.helpOptions();
        java.util.List<java.lang.String> strList58 = options53.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean60 = options53.hasOption("");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        boolean boolean63 = options61.hasShortOption("");
        org.apache.commons.cli.Options options67 = options61.addOption("", true, "");
        java.util.List<java.lang.String> strList69 = options67.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList71 = options67.getMatchingOptions("");
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        boolean boolean74 = options72.hasShortOption("");
        org.apache.commons.cli.Options options78 = options72.addOption("", true, "");
        java.util.List<java.lang.String> strList80 = options78.getMatchingOptions("hi!");
        boolean boolean82 = options78.hasOption("");
        org.apache.commons.cli.Option option84 = options78.getOption("");
        org.apache.commons.cli.Options options85 = options67.addOption(option84);
        org.apache.commons.cli.Options options86 = options53.addOption(option84);
        org.apache.commons.cli.Options options87 = options34.addOption(option84);
        org.apache.commons.cli.OptionGroup optionGroup88 = options21.getOptionGroup(option84);
        org.apache.commons.cli.Options options89 = options0.addOption(option84);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection90 = options0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(optionCollection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(optionList56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(option84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNull(optionGroup88);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(optionCollection90);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options6.getOptionGroups();
        java.util.List list12 = options6.getRequiredOptions();
        java.util.List list13 = options6.getRequiredOptions();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList15 = options14.helpOptions();
        java.util.List<java.lang.String> strList17 = options14.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options18.getOptions();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasShortOption("");
        org.apache.commons.cli.Options options28 = options22.addOption("", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        boolean boolean32 = options28.hasOption("");
        org.apache.commons.cli.Option option34 = options28.getOption("");
        org.apache.commons.cli.Options options35 = options18.addOption(option34);
        org.apache.commons.cli.Options options36 = options14.addOption(option34);
        org.apache.commons.cli.Options options37 = options6.addOption(option34);
        boolean boolean39 = options6.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        boolean boolean41 = options6.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasShortOption("");
        org.apache.commons.cli.Options options13 = options7.addOption("", true, "");
        java.util.List<java.lang.String> strList15 = options13.getMatchingOptions("hi!");
        boolean boolean17 = options13.hasOption("");
        org.apache.commons.cli.Option option19 = options13.getOption("");
        org.apache.commons.cli.Options options20 = options6.addOption(option19);
        org.apache.commons.cli.Options options23 = options20.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList25 = options23.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        boolean boolean28 = options26.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList29 = options26.helpOptions();
        java.util.List list30 = options26.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options26.getOptions();
        org.apache.commons.cli.Options options36 = options26.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options39.getOptions();
        java.lang.String str43 = options39.toString();
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        boolean boolean46 = options44.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection47 = options44.getOptions();
        org.apache.commons.cli.Option option49 = options44.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list50 = options44.getRequiredOptions();
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList52 = options51.helpOptions();
        java.util.List<java.lang.String> strList54 = options51.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection58 = options55.getOptions();
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        boolean boolean61 = options59.hasShortOption("");
        org.apache.commons.cli.Options options65 = options59.addOption("", true, "");
        java.util.List<java.lang.String> strList67 = options65.getMatchingOptions("hi!");
        boolean boolean69 = options65.hasOption("");
        org.apache.commons.cli.Option option71 = options65.getOption("");
        org.apache.commons.cli.Options options72 = options55.addOption(option71);
        org.apache.commons.cli.Options options73 = options51.addOption(option71);
        org.apache.commons.cli.OptionGroup optionGroup74 = options44.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup75 = options39.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup76 = options36.getOptionGroup(option71);
        org.apache.commons.cli.OptionGroup optionGroup77 = options23.getOptionGroup(option71);
        boolean boolean79 = options23.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(optionList29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str43, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(optionCollection47);
        org.junit.Assert.assertNull(option49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(optionList52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(optionCollection58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options25.helpOptions();
        java.util.List<java.lang.String> strList30 = options25.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean32 = options25.hasOption("");
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        boolean boolean35 = options33.hasShortOption("");
        org.apache.commons.cli.Options options39 = options33.addOption("", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList43 = options39.getMatchingOptions("");
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        boolean boolean46 = options44.hasShortOption("");
        org.apache.commons.cli.Options options50 = options44.addOption("", true, "");
        java.util.List<java.lang.String> strList52 = options50.getMatchingOptions("hi!");
        boolean boolean54 = options50.hasOption("");
        org.apache.commons.cli.Option option56 = options50.getOption("");
        org.apache.commons.cli.Options options57 = options39.addOption(option56);
        org.apache.commons.cli.Options options58 = options25.addOption(option56);
        org.apache.commons.cli.Options options59 = options6.addOption(option56);
        java.util.List<org.apache.commons.cli.Option> optionList60 = options6.helpOptions();
        org.apache.commons.cli.Option option62 = options6.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option64 = options6.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str65 = options6.toString();
        java.util.List list66 = options6.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection67 = options6.getOptions();
        java.util.List<java.lang.String> strList69 = options6.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean71 = options6.hasLongOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(optionList60);
        org.junit.Assert.assertNull(option62);
        org.junit.Assert.assertNull(option64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str65, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(optionCollection67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        boolean boolean5 = options0.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList7 = options0.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertNotNull(optionList7);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        boolean boolean5 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str6 = options0.toString();
        boolean boolean8 = options0.hasOption("");
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList10 = options9.helpOptions();
        java.util.List<java.lang.String> strList12 = options9.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean14 = options9.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options9.getOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasShortOption("");
        org.apache.commons.cli.Options options22 = options16.addOption("", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList26 = options22.getMatchingOptions("");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasShortOption("");
        org.apache.commons.cli.Options options33 = options27.addOption("", true, "");
        java.util.List<java.lang.String> strList35 = options33.getMatchingOptions("hi!");
        boolean boolean37 = options33.hasOption("");
        org.apache.commons.cli.Option option39 = options33.getOption("");
        org.apache.commons.cli.Options options40 = options22.addOption(option39);
        org.apache.commons.cli.Options options41 = options9.addOption(option39);
        org.apache.commons.cli.Options options42 = options0.addOption(option39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options46 = options42.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(option39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(options42);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        boolean boolean5 = options3.hasShortOption("");
        org.apache.commons.cli.Options options9 = options3.addOption("", true, "");
        java.util.List<java.lang.String> strList11 = options9.getMatchingOptions("hi!");
        boolean boolean13 = options9.hasOption("");
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        boolean boolean16 = options14.hasShortOption("");
        org.apache.commons.cli.Options options20 = options14.addOption("", true, "");
        java.util.List<java.lang.String> strList22 = options20.getMatchingOptions("hi!");
        boolean boolean24 = options20.hasOption("");
        org.apache.commons.cli.Option option26 = options20.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup27 = options9.getOptionGroup(option26);
        org.apache.commons.cli.Options options28 = options0.addOption(option26);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection29 = options28.getOptionGroups();
        boolean boolean31 = options28.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(optionGroupCollection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        boolean boolean7 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        boolean boolean25 = options21.hasOption("");
        org.apache.commons.cli.Option option27 = options21.getOption("");
        org.apache.commons.cli.Options options28 = options14.addOption(option27);
        boolean boolean30 = options14.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasShortOption("");
        org.apache.commons.cli.Options options37 = options31.addOption("", true, "");
        java.lang.String str38 = options37.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection39 = options37.getOptionGroups();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList41 = options40.helpOptions();
        java.util.List<java.lang.String> strList43 = options40.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean45 = options40.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList46 = options40.helpOptions();
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        boolean boolean49 = options47.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection50 = options47.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options47.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList52 = options47.helpOptions();
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasShortOption("");
        org.apache.commons.cli.Options options59 = options53.addOption("", true, "");
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        boolean boolean62 = options60.hasShortOption("");
        org.apache.commons.cli.Options options66 = options60.addOption("", true, "");
        java.util.List<java.lang.String> strList68 = options66.getMatchingOptions("hi!");
        boolean boolean70 = options66.hasOption("");
        org.apache.commons.cli.Option option72 = options66.getOption("");
        org.apache.commons.cli.Options options73 = options59.addOption(option72);
        org.apache.commons.cli.Options options74 = options47.addOption(option72);
        org.apache.commons.cli.Options options75 = options40.addOption(option72);
        org.apache.commons.cli.OptionGroup optionGroup76 = options37.getOptionGroup(option72);
        org.apache.commons.cli.Options options77 = options14.addOption(option72);
        org.apache.commons.cli.OptionGroup optionGroup78 = options0.getOptionGroup(option72);
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(option27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str38, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection39);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(optionList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(optionCollection50);
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(optionList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(option72);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertNull(optionGroup78);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean15 = options10.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options20 = options10.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList22 = options20.helpOptions();
        java.util.List list23 = options20.getRequiredOptions();
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options20.addOptionGroup(optionGroup24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean15 = options10.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options20 = options10.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList22 = options20.helpOptions();
        org.apache.commons.cli.Option option24 = options20.getOption("");
        java.util.List list25 = options20.getRequiredOptions();
        java.util.List list26 = options20.getRequiredOptions();
        java.lang.String str27 = options20.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str11, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]" + "'", str27, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        boolean boolean10 = options6.hasOption("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup24 = options6.getOptionGroup(option23);
        boolean boolean26 = options6.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list27 = options6.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.lang.String str6 = options0.toString();
        boolean boolean8 = options0.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        boolean boolean9 = options7.hasOption("hi!");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        java.util.List<java.lang.String> strList18 = options16.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList20 = options16.getMatchingOptions("");
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        boolean boolean31 = options27.hasOption("");
        org.apache.commons.cli.Option option33 = options27.getOption("");
        org.apache.commons.cli.Options options34 = options16.addOption(option33);
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList38 = options35.helpOptions();
        java.util.List<java.lang.String> strList40 = options35.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean42 = options35.hasOption("");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList53 = options49.getMatchingOptions("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        boolean boolean64 = options60.hasOption("");
        org.apache.commons.cli.Option option66 = options60.getOption("");
        org.apache.commons.cli.Options options67 = options49.addOption(option66);
        org.apache.commons.cli.Options options68 = options35.addOption(option66);
        org.apache.commons.cli.Options options69 = options16.addOption(option66);
        org.apache.commons.cli.Options options70 = options7.addOption(option66);
        java.util.List<org.apache.commons.cli.Option> optionList71 = options70.helpOptions();
        java.util.List<java.lang.String> strList73 = options70.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options77 = options70.addOption("", false, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean79 = options77.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(optionList38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(optionList71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(options77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options0.getOptions();
        boolean boolean14 = options0.hasOption("");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection26 = options21.getOptionGroups();
        boolean boolean28 = options21.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options33 = options21.addOption("", "", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList37 = options34.helpOptions();
        java.util.List list38 = options34.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options34.getOptions();
        org.apache.commons.cli.Options options44 = options34.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str45 = options44.toString();
        boolean boolean47 = options44.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean49 = options44.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        boolean boolean52 = options50.hasShortOption("");
        boolean boolean54 = options50.hasLongOption("");
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasShortOption("");
        org.apache.commons.cli.Options options61 = options55.addOption("", true, "");
        java.util.List<java.lang.String> strList63 = options61.getMatchingOptions("hi!");
        boolean boolean65 = options61.hasOption("");
        org.apache.commons.cli.Option option67 = options61.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup68 = options50.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup69 = options44.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup70 = options33.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup71 = options0.getOptionGroup(option67);
        java.util.List<java.lang.String> strList73 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option75 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<java.lang.String> strList77 = options0.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection78 = options0.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(optionGroupCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(optionList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str45, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(option75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(optionGroupCollection78);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        boolean boolean8 = options6.hasShortOption("");
        org.apache.commons.cli.Options options12 = options6.addOption("", true, "");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Option option25 = options19.getOption("");
        org.apache.commons.cli.Options options26 = options12.addOption(option25);
        org.apache.commons.cli.Options options27 = options0.addOption(option25);
        java.util.List list28 = options27.getRequiredOptions();
        boolean boolean30 = options27.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean32 = options27.hasLongOption("hi!");
        java.util.List<java.lang.String> strList34 = options27.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options27.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(optionCollection35);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        boolean boolean4 = options2.hasShortOption("");
        org.apache.commons.cli.Options options8 = options2.addOption("", true, "");
        java.util.List<java.lang.String> strList10 = options8.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList12 = options8.getMatchingOptions("");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        boolean boolean23 = options19.hasOption("");
        org.apache.commons.cli.Option option25 = options19.getOption("");
        org.apache.commons.cli.Options options26 = options8.addOption(option25);
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList30 = options27.helpOptions();
        java.util.List<java.lang.String> strList32 = options27.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean34 = options27.hasOption("");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList45 = options41.getMatchingOptions("");
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        boolean boolean56 = options52.hasOption("");
        org.apache.commons.cli.Option option58 = options52.getOption("");
        org.apache.commons.cli.Options options59 = options41.addOption(option58);
        org.apache.commons.cli.Options options60 = options27.addOption(option58);
        org.apache.commons.cli.Options options61 = options8.addOption(option58);
        org.apache.commons.cli.Options options62 = options0.addOption(option58);
        org.apache.commons.cli.Options options67 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options71 = options67.addOption("", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option73 = options71.getOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean75 = options71.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean77 = options71.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(option58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNull(option73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.util.List list6 = options0.getRequiredOptions();
        java.util.List<org.apache.commons.cli.Option> optionList7 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        boolean boolean10 = options0.hasLongOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options6.helpOptions();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String str14 = options12.toString();
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList20 = options17.helpOptions();
        java.util.List list21 = options17.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options17.getOptions();
        org.apache.commons.cli.Options options27 = options17.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str28 = options27.toString();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        boolean boolean31 = options29.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options29.getOptions();
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        boolean boolean35 = options33.hasShortOption("");
        org.apache.commons.cli.Options options39 = options33.addOption("", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        boolean boolean43 = options39.hasOption("");
        org.apache.commons.cli.Option option45 = options39.getOption("");
        org.apache.commons.cli.Options options46 = options29.addOption(option45);
        org.apache.commons.cli.Options options47 = options27.addOption(option45);
        org.apache.commons.cli.OptionGroup optionGroup48 = options12.getOptionGroup(option45);
        org.apache.commons.cli.Options options49 = options6.addOption(option45);
        java.lang.String str50 = options49.toString();
        org.apache.commons.cli.Option option51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options52 = options49.addOption(option51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str14, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str28, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str50, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasLongOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options26 = options16.addOption("", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options31 = options16.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Option option55 = options49.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup56 = options38.getOptionGroup(option55);
        org.apache.commons.cli.Options options57 = options31.addOption(option55);
        boolean boolean59 = options57.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options57.getOptions();
        boolean boolean62 = options57.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str63 = options57.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNull(optionGroup56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ]" + "'", str63, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ]");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasShortOption("");
        org.apache.commons.cli.Options options11 = options5.addOption("", true, "");
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options11.addOption(option24);
        org.apache.commons.cli.OptionGroup optionGroup26 = options0.getOptionGroup(option24);
        java.util.List<java.lang.String> strList28 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options0.getOptions();
        org.apache.commons.cli.Options options34 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", false, "");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        boolean boolean45 = options41.hasOption("");
        org.apache.commons.cli.Option option47 = options41.getOption("");
        org.apache.commons.cli.Options options48 = options34.addOption(option47);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection49 = options34.getOptionGroups();
        boolean boolean51 = options34.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList52 = options34.helpOptions();
        java.util.List list53 = options34.getRequiredOptions();
        org.apache.commons.cli.OptionGroup optionGroup54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options55 = options34.addOptionGroup(optionGroup54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(optionGroupCollection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(optionList52);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        boolean boolean12 = options10.hasShortOption("");
        java.util.List list13 = options10.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options10.getOptions();
        boolean boolean16 = options10.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str17 = options10.toString();
        boolean boolean19 = options10.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str17, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        org.apache.commons.cli.Option option20 = options16.getOption("");
        boolean boolean22 = options16.hasLongOption("");
        boolean boolean24 = options16.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean26 = options16.hasShortOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        org.apache.commons.cli.Options options27 = options6.addOption("", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list28 = options6.getRequiredOptions();
        java.lang.String str29 = options6.toString();
        java.util.List<java.lang.String> strList31 = options6.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean33 = options6.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]" + "'", str29, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option17 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options21 = options0.addOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List<java.lang.String> strList5 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean7 = options0.hasOption("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList18 = options14.getMatchingOptions("");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasShortOption("");
        org.apache.commons.cli.Options options25 = options19.addOption("", true, "");
        java.util.List<java.lang.String> strList27 = options25.getMatchingOptions("hi!");
        boolean boolean29 = options25.hasOption("");
        org.apache.commons.cli.Option option31 = options25.getOption("");
        org.apache.commons.cli.Options options32 = options14.addOption(option31);
        org.apache.commons.cli.Options options33 = options0.addOption(option31);
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasShortOption("");
        org.apache.commons.cli.Options options40 = options34.addOption("", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList44 = options40.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection45 = options40.getOptionGroups();
        java.util.List list46 = options40.getRequiredOptions();
        java.util.List list47 = options40.getRequiredOptions();
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList49 = options48.helpOptions();
        java.util.List<java.lang.String> strList51 = options48.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        boolean boolean54 = options52.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options52.getOptions();
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasShortOption("");
        org.apache.commons.cli.Options options62 = options56.addOption("", true, "");
        java.util.List<java.lang.String> strList64 = options62.getMatchingOptions("hi!");
        boolean boolean66 = options62.hasOption("");
        org.apache.commons.cli.Option option68 = options62.getOption("");
        org.apache.commons.cli.Options options69 = options52.addOption(option68);
        org.apache.commons.cli.Options options70 = options48.addOption(option68);
        org.apache.commons.cli.Options options71 = options40.addOption(option68);
        org.apache.commons.cli.Options options72 = options0.addOption(option68);
        boolean boolean74 = options0.hasLongOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(optionGroupCollection45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(optionList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(option68);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options6.helpOptions();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String str14 = options12.toString();
        java.util.List<java.lang.String> strList16 = options12.getMatchingOptions("");
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList20 = options17.helpOptions();
        java.util.List list21 = options17.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options17.getOptions();
        org.apache.commons.cli.Options options27 = options17.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str28 = options27.toString();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        boolean boolean31 = options29.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options29.getOptions();
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        boolean boolean35 = options33.hasShortOption("");
        org.apache.commons.cli.Options options39 = options33.addOption("", true, "");
        java.util.List<java.lang.String> strList41 = options39.getMatchingOptions("hi!");
        boolean boolean43 = options39.hasOption("");
        org.apache.commons.cli.Option option45 = options39.getOption("");
        org.apache.commons.cli.Options options46 = options29.addOption(option45);
        org.apache.commons.cli.Options options47 = options27.addOption(option45);
        org.apache.commons.cli.OptionGroup optionGroup48 = options12.getOptionGroup(option45);
        org.apache.commons.cli.Options options49 = options6.addOption(option45);
        java.util.List list50 = options49.getRequiredOptions();
        java.lang.String str51 = options49.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str14, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionList20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str28, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(option45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str51, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList6 = options5.helpOptions();
        java.util.List<java.lang.String> strList8 = options5.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean10 = options5.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList12 = options5.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList16 = options13.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options13.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options13.getOptions();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasShortOption("");
        java.util.List list22 = options19.getRequiredOptions();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList33 = options29.getMatchingOptions("");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasShortOption("");
        org.apache.commons.cli.Options options40 = options34.addOption("", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        boolean boolean44 = options40.hasOption("");
        org.apache.commons.cli.Option option46 = options40.getOption("");
        org.apache.commons.cli.Options options47 = options29.addOption(option46);
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        boolean boolean50 = options48.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList51 = options48.helpOptions();
        java.util.List<java.lang.String> strList53 = options48.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean55 = options48.hasOption("");
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasShortOption("");
        org.apache.commons.cli.Options options62 = options56.addOption("", true, "");
        java.util.List<java.lang.String> strList64 = options62.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList66 = options62.getMatchingOptions("");
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        boolean boolean69 = options67.hasShortOption("");
        org.apache.commons.cli.Options options73 = options67.addOption("", true, "");
        java.util.List<java.lang.String> strList75 = options73.getMatchingOptions("hi!");
        boolean boolean77 = options73.hasOption("");
        org.apache.commons.cli.Option option79 = options73.getOption("");
        org.apache.commons.cli.Options options80 = options62.addOption(option79);
        org.apache.commons.cli.Options options81 = options48.addOption(option79);
        org.apache.commons.cli.Options options82 = options29.addOption(option79);
        org.apache.commons.cli.OptionGroup optionGroup83 = options19.getOptionGroup(option79);
        org.apache.commons.cli.OptionGroup optionGroup84 = options13.getOptionGroup(option79);
        org.apache.commons.cli.Options options85 = options5.addOption(option79);
        org.apache.commons.cli.Options options86 = options0.addOption(option79);
        java.util.List<org.apache.commons.cli.Option> optionList87 = options86.helpOptions();
        boolean boolean89 = options86.hasLongOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(optionList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(option79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNull(optionGroup83);
        org.junit.Assert.assertNull(optionGroup84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(optionList87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        boolean boolean3 = options0.hasShortOption("");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.List<java.lang.String> strList8 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options5.helpOptions();
        java.util.List list9 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options5.getOptions();
        org.apache.commons.cli.Options options15 = options5.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str16 = options15.toString();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options17.getOptions();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        boolean boolean31 = options27.hasOption("");
        org.apache.commons.cli.Option option33 = options27.getOption("");
        org.apache.commons.cli.Options options34 = options17.addOption(option33);
        org.apache.commons.cli.Options options35 = options15.addOption(option33);
        org.apache.commons.cli.OptionGroup optionGroup36 = options0.getOptionGroup(option33);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection37 = options0.getOptionGroups();
        boolean boolean39 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List list40 = options0.getRequiredOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str16, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(option33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNull(optionGroup36);
        org.junit.Assert.assertNotNull(optionGroupCollection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        boolean boolean8 = options6.hasShortOption("");
        boolean boolean10 = options6.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList14 = options11.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList15 = options11.helpOptions();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasShortOption("");
        org.apache.commons.cli.Options options22 = options16.addOption("", true, "");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Option option35 = options29.getOption("");
        org.apache.commons.cli.Options options36 = options22.addOption(option35);
        org.apache.commons.cli.OptionGroup optionGroup37 = options11.getOptionGroup(option35);
        org.apache.commons.cli.Options options38 = options6.addOption(option35);
        org.apache.commons.cli.Options options39 = options0.addOption(option35);
        java.lang.String str40 = options39.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options39.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList42 = options39.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionList14);
        org.junit.Assert.assertNotNull(optionList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNull(optionGroup37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str40, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(optionList42);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option17 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList21 = options18.helpOptions();
        java.util.List list22 = options18.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options18.getOptions();
        org.apache.commons.cli.Options options28 = options18.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str29 = options28.toString();
        boolean boolean31 = options28.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options28.addOption(option44);
        org.apache.commons.cli.OptionGroup optionGroup46 = options0.getOptionGroup(option44);
        org.apache.commons.cli.Option option48 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean50 = options0.hasShortOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options52 = options0.addOptionGroup(optionGroup51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str29, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNull(option48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Option option12 = options6.getOption("hi!");
        boolean boolean14 = options6.hasLongOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list15 = options6.getRequiredOptions();
        java.util.List<java.lang.String> strList17 = options6.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean19 = options6.hasOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options0.getOptions();
        boolean boolean14 = options0.hasOption("");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.List<java.lang.String> strList23 = options21.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList25 = options21.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection26 = options21.getOptionGroups();
        boolean boolean28 = options21.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options33 = options21.addOption("", "", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList37 = options34.helpOptions();
        java.util.List list38 = options34.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options34.getOptions();
        org.apache.commons.cli.Options options44 = options34.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str45 = options44.toString();
        boolean boolean47 = options44.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean49 = options44.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        boolean boolean52 = options50.hasShortOption("");
        boolean boolean54 = options50.hasLongOption("");
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasShortOption("");
        org.apache.commons.cli.Options options61 = options55.addOption("", true, "");
        java.util.List<java.lang.String> strList63 = options61.getMatchingOptions("hi!");
        boolean boolean65 = options61.hasOption("");
        org.apache.commons.cli.Option option67 = options61.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup68 = options50.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup69 = options44.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup70 = options33.getOptionGroup(option67);
        org.apache.commons.cli.OptionGroup optionGroup71 = options0.getOptionGroup(option67);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options0.getOptions();
        boolean boolean74 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList75 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection76 = options0.getOptionGroups();
        org.apache.commons.cli.Option option78 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList79 = options0.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(optionGroupCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(optionList37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str45, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(option67);
        org.junit.Assert.assertNull(optionGroup68);
        org.junit.Assert.assertNull(optionGroup69);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(optionList75);
        org.junit.Assert.assertNotNull(optionGroupCollection76);
        org.junit.Assert.assertNull(option78);
        org.junit.Assert.assertNotNull(optionList79);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        org.apache.commons.cli.Option option6 = options0.getOption("hi!");
        boolean boolean8 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option10 = options0.getOption("[ Options: [ short {} ] [ long {} ]");
        java.lang.String str11 = options0.toString();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String str14 = options12.toString();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        boolean boolean17 = options15.hasShortOption("");
        org.apache.commons.cli.Options options21 = options15.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options15.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList23 = options15.helpOptions();
        java.lang.String str24 = options15.toString();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasShortOption("");
        org.apache.commons.cli.Options options31 = options25.addOption("", true, "");
        java.util.List<java.lang.String> strList33 = options31.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList35 = options31.getMatchingOptions("");
        java.util.List<org.apache.commons.cli.Option> optionList36 = options31.helpOptions();
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection38 = options37.getOptions();
        java.lang.String str39 = options37.toString();
        java.util.List<java.lang.String> strList41 = options37.getMatchingOptions("");
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        boolean boolean44 = options42.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList45 = options42.helpOptions();
        java.util.List list46 = options42.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection47 = options42.getOptions();
        org.apache.commons.cli.Options options52 = options42.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str53 = options52.toString();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection57 = options54.getOptions();
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        boolean boolean60 = options58.hasShortOption("");
        org.apache.commons.cli.Options options64 = options58.addOption("", true, "");
        java.util.List<java.lang.String> strList66 = options64.getMatchingOptions("hi!");
        boolean boolean68 = options64.hasOption("");
        org.apache.commons.cli.Option option70 = options64.getOption("");
        org.apache.commons.cli.Options options71 = options54.addOption(option70);
        org.apache.commons.cli.Options options72 = options52.addOption(option70);
        org.apache.commons.cli.OptionGroup optionGroup73 = options37.getOptionGroup(option70);
        org.apache.commons.cli.Options options74 = options31.addOption(option70);
        org.apache.commons.cli.OptionGroup optionGroup75 = options15.getOptionGroup(option70);
        org.apache.commons.cli.Options options76 = options12.addOption(option70);
        org.apache.commons.cli.OptionGroup optionGroup77 = options0.getOptionGroup(option70);
        boolean boolean79 = options0.hasLongOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection80 = options0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options83 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str14, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertNotNull(optionList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str24, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(optionList36);
        org.junit.Assert.assertNotNull(optionCollection38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str39, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(optionList45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(optionCollection47);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str53, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(optionCollection57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(option70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(optionCollection80);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options6.getOptionGroups();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Option option35 = options29.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup36 = options18.getOptionGroup(option35);
        org.apache.commons.cli.Options options37 = options6.addOption(option35);
        java.util.List list38 = options6.getRequiredOptions();
        java.util.List list39 = options6.getRequiredOptions();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options40.getOptions();
        java.lang.String str44 = options40.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options40.getOptions();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        boolean boolean50 = options46.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        boolean boolean53 = options51.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList54 = options51.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList55 = options51.helpOptions();
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasShortOption("");
        org.apache.commons.cli.Options options62 = options56.addOption("", true, "");
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        boolean boolean65 = options63.hasShortOption("");
        org.apache.commons.cli.Options options69 = options63.addOption("", true, "");
        java.util.List<java.lang.String> strList71 = options69.getMatchingOptions("hi!");
        boolean boolean73 = options69.hasOption("");
        org.apache.commons.cli.Option option75 = options69.getOption("");
        org.apache.commons.cli.Options options76 = options62.addOption(option75);
        org.apache.commons.cli.OptionGroup optionGroup77 = options51.getOptionGroup(option75);
        org.apache.commons.cli.Options options78 = options46.addOption(option75);
        org.apache.commons.cli.Options options79 = options40.addOption(option75);
        org.apache.commons.cli.Options options80 = options6.addOption(option75);
        java.util.List<java.lang.String> strList82 = options80.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean84 = options80.hasLongOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNull(optionGroup36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str44, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(optionList54);
        org.junit.Assert.assertNotNull(optionList55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(options69);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(option75);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNull(optionGroup77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        java.lang.String str11 = options6.toString();
        org.apache.commons.cli.Options options16 = options6.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "");
        java.util.List list17 = options16.getRequiredOptions();
        java.util.List list18 = options16.getRequiredOptions();
        boolean boolean20 = options16.hasLongOption("");
        org.apache.commons.cli.Option option22 = options16.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options23.getOptions();
        java.lang.String str25 = options23.toString();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        boolean boolean28 = options26.hasShortOption("");
        org.apache.commons.cli.Options options32 = options26.addOption("", true, "");
        java.util.List<java.lang.String> strList34 = options32.getMatchingOptions("hi!");
        boolean boolean36 = options32.hasOption("");
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        boolean boolean39 = options37.hasShortOption("");
        org.apache.commons.cli.Options options43 = options37.addOption("", true, "");
        java.util.List<java.lang.String> strList45 = options43.getMatchingOptions("hi!");
        boolean boolean47 = options43.hasOption("");
        org.apache.commons.cli.Option option49 = options43.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup50 = options32.getOptionGroup(option49);
        org.apache.commons.cli.Options options51 = options23.addOption(option49);
        org.apache.commons.cli.OptionGroup optionGroup52 = options16.getOptionGroup(option49);
        org.apache.commons.cli.Option option54 = options16.getOption("");
        boolean boolean56 = options16.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean58 = options16.hasLongOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList60 = options16.getMatchingOptions("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str11, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str25, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(option49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNull(optionGroup52);
        org.junit.Assert.assertNotNull(option54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        boolean boolean7 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List list8 = options0.getRequiredOptions();
        java.lang.String str9 = options0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options13 = options0.addOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.lang.String str5 = options0.toString();
        boolean boolean7 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options8.getOptions();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        boolean boolean22 = options18.hasOption("");
        org.apache.commons.cli.Option option24 = options18.getOption("");
        org.apache.commons.cli.Options options25 = options8.addOption(option24);
        org.apache.commons.cli.Options options26 = options0.addOption(option24);
        java.lang.String str27 = options0.toString();
        org.apache.commons.cli.Option option29 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        java.util.List list30 = options0.getRequiredOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str27, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNull(option29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        boolean boolean6 = options4.hasShortOption("");
        org.apache.commons.cli.Options options10 = options4.addOption("", true, "");
        java.util.List<java.lang.String> strList12 = options10.getMatchingOptions("hi!");
        boolean boolean14 = options10.hasOption("");
        org.apache.commons.cli.Option option16 = options10.getOption("");
        org.apache.commons.cli.Options options17 = options0.addOption(option16);
        org.apache.commons.cli.Options options18 = new org.apache.commons.cli.Options();
        boolean boolean20 = options18.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList21 = options18.helpOptions();
        org.apache.commons.cli.Options options25 = options18.addOption("", true, "");
        boolean boolean27 = options25.hasOption("hi!");
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        boolean boolean30 = options28.hasShortOption("");
        org.apache.commons.cli.Options options34 = options28.addOption("", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList38 = options34.getMatchingOptions("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasShortOption("");
        org.apache.commons.cli.Options options45 = options39.addOption("", true, "");
        java.util.List<java.lang.String> strList47 = options45.getMatchingOptions("hi!");
        boolean boolean49 = options45.hasOption("");
        org.apache.commons.cli.Option option51 = options45.getOption("");
        org.apache.commons.cli.Options options52 = options34.addOption(option51);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        boolean boolean55 = options53.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList56 = options53.helpOptions();
        java.util.List<java.lang.String> strList58 = options53.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean60 = options53.hasOption("");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        boolean boolean63 = options61.hasShortOption("");
        org.apache.commons.cli.Options options67 = options61.addOption("", true, "");
        java.util.List<java.lang.String> strList69 = options67.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList71 = options67.getMatchingOptions("");
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        boolean boolean74 = options72.hasShortOption("");
        org.apache.commons.cli.Options options78 = options72.addOption("", true, "");
        java.util.List<java.lang.String> strList80 = options78.getMatchingOptions("hi!");
        boolean boolean82 = options78.hasOption("");
        org.apache.commons.cli.Option option84 = options78.getOption("");
        org.apache.commons.cli.Options options85 = options67.addOption(option84);
        org.apache.commons.cli.Options options86 = options53.addOption(option84);
        org.apache.commons.cli.Options options87 = options34.addOption(option84);
        org.apache.commons.cli.Options options88 = options25.addOption(option84);
        org.apache.commons.cli.OptionGroup optionGroup89 = options0.getOptionGroup(option84);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection90 = options0.getOptionGroups();
        boolean boolean92 = options0.hasLongOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.lang.Class<?> wildcardClass93 = options0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(optionList56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(option84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNotNull(options88);
        org.junit.Assert.assertNull(optionGroup89);
        org.junit.Assert.assertNotNull(optionGroupCollection90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection7 = options0.getOptionGroups();
        java.lang.String str8 = options0.toString();
        boolean boolean10 = options0.hasShortOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str11 = options0.toString();
        org.apache.commons.cli.Options options14 = options0.addOption("", "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str8, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options14);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection2 = options0.getOptionGroups();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        boolean boolean5 = options3.hasShortOption("");
        boolean boolean7 = options3.hasLongOption("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasShortOption("");
        org.apache.commons.cli.Options options14 = options8.addOption("", true, "");
        java.util.List<java.lang.String> strList16 = options14.getMatchingOptions("hi!");
        boolean boolean18 = options14.hasOption("");
        org.apache.commons.cli.Option option20 = options14.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup21 = options3.getOptionGroup(option20);
        org.apache.commons.cli.Options options22 = options0.addOption(option20);
        java.util.List<java.lang.String> strList24 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean26 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasShortOption("");
        org.apache.commons.cli.Options options33 = options27.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection34 = options27.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList35 = options27.helpOptions();
        java.lang.String str36 = options27.toString();
        java.util.List list37 = options27.getRequiredOptions();
        java.util.List<java.lang.String> strList39 = options27.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList41 = options27.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option43 = options27.getOption("");
        org.apache.commons.cli.Options options44 = options0.addOption(option43);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection45 = options44.getOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionGroupCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(option20);
        org.junit.Assert.assertNull(optionGroup21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(optionCollection34);
        org.junit.Assert.assertNotNull(optionList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str36, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(optionCollection45);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        boolean boolean5 = options0.hasLongOption("");
        org.apache.commons.cli.Options options9 = options0.addOption("", false, "hi!");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection10 = options9.getOptionGroups();
        org.apache.commons.cli.Option option12 = options9.getOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        boolean boolean14 = options9.hasLongOption("[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(optionGroupCollection10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.lang.String str7 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("");
        java.util.List list12 = options9.getRequiredOptions();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList23 = options19.getMatchingOptions("");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.Options options37 = options19.addOption(option36);
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        boolean boolean40 = options38.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList41 = options38.helpOptions();
        java.util.List<java.lang.String> strList43 = options38.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean45 = options38.hasOption("");
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasShortOption("");
        org.apache.commons.cli.Options options52 = options46.addOption("", true, "");
        java.util.List<java.lang.String> strList54 = options52.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList56 = options52.getMatchingOptions("");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        boolean boolean59 = options57.hasShortOption("");
        org.apache.commons.cli.Options options63 = options57.addOption("", true, "");
        java.util.List<java.lang.String> strList65 = options63.getMatchingOptions("hi!");
        boolean boolean67 = options63.hasOption("");
        org.apache.commons.cli.Option option69 = options63.getOption("");
        org.apache.commons.cli.Options options70 = options52.addOption(option69);
        org.apache.commons.cli.Options options71 = options38.addOption(option69);
        org.apache.commons.cli.Options options72 = options19.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup73 = options9.getOptionGroup(option69);
        org.apache.commons.cli.OptionGroup optionGroup74 = options0.getOptionGroup(option69);
        java.util.List<org.apache.commons.cli.Option> optionList75 = options0.helpOptions();
        boolean boolean77 = options0.hasLongOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str7, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(optionList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(optionList75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        java.lang.String str25 = options6.toString();
        boolean boolean27 = options6.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options6.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options32 = options6.addOption("[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options11.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options11.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options11.helpOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        org.apache.commons.cli.Options options23 = options17.addOption("", true, "");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.Options options37 = options23.addOption(option36);
        org.apache.commons.cli.Options options38 = options11.addOption(option36);
        org.apache.commons.cli.Options options39 = options10.addOption(option36);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection40 = options39.getOptionGroups();
        org.apache.commons.cli.Options options44 = options39.addOption("", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(optionGroupCollection40);
        org.junit.Assert.assertNotNull(options44);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasShortOption("");
        org.apache.commons.cli.Options options13 = options7.addOption("", true, "");
        java.util.List<java.lang.String> strList15 = options13.getMatchingOptions("hi!");
        boolean boolean17 = options13.hasOption("");
        org.apache.commons.cli.Option option19 = options13.getOption("");
        org.apache.commons.cli.Options options20 = options6.addOption(option19);
        boolean boolean22 = options20.hasShortOption("");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList33 = options29.getMatchingOptions("");
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        boolean boolean36 = options34.hasShortOption("");
        org.apache.commons.cli.Options options40 = options34.addOption("", true, "");
        java.util.List<java.lang.String> strList42 = options40.getMatchingOptions("hi!");
        boolean boolean44 = options40.hasOption("");
        org.apache.commons.cli.Option option46 = options40.getOption("");
        org.apache.commons.cli.Options options47 = options29.addOption(option46);
        java.lang.String str48 = options29.toString();
        boolean boolean50 = options29.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList51 = options29.helpOptions();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        boolean boolean54 = options52.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList55 = options52.helpOptions();
        java.util.List list56 = options52.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection57 = options52.getOptions();
        org.apache.commons.cli.Options options62 = options52.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str63 = options62.toString();
        boolean boolean65 = options62.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        boolean boolean68 = options66.hasShortOption("");
        org.apache.commons.cli.Options options72 = options66.addOption("", true, "");
        java.util.List<java.lang.String> strList74 = options72.getMatchingOptions("hi!");
        boolean boolean76 = options72.hasOption("");
        org.apache.commons.cli.Option option78 = options72.getOption("");
        org.apache.commons.cli.Options options79 = options62.addOption(option78);
        org.apache.commons.cli.Options options80 = options29.addOption(option78);
        org.apache.commons.cli.Options options81 = options20.addOption(option78);
        boolean boolean83 = options20.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(option46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str48, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(optionList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(optionList55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(optionCollection57);
        org.junit.Assert.assertNotNull(options62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str63, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(option78);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        boolean boolean5 = options3.hasShortOption("");
        org.apache.commons.cli.Options options9 = options3.addOption("", true, "");
        java.util.List<java.lang.String> strList11 = options9.getMatchingOptions("hi!");
        boolean boolean13 = options9.hasOption("");
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        boolean boolean16 = options14.hasShortOption("");
        org.apache.commons.cli.Options options20 = options14.addOption("", true, "");
        java.util.List<java.lang.String> strList22 = options20.getMatchingOptions("hi!");
        boolean boolean24 = options20.hasOption("");
        org.apache.commons.cli.Option option26 = options20.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup27 = options9.getOptionGroup(option26);
        org.apache.commons.cli.Options options28 = options0.addOption(option26);
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option32 = options28.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList33 = options28.helpOptions();
        java.util.List<java.lang.String> strList35 = options28.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(option26);
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNull(option32);
        org.junit.Assert.assertNotNull(optionList33);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List list5 = options0.getRequiredOptions();
        org.apache.commons.cli.Option option7 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection5 = options0.getOptionGroups();
        java.lang.String str6 = options0.toString();
        org.apache.commons.cli.Option option8 = options0.getOption("");
        java.util.List list9 = options0.getRequiredOptions();
        org.apache.commons.cli.Option option11 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.String str12 = options0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options15 = options0.addOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionGroupCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str12, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        boolean boolean9 = options7.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options7.helpOptions();
        java.util.List list11 = options7.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options7.getOptions();
        org.apache.commons.cli.Options options17 = options7.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str18 = options17.toString();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        boolean boolean21 = options19.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection22 = options19.getOptions();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Option option35 = options29.getOption("");
        org.apache.commons.cli.Options options36 = options19.addOption(option35);
        org.apache.commons.cli.Options options37 = options17.addOption(option35);
        java.util.List<java.lang.String> strList39 = options17.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList43 = options40.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList44 = options40.helpOptions();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        boolean boolean47 = options45.hasShortOption("");
        org.apache.commons.cli.Options options51 = options45.addOption("", true, "");
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        boolean boolean54 = options52.hasShortOption("");
        org.apache.commons.cli.Options options58 = options52.addOption("", true, "");
        java.util.List<java.lang.String> strList60 = options58.getMatchingOptions("hi!");
        boolean boolean62 = options58.hasOption("");
        org.apache.commons.cli.Option option64 = options58.getOption("");
        org.apache.commons.cli.Options options65 = options51.addOption(option64);
        org.apache.commons.cli.OptionGroup optionGroup66 = options40.getOptionGroup(option64);
        org.apache.commons.cli.OptionGroup optionGroup67 = options17.getOptionGroup(option64);
        org.apache.commons.cli.Options options68 = options0.addOption(option64);
        java.util.List list69 = options68.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection70 = options68.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection71 = options68.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionList10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str18, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionCollection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(optionList43);
        org.junit.Assert.assertNotNull(optionList44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertNull(optionGroup66);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(optionCollection70);
        org.junit.Assert.assertNotNull(optionCollection71);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.lang.String str12 = options0.toString();
        org.apache.commons.cli.Options options16 = options0.addOption("", false, "");
        boolean boolean18 = options16.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list19 = options16.getRequiredOptions();
        org.apache.commons.cli.Options options22 = options16.addOption("", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options26 = options16.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", true, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.lang.String str4 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection6 = options0.getOptionGroups();
        boolean boolean8 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List list9 = options0.getRequiredOptions();
        boolean boolean11 = options0.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        java.lang.String str12 = options0.toString();
        java.util.List<java.lang.String> strList14 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection15 = options0.getOptionGroups();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = options16.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = options16.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options16.getOptions();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList25 = options22.helpOptions();
        java.util.List list26 = options22.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection27 = options22.getOptions();
        java.util.List<java.lang.String> strList29 = options22.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList31 = options22.getMatchingOptions("");
        java.util.List<java.lang.String> strList33 = options22.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList34 = options22.helpOptions();
        org.apache.commons.cli.Options options37 = options22.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option39 = options22.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup40 = options16.getOptionGroup(option39);
        org.apache.commons.cli.OptionGroup optionGroup41 = options0.getOptionGroup(option39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(optionGroupCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str12, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(optionGroupCollection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionList25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(optionCollection27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(optionList34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(option39);
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertNull(optionGroup41);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        boolean boolean10 = options6.hasOption("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup24 = options6.getOptionGroup(option23);
        boolean boolean26 = options6.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options30 = options6.addOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNull(optionGroup24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        boolean boolean4 = options0.hasLongOption("");
        java.lang.String str5 = options0.toString();
        boolean boolean7 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options0.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options11 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(optionList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionList8);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        boolean boolean10 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options0.getOptions();
        boolean boolean18 = options0.hasLongOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        boolean boolean7 = options0.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        boolean boolean10 = options8.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options8.helpOptions();
        java.util.List<java.lang.String> strList13 = options8.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean15 = options8.hasOption("");
        java.util.List list16 = options8.getRequiredOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList18 = options17.helpOptions();
        java.util.List<java.lang.String> strList20 = options17.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean22 = options17.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options17.getOptions();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList34 = options30.getMatchingOptions("");
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        boolean boolean37 = options35.hasShortOption("");
        org.apache.commons.cli.Options options41 = options35.addOption("", true, "");
        java.util.List<java.lang.String> strList43 = options41.getMatchingOptions("hi!");
        boolean boolean45 = options41.hasOption("");
        org.apache.commons.cli.Option option47 = options41.getOption("");
        org.apache.commons.cli.Options options48 = options30.addOption(option47);
        org.apache.commons.cli.Options options49 = options17.addOption(option47);
        org.apache.commons.cli.OptionGroup optionGroup50 = options8.getOptionGroup(option47);
        boolean boolean52 = options8.hasOption("");
        boolean boolean54 = options8.hasShortOption("hi!");
        java.lang.String str55 = options8.toString();
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        boolean boolean58 = options56.hasShortOption("");
        boolean boolean60 = options56.hasLongOption("");
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        boolean boolean63 = options61.hasShortOption("");
        org.apache.commons.cli.Options options67 = options61.addOption("", true, "");
        java.util.List<java.lang.String> strList69 = options67.getMatchingOptions("hi!");
        boolean boolean71 = options67.hasOption("");
        org.apache.commons.cli.Option option73 = options67.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup74 = options56.getOptionGroup(option73);
        org.apache.commons.cli.Options options75 = options8.addOption(option73);
        org.apache.commons.cli.Options options76 = options0.addOption(option73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(option47);
        org.junit.Assert.assertNotNull(options48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str55, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(option73);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNotNull(options76);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options11.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options11.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList16 = options11.helpOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        org.apache.commons.cli.Options options23 = options17.addOption("", true, "");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.Options options37 = options23.addOption(option36);
        org.apache.commons.cli.Options options38 = options11.addOption(option36);
        org.apache.commons.cli.Options options39 = options10.addOption(option36);
        java.util.List list40 = options10.getRequiredOptions();
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        boolean boolean43 = options41.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList44 = options41.helpOptions();
        java.util.List list45 = options41.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection46 = options41.getOptions();
        java.util.List<java.lang.String> strList48 = options41.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        boolean boolean51 = options49.hasShortOption("");
        org.apache.commons.cli.Options options55 = options49.addOption("", true, "");
        java.util.List<java.lang.String> strList57 = options55.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList59 = options55.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection60 = options55.getOptionGroups();
        org.apache.commons.cli.Options options61 = new org.apache.commons.cli.Options();
        boolean boolean63 = options61.hasShortOption("");
        org.apache.commons.cli.Options options67 = options61.addOption("", true, "");
        java.util.List<java.lang.String> strList69 = options67.getMatchingOptions("hi!");
        boolean boolean71 = options67.hasOption("");
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        boolean boolean74 = options72.hasShortOption("");
        org.apache.commons.cli.Options options78 = options72.addOption("", true, "");
        java.util.List<java.lang.String> strList80 = options78.getMatchingOptions("hi!");
        boolean boolean82 = options78.hasOption("");
        org.apache.commons.cli.Option option84 = options78.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup85 = options67.getOptionGroup(option84);
        org.apache.commons.cli.Options options86 = options55.addOption(option84);
        org.apache.commons.cli.Options options87 = options41.addOption(option84);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection88 = options41.getOptionGroups();
        boolean boolean90 = options41.hasLongOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option92 = options41.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup93 = options10.getOptionGroup(option92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(optionList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(optionList44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(optionCollection46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(optionGroupCollection60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(option84);
        org.junit.Assert.assertNull(optionGroup85);
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNotNull(optionGroupCollection88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(option92);
        org.junit.Assert.assertNull(optionGroup93);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList13 = options0.helpOptions();
        boolean boolean15 = options0.hasOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertNotNull(optionList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        boolean boolean3 = options0.hasShortOption("");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options10 = options0.addOption("", "[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]", false, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection11 = options0.getOptionGroups();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        boolean boolean14 = options12.hasShortOption("");
        org.apache.commons.cli.Options options18 = options12.addOption("", true, "");
        java.util.List<java.lang.String> strList20 = options18.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList22 = options18.getMatchingOptions("");
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        boolean boolean25 = options23.hasShortOption("");
        org.apache.commons.cli.Options options29 = options23.addOption("", true, "");
        java.util.List<java.lang.String> strList31 = options29.getMatchingOptions("hi!");
        boolean boolean33 = options29.hasOption("");
        org.apache.commons.cli.Option option35 = options29.getOption("");
        org.apache.commons.cli.Options options36 = options18.addOption(option35);
        java.lang.String str37 = options18.toString();
        boolean boolean39 = options18.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        boolean boolean42 = options40.hasShortOption("");
        boolean boolean44 = options40.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        boolean boolean47 = options45.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList48 = options45.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList49 = options45.helpOptions();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        boolean boolean52 = options50.hasShortOption("");
        org.apache.commons.cli.Options options56 = options50.addOption("", true, "");
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        boolean boolean59 = options57.hasShortOption("");
        org.apache.commons.cli.Options options63 = options57.addOption("", true, "");
        java.util.List<java.lang.String> strList65 = options63.getMatchingOptions("hi!");
        boolean boolean67 = options63.hasOption("");
        org.apache.commons.cli.Option option69 = options63.getOption("");
        org.apache.commons.cli.Options options70 = options56.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup71 = options45.getOptionGroup(option69);
        org.apache.commons.cli.Options options72 = options40.addOption(option69);
        org.apache.commons.cli.OptionGroup optionGroup73 = options18.getOptionGroup(option69);
        org.apache.commons.cli.OptionGroup optionGroup74 = options0.getOptionGroup(option69);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionGroupCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str37, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(optionList48);
        org.junit.Assert.assertNotNull(optionList49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNull(optionGroup73);
        org.junit.Assert.assertNull(optionGroup74);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        org.apache.commons.cli.Options options15 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean17 = options15.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection18 = options15.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection19 = options15.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection20 = options15.getOptionGroups();
        java.util.List list21 = options15.getRequiredOptions();
        boolean boolean23 = options15.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection18);
        org.junit.Assert.assertNotNull(optionGroupCollection19);
        org.junit.Assert.assertNotNull(optionGroupCollection20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        boolean boolean6 = options0.hasShortOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option11 = options0.getOption("[ Options: [ short {=[ option:   [ARG] :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        org.apache.commons.cli.Options options10 = options0.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList11 = options0.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options0.getOptions();
        org.apache.commons.cli.Option option15 = options0.getOption("");
        boolean boolean17 = options0.hasShortOption("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.List<org.apache.commons.cli.Option> optionList18 = options0.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(optionList11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(option15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionList18);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Option option23 = options17.getOption("");
        org.apache.commons.cli.Options options24 = options6.addOption(option23);
        java.lang.String str25 = options6.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options6.getOptions();
        java.util.List<java.lang.String> strList28 = options6.getMatchingOptions("[ Options: [ short {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str25, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        java.util.List list10 = options0.getRequiredOptions();
        java.lang.Class<?> wildcardClass11 = options0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<org.apache.commons.cli.Option> optionList7 = options0.helpOptions();
        org.apache.commons.cli.Options options11 = options0.addOption("", false, "[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option13 = options11.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList15 = options11.getMatchingOptions("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List list3 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options6 = options0.addOption("", "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options11 = options0.addOption("", "[ Options: [ short {=[ option:   :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options11.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options11.getOptions();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(optionList12);
        org.junit.Assert.assertNotNull(optionCollection13);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.apache.commons.cli.Options options7 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options0.getOptions();
        java.util.List<java.lang.String> strList12 = options0.getMatchingOptions("hi!");
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        boolean boolean15 = options13.hasShortOption("");
        org.apache.commons.cli.Options options19 = options13.addOption("", true, "");
        java.util.List<java.lang.String> strList21 = options19.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList23 = options19.getMatchingOptions("");
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        boolean boolean26 = options24.hasShortOption("");
        org.apache.commons.cli.Options options30 = options24.addOption("", true, "");
        java.util.List<java.lang.String> strList32 = options30.getMatchingOptions("hi!");
        boolean boolean34 = options30.hasOption("");
        org.apache.commons.cli.Option option36 = options30.getOption("");
        org.apache.commons.cli.Options options37 = options19.addOption(option36);
        org.apache.commons.cli.OptionGroup optionGroup38 = options0.getOptionGroup(option36);
        java.util.List<java.lang.String> strList40 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNull(optionGroup38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(optionCollection41);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        boolean boolean8 = options0.hasShortOption("");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options0.addOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]", "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        java.util.List list4 = options0.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options0.getOptions();
        java.util.List<java.lang.String> strList7 = options0.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("");
        org.apache.commons.cli.Option option11 = options0.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection12 = options0.getOptionGroups();
        java.lang.String str13 = options0.toString();
        java.util.List<java.lang.String> strList15 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(optionGroupCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str13, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        boolean boolean4 = options0.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options5.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList9 = options5.helpOptions();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasShortOption("");
        org.apache.commons.cli.Options options16 = options10.addOption("", true, "");
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        org.apache.commons.cli.Options options23 = options17.addOption("", true, "");
        java.util.List<java.lang.String> strList25 = options23.getMatchingOptions("hi!");
        boolean boolean27 = options23.hasOption("");
        org.apache.commons.cli.Option option29 = options23.getOption("");
        org.apache.commons.cli.Options options30 = options16.addOption(option29);
        org.apache.commons.cli.OptionGroup optionGroup31 = options5.getOptionGroup(option29);
        org.apache.commons.cli.Options options32 = options0.addOption(option29);
        java.util.List<org.apache.commons.cli.Option> optionList33 = options0.helpOptions();
        java.util.List<java.lang.String> strList35 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNull(optionGroup31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(optionList33);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.lang.String str7 = options6.toString();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options6.getOptionGroups();
        boolean boolean10 = options6.hasLongOption("");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.lang.String str12 = options11.toString();
        boolean boolean14 = options11.hasShortOption("");
        boolean boolean16 = options11.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        boolean boolean18 = options11.hasOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] ::  :: class java.lang.String ]} ]");
        java.util.List list19 = options11.getRequiredOptions();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options20.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection24 = options20.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList25 = options20.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options20.getOptions();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList30 = options27.helpOptions();
        java.util.List list31 = options27.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options27.getOptions();
        org.apache.commons.cli.Options options37 = options27.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str38 = options37.toString();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options39.getOptions();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Option option55 = options49.getOption("");
        org.apache.commons.cli.Options options56 = options39.addOption(option55);
        org.apache.commons.cli.Options options57 = options37.addOption(option55);
        java.util.List<java.lang.String> strList59 = options37.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options60 = new org.apache.commons.cli.Options();
        boolean boolean62 = options60.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList63 = options60.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList64 = options60.helpOptions();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        boolean boolean67 = options65.hasShortOption("");
        org.apache.commons.cli.Options options71 = options65.addOption("", true, "");
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        boolean boolean74 = options72.hasShortOption("");
        org.apache.commons.cli.Options options78 = options72.addOption("", true, "");
        java.util.List<java.lang.String> strList80 = options78.getMatchingOptions("hi!");
        boolean boolean82 = options78.hasOption("");
        org.apache.commons.cli.Option option84 = options78.getOption("");
        org.apache.commons.cli.Options options85 = options71.addOption(option84);
        org.apache.commons.cli.OptionGroup optionGroup86 = options60.getOptionGroup(option84);
        org.apache.commons.cli.OptionGroup optionGroup87 = options37.getOptionGroup(option84);
        org.apache.commons.cli.Options options88 = options20.addOption(option84);
        org.apache.commons.cli.Option option90 = options20.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup91 = options11.getOptionGroup(option90);
        org.apache.commons.cli.OptionGroup optionGroup92 = options6.getOptionGroup(option90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str7, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str12, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(optionCollection24);
        org.junit.Assert.assertNotNull(optionList25);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str38, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(optionList63);
        org.junit.Assert.assertNotNull(optionList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(option84);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNull(optionGroup86);
        org.junit.Assert.assertNull(optionGroup87);
        org.junit.Assert.assertNotNull(options88);
        org.junit.Assert.assertNotNull(option90);
        org.junit.Assert.assertNull(optionGroup91);
        org.junit.Assert.assertNull(optionGroup92);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList5 = options0.helpOptions();
        org.apache.commons.cli.Option option7 = options0.getOption("hi!");
        java.lang.String str8 = options0.toString();
        java.lang.String str9 = options0.toString();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        boolean boolean12 = options10.hasLongOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options10.getOptions();
        org.apache.commons.cli.Option option15 = options10.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.List list16 = options10.getRequiredOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        org.apache.commons.cli.Options options23 = options17.addOption("", true, "");
        java.util.List<java.lang.String> strList25 = options23.getMatchingOptions("hi!");
        boolean boolean27 = options23.hasOption("");
        org.apache.commons.cli.Option option29 = options23.getOption("");
        org.apache.commons.cli.Options options30 = options10.addOption(option29);
        boolean boolean32 = options10.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option34 = options10.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup35 = options0.getOptionGroup(option34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionList5);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str8, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(option29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNull(optionGroup35);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        boolean boolean7 = options5.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList8 = options5.helpOptions();
        java.util.List list9 = options5.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options5.getOptions();
        org.apache.commons.cli.Options options15 = options5.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        boolean boolean18 = options16.hasShortOption("");
        org.apache.commons.cli.Options options22 = options16.addOption("", true, "");
        java.util.List<java.lang.String> strList24 = options22.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList26 = options22.getMatchingOptions("");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection27 = options22.getOptionGroups();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        boolean boolean30 = options28.hasShortOption("");
        org.apache.commons.cli.Options options34 = options28.addOption("", true, "");
        java.util.List<java.lang.String> strList36 = options34.getMatchingOptions("hi!");
        boolean boolean38 = options34.hasOption("");
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        boolean boolean41 = options39.hasShortOption("");
        org.apache.commons.cli.Options options45 = options39.addOption("", true, "");
        java.util.List<java.lang.String> strList47 = options45.getMatchingOptions("hi!");
        boolean boolean49 = options45.hasOption("");
        org.apache.commons.cli.Option option51 = options45.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup52 = options34.getOptionGroup(option51);
        org.apache.commons.cli.Options options53 = options22.addOption(option51);
        org.apache.commons.cli.Options options54 = options5.addOption(option51);
        org.apache.commons.cli.OptionGroup optionGroup55 = options0.getOptionGroup(option51);
        java.util.List<java.lang.String> strList57 = options0.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection58 = options0.getOptions();
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(optionList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionList8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(optionGroupCollection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertNull(optionGroup52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(optionCollection58);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        java.util.List<java.lang.String> strList3 = options0.getMatchingOptions("[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = options0.hasLongOption("[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection7 = options0.getOptionGroups();
        java.util.List list8 = options0.getRequiredOptions();
        org.apache.commons.cli.Option option10 = options0.getOption("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        java.util.List<org.apache.commons.cli.Option> optionList14 = options11.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options11.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options11.getOptions();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        boolean boolean19 = options17.hasShortOption("");
        java.util.List list20 = options17.getRequiredOptions();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("");
        org.apache.commons.cli.Options options27 = options21.addOption("", true, "");
        java.util.List<java.lang.String> strList29 = options27.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList31 = options27.getMatchingOptions("");
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        boolean boolean34 = options32.hasShortOption("");
        org.apache.commons.cli.Options options38 = options32.addOption("", true, "");
        java.util.List<java.lang.String> strList40 = options38.getMatchingOptions("hi!");
        boolean boolean42 = options38.hasOption("");
        org.apache.commons.cli.Option option44 = options38.getOption("");
        org.apache.commons.cli.Options options45 = options27.addOption(option44);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        boolean boolean48 = options46.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList49 = options46.helpOptions();
        java.util.List<java.lang.String> strList51 = options46.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        boolean boolean53 = options46.hasOption("");
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        boolean boolean56 = options54.hasShortOption("");
        org.apache.commons.cli.Options options60 = options54.addOption("", true, "");
        java.util.List<java.lang.String> strList62 = options60.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList64 = options60.getMatchingOptions("");
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        boolean boolean67 = options65.hasShortOption("");
        org.apache.commons.cli.Options options71 = options65.addOption("", true, "");
        java.util.List<java.lang.String> strList73 = options71.getMatchingOptions("hi!");
        boolean boolean75 = options71.hasOption("");
        org.apache.commons.cli.Option option77 = options71.getOption("");
        org.apache.commons.cli.Options options78 = options60.addOption(option77);
        org.apache.commons.cli.Options options79 = options46.addOption(option77);
        org.apache.commons.cli.Options options80 = options27.addOption(option77);
        org.apache.commons.cli.OptionGroup optionGroup81 = options17.getOptionGroup(option77);
        org.apache.commons.cli.OptionGroup optionGroup82 = options11.getOptionGroup(option77);
        org.apache.commons.cli.Options options83 = options0.addOption(option77);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection84 = options83.getOptionGroups();
        java.util.List<java.lang.String> strList86 = options83.getMatchingOptions("[ Options: [ short {=[ option:   ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionGroupCollection7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionList14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(option44);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(optionList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(option77);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(options79);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNull(optionGroup82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertNotNull(optionGroupCollection84);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.List<java.lang.String> strList8 = options6.getMatchingOptions("hi!");
        java.util.List<java.lang.String> strList10 = options6.getMatchingOptions("");
        org.apache.commons.cli.Option option12 = options6.getOption("hi!");
        java.lang.String str13 = options6.toString();
        boolean boolean15 = options6.hasShortOption("");
        java.lang.String str16 = options6.toString();
        java.util.List list17 = options6.getRequiredOptions();
        boolean boolean19 = options6.hasOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ], [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]" + "'", str16, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection8 = options0.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList9 = options0.helpOptions();
        java.util.List<java.lang.String> strList11 = options0.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList12 = options0.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options0.addOption("[ Options: [ short {} ] [ long {} ]", "[ Options: [ short {=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {[ Options: [ short {} ] [ long {} ]=[ option:  [ Options: [ short {} ] [ long {} ]  [ARG] :: [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ]", true, "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionGroupCollection8);
        org.junit.Assert.assertNotNull(optionList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(optionList12);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("");
        org.apache.commons.cli.Options options6 = options0.addOption("", true, "");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection7 = options0.getOptionGroups();
        boolean boolean9 = options0.hasShortOption("[ Options: [ short {=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ] [ long {[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]=[ option:  [ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]  :: hi! :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = options10.getOptions();
        java.lang.String str12 = options10.toString();
        java.util.List<java.lang.String> strList14 = options10.getMatchingOptions("");
        java.lang.String str15 = options10.toString();
        java.lang.String str16 = options10.toString();
        org.apache.commons.cli.Options options20 = options10.addOption("", false, "hi!");
        org.apache.commons.cli.Options options24 = options20.addOption("", false, "[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        boolean boolean27 = options25.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList28 = options25.helpOptions();
        java.util.List list29 = options25.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options25.getOptions();
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        boolean boolean33 = options31.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList34 = options31.helpOptions();
        java.util.List<org.apache.commons.cli.Option> optionList35 = options31.helpOptions();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        boolean boolean38 = options36.hasShortOption("");
        org.apache.commons.cli.Options options42 = options36.addOption("", true, "");
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        boolean boolean45 = options43.hasShortOption("");
        org.apache.commons.cli.Options options49 = options43.addOption("", true, "");
        java.util.List<java.lang.String> strList51 = options49.getMatchingOptions("hi!");
        boolean boolean53 = options49.hasOption("");
        org.apache.commons.cli.Option option55 = options49.getOption("");
        org.apache.commons.cli.Options options56 = options42.addOption(option55);
        org.apache.commons.cli.OptionGroup optionGroup57 = options31.getOptionGroup(option55);
        org.apache.commons.cli.Options options58 = options25.addOption(option55);
        org.apache.commons.cli.Options options59 = options24.addOption(option55);
        org.apache.commons.cli.Options options60 = options0.addOption(option55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(optionGroupCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str12, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str15, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str16, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(optionList28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(optionList34);
        org.junit.Assert.assertNotNull(optionList35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options56);
        org.junit.Assert.assertNull(optionGroup57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(options60);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        java.lang.String str2 = options0.toString();
        java.util.List<java.lang.String> strList4 = options0.getMatchingOptions("");
        java.lang.String str5 = options0.toString();
        java.lang.String str6 = options0.toString();
        java.util.List list7 = options0.getRequiredOptions();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String str10 = options8.toString();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("");
        org.apache.commons.cli.Options options17 = options11.addOption("", true, "");
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("hi!");
        boolean boolean21 = options17.hasOption("");
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        boolean boolean24 = options22.hasShortOption("");
        org.apache.commons.cli.Options options28 = options22.addOption("", true, "");
        java.util.List<java.lang.String> strList30 = options28.getMatchingOptions("hi!");
        boolean boolean32 = options28.hasOption("");
        org.apache.commons.cli.Option option34 = options28.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup35 = options17.getOptionGroup(option34);
        org.apache.commons.cli.Options options36 = options8.addOption(option34);
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        boolean boolean39 = options37.hasShortOption("");
        org.apache.commons.cli.Options options43 = options37.addOption("", true, "");
        boolean boolean45 = options37.hasShortOption("");
        boolean boolean47 = options37.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options52 = options37.addOption("", "[ Options: [ short {} ] [ long {} ]", true, "[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Option option54 = options37.getOption("[ Options: [ short {=[ option:   [ARG] ::  :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        boolean boolean57 = options55.hasLongOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList58 = options55.helpOptions();
        java.util.List list59 = options55.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection60 = options55.getOptions();
        org.apache.commons.cli.Options options65 = options55.addOption("", "", false, "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str66 = options65.toString();
        boolean boolean68 = options65.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options69 = new org.apache.commons.cli.Options();
        boolean boolean71 = options69.hasShortOption("");
        org.apache.commons.cli.Options options75 = options69.addOption("", true, "");
        java.util.List<java.lang.String> strList77 = options75.getMatchingOptions("hi!");
        boolean boolean79 = options75.hasOption("");
        org.apache.commons.cli.Option option81 = options75.getOption("");
        org.apache.commons.cli.Options options82 = options65.addOption(option81);
        org.apache.commons.cli.OptionGroup optionGroup83 = options37.getOptionGroup(option81);
        org.apache.commons.cli.OptionGroup optionGroup84 = options36.getOptionGroup(option81);
        org.apache.commons.cli.OptionGroup optionGroup85 = options0.getOptionGroup(option81);
        java.util.List<org.apache.commons.cli.Option> optionList86 = options0.helpOptions();
        java.util.List<java.lang.String> strList88 = options0.getMatchingOptions("[ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:   :: [ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] :: class java.lang.String ]} ] [ long {} ] :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str5, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str10, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNull(optionGroup35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNull(option54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(optionList58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(optionCollection60);
        org.junit.Assert.assertNotNull(options65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]" + "'", str66, "[ Options: [ short {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ] [ long {=[ option:    :: [ Options: [ short {} ] [ long {} ] :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(options75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(option81);
        org.junit.Assert.assertNotNull(options82);
        org.junit.Assert.assertNull(optionGroup83);
        org.junit.Assert.assertNull(optionGroup84);
        org.junit.Assert.assertNull(optionGroup85);
        org.junit.Assert.assertNotNull(optionList86);
        org.junit.Assert.assertNotNull(strList88);
    }
}

