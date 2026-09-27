package com.google.javascript.jscomp;

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
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, abstractCompiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.Scope scope0 = null;
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(scope0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, basicBlock1, node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock0 = null;
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock(basicBlock0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference(node0, node1, nodeTraversal2, basicBlock3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var9 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollectingCallback6.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.lang.Class<?> wildcardClass10 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(scope2, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = referenceCollectingCallback2.shouldTraverse(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        java.lang.Class<?> wildcardClass8 = varSet7.getClass();
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.visit(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        java.lang.Class<?> wildcardClass8 = referenceCollectingCallback6.getClass();
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope4 = new com.google.javascript.jscomp.Scope(scope2, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        java.lang.Class<?> wildcardClass5 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.lang.Class<?> wildcardClass6 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("hi!");
        boolean boolean15 = scope10.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope10.getParentScope();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope10.declare("hi!", node18, jSType19, compilerInput20, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback6.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        java.lang.Class<?> wildcardClass1 = behavior0.getClass();
        org.junit.Assert.assertNotNull(behavior0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getVar("hi!");
        boolean boolean14 = scope9.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope9.getParentScope();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope9.declare("hi!", node17, jSType18, compilerInput19, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback6.getReferenceCollection(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("", node16, jSType17, compilerInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        java.lang.Class<?> wildcardClass7 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollectingCallback5.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = var14.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.enterScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass2 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        boolean boolean16 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(scope2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = scope12.isBottom();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node14, jSType15, compilerInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("", node12, jSType13, compilerInput14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        java.lang.Class<?> wildcardClass5 = scope2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        boolean boolean16 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior0.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior0.afterExitScope(nodeTraversal5, varMap6);
        org.junit.Assert.assertNotNull(behavior0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = var14.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType6 = scope5.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        boolean boolean18 = scope17.isLocal();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope17.declare("hi!", node20, jSType21, compilerInput22, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.Scope.Var var4 = null;
        referenceCollection0.add(reference2, nodeTraversal3, var4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = referenceCollection0.isWellDefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.visit(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = scope5.getVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior0.afterExitScope(nodeTraversal2, varMap3);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        org.junit.Assert.assertNotNull(behavior0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getVar("hi!");
        boolean boolean19 = scope14.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope14.getParentScope();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope14.declare("hi!", node22, jSType23, compilerInput24, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = referenceCollectingCallback11.getReferenceCollection(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope20);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap5 = null;
        behavior3.afterExitScope(nodeTraversal4, varMap5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("hi!");
        boolean boolean16 = scope11.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope11.getTypeOfThis();
        boolean boolean18 = scope11.isLocal();
        boolean boolean19 = scope11.isGlobal();
        boolean boolean20 = scope11.isGlobal();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope11.declare("hi!", node22, jSType23, compilerInput24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = referenceCollectingCallback8.getReferenceCollection(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback7.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap5 = null;
        behavior3.afterExitScope(nodeTraversal4, varMap5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = referenceCollectingCallback10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior1.afterExitScope(nodeTraversal3, varMap4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node8, jSType9, compilerInput10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(var6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        boolean boolean10 = scope9.isLocal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope9.declare("hi!", node12, jSType13, compilerInput14, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node5, jSType6, compilerInput7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            var9.setType(jSType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isLocal();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getVar("hi!");
        boolean boolean13 = scope8.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope8.getTypeOfThis();
        boolean boolean15 = scope8.isLocal();
        boolean boolean16 = scope8.isGlobal();
        boolean boolean17 = scope8.isGlobal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope8.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap10 = null;
        behavior2.afterExitScope(nodeTraversal9, varMap10);
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap5 = null;
        behavior3.afterExitScope(nodeTraversal4, varMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap10 = null;
        behavior3.afterExitScope(nodeTraversal9, varMap10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        int int9 = scope2.getDepth();
        boolean boolean12 = scope2.isDeclared("", false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("hi!");
        boolean boolean20 = scope15.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope15.getTypeOfThis();
        boolean boolean22 = scope15.isLocal();
        boolean boolean23 = scope15.isGlobal();
        boolean boolean24 = scope15.isGlobal();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope15.declare("hi!", node26, jSType27, compilerInput28);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objectType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.jscomp.Scope.Var var23 = scope21.getVar("hi!");
        boolean boolean26 = scope21.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope21.getParentScope();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput31 = null;
        com.google.javascript.jscomp.Scope.Var var33 = scope21.declare("hi!", node29, jSType30, compilerInput31, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope27);
        org.junit.Assert.assertNotNull(var33);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node5, jSType6, compilerInput7, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("", node11, jSType12, compilerInput13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollectingCallback3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node5, jSType6, compilerInput7, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var9.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        int int12 = scope2.getVarCount();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection1 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean2 = referenceCollection1.isEscaped();
        boolean boolean3 = referenceCollection1.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection1.references;
        referenceCollection0.references = referenceList4;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node5, jSType6, compilerInput7, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = null;
        referenceCollection0.references = referenceList24;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node14, jSType15, compilerInput16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            var18.setType(jSType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        int int15 = scope2.getDepth();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(scope2, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node17, jSType18, compilerInput19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = var20.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(node3, objectType4);
        com.google.javascript.jscomp.Scope.Var var7 = scope5.getVar("hi!");
        boolean boolean10 = scope5.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope5.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope5.getOwnSlot("");
        boolean boolean16 = scope5.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var18 = scope5.getVar("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope5.declare("hi!", node20, jSType21, compilerInput22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback2.getReferenceCollection(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        java.lang.Class<?> wildcardClass5 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = scope12.getGlobalScope();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope13.declare("", node15, jSType16, compilerInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = scope10.getVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        boolean boolean4 = scope2.isBottom();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        boolean boolean4 = scope2.isBottom();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var11.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        boolean boolean16 = scope2.isBottom();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node6, jSType7, compilerInput8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node14, jSType15, compilerInput16, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = var18.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node14, jSType15, compilerInput16, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = var18.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node8, jSType9, compilerInput10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = scope6.getDepth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = scope12.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getVar("hi!");
        boolean boolean21 = scope16.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = scope16.getTypeOfThis();
        boolean boolean23 = scope16.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope16.getVars();
        boolean boolean25 = scope16.isGlobal();
        com.google.javascript.jscomp.Scope scope26 = scope16.getGlobalScope();
        com.google.javascript.rhino.Node node27 = scope16.getRootNode();
        boolean boolean30 = scope16.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor31 = scope16.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope16.getVars();
        boolean boolean33 = scope16.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = scope16.getTypeOfThis();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput38 = null;
        com.google.javascript.jscomp.Scope.Var var39 = scope16.declare("hi!", node36, jSType37, compilerInput38);
        // The following exception was thrown during execution in test generation
        try {
            scope13.undeclare(var39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(varItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(varItor31);
        org.junit.Assert.assertNotNull(varItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNotNull(var39);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        java.lang.Class<?> wildcardClass8 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.enterScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("hi!");
        com.google.javascript.jscomp.Scope scope14 = scope11.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope11.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var19 = scope11.getVar("hi!");
        com.google.javascript.rhino.Node node20 = scope11.getRootNode();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope11.declare("hi!", node22, jSType23, compilerInput24);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNull(var19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        java.lang.Class<?> wildcardClass14 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(scope2, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(scope2, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.lang.Class<?> wildcardClass6 = referenceList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollectingCallback5.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var8 = scope2.declare("hi!", node5, jSType6, compilerInput7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope6.declare("", node8, jSType9, compilerInput10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isLocal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getVar("hi!");
        com.google.javascript.jscomp.Scope scope17 = scope14.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope14.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope14.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var22 = scope14.getVar("hi!");
        com.google.javascript.rhino.Node node23 = scope14.getRootNode();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope14.declare("hi!", node25, jSType26, compilerInput27);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getVar("hi!");
        boolean boolean18 = scope13.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope13.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope13.getOwnSlot("");
        boolean boolean24 = scope13.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var26 = scope13.getVar("hi!");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var31 = scope13.declare("hi!", node28, jSType29, compilerInput30);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(var26);
        org.junit.Assert.assertNotNull(var31);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        com.google.javascript.jscomp.Scope.Var var26 = scope24.getVar("hi!");
        boolean boolean29 = scope24.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = scope24.getSlot("");
        int int32 = scope24.getDepth();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput36 = null;
        com.google.javascript.jscomp.Scope.Var var38 = scope24.declare("hi!", node34, jSType35, compilerInput36, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(objectType21);
        org.junit.Assert.assertNull(var26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(var38);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.lang.Class<?> wildcardClass4 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass12 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("", node15, jSType16, compilerInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(objectType13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = scope10.isGlobal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("");
        int int14 = scope2.getVarCount();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass8 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("hi!", node22, jSType23, compilerInput24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = var25.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.exitScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        int int12 = scope2.getDepth();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = scope2.getRootNode();
        com.google.javascript.rhino.Node node22 = scope2.getRootNode();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("", node24, jSType25, compilerInput26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        com.google.javascript.jscomp.Scope.Var var8 = scope6.getVar("hi!");
        boolean boolean11 = scope6.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope6.getSlot("");
        int int14 = scope6.getDepth();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope6.declare("hi!", node16, jSType17, compilerInput18, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        org.junit.Assert.assertNull(behavior0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var24 = scope2.declare("", node20, jSType21, compilerInput22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            behavior1.afterExitScope(nodeTraversal4, varMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        java.lang.Class<?> wildcardClass14 = scope12.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node7, jSType8, compilerInput9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(scope2, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("", node18, jSType19, compilerInput20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getParentScope();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("", node17, jSType18, compilerInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(scope2, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(varItor13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node17, jSType18, compilerInput19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(scope2, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        int int12 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getVar("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope16.declare("hi!", node20, jSType21, compilerInput22);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = referenceCollectingCallback4.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceList5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        boolean boolean15 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("");
        int int18 = scope2.getVarCount();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        boolean boolean13 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("", node16, jSType17, compilerInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        int int14 = scope2.getVarCount();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getVar("hi!");
        boolean boolean22 = scope17.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope17.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope17.getOwnSlot("");
        boolean boolean28 = scope17.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node29 = scope17.getRootNode();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput33 = null;
        com.google.javascript.jscomp.Scope.Var var35 = scope17.declare("hi!", node31, jSType32, compilerInput33, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(var19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope23);
        org.junit.Assert.assertNull(jSTypeStaticSlot25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(var35);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("", node18, jSType19, compilerInput20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        boolean boolean4 = scope2.isBottom();
        boolean boolean5 = scope2.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope4 = scope2.getParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.exitScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = scope2.getRootNode();
        com.google.javascript.rhino.Node node22 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getVar("");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var30 = scope2.declare("", node26, jSType27, compilerInput28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(var24);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope12.getOwnSlot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getParentScope();
        int int16 = scope2.getDepth();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("", node6, jSType7, compilerInput8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        boolean boolean17 = scope2.isDeclared("", false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("", node19, jSType20, compilerInput21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, true);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("", node24, jSType25, compilerInput26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        boolean boolean15 = scope14.isLocal();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope14.declare("hi!", node17, jSType18, compilerInput19, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getVar("hi!");
        boolean boolean14 = scope9.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope9.getOwnSlot("");
        boolean boolean20 = scope9.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var22 = scope9.getVar("hi!");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope9.declare("hi!", node24, jSType25, compilerInput26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = referenceCollectingCallback5.getReferenceCollection(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollectingCallback5.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        int int15 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getParentScope();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getVar("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var8 = scope2.declare("hi!", node5, jSType6, compilerInput7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = var8.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean2 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(node3, objectType4);
        com.google.javascript.jscomp.Scope.Var var7 = scope5.getVar("hi!");
        boolean boolean10 = scope5.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope5.getTypeOfThis();
        boolean boolean12 = scope5.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope5.getVars();
        boolean boolean14 = scope5.isGlobal();
        com.google.javascript.jscomp.Scope scope15 = scope5.getGlobalScope();
        com.google.javascript.rhino.Node node16 = scope5.getRootNode();
        boolean boolean19 = scope5.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope5.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope5.getVars();
        boolean boolean22 = scope5.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = scope5.getTypeOfThis();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope5.declare("hi!", node25, jSType26, compilerInput27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection29 = referenceCollectingCallback2.getReferenceCollection(var28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varItor20);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(objectType23);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node14, jSType15, compilerInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isGlobal();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(scope2, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        int int13 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean25 = referenceCollection24.isEscaped();
        boolean boolean26 = referenceCollection24.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection24.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean29 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray30 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList31, referenceArray30);
        referenceCollection28.references = referenceList31;
        referenceCollection24.references = referenceList31;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection35 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean36 = referenceCollection35.isEscaped();
        boolean boolean37 = referenceCollection35.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList38 = referenceCollection35.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection39 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean40 = referenceCollection39.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray41 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList42, referenceArray41);
        referenceCollection39.references = referenceList42;
        referenceCollection35.references = referenceList42;
        referenceCollection24.references = referenceList42;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection47 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean48 = referenceCollection47.isEscaped();
        boolean boolean49 = referenceCollection47.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList50 = referenceCollection47.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection51 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean52 = referenceCollection51.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray53 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList54 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList54, referenceArray53);
        referenceCollection51.references = referenceList54;
        referenceCollection47.references = referenceList54;
        referenceCollection24.references = referenceList54;
        referenceCollection0.references = referenceList54;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference60 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(referenceArray30);
        org.junit.Assert.assertArrayEquals(referenceArray30, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(referenceList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceArray41);
        org.junit.Assert.assertArrayEquals(referenceArray41, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(referenceList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(referenceArray53);
        org.junit.Assert.assertArrayEquals(referenceArray53, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(scope2, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        int int14 = scope2.getDepth();
        boolean boolean17 = scope2.isDeclared("hi!", false);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jSTypeStaticSlot17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getVar("hi!");
        boolean boolean13 = scope8.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope8.getSlot("");
        boolean boolean16 = scope8.isBottom();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope8.declare("hi!", node18, jSType19, compilerInput20, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback5.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("hi!", node15, jSType16, compilerInput17, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = var19.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getParentScope();
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope2, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope17);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            var20.setType(jSType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("hi!");
        boolean boolean12 = scope7.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope7.getSlot("");
        boolean boolean15 = scope7.isBottom();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope7.declare("hi!", node17, jSType18, compilerInput19, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback3.getReferenceCollection(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(referenceList12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope7 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope14 = scope12.getParent();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope14.declare("", node16, jSType17, compilerInput18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("hi!");
        boolean boolean12 = scope7.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope7.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope7.getParentScope();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope7.declare("hi!", node17, jSType18, compilerInput19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = referenceCollectingCallback3.getReferenceCollection(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = scope2.getParent();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        boolean boolean19 = scope18.isLocal();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("hi!", node21, jSType22, compilerInput23, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        boolean boolean8 = scope2.isLocal();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        java.lang.Class<?> wildcardClass15 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getVar("hi!");
        boolean boolean21 = scope16.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot23 = scope16.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope16.getParentScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope16.declare("hi!", node26, jSType27, compilerInput28);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot23);
        org.junit.Assert.assertNull(jSTypeStaticScope24);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        int int19 = scope2.getVarCount();
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(scope2, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = referenceCollectingCallback2.shouldTraverse(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getVar("hi!");
        boolean boolean13 = scope8.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope8.getTypeOfThis();
        boolean boolean15 = scope8.isLocal();
        boolean boolean16 = scope8.isGlobal();
        boolean boolean17 = scope8.isGlobal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope8.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        int int14 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        boolean boolean16 = scope15.isLocal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("hi!");
        boolean boolean15 = scope10.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope10.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope10.getOwnSlot("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope10.declare("hi!", node20, jSType21, compilerInput22, false);
        // The following exception was thrown during execution in test generation
        try {
            scope6.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        boolean boolean10 = scope2.isBottom();
        boolean boolean13 = scope2.isDeclared("hi!", true);
        java.lang.Class<?> wildcardClass14 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("", node12, jSType13, compilerInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollectingCallback4.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
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
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("hi!");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.enterScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isEscaped();
        boolean boolean25 = referenceCollection23.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection23.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean28 = referenceCollection27.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection27.references = referenceList30;
        referenceCollection23.references = referenceList30;
        referenceCollection0.references = referenceList30;
        boolean boolean35 = referenceCollection0.isWellDefined();
        boolean boolean36 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.lang.Class<?> wildcardClass4 = referenceList3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope2.getVars();
        java.lang.Class<?> wildcardClass13 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(var6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        int int19 = scope2.getVarCount();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("", node21, jSType22, compilerInput23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getParentScope();
        com.google.javascript.rhino.Node node17 = scope2.getRootNode();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("", node19, jSType20, compilerInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        int int10 = scope9.getDepth();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope9.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.exitScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node7, jSType8, compilerInput9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("hi!", node22, jSType23, compilerInput24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = var25.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("", node16, jSType17, compilerInput18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getVar("hi!");
        boolean boolean23 = scope18.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = scope18.getTypeOfThis();
        boolean boolean25 = scope18.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope18.getVars();
        boolean boolean27 = scope18.isGlobal();
        com.google.javascript.jscomp.Scope scope28 = scope18.getGlobalScope();
        com.google.javascript.rhino.Node node29 = scope18.getRootNode();
        boolean boolean32 = scope18.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot34 = scope18.getSlot("hi!");
        boolean boolean37 = scope18.isDeclared("", true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput41 = null;
        com.google.javascript.jscomp.Scope.Var var42 = scope18.declare("hi!", node39, jSType40, compilerInput41);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(varItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(scope28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(var42);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = var22.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        boolean boolean14 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("", node16, jSType17, compilerInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        int int5 = scope2.getVarCount();
        boolean boolean8 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        java.lang.Class<?> wildcardClass8 = scope6.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isLocal();
        boolean boolean8 = scope2.isDeclared("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = null;
        referenceCollection0.references = referenceList24;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = referenceCollection0.isWellDefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        boolean boolean15 = scope13.isBottom();
        com.google.javascript.rhino.Node node16 = scope13.getRootNode();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope13.declare("hi!", node18, jSType19, compilerInput20, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables15.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        boolean boolean16 = scope2.isLocal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.jscomp.Scope.Var var23 = scope21.getVar("hi!");
        boolean boolean26 = scope21.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope21.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot29 = scope21.getOwnSlot("");
        boolean boolean32 = scope21.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node33 = scope21.getRootNode();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput37 = null;
        com.google.javascript.jscomp.Scope.Var var39 = scope21.declare("hi!", node35, jSType36, compilerInput37, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope27);
        org.junit.Assert.assertNull(jSTypeStaticSlot29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(var39);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("hi!");
        boolean boolean20 = scope15.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope15.getTypeOfThis();
        boolean boolean22 = scope15.isLocal();
        com.google.javascript.jscomp.Scope scope23 = scope15.getParent();
        com.google.javascript.jscomp.Scope.Var var25 = scope15.getVar("hi!");
        int int26 = scope15.getDepth();
        int int27 = scope15.getVarCount();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput31 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope15.declare("hi!", node29, jSType30, compilerInput31);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objectType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(var25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(var32);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node16, jSType17, compilerInput18, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = var20.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        boolean boolean6 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("hi!");
        boolean boolean15 = scope10.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope10.getTypeOfThis();
        boolean boolean17 = scope10.isLocal();
        boolean boolean18 = scope10.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope10.getVars();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope10.declare("hi!", node21, jSType22, compilerInput23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback5.getReferenceCollection(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(varItor19);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            var16.setType(jSType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean25 = referenceCollection24.isEscaped();
        boolean boolean26 = referenceCollection24.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection24.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean29 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray30 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList31 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList31, referenceArray30);
        referenceCollection28.references = referenceList31;
        referenceCollection24.references = referenceList31;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection35 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean36 = referenceCollection35.isEscaped();
        boolean boolean37 = referenceCollection35.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList38 = referenceCollection35.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection39 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean40 = referenceCollection39.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray41 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList42, referenceArray41);
        referenceCollection39.references = referenceList42;
        referenceCollection35.references = referenceList42;
        referenceCollection24.references = referenceList42;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection47 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean48 = referenceCollection47.isEscaped();
        boolean boolean49 = referenceCollection47.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList50 = referenceCollection47.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection51 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean52 = referenceCollection51.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray53 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList54 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList54, referenceArray53);
        referenceCollection51.references = referenceList54;
        referenceCollection47.references = referenceList54;
        referenceCollection24.references = referenceList54;
        referenceCollection0.references = referenceList54;
        boolean boolean60 = referenceCollection0.isWellDefined();
        boolean boolean61 = referenceCollection0.isWellDefined();
        boolean boolean62 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(referenceArray30);
        org.junit.Assert.assertArrayEquals(referenceArray30, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(referenceList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceArray41);
        org.junit.Assert.assertArrayEquals(referenceArray41, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(referenceList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(referenceArray53);
        org.junit.Assert.assertArrayEquals(referenceArray53, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.enterScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        java.lang.Class<?> wildcardClass18 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        com.google.javascript.jscomp.Scope.Var var8 = scope6.getVar("hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope6.declare("hi!", node10, jSType11, compilerInput12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = referenceCollectingCallback3.getReferenceCollection(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = scope10.isDeclared("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getSlot("hi!");
        boolean boolean21 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("hi!", node23, jSType24, compilerInput25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.jscomp.Scope.Var var31 = scope29.getVar("hi!");
        com.google.javascript.jscomp.Scope scope32 = scope29.getParent();
        com.google.javascript.rhino.Node node33 = scope29.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot35 = scope29.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope29.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = scope29.getTypeOfThis();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput41 = null;
        com.google.javascript.jscomp.Scope.Var var43 = scope29.declare("hi!", node39, jSType40, compilerInput41, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(var26);
        org.junit.Assert.assertNull(var31);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(jSTypeStaticSlot35);
        org.junit.Assert.assertNull(jSTypeStaticScope36);
        org.junit.Assert.assertNull(objectType37);
        org.junit.Assert.assertNotNull(var43);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node6, jSType7, compilerInput8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var9.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("hi!", node13, jSType14, compilerInput15, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = var17.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isEscaped();
        boolean boolean25 = referenceCollection23.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection23.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean28 = referenceCollection27.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection27.references = referenceList30;
        referenceCollection23.references = referenceList30;
        referenceCollection0.references = referenceList30;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = referenceCollection0.references;
        boolean boolean36 = referenceCollection0.isEscaped();
        boolean boolean37 = referenceCollection0.isEscaped();
        boolean boolean38 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection39 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean40 = referenceCollection39.firstReferenceIsAssigningDeclaration();
        boolean boolean41 = referenceCollection39.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = referenceCollection39.references;
        referenceCollection0.references = referenceList42;
        java.lang.Class<?> wildcardClass44 = referenceList42.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(referenceList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(referenceList42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isEscaped();
        boolean boolean25 = referenceCollection23.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection23.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean28 = referenceCollection27.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection27.references = referenceList30;
        referenceCollection23.references = referenceList30;
        referenceCollection0.references = referenceList30;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference36 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference37 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(referenceList35);
        org.junit.Assert.assertNull(reference36);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getParentScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var24 = scope2.declare("", node20, jSType21, compilerInput22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope17);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("hi!");
        boolean boolean16 = scope11.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope11.getSlot("");
        int int19 = scope11.getDepth();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope11.declare("hi!", node21, jSType22, compilerInput23, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollectingCallback3.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(scope2, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean8 = referenceCollection0.isEscaped();
        java.lang.Class<?> wildcardClass9 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        int int15 = scope2.getDepth();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getVar("hi!");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("hi!", node22, jSType23, compilerInput24);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("hi!");
        boolean boolean20 = scope15.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope15.getSlot("");
        boolean boolean23 = scope15.isBottom();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope15.declare("hi!", node25, jSType26, compilerInput27, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        boolean boolean7 = scope6.isLocal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope6.declare("hi!", node9, jSType10, compilerInput11, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = referenceCollectingCallback3.getReferenceCollection(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope11, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        boolean boolean13 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope14 = scope2.getParent();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getSlot("");
        boolean boolean17 = scope2.isLocal();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getVar("hi!");
        com.google.javascript.jscomp.Scope scope23 = scope20.getParent();
        com.google.javascript.rhino.Node node24 = scope20.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope20.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope20.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = scope20.getTypeOfThis();
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput32 = null;
        com.google.javascript.jscomp.Scope.Var var34 = scope20.declare("hi!", node30, jSType31, compilerInput32, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(jSTypeStaticSlot26);
        org.junit.Assert.assertNull(jSTypeStaticScope27);
        org.junit.Assert.assertNull(objectType28);
        org.junit.Assert.assertNotNull(var34);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = scope13.isGlobal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("", node12, jSType13, compilerInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isGlobal();
        boolean boolean12 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = scope13.isBottom();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("hi!", node15, jSType16, compilerInput17, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = var19.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.lang.Class<?> wildcardClass5 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = null;
        referenceCollection0.references = referenceList23;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollectingCallback4.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope11.declare("", node14, jSType15, compilerInput16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        int int12 = scope2.getVarCount();
        boolean boolean13 = scope2.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node15, jSType16, compilerInput17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = var18.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope4 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = scope4.isLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        boolean boolean13 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node16, jSType17, compilerInput18, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = var20.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        int int15 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope2.getVars();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(varItor16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        boolean boolean14 = referenceCollection0.isNeverAssigned();
        boolean boolean15 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getVar("hi!");
        boolean boolean19 = scope14.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope14.getTypeOfThis();
        boolean boolean21 = scope14.isLocal();
        boolean boolean22 = scope14.isGlobal();
        boolean boolean23 = scope14.isGlobal();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope14.declare("hi!", node25, jSType26, compilerInput27);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node17, jSType18, compilerInput19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("hi!", node22, jSType23, compilerInput24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope2.getVars();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getVar("hi!");
        boolean boolean22 = scope17.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot24 = scope17.getSlot("");
        boolean boolean25 = scope17.isBottom();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = null;
        com.google.javascript.jscomp.Scope.Var var31 = scope17.declare("hi!", node27, jSType28, compilerInput29, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNull(var19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(var31);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            behavior1.afterExitScope(nodeTraversal3, varMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        int int14 = scope2.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("hi!", node16, jSType17, compilerInput18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = var19.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection6.isWellDefined();
        boolean boolean9 = referenceCollection6.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection6.references;
        boolean boolean11 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection6.references;
        referenceCollection0.references = referenceList12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceList12);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope16 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        java.lang.Class<?> wildcardClass8 = scope2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("hi!");
        boolean boolean12 = scope2.isBottom();
        boolean boolean13 = scope2.isGlobal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        int int10 = scope2.getDepth();
        java.lang.Class<?> wildcardClass11 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        int int12 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = scope13.getRootNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = reference9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollectingCallback3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        boolean boolean13 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node16, jSType17, compilerInput18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.Node node24 = scope23.getRootNode();
        boolean boolean25 = scope23.isBottom();
        com.google.javascript.rhino.Node node26 = scope23.getRootNode();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope23.declare("hi!", node28, jSType29, compilerInput30, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(var32);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        int int15 = scope14.getVarCount();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope14.declare("hi!", node17, jSType18, compilerInput19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = var20.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        boolean boolean14 = scope2.isBottom();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("", node16, jSType17, compilerInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getVar("hi!");
        boolean boolean14 = scope9.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope9.getParentScope();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope9.declare("hi!", node17, jSType18, compilerInput19, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback6.getReferenceCollection(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getOwnSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getVars();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.exitScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isGlobal();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("", node11, jSType12, compilerInput13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection0.isNeverAssigned();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean14 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        java.lang.Class<?> wildcardClass19 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.lang.Class<?> wildcardClass3 = referenceCollectingCallback2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        int int15 = scope14.getVarCount();
        int int16 = scope14.getDepth();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope2, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        boolean boolean10 = scope2.isBottom();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("", node16, jSType17, compilerInput18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.isNeverAssigned();
        boolean boolean9 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceList10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        boolean boolean15 = scope14.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        com.google.javascript.rhino.Node node17 = scope14.getRootNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = referenceCollectingCallback2.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope14 = scope12.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = scope14.isDeclared("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node14, jSType15, compilerInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        boolean boolean10 = scope2.isGlobal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean15 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean16 = referenceCollection14.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean18 = referenceCollection17.isEscaped();
        boolean boolean19 = referenceCollection17.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection17.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection17.references;
        boolean boolean22 = referenceCollection17.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection23.getInitializingReferenceForConstants();
        boolean boolean26 = referenceCollection23.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean28 = referenceCollection27.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection27.references = referenceList30;
        referenceCollection23.references = referenceList30;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection34 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean35 = referenceCollection34.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList37, referenceArray36);
        referenceCollection34.references = referenceList37;
        referenceCollection23.references = referenceList37;
        referenceCollection17.references = referenceList37;
        referenceCollection14.references = referenceList37;
        referenceCollection0.references = referenceList37;
        boolean boolean44 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceArray36);
        org.junit.Assert.assertArrayEquals(referenceArray36, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        int int14 = scope2.getDepth();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        int int16 = scope2.getVarCount();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(node3, objectType4);
        int int6 = scope5.getDepth();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("hi!", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = referenceCollectingCallback2.getReferenceCollection(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("hi!");
        boolean boolean12 = scope2.isBottom();
        int int13 = scope2.getDepth();
        boolean boolean14 = scope2.isBottom();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection0.isNeverAssigned();
        boolean boolean13 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        int int4 = scope2.getDepth();
        boolean boolean5 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = referenceCollectingCallback4.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope2.getVars();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertNotNull(varItor16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        boolean boolean14 = scope2.isDeclared("hi!", false);
        boolean boolean15 = scope2.isBottom();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getVars();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        boolean boolean12 = scope2.isBottom();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getVar("hi!");
        boolean boolean18 = scope13.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope13.getSlot("");
        int int21 = scope13.getDepth();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope13.declare("hi!", node23, jSType24, compilerInput25, true);
        // The following exception was thrown during execution in test generation
        try {
            scope10.undeclare(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        java.lang.Class<?> wildcardClass16 = inlineVariables15.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isWellDefined();
        boolean boolean24 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean25 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("hi!");
        boolean boolean15 = scope10.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope10.getTypeOfThis();
        boolean boolean17 = scope10.isLocal();
        boolean boolean18 = scope10.isGlobal();
        boolean boolean19 = scope10.isGlobal();
        int int20 = scope10.getVarCount();
        boolean boolean21 = scope10.isBottom();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope10.declare("hi!", node23, jSType24, compilerInput25);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("hi!", node15, jSType16, compilerInput17, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = var19.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var22 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var27 = scope2.declare("", node24, jSType25, compilerInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(var22);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        boolean boolean15 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = scope2.getTypeOfThis();
        boolean boolean19 = scope2.isGlobal();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("", node21, jSType22, compilerInput23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var13 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.exitScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = scope2.getRootNode();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("", node23, jSType24, compilerInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        boolean boolean4 = scope2.isBottom();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback5.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback5.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet8 = referenceCollectingCallback5.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = referenceCollectingCallback5.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(varSet8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.Scope.Var var4 = null;
        referenceCollection0.add(reference2, nodeTraversal3, var4);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = null;
        referenceCollection0.references = referenceList7;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        int int9 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("");
        int int12 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(scope2, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isGlobal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node5, jSType6, compilerInput7, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        int int13 = scope2.getDepth();
        boolean boolean14 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope16 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection6.isWellDefined();
        boolean boolean9 = referenceCollection6.isWellDefined();
        boolean boolean10 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection6.references;
        referenceCollection0.references = referenceList11;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNull(reference13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        boolean boolean8 = scope6.isBottom();
        boolean boolean11 = scope6.isDeclared("", false);
        boolean boolean14 = scope6.isDeclared("hi!", true);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isLocal();
        boolean boolean8 = scope2.isDeclared("", true);
        boolean boolean9 = scope2.isBottom();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType13 = scope12.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope2.getVars();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(varItor12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = scope2.getRootNode();
        com.google.javascript.rhino.Node node22 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot24 = scope2.getSlot("hi!");
        boolean boolean25 = scope2.isBottom();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        com.google.javascript.jscomp.Scope.Var var30 = scope28.getVar("hi!");
        boolean boolean33 = scope28.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope28.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot36 = scope28.getOwnSlot("");
        boolean boolean39 = scope28.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node40 = scope28.getRootNode();
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput44 = null;
        com.google.javascript.jscomp.Scope.Var var46 = scope28.declare("hi!", node42, jSType43, compilerInput44, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(jSTypeStaticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(var30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope34);
        org.junit.Assert.assertNull(jSTypeStaticSlot36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(var46);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("");
        int int16 = scope2.getDepth();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(scope2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet3 = referenceCollectingCallback2.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback2.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("hi!");
        boolean boolean12 = scope7.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope7.getParentScope();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope7.declare("hi!", node15, jSType16, compilerInput17, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback2.getReferenceCollection(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet3);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node17, jSType18, compilerInput19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback4.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback4.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("hi!");
        boolean boolean15 = scope10.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope10.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope10.getParentScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope10.declare("hi!", node20, jSType21, compilerInput22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback4.getReferenceCollection(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope14 = scope12.getParent();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope12.declare("", node16, jSType17, compilerInput18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean3 = referenceCollection2.isEscaped();
        boolean boolean4 = referenceCollection2.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection2.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList9, referenceArray8);
        referenceCollection6.references = referenceList9;
        referenceCollection2.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean14 = referenceCollection13.isEscaped();
        boolean boolean15 = referenceCollection13.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection13.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean18 = referenceCollection17.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection17.references = referenceList20;
        referenceCollection13.references = referenceList20;
        referenceCollection2.references = referenceList20;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean26 = referenceCollection25.isEscaped();
        boolean boolean27 = referenceCollection25.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection25.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean30 = referenceCollection29.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray31 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList32, referenceArray31);
        referenceCollection29.references = referenceList32;
        referenceCollection25.references = referenceList32;
        referenceCollection2.references = referenceList32;
        referenceCollection0.references = referenceList32;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference38 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceArray8);
        org.junit.Assert.assertArrayEquals(referenceArray8, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceArray31);
        org.junit.Assert.assertArrayEquals(referenceArray31, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(reference38);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        boolean boolean14 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNull(objectType19);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        java.lang.Class<?> wildcardClass10 = mode3.getClass();
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getParentScope();
        boolean boolean18 = scope2.isBottom();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.jscomp.Scope.Var var23 = scope21.getVar("hi!");
        boolean boolean26 = scope21.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = scope21.getTypeOfThis();
        boolean boolean28 = scope21.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope21.getVars();
        boolean boolean30 = scope21.isGlobal();
        com.google.javascript.jscomp.Scope scope31 = scope21.getGlobalScope();
        com.google.javascript.rhino.Node node32 = scope21.getRootNode();
        boolean boolean35 = scope21.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor36 = scope21.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor37 = scope21.getVars();
        boolean boolean38 = scope21.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = scope21.getTypeOfThis();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput43 = null;
        com.google.javascript.jscomp.Scope.Var var44 = scope21.declare("hi!", node41, jSType42, compilerInput43);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNull(jSTypeStaticScope17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(objectType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(varItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(scope31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(varItor36);
        org.junit.Assert.assertNotNull(varItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(objectType39);
        org.junit.Assert.assertNotNull(var44);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, true);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        boolean boolean15 = scope2.isBottom();
        int int16 = scope2.getDepth();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        boolean boolean8 = scope6.isGlobal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("hi!", node13, jSType14, compilerInput15, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = var17.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        boolean boolean13 = scope2.isBottom();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        boolean boolean16 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        boolean boolean19 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node23 = scope2.getRootNode();
        int int24 = scope2.getDepth();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        boolean boolean11 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = scope12.getGlobalScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        boolean boolean14 = scope2.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.isWellDefined();
        boolean boolean9 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback5.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean10 = referenceCollection0.isWellDefined();
        boolean boolean11 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet6 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getVar("hi!");
        boolean boolean14 = scope9.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope9.getTypeOfThis();
        boolean boolean16 = scope9.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope9.getVars();
        boolean boolean18 = scope9.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope9.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope21 = scope9.getGlobalScope();
        int int22 = scope21.getVarCount();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope21.declare("hi!", node24, jSType25, compilerInput26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = referenceCollectingCallback3.getReferenceCollection(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNotNull(varSet6);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope19 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope19.getVar("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNull(scope19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = scope12.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getVar("hi!");
        boolean boolean21 = scope16.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = scope16.getTypeOfThis();
        boolean boolean23 = scope16.isLocal();
        com.google.javascript.jscomp.Scope scope24 = scope16.getParent();
        com.google.javascript.jscomp.Scope.Var var26 = scope16.getVar("hi!");
        int int27 = scope16.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot29 = scope16.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = scope16.getSlot("");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput35 = null;
        com.google.javascript.jscomp.Scope.Var var36 = scope16.declare("hi!", node33, jSType34, compilerInput35);
        // The following exception was thrown during execution in test generation
        try {
            scope12.undeclare(var36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(var26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot29);
        org.junit.Assert.assertNull(jSTypeStaticSlot31);
        org.junit.Assert.assertNotNull(var36);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        boolean boolean18 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        int int17 = scope2.getVarCount();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getVar("hi!");
        boolean boolean25 = scope20.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope20.getTypeOfThis();
        boolean boolean27 = scope20.isLocal();
        boolean boolean28 = scope20.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope20.getVars();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput33 = null;
        com.google.javascript.jscomp.Scope.Var var34 = scope20.declare("hi!", node31, jSType32, compilerInput33);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(varItor29);
        org.junit.Assert.assertNotNull(var34);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        int int9 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getVar("hi!");
        boolean boolean19 = scope14.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope14.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope14.getParentScope();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope14.declare("hi!", node24, jSType25, compilerInput26);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        boolean boolean14 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        boolean boolean10 = scope2.isBottom();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = null;
        referenceCollection0.references = referenceList11;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNotNull(referenceList10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node11, jSType12, compilerInput13, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = var15.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        java.lang.Class<?> wildcardClass13 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        java.lang.Class<?> wildcardClass9 = scope2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        int int13 = scope2.getVarCount();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        int int7 = scope2.getDepth();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isEscaped();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean5 = referenceCollection4.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection4.references = referenceList7;
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isEscaped();
        boolean boolean13 = referenceCollection11.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection11.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection15.references = referenceList18;
        referenceCollection11.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean23 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean25 = referenceCollection24.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = referenceCollection24.getInitializingReferenceForConstants();
        boolean boolean27 = referenceCollection24.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = referenceCollection24.references;
        referenceCollection0.references = referenceList28;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(reference26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceList28);
        org.junit.Assert.assertNotNull(referenceList30);
        org.junit.Assert.assertNull(reference31);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getVar("hi!");
        java.lang.Class<?> wildcardClass17 = scope2.getClass();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var13 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getVar("hi!");
        com.google.javascript.jscomp.Scope scope15 = scope12.getParent();
        com.google.javascript.rhino.Node node16 = scope12.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope12.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope12.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope12.getTypeOfThis();
        boolean boolean23 = scope12.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node24 = scope12.getRootNode();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var30 = scope12.declare("hi!", node26, jSType27, compilerInput28, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(var30);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        boolean boolean15 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("hi!", node17, jSType18, compilerInput19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = var20.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        boolean boolean16 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getSlot("hi!");
        boolean boolean21 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("hi!", node23, jSType24, compilerInput25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = var26.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("hi!");
        boolean boolean7 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getVarCount();
        int int13 = scope2.getDepth();
        int int14 = scope2.getVarCount();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }
}

