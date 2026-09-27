package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str7 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str11 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier4.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
        org.junit.Assert.assertNotNull(nameGenerator15);
        org.junit.Assert.assertNotNull(nameGenerator16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList9 = processLabels8.names;
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str14 = labelNameSupplier13.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13);
        java.lang.String str16 = labelNameSupplier13.get();
        java.lang.String str17 = labelNameSupplier13.get();
        java.lang.String str18 = labelNameSupplier13.get();
        com.google.javascript.jscomp.RenameLabels renameLabels20 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13, true);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c" + "'", str11, "c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSCompiler_inline_label_e" + "'", str14, "JSCompiler_inline_label_e");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSCompiler_inline_label_f" + "'", str16, "JSCompiler_inline_label_f");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JSCompiler_inline_label_g" + "'", str17, "JSCompiler_inline_label_g");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JSCompiler_inline_label_h" + "'", str18, "JSCompiler_inline_label_h");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        java.lang.String str4 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("", node7, node8, "JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_b" + "'", str4, "JSCompiler_inline_label_b");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels6.new ProcessLabels();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels6.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier4);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels6 = renameLabels5.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        processLabels6.enterScope(nodeTraversal7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels6.enterScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        processLabels6.enterScope(nodeTraversal11);
        java.util.ArrayList<java.lang.String> strList13 = processLabels6.names;
        java.util.ArrayList<java.lang.String> strList14 = processLabels6.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        processLabels6.enterScope(nodeTraversal15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        processLabels6.exitScope(nodeTraversal17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = processLabels6.shouldTraverse(nodeTraversal19, node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("hi!", node11, node12, "JSCompiler_inline_label_JSCompiler_inline_label_a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str8 = defaultNameSupplier1.get();
        java.lang.String str9 = defaultNameSupplier1.get();
        java.lang.String str10 = defaultNameSupplier1.get();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "e" + "'", str10, "e");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier11.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier13);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.Class<?> wildcardClass8 = defaultNameSupplier3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        processLabels4.enterScope(nodeTraversal5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        processLabels4.exitScope(nodeTraversal7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels4.exitScope(nodeTraversal9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        java.lang.String str9 = labelNameSupplier7.get();
        java.lang.String str10 = labelNameSupplier7.get();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        java.lang.String str13 = defaultNameSupplier3.get();
        java.lang.String str14 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c" + "'", str11, "c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "e" + "'", str13, "e");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "f" + "'", str14, "f");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str8 = labelNameSupplier7.get();
        java.lang.String str9 = labelNameSupplier7.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier7.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier7.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier7.idSupplier;
        java.lang.String str13 = labelNameSupplier7.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        java.lang.String str15 = labelNameSupplier14.get();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_d" + "'", str9, "JSCompiler_inline_label_d");
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_e" + "'", str13, "JSCompiler_inline_label_e");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_f" + "'", str15, "JSCompiler_inline_label_JSCompiler_inline_label_f");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = functionToBlockMutator14.mutate("JSCompiler_inline_label_JSCompiler_inline_label_a", node16, node17, "JSCompiler_inline_label_JSCompiler_inline_label_a", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c" + "'", str11, "c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        java.lang.String str13 = defaultNameSupplier3.get();
        java.lang.String str14 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = functionToBlockMutator15.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node17, node18, "b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c" + "'", str11, "c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "e" + "'", str13, "e");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "f" + "'", str14, "f");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = functionToBlockMutator14.mutate("JSCompiler_inline_label_JSCompiler_inline_label_f", node16, node17, "JSCompiler_inline_label_f", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        java.lang.String str8 = labelNameSupplier5.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        java.lang.String str11 = labelNameSupplier5.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.String str13 = labelNameSupplier5.get();
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str13, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        java.lang.String str9 = labelNameSupplier8.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_a");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier4.nameGenerator;
        java.lang.String str9 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier10.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.common.base.Supplier<java.lang.String> strSupplier15 = labelNameSupplier10.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = labelNameSupplier10.idSupplier;
        java.lang.Class<?> wildcardClass17 = strSupplier16.getClass();
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(strSupplier13);
        org.junit.Assert.assertNotNull(strSupplier15);
        org.junit.Assert.assertNotNull(strSupplier16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str9 = defaultNameSupplier2.get();
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels9.new ProcessLabels();
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_c", node10, node11, "d", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = labelNameSupplier2.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        java.lang.Class<?> wildcardClass12 = nameGenerator11.getClass();
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels6 = renameLabels5.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList7 = processLabels6.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels6.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels6.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier10.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.common.base.Supplier<java.lang.String> strSupplier15 = labelNameSupplier10.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = labelNameSupplier10.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier16);
        java.lang.String str18 = labelNameSupplier17.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier19 = labelNameSupplier17.idSupplier;
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(strSupplier13);
        org.junit.Assert.assertNotNull(strSupplier15);
        org.junit.Assert.assertNotNull(strSupplier16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JSCompiler_inline_label_b" + "'", str18, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier19);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str8 = labelNameSupplier7.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("e", node8, node9, "f", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier4);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        java.lang.String str10 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        java.lang.String str15 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier4.nameGenerator;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "b" + "'", str12, "b");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c" + "'", str15, "c");
        org.junit.Assert.assertNotNull(nameGenerator16);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier6.idSupplier;
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList8 = processLabels7.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = processLabels7.getNameForId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str6 = labelNameSupplier5.get();
        java.lang.String str7 = labelNameSupplier5.get();
        java.lang.String str8 = labelNameSupplier5.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str6, "JSCompiler_inline_label_JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        java.lang.String str6 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_a" + "'", str6, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.Class<?> wildcardClass11 = renameLabels10.getClass();
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier7.idSupplier;
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.String str9 = labelNameSupplier5.get();
        java.lang.String str10 = labelNameSupplier5.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        java.lang.String str14 = labelNameSupplier5.get();
        java.lang.String str15 = labelNameSupplier5.get();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_a" + "'", str9, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSCompiler_inline_label_c" + "'", str14, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSCompiler_inline_label_d" + "'", str15, "JSCompiler_inline_label_d");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels5.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator1 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str3 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        org.junit.Assert.assertNotNull(strSupplier4);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator1 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str3 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        java.lang.String str5 = defaultNameSupplier0.get();
        java.lang.String str6 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier0.nameGenerator;
        java.lang.String str8 = defaultNameSupplier0.get();
        org.junit.Assert.assertNotNull(nameGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b" + "'", str5, "b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "c" + "'", str6, "c");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str9 = labelNameSupplier8.get();
        java.lang.String str10 = labelNameSupplier8.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier8.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier8.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = functionToBlockMutator14.mutate("JSCompiler_inline_label_g", node16, node17, "JSCompiler_inline_label_JSCompiler_inline_label_f", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_d" + "'", str10, "JSCompiler_inline_label_d");
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(strSupplier12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_a", node6, node7, "JSCompiler_inline_label_e", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels7.exitScope(nodeTraversal8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = processLabels7.getNameForId((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str7 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str12 = labelNameSupplier11.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier11.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_b" + "'", str12, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        java.lang.String str8 = defaultNameSupplier5.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        java.lang.String str13 = labelNameSupplier12.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier14 = labelNameSupplier12.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier12);
        java.lang.String str16 = labelNameSupplier12.get();
        com.google.javascript.jscomp.RenameLabels renameLabels18 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier12, true);
        com.google.javascript.jscomp.RenameLabels renameLabels20 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier12, true);
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_b" + "'", str13, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSCompiler_inline_label_c" + "'", str16, "JSCompiler_inline_label_c");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        java.lang.String str8 = labelNameSupplier5.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_a");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator7);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels6 = renameLabels5.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        processLabels6.enterScope(nodeTraversal7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels6.enterScope(nodeTraversal9);
        java.util.ArrayList<java.lang.String> strList11 = processLabels6.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels6.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        processLabels6.enterScope(nodeTraversal14);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str11 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier12.idSupplier;
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier6 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        java.lang.String str9 = defaultNameSupplier6.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler5, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13);
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = labelNameSupplier13.idSupplier;
        java.lang.String str17 = labelNameSupplier13.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier18 = labelNameSupplier13.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels20 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13, false);
        com.google.javascript.jscomp.RenameLabels renameLabels22 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator23 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13);
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertNotNull(strSupplier16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JSCompiler_inline_label_b" + "'", str17, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        java.lang.Class<?> wildcardClass7 = defaultNameSupplier1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b" + "'", str5, "b");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        java.lang.Class<?> wildcardClass11 = processLabels10.getClass();
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier0);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.Class<?> wildcardClass6 = labelNameSupplier2.getClass();
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertNotNull(nameGenerator11);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node11, node12, "a", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str7 = defaultNameSupplier1.get();
        java.lang.String str8 = defaultNameSupplier1.get();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        java.lang.String str9 = labelNameSupplier6.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        java.lang.String str12 = labelNameSupplier6.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier14);
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier15, false);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels6 = renameLabels5.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList7 = processLabels6.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels6.enterScope(nodeTraversal8);
        java.util.ArrayList<java.lang.String> strList10 = processLabels6.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = processLabels6.getNameForId((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator1 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str6 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier0.nameGenerator;
        java.lang.String str8 = defaultNameSupplier0.get();
        org.junit.Assert.assertNotNull(nameGenerator1);
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str8 = defaultNameSupplier2.get();
        java.lang.String str9 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str11 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "c" + "'", str9, "c");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertNotNull(nameGenerator12);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_JSCompiler_inline_label_f", node8, node9, "JSCompiler_inline_label_g", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier1.nameGenerator;
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("f", node9, node10, "JSCompiler_inline_label_h", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList5 = processLabels4.names;
        java.util.ArrayList<java.lang.String> strList6 = processLabels4.names;
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }
}

