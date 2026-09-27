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
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList1 = options0.helpOptions();
        boolean boolean3 = options0.hasOption("[ Options: [ short {=[ option:   :: [] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options4.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup6 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options7 = options4.addOptionGroup(optionGroup6);
        java.lang.String str8 = optionGroup6.toString();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup6.getNames();
        java.lang.String str10 = optionGroup6.getSelected();
        optionGroup6.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup6.getOptions();
        org.apache.commons.cli.Options options14 = options0.addOptionGroup(optionGroup6);
        optionGroup6.setRequired(true);
        org.apache.commons.cli.OptionGroup optionGroup17 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str18 = optionGroup17.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup17.getOptions();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.List<org.apache.commons.cli.Option> optionList21 = options20.helpOptions();
        java.util.List<java.lang.String> strList23 = options20.getMatchingOptions("hi!");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection24 = options20.getOptionGroups();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options25.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup27 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options28 = options25.addOptionGroup(optionGroup27);
        org.apache.commons.cli.OptionGroup optionGroup29 = new org.apache.commons.cli.OptionGroup();
        optionGroup29.setRequired(true);
        java.util.Collection<java.lang.String> strCollection32 = optionGroup29.getNames();
        org.apache.commons.cli.Options options33 = options28.addOptionGroup(optionGroup29);
        org.apache.commons.cli.Option option34 = null;
        optionGroup29.setSelected(option34);
        boolean boolean36 = optionGroup29.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection37 = optionGroup29.getOptions();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options38.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup40 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options41 = options38.addOptionGroup(optionGroup40);
        boolean boolean43 = options41.hasShortOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup44 = new org.apache.commons.cli.OptionGroup();
        optionGroup44.setRequired(true);
        java.util.Collection<java.lang.String> strCollection47 = optionGroup44.getNames();
        java.util.Collection<java.lang.String> strCollection48 = optionGroup44.getNames();
        java.lang.String str49 = optionGroup44.toString();
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options50.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup52 = new org.apache.commons.cli.OptionGroup();
        optionGroup52.setRequired(true);
        optionGroup52.setRequired(true);
        java.util.Collection<java.lang.String> strCollection57 = optionGroup52.getNames();
        org.apache.commons.cli.Options options58 = options50.addOptionGroup(optionGroup52);
        boolean boolean60 = options50.hasShortOption("[ Options: [ short {=[ option:   :: [] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options64 = options50.addOption("", true, "[]");
        org.apache.commons.cli.Option option66 = options50.getOption("");
        optionGroup44.setSelected(option66);
        org.apache.commons.cli.Options options68 = options41.addOption(option66);
        org.apache.commons.cli.OptionGroup optionGroup69 = optionGroup29.addOption(option66);
        org.apache.commons.cli.Options options70 = options20.addOption(option66);
        optionGroup17.setSelected(option66);
        optionGroup6.setSelected(option66);
        boolean boolean73 = optionGroup6.isRequired();
        java.lang.String str74 = optionGroup6.getSelected();
        java.lang.String str75 = optionGroup6.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection76 = optionGroup6.getOptions();
        org.junit.Assert.assertNotNull(optionList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(optionGroupCollection24);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(strCollection32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(optionCollection37);
        org.junit.Assert.assertNotNull(optionCollection39);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strCollection47);
        org.junit.Assert.assertNotNull(strCollection48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(strCollection57);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(option66);
        org.junit.Assert.assertNotNull(options68);
        org.junit.Assert.assertNotNull(optionGroup69);
        org.junit.Assert.assertNotNull(options70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[]" + "'", str75, "[]");
        org.junit.Assert.assertNotNull(optionCollection76);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup2 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options3 = options0.addOptionGroup(optionGroup2);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup2.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup2.getOptions();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup2.getNames();
        boolean boolean7 = optionGroup2.isRequired();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup2 = new org.apache.commons.cli.OptionGroup();
        optionGroup2.setRequired(true);
        optionGroup2.setRequired(true);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup2.getNames();
        org.apache.commons.cli.Options options8 = options0.addOptionGroup(optionGroup2);
        org.apache.commons.cli.Options options11 = options8.addOption("", "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option13 = options8.getOption("[ Options: [ short {=[ option:   [ARG] :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options14.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup16 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options17 = options14.addOptionGroup(optionGroup16);
        java.util.List<java.lang.String> strList19 = options17.getMatchingOptions("");
        boolean boolean21 = options17.hasLongOption("[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList22 = options17.helpOptions();
        org.apache.commons.cli.Option option24 = options17.getOption("[]");
        java.util.List<java.lang.String> strList26 = options17.getMatchingOptions("[ Options: [ short {=[ option:   [ARG] :: [] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options27.addOption("", "hi!");
        java.util.List list31 = options30.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection32 = options30.getOptionGroups();
        java.lang.String str33 = options30.toString();
        org.apache.commons.cli.Options options37 = options30.addOption("", true, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup38 = new org.apache.commons.cli.OptionGroup();
        optionGroup38.setRequired(true);
        optionGroup38.setRequired(true);
        java.util.Collection<java.lang.String> strCollection43 = optionGroup38.getNames();
        boolean boolean44 = optionGroup38.isRequired();
        java.lang.String str45 = optionGroup38.toString();
        org.apache.commons.cli.Options options46 = options37.addOptionGroup(optionGroup38);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options46.getOptionGroups();
        java.util.List<org.apache.commons.cli.Option> optionList48 = options46.helpOptions();
        org.apache.commons.cli.OptionGroup optionGroup49 = new org.apache.commons.cli.OptionGroup();
        optionGroup49.setRequired(true);
        java.util.Collection<java.lang.String> strCollection52 = optionGroup49.getNames();
        boolean boolean53 = optionGroup49.isRequired();
        java.lang.String str54 = optionGroup49.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = optionGroup49.getOptions();
        optionGroup49.setRequired(true);
        org.apache.commons.cli.Options options58 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection59 = options58.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup60 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options61 = options58.addOptionGroup(optionGroup60);
        org.apache.commons.cli.OptionGroup optionGroup62 = new org.apache.commons.cli.OptionGroup();
        optionGroup62.setRequired(true);
        java.util.Collection<java.lang.String> strCollection65 = optionGroup62.getNames();
        org.apache.commons.cli.Options options66 = options61.addOptionGroup(optionGroup62);
        org.apache.commons.cli.Option option67 = null;
        optionGroup62.setSelected(option67);
        org.apache.commons.cli.OptionGroup optionGroup69 = new org.apache.commons.cli.OptionGroup();
        optionGroup69.setRequired(true);
        java.util.Collection<java.lang.String> strCollection72 = optionGroup69.getNames();
        java.util.Collection<java.lang.String> strCollection73 = optionGroup69.getNames();
        java.lang.String str74 = optionGroup69.toString();
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection76 = options75.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup77 = new org.apache.commons.cli.OptionGroup();
        optionGroup77.setRequired(true);
        optionGroup77.setRequired(true);
        java.util.Collection<java.lang.String> strCollection82 = optionGroup77.getNames();
        org.apache.commons.cli.Options options83 = options75.addOptionGroup(optionGroup77);
        boolean boolean85 = options75.hasShortOption("[ Options: [ short {=[ option:   :: [] :: class java.lang.String ]} ] [ long {} ]");
        org.apache.commons.cli.Options options89 = options75.addOption("", true, "[]");
        org.apache.commons.cli.Option option91 = options75.getOption("");
        optionGroup69.setSelected(option91);
        optionGroup62.setSelected(option91);
        optionGroup49.setSelected(option91);
        org.apache.commons.cli.OptionGroup optionGroup95 = options46.getOptionGroup(option91);
        org.apache.commons.cli.Options options96 = options17.addOption(option91);
        org.apache.commons.cli.OptionGroup optionGroup97 = options8.getOptionGroup(option91);
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(optionList22);
        org.junit.Assert.assertNull(option24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(optionGroupCollection32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]" + "'", str33, "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strCollection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
        org.junit.Assert.assertNotNull(optionList48);
        org.junit.Assert.assertNotNull(strCollection52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertNotNull(optionCollection59);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strCollection65);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(strCollection72);
        org.junit.Assert.assertNotNull(strCollection73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
        org.junit.Assert.assertNotNull(optionCollection76);
        org.junit.Assert.assertNotNull(strCollection82);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(option91);
        org.junit.Assert.assertNull(optionGroup95);
        org.junit.Assert.assertNotNull(options96);
        org.junit.Assert.assertNull(optionGroup97);
    }
}

