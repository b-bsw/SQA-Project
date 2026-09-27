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
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        boolean boolean15 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isVarArgsParameter(node16);
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = closureCodingConvention0.isPropertyTestFunction(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship15 = closureCodingConvention0.getClassesDefinedByCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertNull(delegateRelationship13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        java.lang.String str20 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean22 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention16.getDelegateRelationship(node17);
        boolean boolean21 = closureCodingConvention16.isExported("hi!", false);
        boolean boolean23 = closureCodingConvention16.isPrivate("");
        java.lang.String str24 = closureCodingConvention16.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str28 = closureCodingConvention27.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship30 = closureCodingConvention27.getDelegateRelationship(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship32 = closureCodingConvention27.getDelegateRelationship(node31);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship37 = closureCodingConvention35.getDelegateRelationship(node36);
        boolean boolean39 = closureCodingConvention35.isConstant("");
        boolean boolean41 = closureCodingConvention35.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType42 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType43 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType44 = null;
        closureCodingConvention35.applySubclassRelationship(functionType42, functionType43, subclassType44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.jscomp.Scope scope47 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention48 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship50 = closureCodingConvention48.getDelegateRelationship(node49);
        java.lang.String str51 = closureCodingConvention48.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.jscomp.Scope scope53 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray54 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, objectTypeArray54);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention48.defineDelegateProxyPrototypeProperties(jSTypeRegistry52, scope53, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry46, scope47, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap61);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap65);
        com.google.javascript.rhino.Node node67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList68 = closureCodingConvention0.identifyTypeDeclarationCall(node67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(delegateRelationship18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(delegateRelationship30);
        org.junit.Assert.assertNull(delegateRelationship32);
        org.junit.Assert.assertNull(delegateRelationship37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(delegateRelationship50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "goog.exportProperty" + "'", str51, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray54);
        org.junit.Assert.assertArrayEquals(objectTypeArray54, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str18 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isExported("", true);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = closureCodingConvention0.identifyTypeDeclarationCall(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        boolean boolean22 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean25 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.Node node26 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node26, strMap27);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean9 = closureCodingConvention0.isExported("goog.global", false);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean12 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast15 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean13 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean8 = closureCodingConvention0.isConstant("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean13 = closureCodingConvention11.isConstant("");
        boolean boolean15 = closureCodingConvention11.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship20 = closureCodingConvention18.getDelegateRelationship(node19);
        boolean boolean22 = closureCodingConvention18.isConstant("");
        java.lang.String str23 = closureCodingConvention18.getExportPropertyFunction();
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention18.isOptionalParameter(node24);
        boolean boolean27 = closureCodingConvention18.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray30 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, objectTypeArray30);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry28, scope29, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap37);
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = closureCodingConvention0.isVarArgsParameter(node39);
        java.lang.String str41 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(delegateRelationship20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.exportProperty" + "'", str23, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeArray30);
        org.junit.Assert.assertArrayEquals(objectTypeArray30, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.exportSymbol" + "'", str41, "goog.exportSymbol");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = closureCodingConvention0.isPropertyTestFunction(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportProperty" + "'", str2, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType4, objectType5, objectType6, functionType7, functionType8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship11 = closureCodingConvention0.getClassesDefinedByCall(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        java.lang.String str5 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.global");
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention0.isConstant("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention7.isConstant("");
        java.lang.String str12 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention7.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention7.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType26, objectType27, objectType28, functionType29, functionType30);
        boolean boolean33 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean35 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = closureCodingConvention0.isOptionalParameter(node36);
        com.google.javascript.rhino.Node node38 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node38, strMap39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship17);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfProvide(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention7.isConstant("");
        java.lang.String str12 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention7.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention7.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType26, objectType27, objectType28, functionType29, functionType30);
        boolean boolean33 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean35 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        java.lang.Class<?> wildcardClass36 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = closureCodingConvention0.extractClassNameIfRequire(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType9, functionType10, objectType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType19, objectType20, objectType21, functionType22, functionType23);
        java.lang.String str25 = closureCodingConvention0.getGlobalObject();
        boolean boolean28 = closureCodingConvention0.isExported("", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.global" + "'", str25, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        boolean boolean16 = closureCodingConvention0.isExported("goog.global", false);
        boolean boolean18 = closureCodingConvention0.isPrivate("hi!");
        java.lang.String str19 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str20 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportProperty" + "'", str19, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship14 = closureCodingConvention0.getClassesDefinedByCall(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        boolean boolean23 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean25 = closureCodingConvention0.isValidEnumKey("goog.global");
        boolean boolean27 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = closureCodingConvention0.isPropertyTestFunction(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray13 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, objectTypeArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node20, strMap21);
        boolean boolean24 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str25 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str26 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship28 = closureCodingConvention0.getClassesDefinedByCall(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray13);
        org.junit.Assert.assertArrayEquals(objectTypeArray13, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.abstractMethod" + "'", str25, "goog.abstractMethod");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("hi!");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isOptionalParameter(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean14 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = closureCodingConvention0.extractClassNameIfProvide(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str5 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType15, objectType16, objectType17, functionType18, functionType19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportSymbol" + "'", str5, "goog.exportSymbol");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        boolean boolean10 = closureCodingConvention0.isPrivate("");
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType14, objectType15, objectType16, functionType17, functionType18);
        java.lang.String str20 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship22 = closureCodingConvention0.getDelegateRelationship(node21);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship22);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType10, objectType11, objectType12, functionType13, functionType14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isOptionalParameter(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind23 = closureCodingConvention0.describeFunctionBind(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isExported("", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention15.getDelegateRelationship(node16);
        boolean boolean19 = closureCodingConvention15.isConstant("");
        java.lang.String str20 = closureCodingConvention15.getExportPropertyFunction();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship22 = closureCodingConvention15.getDelegateRelationship(node21);
        boolean boolean25 = closureCodingConvention15.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray28 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, objectTypeArray28);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, strMap33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeArray28);
        org.junit.Assert.assertArrayEquals(objectTypeArray28, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention24.getDelegateRelationship(node25);
        boolean boolean28 = closureCodingConvention24.isConstant("");
        boolean boolean30 = closureCodingConvention24.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = null;
        closureCodingConvention24.applySubclassRelationship(functionType31, functionType32, subclassType33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.jscomp.Scope scope36 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention37 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship39 = closureCodingConvention37.getDelegateRelationship(node38);
        java.lang.String str40 = closureCodingConvention37.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray43 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, objectTypeArray43);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention37.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry35, scope36, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention52 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship54 = closureCodingConvention52.getDelegateRelationship(node53);
        java.lang.String str55 = closureCodingConvention52.getExportPropertyFunction();
        java.lang.String str56 = closureCodingConvention52.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention59 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship61 = closureCodingConvention59.getDelegateRelationship(node60);
        java.lang.String str62 = closureCodingConvention59.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.jscomp.Scope scope64 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray65 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, objectTypeArray65);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention59.defineDelegateProxyPrototypeProperties(jSTypeRegistry63, scope64, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention52.defineDelegateProxyPrototypeProperties(jSTypeRegistry57, scope58, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap72);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType77 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType78 = null;
        closureCodingConvention0.applySubclassRelationship(functionType76, functionType77, subclassType78);
        boolean boolean81 = closureCodingConvention0.isExported("goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertNull(delegateRelationship26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(delegateRelationship39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "goog.exportProperty" + "'", str40, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray43);
        org.junit.Assert.assertArrayEquals(objectTypeArray43, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(delegateRelationship54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "goog.exportProperty" + "'", str55, "goog.exportProperty");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(delegateRelationship61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.exportProperty" + "'", str62, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray65);
        org.junit.Assert.assertArrayEquals(objectTypeArray65, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        boolean boolean10 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship14 = closureCodingConvention0.getClassesDefinedByCall(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(delegateRelationship12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType19, objectType20, objectType21, functionType22, functionType23);
        boolean boolean26 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean28 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray13 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, objectTypeArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isOptionalParameter(node18);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection20 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection21 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str22 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectTypeArray13);
        org.junit.Assert.assertArrayEquals(objectTypeArray13, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection20);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType18, functionType19, objectType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = null;
        closureCodingConvention0.applySubclassRelationship(functionType7, functionType8, subclassType9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean18 = closureCodingConvention0.isSuperClassReference("");
        boolean boolean20 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention7.isConstant("");
        java.lang.String str12 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention7.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention7.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType26, objectType27, objectType28, functionType29, functionType30);
        boolean boolean33 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean35 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType36 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType38 = null;
        closureCodingConvention0.applySubclassRelationship(functionType36, functionType37, subclassType38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = closureCodingConvention0.getClassesDefinedByCall(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention24.getDelegateRelationship(node25);
        boolean boolean28 = closureCodingConvention24.isConstant("");
        boolean boolean30 = closureCodingConvention24.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = null;
        closureCodingConvention24.applySubclassRelationship(functionType31, functionType32, subclassType33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.jscomp.Scope scope36 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention37 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship39 = closureCodingConvention37.getDelegateRelationship(node38);
        java.lang.String str40 = closureCodingConvention37.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray43 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, objectTypeArray43);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention37.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry35, scope36, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention52 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship54 = closureCodingConvention52.getDelegateRelationship(node53);
        java.lang.String str55 = closureCodingConvention52.getExportPropertyFunction();
        java.lang.String str56 = closureCodingConvention52.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention59 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship61 = closureCodingConvention59.getDelegateRelationship(node60);
        java.lang.String str62 = closureCodingConvention59.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.jscomp.Scope scope64 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray65 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, objectTypeArray65);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention59.defineDelegateProxyPrototypeProperties(jSTypeRegistry63, scope64, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention52.defineDelegateProxyPrototypeProperties(jSTypeRegistry57, scope58, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap72);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap74);
        com.google.javascript.rhino.Node node76 = null;
        boolean boolean77 = closureCodingConvention0.isOptionalParameter(node76);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType79 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType78, functionType79, objectType80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertNull(delegateRelationship26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(delegateRelationship39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "goog.exportProperty" + "'", str40, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray43);
        org.junit.Assert.assertArrayEquals(objectTypeArray43, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(delegateRelationship54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "goog.exportProperty" + "'", str55, "goog.exportProperty");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(delegateRelationship61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.exportProperty" + "'", str62, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray65);
        org.junit.Assert.assertArrayEquals(objectTypeArray65, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention7.isConstant("");
        java.lang.String str12 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention7.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention7.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType26, objectType27, objectType28, functionType29, functionType30);
        boolean boolean33 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType34 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType35 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType36 = null;
        closureCodingConvention0.applySubclassRelationship(functionType34, functionType35, subclassType36);
        boolean boolean39 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention15.getDelegateRelationship(node16);
        java.lang.String str18 = closureCodingConvention15.getExportPropertyFunction();
        java.lang.String str19 = closureCodingConvention15.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.jscomp.Scope scope21 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention22 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship24 = closureCodingConvention22.getDelegateRelationship(node23);
        java.lang.String str25 = closureCodingConvention22.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray28 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList29 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, objectTypeArray28);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        closureCodingConvention22.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry20, scope21, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList29, strMap35);
        boolean boolean38 = closureCodingConvention0.isExported("");
        boolean boolean40 = closureCodingConvention0.isConstant("goog.exportProperty");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = null;
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast43 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal41, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportProperty" + "'", str18, "goog.exportProperty");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(delegateRelationship24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.exportProperty" + "'", str25, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray28);
        org.junit.Assert.assertArrayEquals(objectTypeArray28, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        boolean boolean14 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node15 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node15, strMap16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention20 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship22 = closureCodingConvention20.getDelegateRelationship(node21);
        boolean boolean24 = closureCodingConvention20.isConstant("");
        java.lang.String str25 = closureCodingConvention20.getExportPropertyFunction();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship27 = closureCodingConvention20.getDelegateRelationship(node26);
        boolean boolean30 = closureCodingConvention20.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.jscomp.Scope scope32 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray33 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, objectTypeArray33);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        closureCodingConvention20.defineDelegateProxyPrototypeProperties(jSTypeRegistry31, scope32, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap36);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry18, scope19, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap38);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.exportProperty" + "'", str25, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeArray33);
        org.junit.Assert.assertArrayEquals(objectTypeArray33, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        boolean boolean13 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        boolean boolean9 = closureCodingConvention0.isExported("goog.global", false);
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        boolean boolean12 = closureCodingConvention0.isConstant("hi!");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType15, functionType16, objectType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention15.getDelegateRelationship(node16);
        boolean boolean19 = closureCodingConvention15.isConstant("");
        boolean boolean21 = closureCodingConvention15.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = null;
        closureCodingConvention15.applySubclassRelationship(functionType22, functionType23, subclassType24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention28 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship30 = closureCodingConvention28.getDelegateRelationship(node29);
        java.lang.String str31 = closureCodingConvention28.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.jscomp.Scope scope33 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray34 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, objectTypeArray34);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention28.defineDelegateProxyPrototypeProperties(jSTypeRegistry32, scope33, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap39);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap41);
        boolean boolean44 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str45 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(delegateRelationship30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.exportProperty" + "'", str31, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray34);
        org.junit.Assert.assertArrayEquals(objectTypeArray34, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.global" + "'", str45, "goog.global");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.global");
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean18 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = closureCodingConvention0.isPropertyTestFunction(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.getSingletonGetterClassName(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection4 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean6 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node7, strMap8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportProperty" + "'", str2, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = closureCodingConvention0.getSingletonGetterClassName(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        boolean boolean12 = closureCodingConvention0.isConstant("hi!");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray17 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList18 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, objectTypeArray17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap20);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeArray17);
        org.junit.Assert.assertArrayEquals(objectTypeArray17, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention11.getDelegateRelationship(node12);
        boolean boolean16 = closureCodingConvention11.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention11.applySubclassRelationship(functionType17, functionType18, subclassType19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship22 = closureCodingConvention11.getDelegateRelationship(node21);
        boolean boolean24 = closureCodingConvention11.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship29 = closureCodingConvention27.getDelegateRelationship(node28);
        boolean boolean32 = closureCodingConvention27.isExported("hi!", false);
        boolean boolean34 = closureCodingConvention27.isPrivate("");
        java.lang.String str35 = closureCodingConvention27.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention38 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str39 = closureCodingConvention38.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship41 = closureCodingConvention38.getDelegateRelationship(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship43 = closureCodingConvention38.getDelegateRelationship(node42);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = null;
        com.google.javascript.jscomp.Scope scope45 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention46 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship48 = closureCodingConvention46.getDelegateRelationship(node47);
        boolean boolean50 = closureCodingConvention46.isConstant("");
        boolean boolean52 = closureCodingConvention46.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType53 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType54 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType55 = null;
        closureCodingConvention46.applySubclassRelationship(functionType53, functionType54, subclassType55);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention59 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship61 = closureCodingConvention59.getDelegateRelationship(node60);
        java.lang.String str62 = closureCodingConvention59.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.jscomp.Scope scope64 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray65 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, objectTypeArray65);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention59.defineDelegateProxyPrototypeProperties(jSTypeRegistry63, scope64, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention46.defineDelegateProxyPrototypeProperties(jSTypeRegistry57, scope58, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        closureCodingConvention38.defineDelegateProxyPrototypeProperties(jSTypeRegistry44, scope45, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap72);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap74);
        java.util.Map<java.lang.String, java.lang.String> strMap76 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap76);
        java.util.Map<java.lang.String, java.lang.String> strMap78 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap78);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType80, functionType81, objectType82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(delegateRelationship22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(delegateRelationship29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.global" + "'", str35, "goog.global");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(delegateRelationship41);
        org.junit.Assert.assertNull(delegateRelationship43);
        org.junit.Assert.assertNull(delegateRelationship48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(delegateRelationship61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.exportProperty" + "'", str62, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray65);
        org.junit.Assert.assertArrayEquals(objectTypeArray65, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.global");
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("hi!");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        boolean boolean17 = closureCodingConvention0.isExported("hi!");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast12 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean13 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        java.lang.String str16 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean18 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType19, objectType20, objectType21, functionType22, functionType23);
        boolean boolean26 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.extractClassNameIfProvide(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        boolean boolean11 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean13 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        boolean boolean16 = closureCodingConvention0.isConstantKey("");
        boolean boolean18 = closureCodingConvention0.isConstantKey("");
        java.lang.String str19 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType20, objectType21, objectType22, functionType23, functionType24);
        java.lang.String str26 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean28 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = closureCodingConvention0.isPropertyTestFunction(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean21 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str22 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship24 = closureCodingConvention0.getDelegateRelationship(node23);
        boolean boolean26 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = closureCodingConvention0.extractClassNameIfRequire(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention24.getDelegateRelationship(node25);
        boolean boolean28 = closureCodingConvention24.isConstant("");
        boolean boolean30 = closureCodingConvention24.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = null;
        closureCodingConvention24.applySubclassRelationship(functionType31, functionType32, subclassType33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.jscomp.Scope scope36 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention37 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship39 = closureCodingConvention37.getDelegateRelationship(node38);
        java.lang.String str40 = closureCodingConvention37.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray43 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, objectTypeArray43);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention37.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry35, scope36, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList44, strMap48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.jscomp.Scope scope51 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention52 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship54 = closureCodingConvention52.getDelegateRelationship(node53);
        java.lang.String str55 = closureCodingConvention52.getExportPropertyFunction();
        java.lang.String str56 = closureCodingConvention52.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention59 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship61 = closureCodingConvention59.getDelegateRelationship(node60);
        java.lang.String str62 = closureCodingConvention59.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.jscomp.Scope scope64 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray65 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, objectTypeArray65);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention59.defineDelegateProxyPrototypeProperties(jSTypeRegistry63, scope64, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention52.defineDelegateProxyPrototypeProperties(jSTypeRegistry57, scope58, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry50, scope51, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap72);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList66, strMap74);
        boolean boolean77 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean79 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node80 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap81 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node80, strMap81);
        boolean boolean84 = closureCodingConvention0.isConstant("goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertNull(delegateRelationship26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(delegateRelationship39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "goog.exportProperty" + "'", str40, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray43);
        org.junit.Assert.assertArrayEquals(objectTypeArray43, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(delegateRelationship54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "goog.exportProperty" + "'", str55, "goog.exportProperty");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(delegateRelationship61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.exportProperty" + "'", str62, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray65);
        org.junit.Assert.assertArrayEquals(objectTypeArray65, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        boolean boolean10 = closureCodingConvention0.isPrivate("");
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType14, objectType15, objectType16, functionType17, functionType18);
        boolean boolean22 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean11 = closureCodingConvention0.isConstant("hi!");
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str19 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = closureCodingConvention0.getClassesDefinedByCall(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportProperty", false);
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        boolean boolean21 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean4 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship12 = closureCodingConvention0.getClassesDefinedByCall(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean16 = closureCodingConvention0.isPrivate("goog.global");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("");
        boolean boolean16 = closureCodingConvention0.isConstant("goog.global");
        java.lang.String str17 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node18, strMap19);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.exportSymbol" + "'", str17, "goog.exportSymbol");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        boolean boolean15 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isOptionalParameter(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = closureCodingConvention0.isPropertyTestFunction(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node15 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node15, strMap16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        boolean boolean25 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        boolean boolean27 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = closureCodingConvention0.identifyTypeDeclarationCall(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        boolean boolean16 = closureCodingConvention0.isConstantKey("");
        boolean boolean18 = closureCodingConvention0.isConstantKey("");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean22 = closureCodingConvention0.isConstantKey("hi!");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isExported("goog.exportProperty");
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = null;
        closureCodingConvention0.applySubclassRelationship(functionType7, functionType8, subclassType9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        boolean boolean18 = closureCodingConvention0.isExported("goog.global");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = closureCodingConvention0.extractClassNameIfRequire(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind17 = closureCodingConvention0.describeFunctionBind(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention16.getDelegateRelationship(node17);
        boolean boolean21 = closureCodingConvention16.isExported("hi!", false);
        boolean boolean23 = closureCodingConvention16.isPrivate("");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship25 = closureCodingConvention16.getDelegateRelationship(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention16.isVarArgsParameter(node26);
        java.lang.String str28 = closureCodingConvention16.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.jscomp.Scope scope30 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention31 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship33 = closureCodingConvention31.getDelegateRelationship(node32);
        boolean boolean35 = closureCodingConvention31.isConstant("");
        boolean boolean37 = closureCodingConvention31.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType38 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType39 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType40 = null;
        closureCodingConvention31.applySubclassRelationship(functionType38, functionType39, subclassType40);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.jscomp.Scope scope43 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention44 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship46 = closureCodingConvention44.getDelegateRelationship(node45);
        java.lang.String str47 = closureCodingConvention44.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.jscomp.Scope scope49 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray50 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, objectTypeArray50);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention44.defineDelegateProxyPrototypeProperties(jSTypeRegistry48, scope49, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention31.defineDelegateProxyPrototypeProperties(jSTypeRegistry42, scope43, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry29, scope30, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap59);
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = closureCodingConvention0.isOptionalParameter(node61);
        java.lang.String str63 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = closureCodingConvention0.isPropertyTestFunction(node64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertNull(delegateRelationship18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(delegateRelationship25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.abstractMethod" + "'", str28, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(delegateRelationship46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "goog.exportProperty" + "'", str47, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray50);
        org.junit.Assert.assertArrayEquals(objectTypeArray50, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "goog.exportProperty" + "'", str63, "goog.exportProperty");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean13 = closureCodingConvention0.isExported("");
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = closureCodingConvention0.identifyTypeDeclarationCall(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str19 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList21 = closureCodingConvention0.identifyTypeDeclarationCall(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = closureCodingConvention0.getSingletonGetterClassName(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.lang.String str18 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean20 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention0.isVarArgsParameter(node21);
        java.lang.String str23 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportProperty" + "'", str18, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.exportProperty" + "'", str23, "goog.exportProperty");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray11 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList12, objectTypeArray11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList12, strMap14);
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        java.lang.String str19 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objectTypeArray11);
        org.junit.Assert.assertArrayEquals(objectTypeArray11, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType15, objectType16, objectType17, functionType18, functionType19);
        com.google.javascript.rhino.Node node21 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node21, strMap22);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType26 = null;
        closureCodingConvention0.applySubclassRelationship(functionType24, functionType25, subclassType26);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        java.lang.String str13 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        java.lang.Class<?> wildcardClass15 = closureCodingConvention0.getClass();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportSymbol" + "'", str13, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.jscomp.Scope scope3 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray4 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList5 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, objectTypeArray4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry2, scope3, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, strMap7);
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(objectTypeArray4);
        org.junit.Assert.assertArrayEquals(objectTypeArray4, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean10 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.jscomp.Scope scope3 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray4 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList5 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, objectTypeArray4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry2, scope3, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, strMap7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(objectTypeArray4);
        org.junit.Assert.assertArrayEquals(objectTypeArray4, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("", true);
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str14 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = closureCodingConvention0.isPropertyTestFunction(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportProperty" + "'", str14, "goog.exportProperty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global", false);
        com.google.javascript.rhino.Node node13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node13, strMap14);
        boolean boolean17 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = closureCodingConvention0.getSingletonGetterClassName(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean12 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        boolean boolean22 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType25 = null;
        closureCodingConvention0.applySubclassRelationship(functionType23, functionType24, subclassType25);
        boolean boolean29 = closureCodingConvention0.isExported("goog.global", false);
        boolean boolean31 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean33 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        boolean boolean8 = closureCodingConvention0.isPrivate("");
        boolean boolean10 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType11, objectType12, objectType13, functionType14, functionType15);
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = closureCodingConvention0.isOptionalParameter(node17);
        boolean boolean20 = closureCodingConvention0.isConstant("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean17 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstant("hi!");
        boolean boolean11 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean13 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship15 = closureCodingConvention0.getClassesDefinedByCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = closureCodingConvention0.isPropertyTestFunction(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray13 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, objectTypeArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node20, strMap21);
        boolean boolean24 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str25 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean27 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        java.lang.String str28 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray13);
        org.junit.Assert.assertArrayEquals(objectTypeArray13, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.abstractMethod" + "'", str25, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.global" + "'", str28, "goog.global");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = closureCodingConvention0.extractClassNameIfProvide(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind9 = closureCodingConvention0.describeFunctionBind(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        boolean boolean16 = closureCodingConvention0.isExported("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str18 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportSymbol" + "'", str18, "goog.exportSymbol");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention10.getDelegateRelationship(node11);
        boolean boolean14 = closureCodingConvention10.isConstant("");
        java.lang.String str15 = closureCodingConvention10.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention10.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        java.lang.String str22 = closureCodingConvention10.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention25 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship27 = closureCodingConvention25.getDelegateRelationship(node26);
        java.lang.String str28 = closureCodingConvention25.getExportPropertyFunction();
        java.lang.String str29 = closureCodingConvention25.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention32 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship34 = closureCodingConvention32.getDelegateRelationship(node33);
        java.lang.String str35 = closureCodingConvention32.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray38 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList39, objectTypeArray38);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        closureCodingConvention32.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList39, strMap41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        closureCodingConvention25.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList39, strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList39, strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList39, strMap47);
        boolean boolean50 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node51 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node51, strMap52);
        java.lang.String str54 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.exportProperty" + "'", str22, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.exportProperty" + "'", str28, "goog.exportProperty");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(delegateRelationship34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.exportProperty" + "'", str35, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray38);
        org.junit.Assert.assertArrayEquals(objectTypeArray38, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "goog.exportSymbol" + "'", str54, "goog.exportSymbol");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.lang.String str18 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList21 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, objectTypeList21, strMap22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention0.isVarArgsParameter(node24);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportProperty" + "'", str18, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship5);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("hi!");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfProvide(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        boolean boolean12 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType13, functionType14, objectType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean17 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean14 = closureCodingConvention0.isConstant("goog.exportSymbol");
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = closureCodingConvention0.isPropertyTestFunction(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str5 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        java.lang.String str27 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention0.isOptionalParameter(node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType30, functionType31, objectType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportProperty" + "'", str2, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.abstractMethod" + "'", str5, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertArrayEquals(objectTypeArray14, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.exportProperty" + "'", str27, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType14, objectType15, objectType16, functionType17, functionType18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = closureCodingConvention0.isPropertyTestFunction(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = closureCodingConvention0.isPropertyTestFunction(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        boolean boolean22 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType25 = null;
        closureCodingConvention0.applySubclassRelationship(functionType23, functionType24, subclassType25);
        java.lang.String str27 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean29 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.exportSymbol" + "'", str27, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node13, strMap14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, objectTypeList17, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isVarArgsParameter(node20);
        boolean boolean23 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean25 = closureCodingConvention0.isPrivate("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isOptionalParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention16.getDelegateRelationship(node17);
        boolean boolean21 = closureCodingConvention16.isExported("hi!", false);
        boolean boolean23 = closureCodingConvention16.isPrivate("");
        java.lang.String str24 = closureCodingConvention16.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str28 = closureCodingConvention27.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship30 = closureCodingConvention27.getDelegateRelationship(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship32 = closureCodingConvention27.getDelegateRelationship(node31);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship37 = closureCodingConvention35.getDelegateRelationship(node36);
        boolean boolean39 = closureCodingConvention35.isConstant("");
        boolean boolean41 = closureCodingConvention35.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType42 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType43 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType44 = null;
        closureCodingConvention35.applySubclassRelationship(functionType42, functionType43, subclassType44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.jscomp.Scope scope47 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention48 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship50 = closureCodingConvention48.getDelegateRelationship(node49);
        java.lang.String str51 = closureCodingConvention48.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.jscomp.Scope scope53 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray54 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, objectTypeArray54);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention48.defineDelegateProxyPrototypeProperties(jSTypeRegistry52, scope53, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry46, scope47, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap61);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList55, strMap65);
        java.lang.String str67 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean69 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(delegateRelationship18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(delegateRelationship30);
        org.junit.Assert.assertNull(delegateRelationship32);
        org.junit.Assert.assertNull(delegateRelationship37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(delegateRelationship50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "goog.exportProperty" + "'", str51, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray54);
        org.junit.Assert.assertArrayEquals(objectTypeArray54, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertNull(delegateRelationship5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstant("hi!");
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = closureCodingConvention0.isPropertyTestFunction(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node13, strMap14);
        java.lang.String str16 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType17, objectType18, objectType19, functionType20, functionType21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = closureCodingConvention0.getSingletonGetterClassName(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportSymbol" + "'", str16, "goog.exportSymbol");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        boolean boolean16 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean15 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean17 = closureCodingConvention0.isExported("hi!", true);
        java.lang.Class<?> wildcardClass18 = closureCodingConvention0.getClass();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str9 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection10 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = closureCodingConvention0.getSingletonGetterClassName(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean11 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention14 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention14.getDelegateRelationship(node15);
        boolean boolean18 = closureCodingConvention14.isConstant("");
        java.lang.String str19 = closureCodingConvention14.getExportPropertyFunction();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention14.getDelegateRelationship(node20);
        boolean boolean24 = closureCodingConvention14.isExported("goog.abstractMethod", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str28 = closureCodingConvention27.getDelegateSuperclassName();
        java.lang.String str29 = closureCodingConvention27.getExportPropertyFunction();
        java.lang.String str30 = closureCodingConvention27.getExportPropertyFunction();
        java.lang.String str31 = closureCodingConvention27.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.jscomp.Scope scope33 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray34 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, objectTypeArray34);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry32, scope33, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention14.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap39);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap41);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportProperty" + "'", str19, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.exportProperty" + "'", str29, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.exportProperty" + "'", str30, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.exportSymbol" + "'", str31, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(objectTypeArray34);
        org.junit.Assert.assertArrayEquals(objectTypeArray34, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global", false);
        boolean boolean15 = closureCodingConvention0.isExported("", true);
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean16 = closureCodingConvention0.isConstant("goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertNull(delegateRelationship5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast7 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        boolean boolean18 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean12 = closureCodingConvention0.isExported("hi!");
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportProperty", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        boolean boolean12 = closureCodingConvention0.isConstant("hi!");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = closureCodingConvention0.identifyTypeDeclarationCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertNull(delegateRelationship5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        java.lang.Class<?> wildcardClass9 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship16);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = null;
        closureCodingConvention0.applySubclassRelationship(functionType7, functionType8, subclassType9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention13 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention13.getDelegateRelationship(node14);
        java.lang.String str16 = closureCodingConvention13.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention13.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        boolean boolean27 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean17 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList19 = closureCodingConvention0.identifyTypeDeclarationCall(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isVarArgsParameter(node20);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention7.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention7.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray13 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, objectTypeArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList14, strMap18);
        boolean boolean21 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str22 = closureCodingConvention0.getGlobalObject();
        boolean boolean24 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray13);
        org.junit.Assert.assertArrayEquals(objectTypeArray13, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind15 = closureCodingConvention0.describeFunctionBind(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = closureCodingConvention0.getSingletonGetterClassName(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean16 = closureCodingConvention0.isConstant("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind18 = closureCodingConvention0.describeFunctionBind(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship16);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        boolean boolean7 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isOptionalParameter(node15);
        java.lang.String str17 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str18 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType21 = null;
        closureCodingConvention0.applySubclassRelationship(functionType19, functionType20, subclassType21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast25 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.exportSymbol" + "'", str17, "goog.exportSymbol");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType4, objectType5, objectType6, functionType7, functionType8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection15 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("");
        java.lang.String str18 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("hi!");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention14 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention14.getDelegateRelationship(node15);
        boolean boolean19 = closureCodingConvention14.isExported("hi!", false);
        boolean boolean21 = closureCodingConvention14.isPrivate("");
        java.lang.String str22 = closureCodingConvention14.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType27 = null;
        closureCodingConvention14.applyDelegateRelationship(objectType23, objectType24, objectType25, functionType26, functionType27);
        java.lang.String str29 = closureCodingConvention14.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType32 = null;
        closureCodingConvention14.applySubclassRelationship(functionType30, functionType31, subclassType32);
        java.lang.String str34 = closureCodingConvention14.getAbstractMethodName();
        java.lang.String str35 = closureCodingConvention14.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention38 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean41 = closureCodingConvention38.isExported("hi!", false);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType43 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType44 = null;
        closureCodingConvention38.applySubclassRelationship(functionType42, functionType43, subclassType44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.jscomp.Scope scope47 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention48 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship50 = closureCodingConvention48.getDelegateRelationship(node49);
        boolean boolean52 = closureCodingConvention48.isConstant("");
        java.lang.String str53 = closureCodingConvention48.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType57 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType58 = null;
        closureCodingConvention48.applyDelegateRelationship(objectType54, objectType55, objectType56, functionType57, functionType58);
        java.lang.String str60 = closureCodingConvention48.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = null;
        com.google.javascript.jscomp.Scope scope62 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention63 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship65 = closureCodingConvention63.getDelegateRelationship(node64);
        java.lang.String str66 = closureCodingConvention63.getExportPropertyFunction();
        java.lang.String str67 = closureCodingConvention63.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = null;
        com.google.javascript.jscomp.Scope scope69 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention70 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship72 = closureCodingConvention70.getDelegateRelationship(node71);
        java.lang.String str73 = closureCodingConvention70.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.jscomp.Scope scope75 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray76 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList77 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, objectTypeArray76);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = null;
        closureCodingConvention70.defineDelegateProxyPrototypeProperties(jSTypeRegistry74, scope75, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap79);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = null;
        closureCodingConvention63.defineDelegateProxyPrototypeProperties(jSTypeRegistry68, scope69, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap81);
        java.util.Map<java.lang.String, java.lang.String> strMap83 = null;
        closureCodingConvention48.defineDelegateProxyPrototypeProperties(jSTypeRegistry61, scope62, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap83);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = null;
        closureCodingConvention38.defineDelegateProxyPrototypeProperties(jSTypeRegistry46, scope47, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap85);
        java.util.Map<java.lang.String, java.lang.String> strMap87 = null;
        closureCodingConvention14.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap87);
        java.util.Map<java.lang.String, java.lang.String> strMap89 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList77, strMap89);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.exportSymbol" + "'", str29, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.abstractMethod" + "'", str34, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.abstractMethod" + "'", str35, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(delegateRelationship50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "goog.exportProperty" + "'", str53, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "goog.exportProperty" + "'", str60, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "goog.exportProperty" + "'", str66, "goog.exportProperty");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(delegateRelationship72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "goog.exportProperty" + "'", str73, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray76);
        org.junit.Assert.assertArrayEquals(objectTypeArray76, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = null;
        closureCodingConvention0.applySubclassRelationship(functionType7, functionType8, subclassType9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention13 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention13.getDelegateRelationship(node14);
        java.lang.String str16 = closureCodingConvention13.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray19 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, objectTypeArray19);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention13.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList20, strMap24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention28 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship30 = closureCodingConvention28.getDelegateRelationship(node29);
        java.lang.String str31 = closureCodingConvention28.getExportPropertyFunction();
        java.lang.String str32 = closureCodingConvention28.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship37 = closureCodingConvention35.getDelegateRelationship(node36);
        java.lang.String str38 = closureCodingConvention35.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.jscomp.Scope scope40 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray41 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, objectTypeArray41);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry39, scope40, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention28.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap48);
        boolean boolean51 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean53 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean56 = closureCodingConvention0.isExported("goog.exportProperty", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray19);
        org.junit.Assert.assertArrayEquals(objectTypeArray19, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(delegateRelationship30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.exportProperty" + "'", str31, "goog.exportProperty");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(delegateRelationship37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.exportProperty" + "'", str38, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray41);
        org.junit.Assert.assertArrayEquals(objectTypeArray41, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean15 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        boolean boolean23 = closureCodingConvention0.isExported("hi!");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node20, strMap21);
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = closureCodingConvention0.isVarArgsParameter(node23);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType25, objectType26, objectType27, functionType28, functionType29);
        boolean boolean32 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = closureCodingConvention0.isVarArgsParameter(node33);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isConstant("hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("");
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertNull(delegateRelationship5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfProvide(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        boolean boolean8 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = closureCodingConvention0.getSingletonGetterClassName(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean14 = closureCodingConvention0.isExported("goog.global", true);
        boolean boolean16 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        java.lang.String str21 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = closureCodingConvention0.getSingletonGetterClassName(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportProperty" + "'", str21, "goog.exportProperty");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray11 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList12, objectTypeArray11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList12, strMap14);
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        boolean boolean20 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean22 = closureCodingConvention0.isExported("goog.exportSymbol");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objectTypeArray11);
        org.junit.Assert.assertArrayEquals(objectTypeArray11, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        com.google.javascript.rhino.Node node14 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node14, strMap15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = closureCodingConvention0.extractClassNameIfProvide(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertNull(delegateRelationship18);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship3 = closureCodingConvention0.getDelegateRelationship(node2);
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(delegateRelationship3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        java.lang.String str5 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportSymbol" + "'", str5, "goog.exportSymbol");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("hi!");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        boolean boolean17 = closureCodingConvention0.isExported("", false);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind19 = closureCodingConvention0.describeFunctionBind(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention0.applySubclassRelationship(functionType18, functionType19, subclassType20);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType21 = null;
        closureCodingConvention0.applySubclassRelationship(functionType19, functionType20, subclassType21);
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = closureCodingConvention0.isVarArgsParameter(node23);
        java.lang.String str25 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention0.isVarArgsParameter(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = closureCodingConvention0.isVarArgsParameter(node28);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.global" + "'", str25, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        boolean boolean19 = closureCodingConvention0.isExported("hi!", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str4 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean9 = closureCodingConvention0.isExported("goog.global", false);
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportProperty" + "'", str4, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship11 = closureCodingConvention0.getDelegateRelationship(node10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType11, objectType12, objectType13, functionType14, functionType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        boolean boolean21 = closureCodingConvention0.isExported("goog.exportProperty", false);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = closureCodingConvention0.isVarArgsParameter(node22);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(delegateRelationship18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.Node node18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node18, strMap19);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str5 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        boolean boolean28 = closureCodingConvention0.isConstantKey("");
        java.lang.Class<?> wildcardClass29 = closureCodingConvention0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportProperty" + "'", str2, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.abstractMethod" + "'", str5, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertArrayEquals(objectTypeArray14, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean9 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType10, objectType11, objectType12, functionType13, functionType14);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean15 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean18 = closureCodingConvention0.isExported("goog.exportProperty", false);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        boolean boolean4 = closureCodingConvention0.isConstantKey("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isOptionalParameter(node8);
        boolean boolean11 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean13 = closureCodingConvention0.isPrivate("");
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType11, functionType12, objectType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        boolean boolean8 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str12 = closureCodingConvention11.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention11.getDelegateRelationship(node13);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention11.isVarArgsParameter(node15);
        boolean boolean18 = closureCodingConvention11.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention21 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship23 = closureCodingConvention21.getDelegateRelationship(node22);
        java.lang.String str24 = closureCodingConvention21.getExportPropertyFunction();
        java.lang.String str25 = closureCodingConvention21.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention28 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship30 = closureCodingConvention28.getDelegateRelationship(node29);
        java.lang.String str31 = closureCodingConvention28.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.jscomp.Scope scope33 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray34 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, objectTypeArray34);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention28.defineDelegateProxyPrototypeProperties(jSTypeRegistry32, scope33, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        closureCodingConvention21.defineDelegateProxyPrototypeProperties(jSTypeRegistry26, scope27, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap39);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList35, strMap43);
        java.lang.String str45 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(delegateRelationship23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.exportProperty" + "'", str24, "goog.exportProperty");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(delegateRelationship30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.exportProperty" + "'", str31, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray34);
        org.junit.Assert.assertArrayEquals(objectTypeArray34, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.exportSymbol" + "'", str45, "goog.exportSymbol");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean13 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast16 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean13 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        boolean boolean18 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean12 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention15.getDelegateRelationship(node16);
        java.lang.String str18 = closureCodingConvention15.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray21 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, objectTypeArray21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, strMap24);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, strMap26);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportProperty" + "'", str18, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray21);
        org.junit.Assert.assertArrayEquals(objectTypeArray21, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind15 = closureCodingConvention0.describeFunctionBind(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstant("");
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean6 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = closureCodingConvention0.extractClassNameIfRequire(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isVarArgsParameter(node4);
        boolean boolean7 = closureCodingConvention0.isExported("hi!");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean15 = closureCodingConvention0.isConstant("");
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean19 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isOptionalParameter(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = closureCodingConvention0.getClassesDefinedByCall(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.jscomp.Scope scope3 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray4 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList5 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, objectTypeArray4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry2, scope3, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList5, strMap7);
        boolean boolean10 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("hi!");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        java.lang.Class<?> wildcardClass14 = closureCodingConvention0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(objectTypeArray4);
        org.junit.Assert.assertArrayEquals(objectTypeArray4, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str13 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportSymbol" + "'", str13, "goog.exportSymbol");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean8 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        boolean boolean10 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean3 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean13 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        java.lang.String str16 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = closureCodingConvention0.identifyTypeDeclarationCall(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship6 = closureCodingConvention0.getDelegateRelationship(node5);
        boolean boolean8 = closureCodingConvention0.isPrivate("");
        boolean boolean10 = closureCodingConvention0.isConstantKey("");
        boolean boolean12 = closureCodingConvention0.isPrivate("hi!");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(delegateRelationship6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        boolean boolean23 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean25 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType26, functionType27, objectType28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        boolean boolean16 = closureCodingConvention0.isValidEnumKey("hi!");
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str5 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = closureCodingConvention0.extractClassNameIfRequire(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportProperty" + "'", str2, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention14 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention14.getDelegateRelationship(node15);
        boolean boolean18 = closureCodingConvention14.isConstant("");
        boolean boolean20 = closureCodingConvention14.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = null;
        closureCodingConvention14.applySubclassRelationship(functionType21, functionType22, subclassType23);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention27 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship29 = closureCodingConvention27.getDelegateRelationship(node28);
        boolean boolean31 = closureCodingConvention27.isConstant("");
        boolean boolean33 = closureCodingConvention27.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType34 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType35 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType36 = null;
        closureCodingConvention27.applySubclassRelationship(functionType34, functionType35, subclassType36);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.jscomp.Scope scope39 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention40 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship42 = closureCodingConvention40.getDelegateRelationship(node41);
        java.lang.String str43 = closureCodingConvention40.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = null;
        com.google.javascript.jscomp.Scope scope45 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray46 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, objectTypeArray46);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        closureCodingConvention40.defineDelegateProxyPrototypeProperties(jSTypeRegistry44, scope45, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry38, scope39, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap51);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = null;
        com.google.javascript.jscomp.Scope scope54 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention55 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship57 = closureCodingConvention55.getDelegateRelationship(node56);
        java.lang.String str58 = closureCodingConvention55.getExportPropertyFunction();
        java.lang.String str59 = closureCodingConvention55.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.jscomp.Scope scope61 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention62 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship64 = closureCodingConvention62.getDelegateRelationship(node63);
        java.lang.String str65 = closureCodingConvention62.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.jscomp.Scope scope67 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray68 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, objectTypeArray68);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        closureCodingConvention62.defineDelegateProxyPrototypeProperties(jSTypeRegistry66, scope67, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention55.defineDelegateProxyPrototypeProperties(jSTypeRegistry60, scope61, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap73);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        closureCodingConvention27.defineDelegateProxyPrototypeProperties(jSTypeRegistry53, scope54, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap75);
        java.util.Map<java.lang.String, java.lang.String> strMap77 = null;
        closureCodingConvention14.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap77);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap79);
        com.google.javascript.rhino.Node node81 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap82 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node81, strMap82);
        com.google.javascript.rhino.Node node84 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship85 = closureCodingConvention0.getClassesDefinedByCall(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(delegateRelationship29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(delegateRelationship42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "goog.exportProperty" + "'", str43, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray46);
        org.junit.Assert.assertArrayEquals(objectTypeArray46, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(delegateRelationship57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "goog.exportProperty" + "'", str58, "goog.exportProperty");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(delegateRelationship64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "goog.exportProperty" + "'", str65, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray68);
        org.junit.Assert.assertArrayEquals(objectTypeArray68, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind14 = closureCodingConvention0.describeFunctionBind(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        java.lang.String str4 = closureCodingConvention0.getGlobalObject();
        java.lang.String str5 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportSymbol" + "'", str5, "goog.exportSymbol");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean4 = closureCodingConvention0.isConstant("");
        boolean boolean6 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.exportProperty", true);
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = closureCodingConvention0.extractClassNameIfRequire(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.jscomp.Scope scope5 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray6 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, objectTypeArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry4, scope5, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList7, strMap9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention17.getDelegateRelationship(node18);
        java.lang.String str20 = closureCodingConvention17.getExportPropertyFunction();
        java.lang.String str21 = closureCodingConvention17.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention24.getDelegateRelationship(node25);
        java.lang.String str27 = closureCodingConvention24.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray30 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, objectTypeArray30);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry28, scope29, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList31, strMap37);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType41 = null;
        closureCodingConvention0.applySubclassRelationship(functionType39, functionType40, subclassType41);
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind44 = closureCodingConvention0.describeFunctionBind(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray6);
        org.junit.Assert.assertArrayEquals(objectTypeArray6, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(delegateRelationship26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.exportProperty" + "'", str27, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray30);
        org.junit.Assert.assertArrayEquals(objectTypeArray30, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship2 = closureCodingConvention0.getDelegateRelationship(node1);
        boolean boolean5 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention21 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship23 = closureCodingConvention21.getDelegateRelationship(node22);
        java.lang.String str24 = closureCodingConvention21.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray27 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, objectTypeArray27);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention21.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap32);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.jscomp.Scope scope35 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention36 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship38 = closureCodingConvention36.getDelegateRelationship(node37);
        boolean boolean41 = closureCodingConvention36.isExported("hi!", true);
        java.lang.String str42 = closureCodingConvention36.getAbstractMethodName();
        boolean boolean44 = closureCodingConvention36.isValidEnumKey("goog.global");
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = closureCodingConvention36.isVarArgsParameter(node45);
        boolean boolean48 = closureCodingConvention36.isExported("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention51 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship53 = closureCodingConvention51.getDelegateRelationship(node52);
        boolean boolean55 = closureCodingConvention51.isConstant("");
        java.lang.String str56 = closureCodingConvention51.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.jscomp.Scope scope58 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention59 = new com.google.javascript.jscomp.ClosureCodingConvention();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship61 = closureCodingConvention59.getDelegateRelationship(node60);
        boolean boolean63 = closureCodingConvention59.isConstant("");
        java.lang.String str64 = closureCodingConvention59.getExportPropertyFunction();
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship66 = closureCodingConvention59.getDelegateRelationship(node65);
        boolean boolean69 = closureCodingConvention59.isExported("goog.abstractMethod", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = null;
        com.google.javascript.jscomp.Scope scope71 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention72 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str73 = closureCodingConvention72.getDelegateSuperclassName();
        java.lang.String str74 = closureCodingConvention72.getExportPropertyFunction();
        java.lang.String str75 = closureCodingConvention72.getExportPropertyFunction();
        java.lang.String str76 = closureCodingConvention72.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = null;
        com.google.javascript.jscomp.Scope scope78 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray79 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList80 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, objectTypeArray79);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = null;
        closureCodingConvention72.defineDelegateProxyPrototypeProperties(jSTypeRegistry77, scope78, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap82);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = null;
        closureCodingConvention59.defineDelegateProxyPrototypeProperties(jSTypeRegistry70, scope71, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = null;
        closureCodingConvention51.defineDelegateProxyPrototypeProperties(jSTypeRegistry57, scope58, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap86);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = null;
        closureCodingConvention36.defineDelegateProxyPrototypeProperties(jSTypeRegistry49, scope50, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap88);
        java.util.Map<java.lang.String, java.lang.String> strMap90 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry34, scope35, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList80, strMap90);
        org.junit.Assert.assertNull(delegateRelationship2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.exportProperty" + "'", str24, "goog.exportProperty");
        org.junit.Assert.assertNotNull(objectTypeArray27);
        org.junit.Assert.assertArrayEquals(objectTypeArray27, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(delegateRelationship38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.abstractMethod" + "'", str42, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(delegateRelationship53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "goog.exportProperty" + "'", str56, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "goog.exportProperty" + "'", str64, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "goog.exportProperty" + "'", str74, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "goog.exportProperty" + "'", str75, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "goog.exportSymbol" + "'", str76, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(objectTypeArray79);
        org.junit.Assert.assertArrayEquals(objectTypeArray79, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }
}

