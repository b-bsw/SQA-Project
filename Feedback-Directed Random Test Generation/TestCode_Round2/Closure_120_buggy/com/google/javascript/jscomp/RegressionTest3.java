package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean23 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate21);
        com.google.javascript.jscomp.Scope.Var var23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback22.getReferences(var23);
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection24);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertNotNull(referenceItor8);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate14);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.Scope.Var var3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = referenceCollectingCallback2.getReferences(var3);
        com.google.javascript.jscomp.Scope.Var var5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = referenceCollectingCallback2.getReferences(var5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = referenceCollectingCallback2.getScope(var8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNull(referenceCollection4);
        org.junit.Assert.assertNull(referenceCollection6);
        org.junit.Assert.assertNotNull(varIterable7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean14 = referenceCollection0.isWellDefined();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator4 = referenceCollection0.spliterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior7.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate22);
        com.google.javascript.jscomp.Scope.Var var24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback23.getReferences(var24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.exitScope(nodeTraversal26);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNull(referenceCollection25);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior4.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate18);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = referenceCollectingCallback19.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.exitScope(nodeTraversal21);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertNotNull(referenceItor16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceList28);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior4.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = referenceCollectingCallback15.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback15.getReferences(var17);
        com.google.javascript.jscomp.Scope.Var var19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = referenceCollectingCallback15.getScope(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable16);
        org.junit.Assert.assertNull(referenceCollection18);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior8.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior8.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap24 = null;
        behavior8.afterExitScope(nodeTraversal23, referenceMap24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate28);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior9.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior9.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior9.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9, varPredicate26);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate28);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate30 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap33 = null;
        behavior9.afterExitScope(nodeTraversal32, referenceMap33);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback35 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback35.hotSwapScript(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.exitScope(nodeTraversal17);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = referenceCollectingCallback23.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(varIterable25);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior8.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap23 = null;
        behavior8.afterExitScope(nodeTraversal22, referenceMap23);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8, varPredicate25);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8, varPredicate27);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = referenceCollectingCallback15.shouldTraverse(nodeTraversal16, node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior8.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate23);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate25);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = referenceCollectingCallback26.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNotNull(varIterable27);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.enterScope(nodeTraversal23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection22);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior3.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate19);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = referenceCollectingCallback20.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope24 = referenceCollectingCallback20.getScope(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable21);
        org.junit.Assert.assertNotNull(varIterable22);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = referenceCollectingCallback7.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = referenceCollectingCallback7.getReferences(var10);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable12 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(referenceCollection11);
        org.junit.Assert.assertNotNull(varIterable12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isEscaped();
        boolean boolean5 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        boolean boolean8 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        referenceCollection3.references = referenceList9;
        referenceCollection0.references = referenceList9;
        boolean boolean12 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator13 = referenceCollection0.spliterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator13);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = referenceCollectingCallback5.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = referenceCollectingCallback5.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = referenceCollectingCallback5.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable6);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNotNull(varIterable8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable24);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = referenceCollectingCallback20.shouldTraverse(nodeTraversal21, node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean10 = referenceCollection9.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection9.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection9.references;
        boolean boolean13 = referenceCollection9.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator14 = referenceCollection9.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection9.references;
        referenceCollection0.references = referenceList15;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator14);
        org.junit.Assert.assertNotNull(referenceList15);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = referenceCollectingCallback16.getAllSymbols();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.hotSwapScript(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection18);
        org.junit.Assert.assertNotNull(varIterable19);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.process(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection0.add(reference12);
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection4.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection4.iterator();
        boolean boolean8 = referenceCollection4.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection9.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection13.references;
        boolean boolean17 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection13.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection4.references = referenceList20;
        referenceCollection0.references = referenceList20;
        boolean boolean26 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList27);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior10.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior10.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10, varPredicate27);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate29);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate31 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap34 = null;
        behavior10.afterExitScope(nodeTraversal33, referenceMap34);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback36 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate37 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback38 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback38.process(node39, node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        referenceCollection0.add(reference2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        boolean boolean9 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = referenceCollectingCallback22.shouldTraverse(nodeTraversal23, node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = referenceCollectingCallback16.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = referenceCollectingCallback16.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection18);
        org.junit.Assert.assertNotNull(varIterable19);
        org.junit.Assert.assertNotNull(varIterable20);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate9);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback10.getReferences(var11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback10.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = referenceCollectingCallback10.getReferences(var15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = referenceCollectingCallback10.shouldTraverse(nodeTraversal17, node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNull(referenceCollection16);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable5 = referenceCollectingCallback4.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = referenceCollectingCallback4.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = referenceCollectingCallback4.getReferences(var7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable5);
        org.junit.Assert.assertNotNull(varIterable6);
        org.junit.Assert.assertNull(referenceCollection8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior5.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate15);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior5.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap25 = null;
        behavior5.afterExitScope(nodeTraversal24, referenceMap25);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection5.add(reference7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        boolean boolean11 = referenceCollection9.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection9.references;
        boolean boolean13 = referenceCollection9.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList16, referenceArray15);
        referenceCollection9.references = referenceList16;
        referenceCollection5.references = referenceList16;
        referenceCollection0.references = referenceList16;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection21.references;
        boolean boolean23 = referenceCollection21.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = referenceCollection21.references;
        boolean boolean25 = referenceCollection21.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference27 = null;
        referenceCollection21.add(reference27);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection21.references;
        referenceCollection0.references = referenceList29;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNotNull(referenceArray15);
        org.junit.Assert.assertArrayEquals(referenceArray15, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(referenceList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(reference26);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertNotNull(referenceList31);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator3 = referenceCollection0.spliterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isEscaped();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceList9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isEscaped();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        boolean boolean8 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback21.getReferences(var22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = referenceCollectingCallback21.shouldTraverse(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection23);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior6.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior6.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap30 = null;
        behavior6.afterExitScope(nodeTraversal29, referenceMap30);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback32.hotSwapScript(node33, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator23 = referenceCollection0.spliterator();
        boolean boolean24 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean25 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback18.hotSwapScript(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior4.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate18);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceList6.spliterator();
        referenceCollection0.references = referenceList6;
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        boolean boolean11 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection0.references;
        boolean boolean14 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean15 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator16 = referenceCollection0.spliterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection0.spliterator();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator16);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean6 = referenceCollection5.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection5.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection5.iterator();
        boolean boolean9 = referenceCollection5.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection5.references;
        referenceCollection0.references = referenceList10;
        boolean boolean12 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = null;
        referenceCollection0.references = referenceList1;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection3.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection7.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor10 = referenceCollection7.iterator();
        boolean boolean11 = referenceCollection7.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection12.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = null;
        referenceCollection12.add(reference14);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        boolean boolean18 = referenceCollection16.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection16.references;
        boolean boolean20 = referenceCollection16.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList23, referenceArray22);
        referenceCollection16.references = referenceList23;
        referenceCollection12.references = referenceList23;
        referenceCollection7.references = referenceList23;
        referenceCollection3.references = referenceList23;
        referenceCollection0.references = referenceList23;
        boolean boolean30 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean32 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertNotNull(referenceItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(reference21);
        org.junit.Assert.assertNotNull(referenceArray22);
        org.junit.Assert.assertArrayEquals(referenceArray22, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(reference31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator23 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean25 = referenceCollection24.isWellDefined();
        boolean boolean26 = referenceCollection24.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection24.references;
        boolean boolean28 = referenceCollection24.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection24.references;
        referenceCollection0.references = referenceList29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceList29);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection6.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection6.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        boolean boolean13 = referenceCollection11.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        boolean boolean15 = referenceCollection11.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection11.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = null;
        referenceCollection11.add(reference17);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection11.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection11.references;
        referenceCollection6.references = referenceList20;
        referenceCollection0.references = referenceList20;
        java.lang.Class<?> wildcardClass23 = referenceList20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior5.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback24.enterScope(nodeTraversal25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        boolean boolean8 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        referenceCollection0.add(reference2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection4.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean16 = referenceCollection0.isWellDefined();
        boolean boolean17 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = null;
        referenceCollection0.add(reference18);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(referenceList20);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior7.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate22);
        com.google.javascript.jscomp.Scope.Var var24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback23.getReferences(var24);
        com.google.javascript.jscomp.Scope.Var var26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = referenceCollectingCallback23.getReferences(var26);
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNull(referenceCollection25);
        org.junit.Assert.assertNull(referenceCollection27);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior5.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate24);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = referenceCollectingCallback25.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable26);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate18);
        com.google.javascript.jscomp.Scope.Var var20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = referenceCollectingCallback19.getReferences(var20);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback19.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.hotSwapScript(node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection21);
        org.junit.Assert.assertNotNull(varIterable22);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        boolean boolean9 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor12 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceItor12);
        org.junit.Assert.assertNull(reference13);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = null;
        referenceCollection0.add(reference23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollection0.isEscaped();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceList8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback8.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback8.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback8.getReferences(var11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNull(referenceCollection12);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.Scope.Var var16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = referenceCollectingCallback15.getReferences(var16);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = referenceCollectingCallback15.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback15.exitScope(nodeTraversal19);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection17);
        org.junit.Assert.assertNotNull(varIterable18);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.exitScope(nodeTraversal23);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = null;
        referenceCollection0.references = referenceList4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection2.references;
        boolean boolean4 = referenceCollection2.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection2.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection2.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection2.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection2.references;
        referenceCollection0.references = referenceList8;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection10.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection14.references;
        boolean boolean16 = referenceCollection14.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection14.references;
        boolean boolean18 = referenceCollection14.isWellDefined();
        boolean boolean19 = referenceCollection14.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        referenceCollection14.references = referenceList21;
        referenceCollection10.references = referenceList21;
        referenceCollection0.references = referenceList21;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean26 = referenceCollection25.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection25.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection25.references;
        boolean boolean29 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = referenceCollection25.references;
        referenceCollection0.references = referenceList30;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator32 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertNotNull(referenceList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(referenceList30);
        org.junit.Assert.assertNotNull(referenceSpliterator32);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        boolean boolean9 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior5.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope26 = referenceCollectingCallback24.getScope(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator4 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertNotNull(referenceSpliterator4);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior8.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceList14.spliterator();
        referenceCollection8.references = referenceList14;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceList14.spliterator();
        referenceCollection0.references = referenceList14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate18);
        com.google.javascript.jscomp.Scope.Var var20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = referenceCollectingCallback19.getReferences(var20);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback19.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.process(node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection21);
        org.junit.Assert.assertNotNull(varIterable22);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior4.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior4.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate21);
        com.google.javascript.jscomp.Scope.Var var23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope24 = referenceCollectingCallback22.getScope(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate7);
        com.google.javascript.jscomp.Scope.Var var9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = referenceCollectingCallback8.getReferences(var9);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback8.getReferences(var11);
        com.google.javascript.jscomp.Scope.Var var13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = referenceCollectingCallback8.getScope(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection10);
        org.junit.Assert.assertNull(referenceCollection12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection0.add(reference9);
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection0.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection13.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection13.references;
        referenceCollection0.references = referenceList18;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNotNull(referenceList18);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.lang.Class<?> wildcardClass7 = referenceSpliterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.Scope.Var var3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = referenceCollectingCallback2.getReferences(var3);
        com.google.javascript.jscomp.Scope.Var var5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = referenceCollectingCallback2.getReferences(var5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = referenceCollectingCallback2.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = referenceCollectingCallback2.getReferences(var9);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback2.getReferences(var12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNull(referenceCollection4);
        org.junit.Assert.assertNull(referenceCollection6);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertNull(referenceCollection10);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNull(referenceCollection13);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        boolean boolean13 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection10.references;
        referenceCollection0.references = referenceList14;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection0.spliterator();
        boolean boolean18 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(referenceItor16);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = referenceCollectingCallback16.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = referenceCollectingCallback16.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.visit(nodeTraversal19, node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable17);
        org.junit.Assert.assertNotNull(varIterable18);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor21 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection22.references;
        boolean boolean24 = referenceCollection22.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection22.references;
        boolean boolean26 = referenceCollection22.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection27.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator29 = referenceList28.spliterator();
        referenceCollection22.references = referenceList28;
        boolean boolean31 = referenceCollection22.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection22.references;
        boolean boolean33 = referenceCollection22.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference34 = null;
        referenceCollection22.add(reference34);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator36 = referenceCollection22.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection37 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean38 = referenceCollection37.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList39 = referenceCollection37.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator40 = referenceList39.spliterator();
        referenceCollection22.references = referenceList39;
        referenceCollection0.references = referenceList39;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceItor21);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList28);
        org.junit.Assert.assertNotNull(referenceSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(referenceList39);
        org.junit.Assert.assertNotNull(referenceSpliterator40);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = referenceCollectingCallback23.getReferences(var25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.process(node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNull(referenceCollection26);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        boolean boolean13 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection10.references;
        referenceCollection0.references = referenceList14;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection0.spliterator();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(referenceItor16);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        boolean boolean9 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.lang.Class<?> wildcardClass6 = referenceList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.Scope.Var var8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = referenceCollectingCallback7.getReferences(var8);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(referenceCollection9);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection0.references;
        boolean boolean32 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean33 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = null;
        referenceCollection0.references = referenceList3;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNull(referenceList5);
        org.junit.Assert.assertNull(referenceList6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection0.spliterator();
        boolean boolean9 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reference10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        boolean boolean8 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        referenceCollection0.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection0.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean14 = referenceCollection13.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection13.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection13.iterator();
        boolean boolean17 = referenceCollection13.isNeverAssigned();
        boolean boolean18 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean20 = referenceCollection19.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator21 = referenceCollection19.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor22 = referenceCollection19.iterator();
        boolean boolean23 = referenceCollection19.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection24.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = null;
        referenceCollection24.add(reference26);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection28.references;
        boolean boolean30 = referenceCollection28.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection28.references;
        boolean boolean32 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference33 = referenceCollection28.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray34 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList35, referenceArray34);
        referenceCollection28.references = referenceList35;
        referenceCollection24.references = referenceList35;
        referenceCollection19.references = referenceList35;
        referenceCollection13.references = referenceList35;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator41 = referenceList35.spliterator();
        referenceCollection0.references = referenceList35;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = referenceCollection0.references;
        boolean boolean44 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertNotNull(referenceItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator21);
        org.junit.Assert.assertNotNull(referenceItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(referenceList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(reference33);
        org.junit.Assert.assertNotNull(referenceArray34);
        org.junit.Assert.assertArrayEquals(referenceArray34, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator41);
        org.junit.Assert.assertNotNull(referenceList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceList6.spliterator();
        referenceCollection0.references = referenceList6;
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection11.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection15.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor18 = referenceCollection15.iterator();
        boolean boolean19 = referenceCollection15.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = null;
        referenceCollection20.add(reference22);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection24.references;
        boolean boolean26 = referenceCollection24.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection24.references;
        boolean boolean28 = referenceCollection24.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = referenceCollection24.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray30 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList31, referenceArray30);
        referenceCollection24.references = referenceList31;
        referenceCollection20.references = referenceList31;
        referenceCollection15.references = referenceList31;
        referenceCollection11.references = referenceList31;
        referenceCollection0.references = referenceList31;
        boolean boolean38 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertNotNull(referenceItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(reference29);
        org.junit.Assert.assertNotNull(referenceArray30);
        org.junit.Assert.assertArrayEquals(referenceArray30, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        boolean boolean8 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        boolean boolean10 = referenceCollection6.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection6.add(reference12);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection6.references;
        referenceCollection0.references = referenceList14;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator16 = referenceList14.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(referenceSpliterator16);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate18);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = referenceCollectingCallback19.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.exitScope(nodeTraversal21);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable20);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = null;
        referenceCollection0.add(reference8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator14 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = null;
        referenceCollection0.references = referenceList15;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean18 = referenceCollection17.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator19 = referenceCollection17.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor20 = referenceCollection17.iterator();
        boolean boolean21 = referenceCollection17.isNeverAssigned();
        boolean boolean22 = referenceCollection17.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator25 = referenceCollection23.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor26 = referenceCollection23.iterator();
        boolean boolean27 = referenceCollection23.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection28.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference30 = null;
        referenceCollection28.add(reference30);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList33 = referenceCollection32.references;
        boolean boolean34 = referenceCollection32.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = referenceCollection32.references;
        boolean boolean36 = referenceCollection32.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference37 = referenceCollection32.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray38 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList39 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList39, referenceArray38);
        referenceCollection32.references = referenceList39;
        referenceCollection28.references = referenceList39;
        referenceCollection23.references = referenceList39;
        referenceCollection17.references = referenceList39;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList45 = referenceCollection17.references;
        boolean boolean46 = referenceCollection17.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection47 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean48 = referenceCollection47.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList49 = referenceCollection47.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection50 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean51 = referenceCollection50.isWellDefined();
        boolean boolean52 = referenceCollection50.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList53 = referenceCollection50.references;
        referenceCollection47.references = referenceList53;
        boolean boolean55 = referenceCollection47.isWellDefined();
        boolean boolean56 = referenceCollection47.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList57 = referenceCollection47.references;
        referenceCollection17.references = referenceList57;
        referenceCollection0.references = referenceList57;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(referenceSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator19);
        org.junit.Assert.assertNotNull(referenceItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator25);
        org.junit.Assert.assertNotNull(referenceItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertNotNull(referenceList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(referenceList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(reference37);
        org.junit.Assert.assertNotNull(referenceArray38);
        org.junit.Assert.assertArrayEquals(referenceArray38, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(referenceList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(referenceList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(referenceList57);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.Scope.Var var8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = referenceCollectingCallback7.getReferences(var8);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(referenceCollection9);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback12.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = referenceCollectingCallback12.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = referenceCollectingCallback12.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(varIterable14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceList5);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = null;
        referenceCollection8.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection11.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection15.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor18 = referenceCollection15.iterator();
        boolean boolean19 = referenceCollection15.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = null;
        referenceCollection20.add(reference22);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection24.references;
        boolean boolean26 = referenceCollection24.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection24.references;
        boolean boolean28 = referenceCollection24.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = referenceCollection24.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray30 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList31, referenceArray30);
        referenceCollection24.references = referenceList31;
        referenceCollection20.references = referenceList31;
        referenceCollection15.references = referenceList31;
        referenceCollection11.references = referenceList31;
        referenceCollection8.references = referenceList31;
        referenceCollection0.references = referenceList31;
        boolean boolean39 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean40 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference41 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertNotNull(referenceItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(reference29);
        org.junit.Assert.assertNotNull(referenceArray30);
        org.junit.Assert.assertArrayEquals(referenceArray30, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(reference41);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isEscaped();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean9 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isEscaped();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.isEscaped();
        boolean boolean11 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor10 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertNotNull(referenceItor10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean8 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior5.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = referenceCollectingCallback24.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = referenceCollectingCallback24.shouldTraverse(nodeTraversal26, node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable25);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertNull(reference8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.Scope.Var var3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = referenceCollectingCallback2.getReferences(var3);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable5 = referenceCollectingCallback2.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.hotSwapScript(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNull(referenceCollection4);
        org.junit.Assert.assertNotNull(varIterable5);
        org.junit.Assert.assertNotNull(varIterable6);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior10.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior10.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10, varPredicate27);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate29);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate31 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap34 = null;
        behavior10.afterExitScope(nodeTraversal33, referenceMap34);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback36 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate37 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback38 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate37);
        com.google.javascript.jscomp.Scope.Var var39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope40 = referenceCollectingCallback38.getScope(var39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior5.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior5.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = referenceCollectingCallback21.shouldTraverse(nodeTraversal22, node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator14 = referenceCollection0.spliterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection17.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference19 = null;
        referenceCollection17.add(reference19);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection21.references;
        boolean boolean23 = referenceCollection21.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = referenceCollection21.references;
        boolean boolean25 = referenceCollection21.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList28, referenceArray27);
        referenceCollection21.references = referenceList28;
        referenceCollection17.references = referenceList28;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean33 = referenceCollection32.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator34 = referenceCollection32.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor35 = referenceCollection32.iterator();
        boolean boolean36 = referenceCollection32.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection32.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection38 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean39 = referenceCollection38.isEscaped();
        boolean boolean40 = referenceCollection38.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList41 = referenceCollection38.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection42 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = referenceCollection42.references;
        boolean boolean44 = referenceCollection42.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList45 = referenceCollection42.references;
        boolean boolean46 = referenceCollection42.isWellDefined();
        boolean boolean47 = referenceCollection42.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection48 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList49 = referenceCollection48.references;
        referenceCollection42.references = referenceList49;
        referenceCollection38.references = referenceList49;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator52 = referenceCollection38.spliterator();
        boolean boolean53 = referenceCollection38.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList54 = referenceCollection38.references;
        referenceCollection32.references = referenceList54;
        referenceCollection17.references = referenceList54;
        referenceCollection0.references = referenceList54;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor58 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(referenceSpliterator14);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(referenceList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(reference26);
        org.junit.Assert.assertNotNull(referenceArray27);
        org.junit.Assert.assertArrayEquals(referenceArray27, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator34);
        org.junit.Assert.assertNotNull(referenceItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(referenceList41);
        org.junit.Assert.assertNotNull(referenceList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(referenceList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(referenceList49);
        org.junit.Assert.assertNotNull(referenceSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(referenceList54);
        org.junit.Assert.assertNotNull(referenceItor58);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior3.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior3.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior3.afterExitScope(nodeTraversal17, referenceMap18);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior4.afterExitScope(nodeTraversal13, referenceMap14);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        referenceCollection0.add(reference2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection4.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean16 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection18.references;
        boolean boolean20 = referenceCollection18.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = referenceCollection18.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = referenceCollection18.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor23 = referenceCollection18.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = referenceCollection18.references;
        referenceCollection0.references = referenceList24;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(reference21);
        org.junit.Assert.assertNull(reference22);
        org.junit.Assert.assertNotNull(referenceItor23);
        org.junit.Assert.assertNotNull(referenceList24);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior5.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.hotSwapScript(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable24);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior6.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.visit(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior8.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior8.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap29 = null;
        behavior8.afterExitScope(nodeTraversal28, referenceMap29);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate31 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate31);
        com.google.javascript.jscomp.Scope.Var var33 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection34 = referenceCollectingCallback32.getReferences(var33);
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNull(referenceCollection34);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        referenceCollection0.add(reference2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection4.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor15 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator16 = referenceCollection0.spliterator();
        boolean boolean17 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceItor15);
        org.junit.Assert.assertNotNull(referenceSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback10.getReferences(var12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback10.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNull(referenceCollection13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isWellDefined();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior6.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior6.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap30 = null;
        behavior6.afterExitScope(nodeTraversal29, referenceMap30);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback32.exitScope(nodeTraversal33);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        com.google.javascript.jscomp.Scope.Var var19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback16.getReferences(var19);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = referenceCollectingCallback16.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope23 = referenceCollectingCallback16.getScope(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection18);
        org.junit.Assert.assertNull(referenceCollection20);
        org.junit.Assert.assertNotNull(varIterable21);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection0.spliterator();
        boolean boolean9 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator10 = referenceCollection0.spliterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean6 = referenceCollection5.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection5.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection5.iterator();
        boolean boolean9 = referenceCollection5.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection5.references;
        referenceCollection0.references = referenceList10;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection0.add(reference12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate11);
        com.google.javascript.jscomp.Scope.Var var13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = referenceCollectingCallback12.getReferences(var13);
        com.google.javascript.jscomp.Scope.Var var15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = referenceCollectingCallback12.getReferences(var15);
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection14);
        org.junit.Assert.assertNull(referenceCollection16);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection5.add(reference7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        boolean boolean11 = referenceCollection9.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection9.references;
        boolean boolean13 = referenceCollection9.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList16, referenceArray15);
        referenceCollection9.references = referenceList16;
        referenceCollection5.references = referenceList16;
        referenceCollection0.references = referenceList16;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = null;
        referenceCollection0.add(reference21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNotNull(referenceArray15);
        org.junit.Assert.assertArrayEquals(referenceArray15, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.process(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection4.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection4.iterator();
        boolean boolean8 = referenceCollection4.isNeverAssigned();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection10.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor13 = referenceCollection10.iterator();
        boolean boolean14 = referenceCollection10.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = null;
        referenceCollection15.add(reference17);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection19.references;
        boolean boolean21 = referenceCollection19.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection19.references;
        boolean boolean23 = referenceCollection19.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList26, referenceArray25);
        referenceCollection19.references = referenceList26;
        referenceCollection15.references = referenceList26;
        referenceCollection10.references = referenceList26;
        referenceCollection4.references = referenceList26;
        boolean boolean32 = referenceCollection4.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection33 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean34 = referenceCollection33.isEscaped();
        boolean boolean35 = referenceCollection33.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor36 = referenceCollection33.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection37 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList38 = referenceCollection37.references;
        boolean boolean39 = referenceCollection37.isNeverAssigned();
        boolean boolean40 = referenceCollection37.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList41 = referenceCollection37.references;
        referenceCollection33.references = referenceList41;
        referenceCollection4.references = referenceList41;
        referenceCollection0.references = referenceList41;
        boolean boolean45 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference46 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator47 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNotNull(referenceItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertNotNull(referenceArray25);
        org.junit.Assert.assertArrayEquals(referenceArray25, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceItor36);
        org.junit.Assert.assertNotNull(referenceList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(referenceList41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(reference46);
        org.junit.Assert.assertNotNull(referenceSpliterator47);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior5.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior5.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = referenceCollectingCallback24.getReferences(var25);
        com.google.javascript.jscomp.Scope.Var var27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope28 = referenceCollectingCallback24.getScope(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection26);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = null;
        referenceCollection0.references = referenceList1;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection3.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection7.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor10 = referenceCollection7.iterator();
        boolean boolean11 = referenceCollection7.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection12.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = null;
        referenceCollection12.add(reference14);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        boolean boolean18 = referenceCollection16.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection16.references;
        boolean boolean20 = referenceCollection16.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList23, referenceArray22);
        referenceCollection16.references = referenceList23;
        referenceCollection12.references = referenceList23;
        referenceCollection7.references = referenceList23;
        referenceCollection3.references = referenceList23;
        referenceCollection0.references = referenceList23;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference30 = null;
        referenceCollection0.add(reference30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference32 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertNotNull(referenceItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(reference21);
        org.junit.Assert.assertNotNull(referenceArray22);
        org.junit.Assert.assertArrayEquals(referenceArray22, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope22 = referenceCollectingCallback20.getScope(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection0.add(reference9);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator13 = referenceCollection11.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor14 = referenceCollection11.iterator();
        boolean boolean15 = referenceCollection11.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = null;
        referenceCollection16.add(reference18);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        boolean boolean22 = referenceCollection20.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection20.references;
        boolean boolean24 = referenceCollection20.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection20.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection20.references = referenceList27;
        referenceCollection16.references = referenceList27;
        referenceCollection11.references = referenceList27;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList33 = referenceCollection32.references;
        boolean boolean34 = referenceCollection32.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = referenceCollection32.references;
        boolean boolean36 = referenceCollection32.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference37 = referenceCollection32.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference38 = null;
        referenceCollection32.add(reference38);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList40 = referenceCollection32.references;
        referenceCollection11.references = referenceList40;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = referenceCollection11.references;
        referenceCollection0.references = referenceList42;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator13);
        org.junit.Assert.assertNotNull(referenceItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(referenceList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(reference37);
        org.junit.Assert.assertNotNull(referenceList40);
        org.junit.Assert.assertNotNull(referenceList42);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate10);
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback11.getReferences(var12);
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection13);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection7.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection7.add(reference9);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        boolean boolean13 = referenceCollection11.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        boolean boolean15 = referenceCollection11.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection11.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection11.references = referenceList18;
        referenceCollection7.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = null;
        referenceCollection0.add(reference24);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceList26);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate9);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback10.getReferences(var11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = referenceCollectingCallback10.getReferences(var14);
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNull(referenceCollection15);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.Scope.Var var8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = referenceCollectingCallback7.getReferences(var8);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback7.getReferences(var11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(referenceCollection9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNull(referenceCollection12);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = referenceCollectingCallback16.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.visit(nodeTraversal20, node21, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection18);
        org.junit.Assert.assertNotNull(varIterable19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection7.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection7.add(reference9);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        boolean boolean13 = referenceCollection11.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        boolean boolean15 = referenceCollection11.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection11.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection11.references = referenceList18;
        referenceCollection7.references = referenceList18;
        referenceCollection0.references = referenceList18;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior3.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior3.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap23 = null;
        behavior3.afterExitScope(nodeTraversal22, referenceMap23);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate25);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = referenceCollectingCallback26.getAllSymbols();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback26.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable27);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior9.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior9.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior9.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9, varPredicate26);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate28);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate30 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate30);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate32 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback33 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9, varPredicate32);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable34 = referenceCollectingCallback33.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior9);
        org.junit.Assert.assertNotNull(varIterable34);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        java.lang.Class<?> wildcardClass6 = referenceCollection0.getClass();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = null;
        referenceCollection0.add(reference8);
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior6.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior6.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap27 = null;
        behavior6.afterExitScope(nodeTraversal26, referenceMap27);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate29);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate9);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback10.getReferences(var11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = referenceCollectingCallback10.getScope(var14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection12);
        org.junit.Assert.assertNotNull(varIterable13);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator3 = referenceCollection0.spliterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap24 = null;
        behavior5.afterExitScope(nodeTraversal23, referenceMap24);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection8.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection8.getInitializingReferenceForConstants();
        boolean boolean11 = referenceCollection8.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor12 = referenceCollection8.iterator();
        boolean boolean13 = referenceCollection8.isEscaped();
        boolean boolean14 = referenceCollection8.isEscaped();
        boolean boolean15 = referenceCollection8.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection8.iterator();
        boolean boolean17 = referenceCollection8.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection8.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection19.references;
        boolean boolean21 = referenceCollection19.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection19.references;
        boolean boolean23 = referenceCollection19.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection19.getInitializingReferenceForConstants();
        boolean boolean25 = referenceCollection19.isWellDefined();
        boolean boolean26 = referenceCollection19.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor27 = referenceCollection19.iterator();
        boolean boolean28 = referenceCollection19.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection19.references;
        referenceCollection8.references = referenceList29;
        referenceCollection0.references = referenceList29;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(referenceItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceList29);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior7.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior7.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate24);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7, varPredicate26);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate28);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollection0.isWellDefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor31 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceItor31);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback8.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = referenceCollectingCallback8.getReferences(var10);
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback8.getReferences(var12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.enterScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(referenceCollection11);
        org.junit.Assert.assertNull(referenceCollection13);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = referenceCollectingCallback7.getReferences(var9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertNull(referenceCollection10);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection4.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection4.iterator();
        boolean boolean8 = referenceCollection4.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection9.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection13.references;
        boolean boolean17 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection13.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection4.references = referenceList20;
        referenceCollection0.references = referenceList20;
        boolean boolean26 = referenceCollection0.isEscaped();
        boolean boolean27 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean28 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = null;
        referenceCollection0.add(reference29);
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = null;
        referenceCollection0.add(reference31);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator33 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator33);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback17.exitScope(nodeTraversal18);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection4.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection4.iterator();
        boolean boolean8 = referenceCollection4.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection9.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection13.references;
        boolean boolean17 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection13.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection4.references = referenceList20;
        referenceCollection0.references = referenceList20;
        boolean boolean26 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor27 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor28 = referenceCollection0.iterator();
        boolean boolean29 = referenceCollection0.isWellDefined();
        boolean boolean30 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceItor27);
        org.junit.Assert.assertNotNull(referenceItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection0.references;
        boolean boolean32 = referenceCollection0.isNeverAssigned();
        boolean boolean33 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor34 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(referenceItor34);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Class<?> wildcardClass8 = behavior2.getClass();
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior7.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap27 = null;
        behavior7.afterExitScope(nodeTraversal26, referenceMap27);
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.process(node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection22);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean10 = referenceCollection9.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection9.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean13 = referenceCollection12.isWellDefined();
        boolean boolean14 = referenceCollection12.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection12.references;
        referenceCollection9.references = referenceList15;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceList15.spliterator();
        referenceCollection0.references = referenceList15;
        boolean boolean19 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator20 = referenceCollection0.spliterator();
        boolean boolean21 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator29 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor30 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator29);
        org.junit.Assert.assertNotNull(referenceItor30);
        org.junit.Assert.assertNotNull(referenceList31);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        java.lang.Class<?> wildcardClass6 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior9.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior9.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = referenceCollectingCallback27.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = referenceCollectingCallback27.shouldTraverse(nodeTraversal29, node30, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior9);
        org.junit.Assert.assertNotNull(varIterable28);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback8.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback8.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback8.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback8.getReferences(var12);
        com.google.javascript.jscomp.Scope.Var var14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = referenceCollectingCallback8.getReferences(var14);
        com.google.javascript.jscomp.Scope.Var var16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = referenceCollectingCallback8.getReferences(var16);
        com.google.javascript.jscomp.Scope.Var var18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = referenceCollectingCallback8.getReferences(var18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = referenceCollectingCallback8.shouldTraverse(nodeTraversal20, node21, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNull(referenceCollection13);
        org.junit.Assert.assertNull(referenceCollection15);
        org.junit.Assert.assertNull(referenceCollection17);
        org.junit.Assert.assertNull(referenceCollection19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.Scope.Var var4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = referenceCollectingCallback3.getReferences(var4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(referenceCollection5);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor23 = referenceCollection0.iterator();
        boolean boolean24 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback21.getReferences(var22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback21.visit(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection23);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection10.references;
        boolean boolean14 = referenceCollection10.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = null;
        referenceCollection10.add(reference16);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection10.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection10.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        boolean boolean22 = referenceCollection20.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection20.references;
        boolean boolean24 = referenceCollection20.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection20.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection20.references = referenceList27;
        referenceCollection10.references = referenceList27;
        referenceCollection0.references = referenceList27;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean33 = referenceCollection32.isEscaped();
        boolean boolean34 = referenceCollection32.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator35 = referenceCollection32.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean37 = referenceCollection36.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator38 = referenceCollection36.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor39 = referenceCollection36.iterator();
        boolean boolean40 = referenceCollection36.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection41 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = referenceCollection41.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference43 = null;
        referenceCollection41.add(reference43);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection45 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList46 = referenceCollection45.references;
        boolean boolean47 = referenceCollection45.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList48 = referenceCollection45.references;
        boolean boolean49 = referenceCollection45.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference50 = referenceCollection45.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray51 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList52 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList52, referenceArray51);
        referenceCollection45.references = referenceList52;
        referenceCollection41.references = referenceList52;
        referenceCollection36.references = referenceList52;
        referenceCollection32.references = referenceList52;
        referenceCollection0.references = referenceList52;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator38);
        org.junit.Assert.assertNotNull(referenceItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceList42);
        org.junit.Assert.assertNotNull(referenceList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(referenceList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(reference50);
        org.junit.Assert.assertNotNull(referenceArray51);
        org.junit.Assert.assertArrayEquals(referenceArray51, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection23.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection23.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection23.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection28.references;
        boolean boolean30 = referenceCollection28.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = referenceCollection28.references;
        boolean boolean32 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference33 = referenceCollection28.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference34 = null;
        referenceCollection28.add(reference34);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList36 = referenceCollection28.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection28.references;
        referenceCollection23.references = referenceList37;
        referenceCollection0.references = referenceList37;
        java.lang.Class<?> wildcardClass40 = referenceList37.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(referenceList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(reference33);
        org.junit.Assert.assertNotNull(referenceList36);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass3 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = referenceCollectingCallback16.getAllSymbols();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.process(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection18);
        org.junit.Assert.assertNotNull(varIterable19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection0.spliterator();
        boolean boolean10 = referenceCollection0.isWellDefined();
        boolean boolean11 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean12 = referenceCollection0.isEscaped();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = null;
        referenceCollection0.add(reference14);
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection5.references;
        boolean boolean9 = referenceCollection5.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection5.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList12, referenceArray11);
        referenceCollection5.references = referenceList12;
        boolean boolean15 = referenceCollection5.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean17 = referenceCollection16.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection16.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor19 = referenceCollection16.iterator();
        boolean boolean20 = referenceCollection16.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection21.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = null;
        referenceCollection21.add(reference23);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection25.references;
        boolean boolean27 = referenceCollection25.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection25.references;
        boolean boolean29 = referenceCollection25.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference30 = referenceCollection25.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray31 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList32, referenceArray31);
        referenceCollection25.references = referenceList32;
        referenceCollection21.references = referenceList32;
        referenceCollection16.references = referenceList32;
        referenceCollection5.references = referenceList32;
        referenceCollection0.references = referenceList32;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference39 = null;
        referenceCollection0.add(reference39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNotNull(referenceArray11);
        org.junit.Assert.assertArrayEquals(referenceArray11, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertNotNull(referenceItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(referenceList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(reference30);
        org.junit.Assert.assertNotNull(referenceArray31);
        org.junit.Assert.assertArrayEquals(referenceArray31, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor23 = referenceCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceItor23);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior6.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior6.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior6.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior4.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior4.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate21);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback22.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.exitScope(nodeTraversal24);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable23);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceList6.spliterator();
        referenceCollection0.references = referenceList6;
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        boolean boolean11 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection0.add(reference13);
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate16);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate9);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback10.getReferences(var11);
        com.google.javascript.jscomp.Scope.Var var13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = referenceCollectingCallback10.getReferences(var13);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope17 = referenceCollectingCallback10.getScope(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection12);
        org.junit.Assert.assertNull(referenceCollection14);
        org.junit.Assert.assertNotNull(varIterable15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceItor8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        boolean boolean6 = referenceCollection4.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection4.references;
        boolean boolean8 = referenceCollection4.isWellDefined();
        boolean boolean9 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        referenceCollection4.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean14 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection0.spliterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator16 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = null;
        referenceCollection0.add(reference17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertNotNull(referenceSpliterator16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection2.references;
        boolean boolean4 = referenceCollection2.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection2.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection2.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection2.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection2.references;
        referenceCollection0.references = referenceList8;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection10.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection14.references;
        boolean boolean16 = referenceCollection14.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection14.references;
        boolean boolean18 = referenceCollection14.isWellDefined();
        boolean boolean19 = referenceCollection14.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        referenceCollection14.references = referenceList21;
        referenceCollection10.references = referenceList21;
        referenceCollection0.references = referenceList21;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator25 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor26 = referenceCollection0.iterator();
        boolean boolean27 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceSpliterator25);
        org.junit.Assert.assertNotNull(referenceItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate20);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection0.spliterator();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate15);
        java.lang.Class<?> wildcardClass17 = behavior6.getClass();
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = referenceCollectingCallback23.getReferences(var25);
        com.google.javascript.jscomp.Scope.Var var27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope28 = referenceCollectingCallback23.getScope(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNull(referenceCollection26);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope17 = referenceCollectingCallback15.getScope(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior6.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback18.hotSwapScript(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior5.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback21.hotSwapScript(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = referenceCollectingCallback15.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = referenceCollectingCallback15.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = referenceCollectingCallback15.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(varIterable16);
        org.junit.Assert.assertNotNull(varIterable17);
        org.junit.Assert.assertNotNull(varIterable18);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        boolean boolean11 = referenceCollection9.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection9.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection9.references;
        boolean boolean15 = referenceCollection9.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection9.references;
        referenceCollection0.references = referenceList16;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceList16);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceList2);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback8.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback8.getAllSymbols();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.hotSwapScript(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertNotNull(referenceList8);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isNeverAssigned();
        boolean boolean8 = referenceCollection5.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection5.references;
        referenceCollection0.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNull(reference11);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection0.iterator();
        boolean boolean10 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection0.add(reference11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = referenceCollection0.isAssignedOnceInLifetime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        boolean boolean9 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        boolean boolean13 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection4.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection4.iterator();
        boolean boolean8 = referenceCollection4.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection9.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection13.references;
        boolean boolean17 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection13.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection4.references = referenceList20;
        referenceCollection0.references = referenceList20;
        boolean boolean26 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor27 = referenceCollection0.iterator();
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection0.isWellDefined();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator30 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator30);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap25 = null;
        behavior7.afterExitScope(nodeTraversal24, referenceMap25);
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = null;
        referenceCollection0.add(reference8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollection0.isWellDefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = referenceCollectingCallback7.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback7.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = referenceCollectingCallback7.getReferences(var10);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable12 = referenceCollectingCallback7.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback7.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(referenceCollection11);
        org.junit.Assert.assertNotNull(varIterable12);
        org.junit.Assert.assertNotNull(varIterable13);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection7.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection7.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator13 = referenceCollection11.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor14 = referenceCollection11.iterator();
        boolean boolean15 = referenceCollection11.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = null;
        referenceCollection16.add(reference18);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        boolean boolean22 = referenceCollection20.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection20.references;
        boolean boolean24 = referenceCollection20.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection20.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection20.references = referenceList27;
        referenceCollection16.references = referenceList27;
        referenceCollection11.references = referenceList27;
        referenceCollection7.references = referenceList27;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator33 = referenceList27.spliterator();
        referenceCollection0.references = referenceList27;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference35 = null;
        referenceCollection0.add(reference35);
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator13);
        org.junit.Assert.assertNotNull(referenceItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator33);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection2.references;
        boolean boolean4 = referenceCollection2.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection2.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection2.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection2.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection2.references;
        referenceCollection0.references = referenceList8;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isEscaped();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection10.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection14.references;
        boolean boolean16 = referenceCollection14.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection14.references;
        boolean boolean18 = referenceCollection14.isWellDefined();
        boolean boolean19 = referenceCollection14.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection20.references;
        referenceCollection14.references = referenceList21;
        referenceCollection10.references = referenceList21;
        referenceCollection0.references = referenceList21;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator25 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor26 = referenceCollection0.iterator();
        boolean boolean27 = referenceCollection0.isEscaped();
        boolean boolean28 = referenceCollection0.isNeverAssigned();
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNotNull(referenceItor7);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceSpliterator25);
        org.junit.Assert.assertNotNull(referenceItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior8.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8, varPredicate18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior8.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap24 = null;
        behavior8.afterExitScope(nodeTraversal23, referenceMap24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate28);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate31 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback32 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate31);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        java.lang.Class<?> wildcardClass7 = referenceItor6.getClass();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        boolean boolean28 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection0.isWellDefined();
        boolean boolean31 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean32 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor33 = referenceCollection0.iterator();
        boolean boolean34 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(referenceItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        java.lang.Class<?> wildcardClass15 = behavior4.getClass();
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator8 = referenceCollection6.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        boolean boolean10 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection11.add(reference13);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection15.references;
        boolean boolean19 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection15.references = referenceList22;
        referenceCollection11.references = referenceList22;
        referenceCollection6.references = referenceList22;
        referenceCollection0.references = referenceList22;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor29 = referenceCollection28.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference30 = referenceCollection28.getInitializingReferenceForConstants();
        boolean boolean31 = referenceCollection28.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor32 = referenceCollection28.iterator();
        boolean boolean33 = referenceCollection28.isEscaped();
        boolean boolean34 = referenceCollection28.isEscaped();
        boolean boolean35 = referenceCollection28.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor36 = referenceCollection28.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator37 = referenceCollection28.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection38 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean39 = referenceCollection38.isEscaped();
        boolean boolean40 = referenceCollection38.isNeverAssigned();
        boolean boolean41 = referenceCollection38.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = referenceCollection38.references;
        referenceCollection28.references = referenceList42;
        referenceCollection0.references = referenceList42;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList45 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator8);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceItor29);
        org.junit.Assert.assertNull(reference30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(referenceItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceItor36);
        org.junit.Assert.assertNotNull(referenceSpliterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(referenceList42);
        org.junit.Assert.assertNotNull(referenceList45);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        boolean boolean10 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = null;
        referenceCollection0.add(reference8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor21 = referenceCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceItor21);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior5.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior5.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior5.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate24);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate26);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection30 = referenceCollectingCallback28.getReferences(var29);
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection30);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior4.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior4.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap23 = null;
        behavior4.afterExitScope(nodeTraversal22, referenceMap23);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback26.process(node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection4.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection4.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection8.references;
        boolean boolean12 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection8.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection8.references = referenceList15;
        referenceCollection4.references = referenceList15;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection4.references;
        referenceCollection0.references = referenceList19;
        boolean boolean21 = referenceCollection0.isWellDefined();
        boolean boolean22 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean24 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean25 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(reference23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.Scope.Var var11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback10.getReferences(var11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = referenceCollectingCallback10.getReferences(var14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback10.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNull(referenceCollection15);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.exitScope(nodeTraversal17);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior4.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior4.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate18);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior4.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback14.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        boolean boolean8 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        boolean boolean10 = referenceCollection6.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection6.add(reference12);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection6.references;
        referenceCollection0.references = referenceList14;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = referenceCollection0.isEscaped();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceList14);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList9);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isEscaped();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor8 = referenceCollection0.iterator();
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator10 = referenceCollection0.spliterator();
        boolean boolean11 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceList12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        boolean boolean8 = referenceCollection0.isWellDefined();
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior5.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate21);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback22.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback22.getReferences(var24);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = referenceCollectingCallback22.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.exitScope(nodeTraversal27);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable23);
        org.junit.Assert.assertNull(referenceCollection25);
        org.junit.Assert.assertNotNull(varIterable26);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass8 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior5.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate18);
        com.google.javascript.jscomp.Scope.Var var20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = referenceCollectingCallback19.getReferences(var20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.exitScope(nodeTraversal22);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNull(referenceCollection21);
    }
}

