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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType29 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError32 = nodeTraversal18.makeError(node28, diagnosticType29, strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError37 = nodeTraversal3.makeError(node14, diagnosticType29, strArray36);
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue39 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal3.getInputId();
        int int41 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43);
        boolean boolean45 = nodeTraversal44.hasScope();
        java.lang.String str46 = nodeTraversal44.getSourceName();
        boolean boolean47 = nodeTraversal44.hasScope();
        com.google.javascript.rhino.InputId inputId48 = nodeTraversal44.getInputId();
        com.google.javascript.jscomp.Compiler compiler49 = nodeTraversal44.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal44.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue50;
        java.lang.String str52 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node53 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(diagnosticType29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNull(compiler49);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        boolean boolean12 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = null;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue13;
        boolean boolean15 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue24;
        com.google.javascript.rhino.Node node26 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId27 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.Scope scope30 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node28, node29, scope30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(inputId27);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal19.cfgs;
        com.google.javascript.rhino.Node node21 = nodeTraversal19.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, callback23, nodeArray24);
        nodeTraversal19.traverseRoots(nodeArray24);
        java.lang.String str27 = nodeTraversal19.getSourceName();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal19.getScope();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType30 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError33 = nodeTraversal19.makeError(node29, diagnosticType30, strArray32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal37.cfgs;
        com.google.javascript.rhino.Node node39 = nodeTraversal37.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler40, callback41, nodeArray42);
        nodeTraversal37.traverseRoots(nodeArray42);
        java.lang.String str45 = nodeTraversal37.getSourceName();
        boolean boolean46 = nodeTraversal37.inGlobalScope();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler48, callback49, scopeCreator50);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue52 = nodeTraversal51.cfgs;
        com.google.javascript.rhino.Node node53 = nodeTraversal51.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler54, callback55, nodeArray56);
        nodeTraversal51.traverseRoots(nodeArray56);
        java.lang.String str59 = nodeTraversal51.getSourceName();
        com.google.javascript.jscomp.Scope scope60 = nodeTraversal51.getScope();
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType62 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError65 = nodeTraversal51.makeError(node61, diagnosticType62, strArray64);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError67 = nodeTraversal37.makeError(node47, diagnosticType62, strArray66);
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.report(node15, diagnosticType30, strArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(diagnosticType30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertArrayEquals(nodeArray42, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertArrayEquals(nodeArray56, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertNotNull(diagnosticType62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError67);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback22);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.Scope scope25 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule26 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(scope25);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList9 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList9, nodeArray8);
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback15);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList9);
        boolean boolean18 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId19 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNull(inputId20);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        boolean boolean13 = nodeTraversal3.hasScope();
        int int14 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.jscomp.Scope scope20 = nodeTraversal19.getScope();
        com.google.javascript.rhino.Node node21 = nodeTraversal19.getEnclosingFunction();
        java.lang.String str22 = nodeTraversal19.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue35 = nodeTraversal34.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        nodeTraversal34.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        boolean boolean43 = nodeTraversal34.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler46, callback47, nodeArray48);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler44, callback45, nodeArray48);
        nodeTraversal34.traverseRoots(nodeArray48);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, callback30, nodeArray48);
        nodeTraversal19.traverseRoots(nodeArray48);
        nodeTraversal3.traverseRoots(nodeArray48);
        com.google.javascript.rhino.InputId inputId55 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator58 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler56, callback57, scopeCreator58);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue60 = nodeTraversal59.cfgs;
        java.lang.String str61 = nodeTraversal59.getSourceName();
        com.google.javascript.rhino.InputId inputId62 = nodeTraversal59.getInputId();
        com.google.javascript.rhino.InputId inputId63 = nodeTraversal59.getInputId();
        com.google.javascript.jscomp.Compiler compiler64 = nodeTraversal59.getCompiler();
        boolean boolean65 = nodeTraversal59.inGlobalScope();
        com.google.javascript.jscomp.Scope scope66 = nodeTraversal59.getScope();
        int int67 = nodeTraversal59.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback69 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator70 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal71 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler68, callback69, scopeCreator70);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue72 = nodeTraversal71.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator75 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal76 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler73, callback74, scopeCreator75);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue77 = nodeTraversal76.cfgs;
        nodeTraversal71.cfgs = nodeControlFlowGraphQueue77;
        java.lang.String str79 = nodeTraversal71.getSourceName();
        com.google.javascript.jscomp.Scope scope80 = nodeTraversal71.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue81 = nodeTraversal71.cfgs;
        nodeTraversal59.cfgs = nodeControlFlowGraphQueue81;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue81;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue35);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertArrayEquals(nodeArray48, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId55);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(inputId62);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertNull(compiler64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue72);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(scope80);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue81);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Compiler compiler8 = nodeTraversal3.getCompiler();
        boolean boolean9 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope10 = nodeTraversal3.getScope();
        int int11 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        com.google.javascript.jscomp.Scope scope24 = nodeTraversal15.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue25;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph27 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNull(compiler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        boolean boolean8 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope9 = nodeTraversal3.getScope();
        java.lang.String str10 = nodeTraversal3.getSourceName();
        boolean boolean11 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        boolean boolean5 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal3.cfgs;
        boolean boolean9 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler10 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compiler10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        int int15 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler12 = nodeTraversal3.getCompiler();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        java.lang.String str14 = nodeTraversal3.getSourceName();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(compiler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler12 = nodeTraversal3.getCompiler();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        boolean boolean15 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(compiler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node14, scope15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal17.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList21 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList21, nodeArray20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, (java.util.List<com.google.javascript.rhino.Node>) nodeList21, callback23);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList21, callback26);
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList21, callback28);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList21);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        int int6 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.Scope scope8 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node7, scope8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getCurrentNode();
        java.lang.String str22 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal27.cfgs;
        com.google.javascript.rhino.Node node29 = nodeTraversal27.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray32);
        nodeTraversal27.traverseRoots(nodeArray32);
        java.lang.String str35 = nodeTraversal27.getSourceName();
        boolean boolean36 = nodeTraversal27.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, callback38, nodeArray39);
        nodeTraversal27.traverseRoots(nodeArray39);
        nodeTraversal3.traverseRoots(nodeArray39);
        int int43 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertArrayEquals(nodeArray39, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        java.lang.String str14 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        boolean boolean6 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        boolean boolean8 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        com.google.javascript.rhino.Node node19 = nodeTraversal17.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, callback21, nodeArray22);
        nodeTraversal17.traverseRoots(nodeArray22);
        java.lang.String str25 = nodeTraversal17.getSourceName();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal17.getScope();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError31 = nodeTraversal17.makeError(node27, diagnosticType28, strArray30);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError33 = nodeTraversal3.makeError(node13, diagnosticType28, strArray32);
        int int34 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal40.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        nodeTraversal40.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal40.traverseRoots(nodeArray49);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, callback36, nodeArray49);
        nodeTraversal3.traverseRoots(nodeArray49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator55 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler53, callback54, scopeCreator55);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue57 = nodeTraversal56.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList60 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList60, nodeArray59);
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler58, (java.util.List<com.google.javascript.rhino.Node>) nodeList60, callback62);
        nodeTraversal56.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList60);
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal56.traverseRoots(nodeArray65);
        com.google.javascript.rhino.InputId inputId67 = nodeTraversal56.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue68 = nodeTraversal56.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue68;
        com.google.javascript.jscomp.Compiler compiler70 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Scope scope71 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope72 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNotNull(diagnosticType28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertArrayEquals(nodeArray49, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue57);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertArrayEquals(nodeArray59, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodeArray65);
        org.junit.Assert.assertArrayEquals(nodeArray65, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue68);
        org.junit.Assert.assertNull(compiler70);
        org.junit.Assert.assertNull(scope71);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId13 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList22 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList22, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, (java.util.List<com.google.javascript.rhino.Node>) nodeList22, callback24);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback37);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback40);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        int int43 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler44, callback45, scopeCreator46);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue48 = nodeTraversal47.cfgs;
        com.google.javascript.rhino.Node node49 = nodeTraversal47.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, callback51, nodeArray52);
        nodeTraversal47.traverseRoots(nodeArray52);
        boolean boolean55 = nodeTraversal47.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator58 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler56, callback57, scopeCreator58);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue60 = nodeTraversal59.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator63 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal64 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler61, callback62, scopeCreator63);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue65 = nodeTraversal64.cfgs;
        nodeTraversal59.cfgs = nodeControlFlowGraphQueue65;
        java.lang.String str67 = nodeTraversal59.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue68 = nodeTraversal59.cfgs;
        nodeTraversal47.cfgs = nodeControlFlowGraphQueue68;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        com.google.javascript.rhino.Node[] nodeArray73 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList74 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList74, nodeArray73);
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler72, (java.util.List<com.google.javascript.rhino.Node>) nodeList74, callback76);
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler71, (java.util.List<com.google.javascript.rhino.Node>) nodeList74, callback78);
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, (java.util.List<com.google.javascript.rhino.Node>) nodeList74, callback80);
        nodeTraversal47.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList74);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList74);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node84 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(nodeArray52);
        org.junit.Assert.assertArrayEquals(nodeArray52, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue60);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue68);
        org.junit.Assert.assertNotNull(nodeArray73);
        org.junit.Assert.assertArrayEquals(nodeArray73, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType29 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError32 = nodeTraversal18.makeError(node28, diagnosticType29, strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError37 = nodeTraversal3.makeError(node14, diagnosticType29, strArray36);
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal3.getInputId();
        boolean boolean39 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue43 = nodeTraversal42.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue43;
        com.google.javascript.jscomp.Compiler compiler45 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(diagnosticType29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue43);
        org.junit.Assert.assertNull(compiler45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        com.google.javascript.rhino.Node node18 = nodeTraversal16.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray21);
        nodeTraversal16.traverseRoots(nodeArray21);
        java.lang.String str24 = nodeTraversal16.getSourceName();
        boolean boolean25 = nodeTraversal16.inGlobalScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal30.cfgs;
        com.google.javascript.rhino.Node node32 = nodeTraversal30.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, callback34, nodeArray35);
        nodeTraversal30.traverseRoots(nodeArray35);
        java.lang.String str38 = nodeTraversal30.getSourceName();
        com.google.javascript.jscomp.Scope scope39 = nodeTraversal30.getScope();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType41 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError44 = nodeTraversal30.makeError(node40, diagnosticType41, strArray43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError46 = nodeTraversal16.makeError(node26, diagnosticType41, strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "" };
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal3.makeError(node12, diagnosticType41, strArray50);
        com.google.javascript.jscomp.Scope scope52 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node53 = nodeTraversal3.getCurrentNode();
        java.lang.String str54 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph55 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNotNull(diagnosticType41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue24;
        com.google.javascript.rhino.Node node26 = nodeTraversal3.getEnclosingFunction();
        int int27 = nodeTraversal3.getLineNumber();
        int int28 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        int int6 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal10.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue18;
        com.google.javascript.jscomp.Compiler compiler20 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList30 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList30, nodeArray29);
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList30, callback32);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList30);
        boolean boolean35 = nodeTraversal26.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, callback39, nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, callback37, nodeArray40);
        nodeTraversal26.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray40);
        nodeTraversal3.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList51 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList51, nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList51, callback53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList51, callback55);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList51, callback57);
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler46, (java.util.List<com.google.javascript.rhino.Node>) nodeList51, callback59);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList51);
        com.google.javascript.rhino.Node node62 = nodeTraversal3.getEnclosingFunction();
        int int63 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(compiler20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Scope scope22 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope23 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule24 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(scope23);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList9 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList9, nodeArray8);
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback15);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList9);
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal5.cfgs;
        com.google.javascript.rhino.Node node7 = nodeTraversal5.getCurrentNode();
        boolean boolean8 = nodeTraversal5.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        boolean boolean21 = nodeTraversal12.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, callback23, nodeArray26);
        nodeTraversal12.traverseRoots(nodeArray26);
        nodeTraversal5.traverseRoots(nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        boolean boolean7 = nodeTraversal2.hasScope();
        int int8 = nodeTraversal2.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        boolean boolean21 = nodeTraversal12.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, callback23, nodeArray26);
        nodeTraversal12.traverseRoots(nodeArray26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray32);
        nodeTraversal12.traverseRoots(nodeArray32);
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal12.getScope();
        boolean boolean36 = nodeTraversal12.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal12.cfgs;
        nodeTraversal2.cfgs = nodeControlFlowGraphQueue37;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue39 = nodeTraversal2.cfgs;
        boolean boolean40 = nodeTraversal2.hasScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        java.lang.String str7 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal18.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal29.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue30;
        com.google.javascript.rhino.Node node32 = nodeTraversal24.getEnclosingFunction();
        java.lang.String str33 = nodeTraversal24.getSourceName();
        com.google.javascript.rhino.Node node34 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.Node node35 = nodeTraversal24.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler36 = nodeTraversal24.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal24.cfgs;
        nodeTraversal18.cfgs = nodeControlFlowGraphQueue37;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue37;
        java.lang.String str40 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(compiler36);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        int int11 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        com.google.javascript.jscomp.Compiler compiler19 = nodeTraversal17.getCompiler();
        com.google.javascript.rhino.Node node20 = nodeTraversal17.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.rhino.Node node26 = nodeTraversal24.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray29);
        nodeTraversal24.traverseRoots(nodeArray29);
        boolean boolean32 = nodeTraversal24.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler33 = nodeTraversal24.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue42 = nodeTraversal41.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList45 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList45, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler43, (java.util.List<com.google.javascript.rhino.Node>) nodeList45, callback47);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList45);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal41.traverseRoots(nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, callback37, nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray50);
        nodeTraversal24.traverseRoots(nodeArray50);
        nodeTraversal17.traverseRoots(nodeArray50);
        nodeTraversal3.traverseRoots(nodeArray50);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node57, scope58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(compiler19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(compiler33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue42);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal5.getScope();
        boolean boolean7 = nodeTraversal5.hasScope();
        com.google.javascript.rhino.Node node8 = nodeTraversal5.getEnclosingFunction();
        boolean boolean9 = nodeTraversal5.inGlobalScope();
        com.google.javascript.rhino.Node node10 = nodeTraversal5.getEnclosingFunction();
        com.google.javascript.rhino.Node node11 = nodeTraversal5.getEnclosingFunction();
        com.google.javascript.rhino.Node node12 = nodeTraversal5.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal18.getScope();
        boolean boolean20 = nodeTraversal18.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, callback26, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray27);
        nodeTraversal18.traverseRoots(nodeArray27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37);
        boolean boolean39 = nodeTraversal38.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal43.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList47 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList47, nodeArray46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler45, (java.util.List<com.google.javascript.rhino.Node>) nodeList47, callback49);
        nodeTraversal43.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList47);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal43.traverseRoots(nodeArray52);
        nodeTraversal38.traverseRoots(nodeArray52);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray52);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, callback33, nodeArray52);
        nodeTraversal18.traverseRoots(nodeArray52);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray52);
        nodeTraversal5.traverseRoots(nodeArray52);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray52);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertArrayEquals(nodeArray46, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeArray52);
        org.junit.Assert.assertArrayEquals(nodeArray52, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler4, callback5, scopeCreator6);
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal7.getScope();
        com.google.javascript.rhino.Node node9 = nodeTraversal7.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11);
        boolean boolean13 = nodeTraversal12.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList21 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList21, nodeArray20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, (java.util.List<com.google.javascript.rhino.Node>) nodeList21, callback23);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList21);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal17.traverseRoots(nodeArray26);
        nodeTraversal12.traverseRoots(nodeArray26);
        nodeTraversal7.traverseRoots(nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, callback3, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray26);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.Node node4 = nodeTraversal2.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal2.getInputId();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverse(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal18.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal18.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        boolean boolean31 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope32 = nodeTraversal3.getScope();
        java.lang.String str33 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        boolean boolean17 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16);
        boolean boolean18 = nodeTraversal17.hasScope();
        java.lang.String str19 = nodeTraversal17.getSourceName();
        boolean boolean20 = nodeTraversal17.hasScope();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal17.getInputId();
        com.google.javascript.rhino.Node node22 = nodeTraversal17.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal31.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue32;
        com.google.javascript.rhino.Node node34 = nodeTraversal26.getEnclosingFunction();
        java.lang.String str35 = nodeTraversal26.getSourceName();
        com.google.javascript.rhino.Node node36 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.Node node37 = nodeTraversal26.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal43.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList49 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList49, nodeArray48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler46, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler45, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback55);
        nodeTraversal43.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback58);
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback60);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler66 = null;
        com.google.javascript.rhino.Node[] nodeArray67 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList68 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList68, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.Callback callback70 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler66, (java.util.List<com.google.javascript.rhino.Node>) nodeList68, callback70);
        com.google.javascript.jscomp.NodeTraversal.Callback callback72 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler65, (java.util.List<com.google.javascript.rhino.Node>) nodeList68, callback72);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList68);
        com.google.javascript.rhino.InputId inputId75 = nodeTraversal3.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass76 = inputId75.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertArrayEquals(nodeArray48, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeArray67);
        org.junit.Assert.assertArrayEquals(nodeArray67, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(inputId75);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal19.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue25;
        com.google.javascript.rhino.Node node27 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal19.getScope();
        boolean boolean29 = nodeTraversal19.hasScope();
        int int30 = nodeTraversal19.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue35 = nodeTraversal34.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList40 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList40, nodeArray39);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, (java.util.List<com.google.javascript.rhino.Node>) nodeList40, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, (java.util.List<com.google.javascript.rhino.Node>) nodeList40, callback44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList40, callback46);
        nodeTraversal34.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList40);
        nodeTraversal19.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList40);
        boolean boolean50 = nodeTraversal19.inGlobalScope();
        boolean boolean51 = nodeTraversal19.hasScope();
        int int52 = nodeTraversal19.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator55 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler53, callback54, scopeCreator55);
        com.google.javascript.jscomp.Scope scope57 = nodeTraversal56.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList60 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList60, nodeArray59);
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler58, (java.util.List<com.google.javascript.rhino.Node>) nodeList60, callback62);
        nodeTraversal56.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList60);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler66 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList69 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList69, nodeArray68);
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler67, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback71);
        com.google.javascript.jscomp.NodeTraversal.Callback callback73 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler66, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback73);
        com.google.javascript.jscomp.NodeTraversal.Callback callback75 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler65, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback75);
        nodeTraversal56.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        nodeTraversal19.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        com.google.javascript.jscomp.NodeTraversal.Callback callback79 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback79);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        com.google.javascript.rhino.Node node82 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler83 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback84 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator85 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal86 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler83, callback84, scopeCreator85);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler87 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback88 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator89 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal90 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler87, callback88, scopeCreator89);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue91 = nodeTraversal90.cfgs;
        com.google.javascript.rhino.Node node92 = nodeTraversal90.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue93 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal90.cfgs = nodeControlFlowGraphQueue93;
        nodeTraversal86.cfgs = nodeControlFlowGraphQueue93;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue93;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue35);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertArrayEquals(nodeArray39, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertArrayEquals(nodeArray59, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertArrayEquals(nodeArray68, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue91);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler4, callback5, scopeCreator6);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal7.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList11, callback13);
        nodeTraversal7.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList11);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal7.traverseRoots(nodeArray16);
        nodeTraversal2.traverseRoots(nodeArray16);
        java.lang.String str19 = nodeTraversal2.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput20 = nodeTraversal2.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        com.google.javascript.rhino.Node node10 = nodeTraversal8.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray13);
        nodeTraversal8.traverseRoots(nodeArray13);
        java.lang.String str16 = nodeTraversal8.getSourceName();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal8.getScope();
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal8.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal22.cfgs;
        com.google.javascript.rhino.Node node24 = nodeTraversal22.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, callback26, nodeArray27);
        nodeTraversal22.traverseRoots(nodeArray27);
        nodeTraversal8.traverseRoots(nodeArray27);
        com.google.javascript.rhino.Node node31 = nodeTraversal8.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback48);
        nodeTraversal8.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal2.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue56 = nodeTraversal55.cfgs;
        com.google.javascript.rhino.Node node57 = nodeTraversal55.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue58 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal55.cfgs = nodeControlFlowGraphQueue58;
        int int60 = nodeTraversal55.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback66 = null;
        com.google.javascript.rhino.Node[] nodeArray67 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler65, callback66, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, callback64, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler61, callback62, nodeArray67);
        nodeTraversal55.traverseRoots(nodeArray67);
        nodeTraversal2.traverseRoots(nodeArray67);
        com.google.javascript.jscomp.Scope scope73 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseAtScope(scope73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(nodeArray67);
        org.junit.Assert.assertArrayEquals(nodeArray67, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList9 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList9, nodeArray8);
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback15);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList9);
        boolean boolean18 = nodeTraversal3.hasScope();
        int int19 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal3.getInputId();
        java.lang.String str21 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule22 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal26.getScope();
        com.google.javascript.rhino.Node node28 = nodeTraversal26.getEnclosingFunction();
        java.lang.String str29 = nodeTraversal26.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue30;
        boolean boolean32 = nodeTraversal3.inGlobalScope();
        int int33 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal3.traverseRoots(nodeArray23);
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal3.getScope();
        boolean boolean27 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal35.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList39 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList39, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback41);
        nodeTraversal35.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList39);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal35.traverseRoots(nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, callback29, nodeArray44);
        nodeTraversal3.traverseRoots(nodeArray44);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node49, scope50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertArrayEquals(nodeArray38, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler4, callback5, scopeCreator6);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal7.cfgs;
        com.google.javascript.rhino.Node node9 = nodeTraversal7.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray12);
        nodeTraversal7.traverseRoots(nodeArray12);
        boolean boolean15 = nodeTraversal7.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal19.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue25;
        java.lang.String str27 = nodeTraversal19.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal19.cfgs;
        nodeTraversal7.cfgs = nodeControlFlowGraphQueue28;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback40);
        nodeTraversal7.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        nodeTraversal2.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.rhino.Node node44 = nodeTraversal2.getCurrentNode();
        int int45 = nodeTraversal2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule46 = nodeTraversal2.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        boolean boolean7 = nodeTraversal2.hasScope();
        boolean boolean8 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.Node node9 = nodeTraversal2.getEnclosingFunction();
        com.google.javascript.rhino.Node node10 = nodeTraversal2.getCurrentNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        int int15 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId17 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(inputId17);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        boolean boolean5 = nodeTraversal2.hasScope();
        boolean boolean6 = nodeTraversal2.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue16;
        com.google.javascript.rhino.Node node18 = nodeTraversal10.getEnclosingFunction();
        java.lang.String str19 = nodeTraversal10.getSourceName();
        com.google.javascript.rhino.Node node20 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, callback23, nodeArray26);
        nodeTraversal10.traverseRoots(nodeArray26);
        nodeTraversal2.traverseRoots(nodeArray26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue35 = nodeTraversal34.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        nodeTraversal34.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        boolean boolean43 = nodeTraversal34.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler44, callback45, scopeCreator46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler48, callback49, scopeCreator50);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue52 = nodeTraversal51.cfgs;
        com.google.javascript.rhino.Node node53 = nodeTraversal51.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue54 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal51.cfgs = nodeControlFlowGraphQueue54;
        nodeTraversal47.cfgs = nodeControlFlowGraphQueue54;
        nodeTraversal34.cfgs = nodeControlFlowGraphQueue54;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue58 = nodeTraversal34.cfgs;
        nodeTraversal2.cfgs = nodeControlFlowGraphQueue58;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue35);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue58);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        int int13 = nodeTraversal3.getScopeDepth();
        int int14 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope7 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal12.traverseRoots(nodeArray21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal27.cfgs;
        com.google.javascript.rhino.Node node29 = nodeTraversal27.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray32);
        nodeTraversal27.traverseRoots(nodeArray32);
        java.lang.String str35 = nodeTraversal27.getSourceName();
        com.google.javascript.jscomp.Scope scope36 = nodeTraversal27.getScope();
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType38 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError41 = nodeTraversal27.makeError(node37, diagnosticType38, strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError46 = nodeTraversal12.makeError(node23, diagnosticType38, strArray45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator49 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler47, callback48, scopeCreator49);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue51 = nodeTraversal50.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList54 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList54, nodeArray53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler52, (java.util.List<com.google.javascript.rhino.Node>) nodeList54, callback56);
        nodeTraversal50.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList54);
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal50.traverseRoots(nodeArray59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator64 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler62, callback63, scopeCreator64);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue66 = nodeTraversal65.cfgs;
        com.google.javascript.rhino.Node node67 = nodeTraversal65.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback69 = null;
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler68, callback69, nodeArray70);
        nodeTraversal65.traverseRoots(nodeArray70);
        java.lang.String str73 = nodeTraversal65.getSourceName();
        com.google.javascript.jscomp.Scope scope74 = nodeTraversal65.getScope();
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType76 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError79 = nodeTraversal65.makeError(node75, diagnosticType76, strArray78);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError84 = nodeTraversal50.makeError(node61, diagnosticType76, strArray83);
        com.google.javascript.jscomp.JSError jSError85 = nodeTraversal3.makeError(node8, diagnosticType38, strArray83);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput86 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNotNull(diagnosticType38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError46);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue51);
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertArrayEquals(nodeArray53, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertArrayEquals(nodeArray59, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(nodeArray70);
        org.junit.Assert.assertArrayEquals(nodeArray70, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(scope74);
        org.junit.Assert.assertNotNull(diagnosticType76);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError79);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError84);
        org.junit.Assert.assertNotNull(jSError85);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.Node node4 = nodeTraversal2.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal2.getInputId();
        com.google.javascript.jscomp.Scope scope6 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseAtScope(scope6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        int int15 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        boolean boolean17 = nodeTraversal3.hasScope();
        int int18 = nodeTraversal3.getScopeDepth();
        java.lang.String str19 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.jscomp.Compiler compiler28 = nodeTraversal26.getCompiler();
        com.google.javascript.rhino.Node node29 = nodeTraversal26.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback40);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        int int43 = nodeTraversal26.getScopeDepth();
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType45 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal49.cfgs;
        com.google.javascript.rhino.Node node51 = nodeTraversal49.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler52, callback53, nodeArray54);
        nodeTraversal49.traverseRoots(nodeArray54);
        java.lang.String str57 = nodeTraversal49.getSourceName();
        com.google.javascript.jscomp.Scope scope58 = nodeTraversal49.getScope();
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType60 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError63 = nodeTraversal49.makeError(node59, diagnosticType60, strArray62);
        com.google.javascript.jscomp.JSError jSError64 = nodeTraversal26.makeError(node44, diagnosticType45, strArray62);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback66 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator67 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal68 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler65, callback66, scopeCreator67);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue69 = nodeTraversal68.cfgs;
        com.google.javascript.rhino.Node node70 = nodeTraversal68.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback72 = null;
        com.google.javascript.rhino.Node[] nodeArray73 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler71, callback72, nodeArray73);
        nodeTraversal68.traverseRoots(nodeArray73);
        java.lang.String str76 = nodeTraversal68.getSourceName();
        com.google.javascript.jscomp.Scope scope77 = nodeTraversal68.getScope();
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType79 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError82 = nodeTraversal68.makeError(node78, diagnosticType79, strArray81);
        com.google.javascript.jscomp.JSError jSError83 = nodeTraversal3.makeError(node22, diagnosticType45, strArray81);
        java.lang.String str84 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node85 = nodeTraversal3.getCurrentNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNull(compiler28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(diagnosticType45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertArrayEquals(nodeArray54, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(scope58);
        org.junit.Assert.assertNotNull(diagnosticType60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError63);
        org.junit.Assert.assertNotNull(jSError64);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(nodeArray73);
        org.junit.Assert.assertArrayEquals(nodeArray73, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(scope77);
        org.junit.Assert.assertNotNull(diagnosticType79);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError82);
        org.junit.Assert.assertNotNull(jSError83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(node85);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        boolean boolean5 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        boolean boolean7 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal15.getScope();
        boolean boolean17 = nodeTraversal15.hasScope();
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal15.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal26.getScope();
        com.google.javascript.rhino.Node node28 = nodeTraversal26.getEnclosingFunction();
        java.lang.String str29 = nodeTraversal26.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal33.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.jscomp.Scope scope40 = nodeTraversal39.getScope();
        com.google.javascript.rhino.Node node41 = nodeTraversal39.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43);
        boolean boolean45 = nodeTraversal44.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal49.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList53 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList53, nodeArray52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler51, (java.util.List<com.google.javascript.rhino.Node>) nodeList53, callback55);
        nodeTraversal49.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList53);
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal49.traverseRoots(nodeArray58);
        nodeTraversal44.traverseRoots(nodeArray58);
        nodeTraversal39.traverseRoots(nodeArray58);
        nodeTraversal26.traverseRoots(nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray58);
        nodeTraversal15.traverseRoots(nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray58);
        nodeTraversal3.traverseRoots(nodeArray58);
        com.google.javascript.rhino.Node node68 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertNotNull(nodeArray52);
        org.junit.Assert.assertArrayEquals(nodeArray52, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertArrayEquals(nodeArray58, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node68);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7);
        boolean boolean9 = nodeTraversal8.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue14 = nodeTraversal13.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList17 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList17, nodeArray16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, (java.util.List<com.google.javascript.rhino.Node>) nodeList17, callback19);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList17);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal13.traverseRoots(nodeArray22);
        nodeTraversal8.traverseRoots(nodeArray22);
        nodeTraversal3.traverseRoots(nodeArray22);
        com.google.javascript.rhino.Node node26 = nodeTraversal3.getCurrentNode();
        java.lang.String str27 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput28 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue14);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal22.cfgs;
        nodeTraversal17.cfgs = nodeControlFlowGraphQueue23;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue23;
        int int26 = nodeTraversal3.getLineNumber();
        boolean boolean27 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node28 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule23 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        com.google.javascript.rhino.Node node10 = nodeTraversal8.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray13);
        nodeTraversal8.traverseRoots(nodeArray13);
        java.lang.String str16 = nodeTraversal8.getSourceName();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal8.getScope();
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal8.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal22.cfgs;
        com.google.javascript.rhino.Node node24 = nodeTraversal22.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, callback26, nodeArray27);
        nodeTraversal22.traverseRoots(nodeArray27);
        nodeTraversal8.traverseRoots(nodeArray27);
        com.google.javascript.rhino.Node node31 = nodeTraversal8.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback48);
        nodeTraversal8.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal2.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue56 = nodeTraversal55.cfgs;
        com.google.javascript.rhino.Node node57 = nodeTraversal55.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue58 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal55.cfgs = nodeControlFlowGraphQueue58;
        int int60 = nodeTraversal55.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback66 = null;
        com.google.javascript.rhino.Node[] nodeArray67 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler65, callback66, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, callback64, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler61, callback62, nodeArray67);
        nodeTraversal55.traverseRoots(nodeArray67);
        nodeTraversal2.traverseRoots(nodeArray67);
        com.google.javascript.rhino.Node[] nodeArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseRoots(nodeArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(nodeArray67);
        org.junit.Assert.assertArrayEquals(nodeArray67, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal18.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal18.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        boolean boolean31 = nodeTraversal3.hasScope();
        int int32 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal36.cfgs;
        com.google.javascript.rhino.Node node38 = nodeTraversal36.getCurrentNode();
        boolean boolean39 = nodeTraversal36.hasScope();
        com.google.javascript.rhino.Node node40 = nodeTraversal36.getEnclosingFunction();
        boolean boolean41 = nodeTraversal36.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler43, callback44, scopeCreator45);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue47 = nodeTraversal46.cfgs;
        com.google.javascript.rhino.Node node48 = nodeTraversal46.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, callback50, nodeArray51);
        nodeTraversal46.traverseRoots(nodeArray51);
        java.lang.String str54 = nodeTraversal46.getSourceName();
        com.google.javascript.jscomp.Scope scope55 = nodeTraversal46.getScope();
        com.google.javascript.jscomp.Scope scope56 = nodeTraversal46.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator59 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal60 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler57, callback58, scopeCreator59);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue61 = nodeTraversal60.cfgs;
        com.google.javascript.rhino.Node node62 = nodeTraversal60.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, callback64, nodeArray65);
        nodeTraversal60.traverseRoots(nodeArray65);
        nodeTraversal46.traverseRoots(nodeArray65);
        com.google.javascript.rhino.Node node69 = nodeTraversal46.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler74 = null;
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList76 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList76, nodeArray75);
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler74, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback78);
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler73, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback80);
        com.google.javascript.jscomp.NodeTraversal.Callback callback82 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler72, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback82);
        com.google.javascript.jscomp.NodeTraversal.Callback callback84 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler71, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback84);
        com.google.javascript.jscomp.NodeTraversal.Callback callback86 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback86);
        nodeTraversal46.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        com.google.javascript.jscomp.NodeTraversal.Callback callback89 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback89);
        nodeTraversal36.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(scope55);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(nodeArray65);
        org.junit.Assert.assertArrayEquals(nodeArray65, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeArray75);
        org.junit.Assert.assertArrayEquals(nodeArray75, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal18.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal18.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        com.google.javascript.jscomp.Scope scope31 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node32 = nodeTraversal3.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        boolean boolean5 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        boolean boolean7 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node10 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal16.getScope();
        boolean boolean18 = nodeTraversal16.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray25);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray25);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray25);
        nodeTraversal16.traverseRoots(nodeArray25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35);
        boolean boolean37 = nodeTraversal36.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue42 = nodeTraversal41.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList45 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList45, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler43, (java.util.List<com.google.javascript.rhino.Node>) nodeList45, callback47);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList45);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal41.traverseRoots(nodeArray50);
        nodeTraversal36.traverseRoots(nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, callback33, nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray50);
        nodeTraversal16.traverseRoots(nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray50);
        nodeTraversal3.traverseRoots(nodeArray50);
        java.lang.Class<?> wildcardClass58 = nodeArray50.getClass();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertArrayEquals(nodeArray25, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue42);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        boolean boolean5 = nodeTraversal2.hasScope();
        boolean boolean6 = nodeTraversal2.hasScope();
        java.util.List<com.google.javascript.rhino.Node> nodeList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseRoots(nodeList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler15 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(compiler15);
        org.junit.Assert.assertNull(compiler16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType14 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError17 = nodeTraversal3.makeError(node13, diagnosticType14, strArray16);
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = null;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue20;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal3.cfgs;
        boolean boolean23 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(diagnosticType14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList9 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList9, nodeArray8);
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback15);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList9);
        boolean boolean18 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node20 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getEnclosingFunction();
        java.lang.Class<?> wildcardClass22 = nodeTraversal3.getClass();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray19);
        nodeTraversal3.traverseRoots(nodeArray19);
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getCurrentNode();
        java.lang.String str24 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph25 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId22 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope23 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.Scope scope25 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node24, scope25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNull(scope23);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        com.google.javascript.rhino.Node node19 = nodeTraversal17.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, callback21, nodeArray22);
        nodeTraversal17.traverseRoots(nodeArray22);
        java.lang.String str25 = nodeTraversal17.getSourceName();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal17.getScope();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError31 = nodeTraversal17.makeError(node27, diagnosticType28, strArray30);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError33 = nodeTraversal3.makeError(node13, diagnosticType28, strArray32);
        int int34 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal40.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        nodeTraversal40.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal40.traverseRoots(nodeArray49);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, callback36, nodeArray49);
        nodeTraversal3.traverseRoots(nodeArray49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator55 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler53, callback54, scopeCreator55);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue57 = nodeTraversal56.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList60 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList60, nodeArray59);
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler58, (java.util.List<com.google.javascript.rhino.Node>) nodeList60, callback62);
        nodeTraversal56.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList60);
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal56.traverseRoots(nodeArray65);
        com.google.javascript.rhino.InputId inputId67 = nodeTraversal56.getInputId();
        com.google.javascript.rhino.InputId inputId68 = nodeTraversal56.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue69 = nodeTraversal56.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue69;
        com.google.javascript.jscomp.Compiler compiler71 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId72 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNotNull(diagnosticType28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertArrayEquals(nodeArray49, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue57);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertArrayEquals(nodeArray59, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodeArray65);
        org.junit.Assert.assertArrayEquals(nodeArray65, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue69);
        org.junit.Assert.assertNull(compiler71);
        org.junit.Assert.assertNull(inputId72);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue24;
        int int26 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal5.getScope();
        boolean boolean7 = nodeTraversal5.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, callback13, nodeArray14);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray14);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray14);
        nodeTraversal5.traverseRoots(nodeArray14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.jscomp.Scope scope23 = nodeTraversal22.getScope();
        com.google.javascript.rhino.Node node24 = nodeTraversal22.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope25 = nodeTraversal22.getScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal30.cfgs;
        com.google.javascript.jscomp.Compiler compiler32 = nodeTraversal30.getCompiler();
        com.google.javascript.rhino.Node node33 = nodeTraversal30.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback44);
        nodeTraversal30.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        int int47 = nodeTraversal30.getScopeDepth();
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType49 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler50, callback51, scopeCreator52);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue54 = nodeTraversal53.cfgs;
        com.google.javascript.rhino.Node node55 = nodeTraversal53.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler56, callback57, nodeArray58);
        nodeTraversal53.traverseRoots(nodeArray58);
        java.lang.String str61 = nodeTraversal53.getSourceName();
        com.google.javascript.jscomp.Scope scope62 = nodeTraversal53.getScope();
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType64 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError67 = nodeTraversal53.makeError(node63, diagnosticType64, strArray66);
        com.google.javascript.jscomp.JSError jSError68 = nodeTraversal30.makeError(node48, diagnosticType49, strArray66);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal22.makeError(node26, diagnosticType49, strArray74);
        int int76 = nodeTraversal22.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler77 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator79 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal80 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler77, callback78, scopeCreator79);
        com.google.javascript.jscomp.Scope scope81 = nodeTraversal80.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler82 = null;
        com.google.javascript.rhino.Node[] nodeArray83 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList84 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList84, nodeArray83);
        com.google.javascript.jscomp.NodeTraversal.Callback callback86 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler82, (java.util.List<com.google.javascript.rhino.Node>) nodeList84, callback86);
        nodeTraversal80.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList84);
        nodeTraversal22.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList84);
        nodeTraversal5.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList84);
        com.google.javascript.jscomp.NodeTraversal.Callback callback91 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler1, (java.util.List<com.google.javascript.rhino.Node>) nodeList84, callback91);
        com.google.javascript.jscomp.NodeTraversal.Callback callback93 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList84, callback93);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertNull(compiler32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(diagnosticType49);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertArrayEquals(nodeArray58, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertNotNull(diagnosticType64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError67);
        org.junit.Assert.assertNotNull(jSError68);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(scope81);
        org.junit.Assert.assertNotNull(nodeArray83);
        org.junit.Assert.assertArrayEquals(nodeArray83, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        boolean boolean5 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal2.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal2.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        nodeTraversal11.cfgs = nodeControlFlowGraphQueue17;
        com.google.javascript.rhino.Node node19 = nodeTraversal11.getEnclosingFunction();
        java.lang.String str20 = nodeTraversal11.getSourceName();
        com.google.javascript.rhino.Node node21 = nodeTraversal11.getCurrentNode();
        com.google.javascript.rhino.Node node22 = nodeTraversal11.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal28.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback40);
        nodeTraversal28.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback45);
        nodeTraversal11.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        nodeTraversal2.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        int int49 = nodeTraversal2.getScopeDepth();
        com.google.javascript.rhino.Node node50 = nodeTraversal2.getCurrentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = node50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.lang.String str18 = nodeTraversal10.getSourceName();
        boolean boolean19 = nodeTraversal10.inGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.rhino.Node node26 = nodeTraversal24.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray29);
        nodeTraversal24.traverseRoots(nodeArray29);
        java.lang.String str32 = nodeTraversal24.getSourceName();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal24.getScope();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType35 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError38 = nodeTraversal24.makeError(node34, diagnosticType35, strArray37);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError40 = nodeTraversal10.makeError(node20, diagnosticType35, strArray39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal44.cfgs;
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal44.getCompiler();
        com.google.javascript.rhino.Node node47 = nodeTraversal44.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback56);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback58);
        nodeTraversal44.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        int int61 = nodeTraversal44.getScopeDepth();
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType63 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator66 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler64, callback65, scopeCreator66);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue68 = nodeTraversal67.cfgs;
        com.google.javascript.rhino.Node node69 = nodeTraversal67.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.rhino.Node[] nodeArray72 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, callback71, nodeArray72);
        nodeTraversal67.traverseRoots(nodeArray72);
        java.lang.String str75 = nodeTraversal67.getSourceName();
        com.google.javascript.jscomp.Scope scope76 = nodeTraversal67.getScope();
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType78 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError81 = nodeTraversal67.makeError(node77, diagnosticType78, strArray80);
        com.google.javascript.jscomp.JSError jSError82 = nodeTraversal44.makeError(node62, diagnosticType63, strArray80);
        com.google.javascript.jscomp.JSError jSError83 = nodeTraversal3.makeError(node6, diagnosticType35, strArray80);
        boolean boolean84 = nodeTraversal3.inGlobalScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node85 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(diagnosticType35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(diagnosticType63);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeArray72);
        org.junit.Assert.assertArrayEquals(nodeArray72, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(scope76);
        org.junit.Assert.assertNotNull(diagnosticType78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError81);
        org.junit.Assert.assertNotNull(jSError82);
        org.junit.Assert.assertNotNull(jSError83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal26.getScope();
        com.google.javascript.rhino.Node node28 = nodeTraversal26.getEnclosingFunction();
        java.lang.String str29 = nodeTraversal26.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue30;
        int int32 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node33 = nodeTraversal3.getEnclosingFunction();
        int int34 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue3 = nodeTraversal2.cfgs;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverse(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue3);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback22);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        boolean boolean25 = nodeTraversal3.hasScope();
        java.lang.String str26 = nodeTraversal3.getSourceName();
        int int27 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal21.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList25 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList25, nodeArray24);
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, (java.util.List<com.google.javascript.rhino.Node>) nodeList25, callback27);
        nodeTraversal21.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList25);
        boolean boolean30 = nodeTraversal21.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, callback34, nodeArray35);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, callback32, nodeArray35);
        nodeTraversal21.traverseRoots(nodeArray35);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, callback17, nodeArray35);
        nodeTraversal3.traverseRoots(nodeArray35);
        int int41 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler42 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(compiler42);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback22);
        nodeTraversal16.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal16.traverseRoots(nodeArray25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal31.cfgs;
        com.google.javascript.rhino.Node node33 = nodeTraversal31.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray36);
        nodeTraversal31.traverseRoots(nodeArray36);
        java.lang.String str39 = nodeTraversal31.getSourceName();
        com.google.javascript.jscomp.Scope scope40 = nodeTraversal31.getScope();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType42 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError45 = nodeTraversal31.makeError(node41, diagnosticType42, strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError50 = nodeTraversal16.makeError(node27, diagnosticType42, strArray49);
        com.google.javascript.rhino.InputId inputId51 = nodeTraversal16.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue52 = nodeTraversal16.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler55, callback56, scopeCreator57);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue59 = nodeTraversal58.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback61 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator62 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler60, callback61, scopeCreator62);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue64 = nodeTraversal63.cfgs;
        nodeTraversal58.cfgs = nodeControlFlowGraphQueue64;
        com.google.javascript.rhino.Node node66 = nodeTraversal58.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope67 = nodeTraversal58.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback69 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.rhino.Node[] nodeArray72 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, callback71, nodeArray72);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler68, callback69, nodeArray72);
        nodeTraversal58.traverseRoots(nodeArray72);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler53, callback54, nodeArray72);
        nodeTraversal16.traverseRoots(nodeArray72);
        nodeTraversal3.traverseRoots(nodeArray72);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertArrayEquals(nodeArray25, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNotNull(diagnosticType42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue52);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue59);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNotNull(nodeArray72);
        org.junit.Assert.assertArrayEquals(nodeArray72, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        int int7 = nodeTraversal2.getScopeDepth();
        com.google.javascript.rhino.Node node8 = nodeTraversal2.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope9 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseAtScope(scope9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        boolean boolean13 = nodeTraversal3.hasScope();
        int int14 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(compiler16);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal18.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal18.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        com.google.javascript.jscomp.Scope scope31 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node32 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId33 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(inputId33);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray19);
        nodeTraversal3.traverseRoots(nodeArray19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal30.cfgs;
        com.google.javascript.rhino.Node node32 = nodeTraversal30.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue33 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal30.cfgs = nodeControlFlowGraphQueue33;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue33;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue33;
        com.google.javascript.rhino.Node node37 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope39 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(inputId38);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal5.getScope();
        boolean boolean7 = nodeTraversal5.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, callback13, nodeArray14);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray14);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray14);
        nodeTraversal5.traverseRoots(nodeArray14);
        int int19 = nodeTraversal5.getScopeDepth();
        boolean boolean20 = nodeTraversal5.hasScope();
        boolean boolean21 = nodeTraversal5.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal25.cfgs;
        com.google.javascript.rhino.Node node27 = nodeTraversal25.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, callback29, nodeArray30);
        nodeTraversal25.traverseRoots(nodeArray30);
        java.lang.String str33 = nodeTraversal25.getSourceName();
        com.google.javascript.jscomp.Scope scope34 = nodeTraversal25.getScope();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType36 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError39 = nodeTraversal25.makeError(node35, diagnosticType36, strArray38);
        com.google.javascript.jscomp.Compiler compiler40 = nodeTraversal25.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler43, callback44, scopeCreator45);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue47 = nodeTraversal46.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList50 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList50, nodeArray49);
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList50, callback52);
        nodeTraversal46.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList50);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal46.traverseRoots(nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, callback42, nodeArray55);
        nodeTraversal25.traverseRoots(nodeArray55);
        nodeTraversal5.traverseRoots(nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray55);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(diagnosticType36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError39);
        org.junit.Assert.assertNull(compiler40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue47);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertArrayEquals(nodeArray49, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertArrayEquals(nodeArray55, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler4, callback5, scopeCreator6);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal7.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        nodeTraversal7.cfgs = nodeControlFlowGraphQueue13;
        com.google.javascript.rhino.Node node15 = nodeTraversal7.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal7.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray21);
        nodeTraversal7.traverseRoots(nodeArray21);
        com.google.javascript.rhino.Node node25 = nodeTraversal7.getCurrentNode();
        java.lang.String str26 = nodeTraversal7.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal7.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal31.cfgs;
        com.google.javascript.rhino.Node node33 = nodeTraversal31.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray36);
        nodeTraversal31.traverseRoots(nodeArray36);
        java.lang.String str39 = nodeTraversal31.getSourceName();
        boolean boolean40 = nodeTraversal31.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, callback42, nodeArray43);
        nodeTraversal31.traverseRoots(nodeArray43);
        nodeTraversal7.traverseRoots(nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, callback3, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray43);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.lang.String str18 = nodeTraversal10.getSourceName();
        boolean boolean19 = nodeTraversal10.inGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.rhino.Node node26 = nodeTraversal24.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray29);
        nodeTraversal24.traverseRoots(nodeArray29);
        java.lang.String str32 = nodeTraversal24.getSourceName();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal24.getScope();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType35 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError38 = nodeTraversal24.makeError(node34, diagnosticType35, strArray37);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError40 = nodeTraversal10.makeError(node20, diagnosticType35, strArray39);
        int int41 = nodeTraversal10.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler44, callback45, scopeCreator46);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue48 = nodeTraversal47.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList51 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList51, nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList51, callback53);
        nodeTraversal47.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList51);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal47.traverseRoots(nodeArray56);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, callback43, nodeArray56);
        nodeTraversal10.traverseRoots(nodeArray56);
        nodeTraversal2.traverseRoots(nodeArray56);
        com.google.javascript.jscomp.Compiler compiler61 = nodeTraversal2.getCompiler();
        com.google.javascript.jscomp.Scope scope62 = nodeTraversal2.getScope();
        com.google.javascript.rhino.Node[] nodeArray63 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseRoots(nodeArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(diagnosticType35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue48);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertArrayEquals(nodeArray56, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(compiler61);
        org.junit.Assert.assertNull(scope62);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        int int4 = nodeTraversal3.getScopeDepth();
        boolean boolean5 = nodeTraversal3.hasScope();
        boolean boolean6 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        boolean boolean7 = nodeTraversal2.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.rhino.Node node13 = nodeTraversal11.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue14 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal11.cfgs = nodeControlFlowGraphQueue14;
        int int16 = nodeTraversal11.getScopeDepth();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal11.cfgs;
        nodeTraversal2.cfgs = nodeControlFlowGraphQueue17;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverse(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal17.cfgs;
        nodeTraversal12.cfgs = nodeControlFlowGraphQueue18;
        com.google.javascript.rhino.Node node20 = nodeTraversal12.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList24 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList24, nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback26);
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback28);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback31);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.jscomp.Scope scope34 = nodeTraversal3.getScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(scope34);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal3.getScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(scope17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue24;
        com.google.javascript.rhino.Node node26 = nodeTraversal3.getCurrentNode();
        int int27 = nodeTraversal3.getLineNumber();
        int int28 = nodeTraversal3.getScopeDepth();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput29 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray23);
        nodeTraversal18.traverseRoots(nodeArray23);
        java.lang.String str26 = nodeTraversal18.getSourceName();
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal18.getScope();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType29 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError32 = nodeTraversal18.makeError(node28, diagnosticType29, strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "" };
        com.google.javascript.jscomp.JSError jSError37 = nodeTraversal3.makeError(node14, diagnosticType29, strArray36);
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue39 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(diagnosticType29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(jSError37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue39);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        int int7 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler8 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(compiler8);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        int int15 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.jscomp.Compiler compiler11 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal3.cfgs;
        java.lang.Class<?> wildcardClass13 = nodeControlFlowGraphQueue12.getClass();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(compiler11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal20.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal15.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue24;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList30 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList30, nodeArray29);
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList30, callback32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList30, callback34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, (java.util.List<com.google.javascript.rhino.Node>) nodeList30, callback36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList30);
        com.google.javascript.jscomp.Scope scope39 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node40 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node41 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Scope scope42 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        com.google.javascript.rhino.Node node18 = nodeTraversal16.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray21);
        nodeTraversal16.traverseRoots(nodeArray21);
        java.lang.String str24 = nodeTraversal16.getSourceName();
        boolean boolean25 = nodeTraversal16.inGlobalScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal30.cfgs;
        com.google.javascript.rhino.Node node32 = nodeTraversal30.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, callback34, nodeArray35);
        nodeTraversal30.traverseRoots(nodeArray35);
        java.lang.String str38 = nodeTraversal30.getSourceName();
        com.google.javascript.jscomp.Scope scope39 = nodeTraversal30.getScope();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType41 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError44 = nodeTraversal30.makeError(node40, diagnosticType41, strArray43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError46 = nodeTraversal16.makeError(node26, diagnosticType41, strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "" };
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal3.makeError(node12, diagnosticType41, strArray50);
        com.google.javascript.jscomp.Scope scope52 = nodeTraversal3.getScope();
        boolean boolean53 = nodeTraversal3.hasScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph54 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNotNull(diagnosticType41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope7 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        nodeTraversal11.cfgs = nodeControlFlowGraphQueue17;
        java.lang.String str19 = nodeTraversal11.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal11.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue20;
        java.lang.String str22 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal31.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue32;
        com.google.javascript.rhino.Node node34 = nodeTraversal26.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback42);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        boolean boolean46 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope47 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node48, node49, scope50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(scope47);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback22);
        nodeTraversal16.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal16.traverseRoots(nodeArray25);
        nodeTraversal3.traverseRoots(nodeArray25);
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue28;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertArrayEquals(nodeArray25, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId13 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList22 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList22, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, (java.util.List<com.google.javascript.rhino.Node>) nodeList22, callback24);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback37);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback40);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue43 = null;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue43;
        int int45 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId46 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(inputId46);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback4 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator5 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler3, callback4, scopeCreator5);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue7 = nodeTraversal6.cfgs;
        com.google.javascript.rhino.Node node8 = nodeTraversal6.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, callback10, nodeArray11);
        nodeTraversal6.traverseRoots(nodeArray11);
        boolean boolean14 = nodeTraversal6.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal23.cfgs;
        nodeTraversal18.cfgs = nodeControlFlowGraphQueue24;
        java.lang.String str26 = nodeTraversal18.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal18.cfgs;
        nodeTraversal6.cfgs = nodeControlFlowGraphQueue27;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback39);
        nodeTraversal6.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler1, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback46);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertArrayEquals(nodeArray11, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        int int16 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        int int18 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.InputId inputId19 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(inputId19);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        boolean boolean5 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        boolean boolean7 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node10 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal16.getScope();
        boolean boolean18 = nodeTraversal16.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray25);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray25);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray25);
        nodeTraversal16.traverseRoots(nodeArray25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35);
        boolean boolean37 = nodeTraversal36.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue42 = nodeTraversal41.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList45 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList45, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler43, (java.util.List<com.google.javascript.rhino.Node>) nodeList45, callback47);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList45);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal41.traverseRoots(nodeArray50);
        nodeTraversal36.traverseRoots(nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, callback33, nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray50);
        nodeTraversal16.traverseRoots(nodeArray50);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray50);
        nodeTraversal3.traverseRoots(nodeArray50);
        boolean boolean58 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertArrayEquals(nodeArray25, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue42);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId8 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11);
        boolean boolean13 = nodeTraversal12.hasScope();
        java.lang.String str14 = nodeTraversal12.getSourceName();
        com.google.javascript.rhino.Node node15 = nodeTraversal12.getEnclosingFunction();
        java.lang.String str16 = nodeTraversal12.getSourceName();
        boolean boolean17 = nodeTraversal12.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList24 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList24, nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback26);
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback28);
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback34);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.rhino.Node node38 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        int int11 = nodeTraversal3.getScopeDepth();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId13 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal18.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList22 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList22, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, (java.util.List<com.google.javascript.rhino.Node>) nodeList22, callback24);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback37);
        nodeTraversal18.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback40);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue43 = null;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue43;
        com.google.javascript.rhino.InputId inputId45 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope46 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputId45);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        com.google.javascript.rhino.Node node18 = nodeTraversal16.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray21);
        nodeTraversal16.traverseRoots(nodeArray21);
        java.lang.String str24 = nodeTraversal16.getSourceName();
        boolean boolean25 = nodeTraversal16.inGlobalScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal30.cfgs;
        com.google.javascript.rhino.Node node32 = nodeTraversal30.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, callback34, nodeArray35);
        nodeTraversal30.traverseRoots(nodeArray35);
        java.lang.String str38 = nodeTraversal30.getSourceName();
        com.google.javascript.jscomp.Scope scope39 = nodeTraversal30.getScope();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType41 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError44 = nodeTraversal30.makeError(node40, diagnosticType41, strArray43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError46 = nodeTraversal16.makeError(node26, diagnosticType41, strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "", "" };
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal3.makeError(node12, diagnosticType41, strArray50);
        com.google.javascript.jscomp.Scope scope52 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId53 = nodeTraversal3.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph54 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNotNull(diagnosticType41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNull(inputId53);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        int int6 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal10.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue18;
        com.google.javascript.jscomp.Compiler compiler20 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(compiler20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(inputId14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str7 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.rhino.Node node13 = nodeTraversal11.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, callback15, nodeArray16);
        nodeTraversal11.traverseRoots(nodeArray16);
        java.lang.String str19 = nodeTraversal11.getSourceName();
        boolean boolean20 = nodeTraversal11.inGlobalScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal25.cfgs;
        com.google.javascript.rhino.Node node27 = nodeTraversal25.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, callback29, nodeArray30);
        nodeTraversal25.traverseRoots(nodeArray30);
        java.lang.String str33 = nodeTraversal25.getSourceName();
        com.google.javascript.jscomp.Scope scope34 = nodeTraversal25.getScope();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType36 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError39 = nodeTraversal25.makeError(node35, diagnosticType36, strArray38);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError41 = nodeTraversal11.makeError(node21, diagnosticType36, strArray40);
        int int42 = nodeTraversal11.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator47 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler45, callback46, scopeCreator47);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue49 = nodeTraversal48.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        nodeTraversal48.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal48.traverseRoots(nodeArray57);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler43, callback44, nodeArray57);
        nodeTraversal11.traverseRoots(nodeArray57);
        nodeTraversal3.traverseRoots(nodeArray57);
        com.google.javascript.rhino.Node node62 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId63 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(diagnosticType36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue49);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertArrayEquals(nodeArray57, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(inputId63);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList9 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList9, nodeArray8);
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList9, callback15);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList9);
        com.google.javascript.jscomp.Scope scope18 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal3.getScope();
        boolean boolean20 = nodeTraversal3.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal27.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue33 = nodeTraversal32.cfgs;
        nodeTraversal27.cfgs = nodeControlFlowGraphQueue33;
        com.google.javascript.rhino.Node node35 = nodeTraversal27.getEnclosingFunction();
        java.lang.String str36 = nodeTraversal27.getSourceName();
        com.google.javascript.rhino.Node node37 = nodeTraversal27.getCurrentNode();
        com.google.javascript.rhino.Node node38 = nodeTraversal27.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler39 = nodeTraversal27.getCompiler();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType41 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator44 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43, scopeCreator44);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal45.cfgs;
        com.google.javascript.rhino.Node node47 = nodeTraversal45.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, callback49, nodeArray50);
        nodeTraversal45.traverseRoots(nodeArray50);
        java.lang.String str53 = nodeTraversal45.getSourceName();
        boolean boolean54 = nodeTraversal45.inGlobalScope();
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator58 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler56, callback57, scopeCreator58);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue60 = nodeTraversal59.cfgs;
        com.google.javascript.rhino.Node node61 = nodeTraversal59.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.rhino.Node[] nodeArray64 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler62, callback63, nodeArray64);
        nodeTraversal59.traverseRoots(nodeArray64);
        java.lang.String str67 = nodeTraversal59.getSourceName();
        com.google.javascript.jscomp.Scope scope68 = nodeTraversal59.getScope();
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType70 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError73 = nodeTraversal59.makeError(node69, diagnosticType70, strArray72);
        java.lang.String[] strArray74 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal45.makeError(node55, diagnosticType70, strArray74);
        com.google.javascript.jscomp.JSError jSError76 = nodeTraversal27.makeError(node40, diagnosticType41, strArray74);
        java.lang.String[] strArray77 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError jSError78 = nodeTraversal3.makeError(node22, checkLevel23, diagnosticType41, strArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(compiler39);
        org.junit.Assert.assertNotNull(diagnosticType41);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(nodeArray64);
        org.junit.Assert.assertArrayEquals(nodeArray64, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertNotNull(diagnosticType70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertNotNull(jSError76);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList15 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList15, nodeArray14);
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList15, callback17);
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList15, callback19);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList15);
        com.google.javascript.rhino.Node node22 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.Scope scope25 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node24, scope25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        int int15 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node17 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope20 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback2 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler1, callback2, scopeCreator3);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue5 = nodeTraversal4.cfgs;
        java.lang.String str6 = nodeTraversal4.getSourceName();
        int int7 = nodeTraversal4.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal12.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback21);
        nodeTraversal4.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback24);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getCurrentNode();
        java.lang.String str22 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal3.cfgs;
        int int24 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node25, node26, scope27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        boolean boolean5 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal2.getInputId();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal2.getCompiler();
        com.google.javascript.rhino.Node node8 = nodeTraversal2.getEnclosingFunction();
        int int9 = nodeTraversal2.getLineNumber();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule7 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getCurrentNode();
        java.lang.String str22 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal3.cfgs;
        int int24 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.Scope scope25 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node26 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        com.google.javascript.rhino.Node node3 = nodeTraversal2.getCurrentNode();
        int int4 = nodeTraversal2.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList14 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList14, nodeArray13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList14, callback16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, (java.util.List<com.google.javascript.rhino.Node>) nodeList14, callback18);
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList14, callback20);
        nodeTraversal8.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList14);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal8.cfgs;
        nodeTraversal2.cfgs = nodeControlFlowGraphQueue23;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverseWithScope(node25, scope26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal18.cfgs;
        com.google.javascript.rhino.Node node20 = nodeTraversal18.getCurrentNode();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal18.cfgs = nodeControlFlowGraphQueue21;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        boolean boolean24 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.lang.String str18 = nodeTraversal10.getSourceName();
        boolean boolean19 = nodeTraversal10.inGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.rhino.Node node26 = nodeTraversal24.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray29);
        nodeTraversal24.traverseRoots(nodeArray29);
        java.lang.String str32 = nodeTraversal24.getSourceName();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal24.getScope();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType35 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError38 = nodeTraversal24.makeError(node34, diagnosticType35, strArray37);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError40 = nodeTraversal10.makeError(node20, diagnosticType35, strArray39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal44.cfgs;
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal44.getCompiler();
        com.google.javascript.rhino.Node node47 = nodeTraversal44.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback56);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback58);
        nodeTraversal44.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        int int61 = nodeTraversal44.getScopeDepth();
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType63 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator66 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler64, callback65, scopeCreator66);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue68 = nodeTraversal67.cfgs;
        com.google.javascript.rhino.Node node69 = nodeTraversal67.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.rhino.Node[] nodeArray72 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, callback71, nodeArray72);
        nodeTraversal67.traverseRoots(nodeArray72);
        java.lang.String str75 = nodeTraversal67.getSourceName();
        com.google.javascript.jscomp.Scope scope76 = nodeTraversal67.getScope();
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType78 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError81 = nodeTraversal67.makeError(node77, diagnosticType78, strArray80);
        com.google.javascript.jscomp.JSError jSError82 = nodeTraversal44.makeError(node62, diagnosticType63, strArray80);
        com.google.javascript.jscomp.JSError jSError83 = nodeTraversal3.makeError(node6, diagnosticType35, strArray80);
        boolean boolean84 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope85 = nodeTraversal3.getScope();
        int int86 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope87 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(diagnosticType35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(diagnosticType63);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeArray72);
        org.junit.Assert.assertArrayEquals(nodeArray72, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(scope76);
        org.junit.Assert.assertNotNull(diagnosticType78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError81);
        org.junit.Assert.assertNotNull(jSError82);
        org.junit.Assert.assertNotNull(jSError83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(scope85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(scope87);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal11.getCompiler();
        com.google.javascript.rhino.Node node14 = nodeTraversal11.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList19 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList19, nodeArray18);
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, (java.util.List<com.google.javascript.rhino.Node>) nodeList19, callback21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, (java.util.List<com.google.javascript.rhino.Node>) nodeList19, callback23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, (java.util.List<com.google.javascript.rhino.Node>) nodeList19, callback25);
        nodeTraversal11.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList19);
        int int28 = nodeTraversal11.getScopeDepth();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType30 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue35 = nodeTraversal34.cfgs;
        com.google.javascript.rhino.Node node36 = nodeTraversal34.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, callback38, nodeArray39);
        nodeTraversal34.traverseRoots(nodeArray39);
        java.lang.String str42 = nodeTraversal34.getSourceName();
        com.google.javascript.jscomp.Scope scope43 = nodeTraversal34.getScope();
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType45 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError48 = nodeTraversal34.makeError(node44, diagnosticType45, strArray47);
        com.google.javascript.jscomp.JSError jSError49 = nodeTraversal11.makeError(node29, diagnosticType30, strArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError56 = nodeTraversal3.makeError(node7, diagnosticType30, strArray55);
        int int57 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler58, callback59, scopeCreator60);
        com.google.javascript.jscomp.Scope scope62 = nodeTraversal61.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.rhino.Node[] nodeArray64 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList65 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList65, nodeArray64);
        com.google.javascript.jscomp.NodeTraversal.Callback callback67 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback67);
        nodeTraversal61.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList65);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList65);
        com.google.javascript.jscomp.Compiler compiler71 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertArrayEquals(nodeArray18, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(diagnosticType30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertArrayEquals(nodeArray39, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(diagnosticType45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError48);
        org.junit.Assert.assertNotNull(jSError49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertNotNull(nodeArray64);
        org.junit.Assert.assertArrayEquals(nodeArray64, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(compiler71);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph16 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal10.cfgs;
        com.google.javascript.rhino.Node node12 = nodeTraversal10.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray15);
        nodeTraversal10.traverseRoots(nodeArray15);
        java.lang.String str18 = nodeTraversal10.getSourceName();
        boolean boolean19 = nodeTraversal10.inGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.rhino.Node node26 = nodeTraversal24.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray29);
        nodeTraversal24.traverseRoots(nodeArray29);
        java.lang.String str32 = nodeTraversal24.getSourceName();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal24.getScope();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType35 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError38 = nodeTraversal24.makeError(node34, diagnosticType35, strArray37);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError40 = nodeTraversal10.makeError(node20, diagnosticType35, strArray39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal44.cfgs;
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal44.getCompiler();
        com.google.javascript.rhino.Node node47 = nodeTraversal44.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback56);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback58);
        nodeTraversal44.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        int int61 = nodeTraversal44.getScopeDepth();
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType63 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator66 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler64, callback65, scopeCreator66);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue68 = nodeTraversal67.cfgs;
        com.google.javascript.rhino.Node node69 = nodeTraversal67.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.rhino.Node[] nodeArray72 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, callback71, nodeArray72);
        nodeTraversal67.traverseRoots(nodeArray72);
        java.lang.String str75 = nodeTraversal67.getSourceName();
        com.google.javascript.jscomp.Scope scope76 = nodeTraversal67.getScope();
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType78 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError81 = nodeTraversal67.makeError(node77, diagnosticType78, strArray80);
        com.google.javascript.jscomp.JSError jSError82 = nodeTraversal44.makeError(node62, diagnosticType63, strArray80);
        com.google.javascript.jscomp.JSError jSError83 = nodeTraversal3.makeError(node6, diagnosticType35, strArray80);
        boolean boolean84 = nodeTraversal3.inGlobalScope();
        boolean boolean85 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue86 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope87 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(diagnosticType35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(diagnosticType63);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeArray72);
        org.junit.Assert.assertArrayEquals(nodeArray72, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(scope76);
        org.junit.Assert.assertNotNull(diagnosticType78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError81);
        org.junit.Assert.assertNotNull(jSError82);
        org.junit.Assert.assertNotNull(jSError83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue86);
        org.junit.Assert.assertNull(scope87);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        int int7 = nodeTraversal3.getScopeDepth();
        boolean boolean8 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal12.cfgs;
        com.google.javascript.rhino.Node node14 = nodeTraversal12.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        nodeTraversal12.traverseRoots(nodeArray17);
        java.lang.String str20 = nodeTraversal12.getSourceName();
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal12.getScope();
        com.google.javascript.jscomp.Scope scope22 = nodeTraversal12.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.rhino.Node node28 = nodeTraversal26.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, callback30, nodeArray31);
        nodeTraversal26.traverseRoots(nodeArray31);
        nodeTraversal12.traverseRoots(nodeArray31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.jscomp.Scope scope40 = nodeTraversal39.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList43 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList43, nodeArray42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback45);
        nodeTraversal39.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback48);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertArrayEquals(nodeArray31, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertArrayEquals(nodeArray42, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray17);
        nodeTraversal3.traverseRoots(nodeArray17);
        boolean boolean21 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId22 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope23 = nodeTraversal3.getScope();
        int int24 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        java.lang.String str5 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope7 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal11.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal16.cfgs;
        nodeTraversal11.cfgs = nodeControlFlowGraphQueue17;
        java.lang.String str19 = nodeTraversal11.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal11.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue20;
        java.lang.String str22 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal26.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal31.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue32;
        com.google.javascript.rhino.Node node34 = nodeTraversal26.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback42);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        boolean boolean46 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope47 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId48 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(scope47);
        org.junit.Assert.assertNull(inputId48);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        java.lang.String str14 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList7 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList7, nodeArray6);
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler5, (java.util.List<com.google.javascript.rhino.Node>) nodeList7, callback9);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList7);
        java.lang.String str12 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList11, callback13);
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList11, callback15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList11, callback17);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList11);
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList28 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList28, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, (java.util.List<com.google.javascript.rhino.Node>) nodeList28, callback30);
        nodeTraversal24.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList28);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList28);
        com.google.javascript.rhino.InputId inputId34 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId34);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        boolean boolean11 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler12 = nodeTraversal3.getCompiler();
        boolean boolean13 = nodeTraversal3.inGlobalScope();
        int int14 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(compiler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        boolean boolean6 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler9 = nodeTraversal3.getCompiler();
        boolean boolean10 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertNull(compiler9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal8.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue9;
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler15 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType17 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal21.cfgs;
        com.google.javascript.rhino.Node node23 = nodeTraversal21.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray26);
        nodeTraversal21.traverseRoots(nodeArray26);
        java.lang.String str29 = nodeTraversal21.getSourceName();
        boolean boolean30 = nodeTraversal21.inGlobalScope();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal35.cfgs;
        com.google.javascript.rhino.Node node37 = nodeTraversal35.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, callback39, nodeArray40);
        nodeTraversal35.traverseRoots(nodeArray40);
        java.lang.String str43 = nodeTraversal35.getSourceName();
        com.google.javascript.jscomp.Scope scope44 = nodeTraversal35.getScope();
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType46 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError49 = nodeTraversal35.makeError(node45, diagnosticType46, strArray48);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal21.makeError(node31, diagnosticType46, strArray50);
        com.google.javascript.jscomp.JSError jSError52 = nodeTraversal3.makeError(node16, diagnosticType17, strArray50);
        boolean boolean53 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler54 = nodeTraversal3.getCompiler();
        java.lang.String str55 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(compiler15);
        org.junit.Assert.assertNotNull(diagnosticType17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNotNull(diagnosticType46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNotNull(jSError52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(compiler54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node5 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray8);
        nodeTraversal3.traverseRoots(nodeArray8);
        java.lang.String str11 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType14 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        com.google.javascript.jscomp.JSError jSError17 = nodeTraversal3.makeError(node13, diagnosticType14, strArray16);
        com.google.javascript.jscomp.Compiler compiler18 = nodeTraversal3.getCompiler();
        int int19 = nodeTraversal3.getLineNumber();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal24.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal29.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue30;
        com.google.javascript.rhino.Node node32 = nodeTraversal24.getEnclosingFunction();
        java.lang.String str33 = nodeTraversal24.getSourceName();
        com.google.javascript.rhino.Node node34 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.Node node35 = nodeTraversal24.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler36 = nodeTraversal24.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal24.cfgs;
        java.lang.String str38 = nodeTraversal24.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler40, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback52);
        nodeTraversal24.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        boolean boolean56 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertArrayEquals(nodeArray8, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(diagnosticType14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(jSError17);
        org.junit.Assert.assertNull(compiler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(compiler36);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        boolean boolean3 = nodeTraversal2.hasScope();
        java.lang.String str4 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node5 = nodeTraversal2.getEnclosingFunction();
        java.lang.String str6 = nodeTraversal2.getSourceName();
        boolean boolean7 = nodeTraversal2.hasScope();
        boolean boolean8 = nodeTraversal2.hasScope();
        com.google.javascript.rhino.InputId inputId9 = nodeTraversal2.getInputId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
    }
}

