package org.mockito.internal.configuration.injection;

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
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, (java.lang.Object) 1.0d);
        java.lang.reflect.Field field68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, (java.lang.Object) (short) 100);
        java.util.Collection<java.lang.Object> objCollection71 = null;
        java.lang.reflect.Field field72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter74 = finalMockCandidateFilter0.filterCandidate(objCollection71, field72, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) 1.0d);
        java.util.Collection<java.lang.Object> objCollection34 = null;
        java.lang.reflect.Field field35 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter55 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter55, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field61, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field64, (java.lang.Object) (-1L));
        java.lang.reflect.Field field67 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter69 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field67, (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate(objCollection34, field35, (java.lang.Object) field67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(ongoingInjecter69);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter17 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter17, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        java.lang.reflect.Field field23 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter25 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList21, field23, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter26 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter28 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter45 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter45, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        java.lang.reflect.Field field51 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter53 = finalMockCandidateFilter28.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field51, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field54, (java.lang.Object) (-1L));
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter26.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field57, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter62 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter79 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray82 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter79, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList83 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList83, objArray82);
        java.lang.reflect.Field field85 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter62.filterCandidate((java.util.Collection<java.lang.Object>) objList83, field85, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter90 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList83, field88, (java.lang.Object) (-1L));
        java.lang.reflect.Field field91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter93 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList83, field91, (java.lang.Object) "hi!");
        java.lang.reflect.Field field94 = null;
        java.lang.Object obj95 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter96 = finalMockCandidateFilter26.filterCandidate((java.util.Collection<java.lang.Object>) objList83, field94, obj95);
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList83, field97, obj98);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter25);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter53);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
        org.junit.Assert.assertNotNull(ongoingInjecter90);
        org.junit.Assert.assertNotNull(ongoingInjecter93);
        org.junit.Assert.assertNotNull(ongoingInjecter96);
        org.junit.Assert.assertNotNull(ongoingInjecter99);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1.0f));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter57 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter74 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray77 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter74, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList78 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList78, objArray77);
        java.lang.reflect.Field field80 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter82 = finalMockCandidateFilter57.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field80, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field83, (java.lang.Object) 1);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field86, (java.lang.Object) 100.0d);
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field89, (java.lang.Object) 10L);
        java.util.Collection<java.lang.Object> objCollection92 = null;
        java.lang.reflect.Field field93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate(objCollection92, field93, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter82);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        java.lang.Object obj66 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, obj66);
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, obj69);
        java.util.Collection<java.lang.Object> objCollection71 = null;
        java.lang.reflect.Field field72 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter73 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter90 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray93 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter90, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList94 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList94, objArray93);
        java.lang.reflect.Field field96 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter98 = finalMockCandidateFilter73.filterCandidate((java.util.Collection<java.lang.Object>) objList94, field96, (java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection71, field72, (java.lang.Object) field96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter98);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter44 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter44, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.lang.reflect.Field field50 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter52 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field50, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field53, (java.lang.Object) 1);
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field56, obj57);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter77 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter77, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList81 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field83, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field86, (java.lang.Object) (-1L));
        java.lang.reflect.Field field89 = null;
        java.lang.Object obj90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field89, obj90);
        java.util.Collection<java.lang.Object> objCollection92 = null;
        java.lang.reflect.Field field93 = null;
        java.lang.Object obj94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate(objCollection92, field93, obj94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter52);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, (java.lang.Object) 1.0d);
        java.lang.reflect.Field field68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, (java.lang.Object) (short) 100);
        java.util.Collection<java.lang.Object> objCollection71 = null;
        java.lang.reflect.Field field72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter74 = finalMockCandidateFilter0.filterCandidate(objCollection71, field72, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter4 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter21 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter21, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field27, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field30 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter32 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field30, (java.lang.Object) (-1L));
        java.lang.reflect.Field field33 = null;
        java.lang.Object obj34 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter35 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field33, obj34);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter55 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter55, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field61, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field64, (java.lang.Object) (-1L));
        java.lang.reflect.Field field67 = null;
        java.lang.Object obj68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter69 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field67, obj68);
        java.lang.reflect.Field field70 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter72 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field70, (java.lang.Object) (byte) 1);
        java.lang.reflect.Field field73 = null;
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter76 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field73, (java.lang.Object) wildcardClass75);
        java.lang.reflect.Field field77 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter79 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field77, (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass80 = ongoingInjecter79.getClass();
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(ongoingInjecter32);
        org.junit.Assert.assertNotNull(ongoingInjecter35);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(ongoingInjecter69);
        org.junit.Assert.assertNotNull(ongoingInjecter72);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(ongoingInjecter76);
        org.junit.Assert.assertNotNull(ongoingInjecter79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter4 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter21 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter21, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field27, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field30 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter32 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field30, (java.lang.Object) (-1L));
        java.lang.reflect.Field field33 = null;
        java.lang.Object obj34 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter35 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field33, obj34);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter55 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter55, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field61, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field64, (java.lang.Object) (-1L));
        java.lang.reflect.Field field67 = null;
        java.lang.Object obj68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter69 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field67, obj68);
        java.lang.reflect.Field field70 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter72 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field70, (java.lang.Object) (byte) 1);
        java.lang.reflect.Field field73 = null;
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter76 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field73, (java.lang.Object) wildcardClass75);
        java.lang.reflect.Field field77 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter79 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field77, (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass80 = objList59.getClass();
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(ongoingInjecter32);
        org.junit.Assert.assertNotNull(ongoingInjecter35);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(ongoingInjecter69);
        org.junit.Assert.assertNotNull(ongoingInjecter72);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(ongoingInjecter76);
        org.junit.Assert.assertNotNull(ongoingInjecter79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field57, (java.lang.Object) (-1L));
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field60, (java.lang.Object) 1L);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter63 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter64 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter81 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray84 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter81, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList85 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList85, objArray84);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter64.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field87, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter63.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field90, (java.lang.Object) (-1L));
        java.lang.reflect.Field field93 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field93, (java.lang.Object) (byte) 0);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection96, field97, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.util.Collection<java.lang.Object> objCollection1 = null;
        java.lang.reflect.Field field2 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter20, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field26, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter29 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter56 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter73 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter73, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList77 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList77, objArray76);
        java.lang.reflect.Field field79 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter81 = finalMockCandidateFilter56.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field79, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field82 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field82, (java.lang.Object) 1);
        java.lang.reflect.Field field85 = null;
        java.lang.Object obj86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter29.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field85, obj86);
        java.lang.reflect.Field field88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter90 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field88, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate(objCollection1, field2, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter28);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter81);
        org.junit.Assert.assertNotNull(ongoingInjecter84);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
        org.junit.Assert.assertNotNull(ongoingInjecter90);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter28 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter45 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter45, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        java.lang.reflect.Field field51 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter53 = finalMockCandidateFilter28.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field51, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field54, (java.lang.Object) 1);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field57, (java.lang.Object) 100.0d);
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList49, field60, (java.lang.Object) finalMockCandidateFilter61);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter63 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter64 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter81 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray84 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter81, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList85 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList85, objArray84);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter64.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field87, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter63.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field90, (java.lang.Object) (-1.0f));
        java.lang.reflect.Field field93 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList85, field93, (java.lang.Object) (byte) 100);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter61.filterCandidate(objCollection96, field97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter53);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) "hi!");
        java.util.Collection<java.lang.Object> objCollection34 = null;
        java.lang.reflect.Field field35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter37 = finalMockCandidateFilter0.filterCandidate(objCollection34, field35, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field57, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, (java.lang.Object) (-1L));
        java.lang.reflect.Field field90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, (java.lang.Object) 1L);
        java.lang.reflect.Field field93 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, (java.lang.Object) 0.0d);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection96, field97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter4 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter21 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter21, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field27, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field30 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter32 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field30, (java.lang.Object) (-1L));
        java.lang.reflect.Field field33 = null;
        java.lang.Object obj34 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter35 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList25, field33, obj34);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter55 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter55, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field61, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field64, (java.lang.Object) (-1L));
        java.lang.reflect.Field field67 = null;
        java.lang.Object obj68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter69 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field67, obj68);
        java.lang.reflect.Field field70 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter72 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field70, (java.lang.Object) (byte) 1);
        java.lang.reflect.Field field73 = null;
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter76 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field73, (java.lang.Object) wildcardClass75);
        java.lang.reflect.Field field77 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter79 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList59, field77, (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass80 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(ongoingInjecter32);
        org.junit.Assert.assertNotNull(ongoingInjecter35);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(ongoingInjecter69);
        org.junit.Assert.assertNotNull(ongoingInjecter72);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(ongoingInjecter76);
        org.junit.Assert.assertNotNull(ongoingInjecter79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter44 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter44, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.lang.reflect.Field field50 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter52 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field50, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field53, (java.lang.Object) 1);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field56, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass59 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter52);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter44 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter44, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.lang.reflect.Field field50 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter52 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field50, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field53, (java.lang.Object) 1);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field56, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass59 = objList48.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter52);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        java.lang.Object obj32 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, obj32);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter52 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter52, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList56, field58, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList56, field61, (java.lang.Object) '4');
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter65 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter66 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter83 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray86 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter83, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter66.filterCandidate((java.util.Collection<java.lang.Object>) objList87, field89, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field92 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter94 = finalMockCandidateFilter65.filterCandidate((java.util.Collection<java.lang.Object>) objList87, field92, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList56, field64, (java.lang.Object) finalMockCandidateFilter65);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter65.filterCandidate(objCollection96, field97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(ongoingInjecter94);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter44 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter44, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.lang.reflect.Field field50 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter52 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field50, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field53, (java.lang.Object) 1);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field56, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass59 = ongoingInjecter58.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter52);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) "hi!");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, (java.lang.Object) "hi!");
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, obj69);
        java.lang.Class<?> wildcardClass71 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field57, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, (java.lang.Object) (-1L));
        java.lang.reflect.Field field90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, (java.lang.Object) 1.0d);
        java.lang.reflect.Field field93 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, (java.lang.Object) (short) 10);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection96, field97, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) "hi!");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, (java.lang.Object) "hi!");
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, obj69);
        java.lang.Class<?> wildcardClass71 = ongoingInjecter70.getClass();
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.util.Collection<java.lang.Object> objCollection1 = null;
        java.lang.reflect.Field field2 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter4 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter5 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter22 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter22, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList26, objArray25);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter5.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field28, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field31, (java.lang.Object) (-1L));
        java.lang.reflect.Field field34 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter36 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field34, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter39 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter56 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter56, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter39.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field62, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field65, (java.lang.Object) (-1L));
        java.lang.reflect.Field field68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field68, (java.lang.Object) 1.0d);
        java.lang.reflect.Field field71 = null;
        java.lang.Object obj72 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter73 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field71, obj72);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter74 = finalMockCandidateFilter0.filterCandidate(objCollection1, field2, (java.lang.Object) objList60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(ongoingInjecter36);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(ongoingInjecter73);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) "hi!");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter53, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        java.lang.reflect.Field field59 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field59, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field62, (java.lang.Object) (-1L));
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field65, (java.lang.Object) "hi!");
        java.lang.reflect.Field field68 = null;
        java.lang.Object obj69 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList57, field68, obj69);
        java.lang.Class<?> wildcardClass71 = objList57.getClass();
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) "hi!");
        java.util.Collection<java.lang.Object> objCollection34 = null;
        java.lang.reflect.Field field35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter37 = finalMockCandidateFilter0.filterCandidate(objCollection34, field35, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        java.lang.Object obj32 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, obj32);
        java.util.Collection<java.lang.Object> objCollection34 = null;
        java.lang.reflect.Field field35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter37 = finalMockCandidateFilter0.filterCandidate(objCollection34, field35, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter20, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field26, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field29, (java.lang.Object) (-1L));
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter34 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field32, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter36 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter54 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray57 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter54, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList58, objArray57);
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field60, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field63 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter65 = finalMockCandidateFilter36.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field63, (java.lang.Object) (-1L));
        java.lang.reflect.Field field66 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter68 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field66, (java.lang.Object) "hi!");
        java.lang.reflect.Field field69 = null;
        java.lang.Object obj70 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter71 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field69, obj70);
        java.lang.reflect.Field field72 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter74 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field72, (java.lang.Object) 0);
        java.util.Collection<java.lang.Object> objCollection75 = null;
        java.lang.reflect.Field field76 = null;
        java.lang.Object obj77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter78 = finalMockCandidateFilter0.filterCandidate(objCollection75, field76, obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter28);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(ongoingInjecter34);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
        org.junit.Assert.assertNotNull(ongoingInjecter65);
        org.junit.Assert.assertNotNull(ongoingInjecter68);
        org.junit.Assert.assertNotNull(ongoingInjecter71);
        org.junit.Assert.assertNotNull(ongoingInjecter74);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field57, (java.lang.Object) (-1L));
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field60, (java.lang.Object) 1L);
        java.util.Collection<java.lang.Object> objCollection63 = null;
        java.lang.reflect.Field field64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter0.filterCandidate(objCollection63, field64, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter48 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter48, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter56 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field54, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter59 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList52, field57, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, (java.lang.Object) (-1L));
        java.lang.reflect.Field field90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, (java.lang.Object) 1L);
        java.lang.reflect.Field field93 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, (java.lang.Object) '#');
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection96, field97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter56);
        org.junit.Assert.assertNotNull(ongoingInjecter59);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.util.Collection<java.lang.Object> objCollection1 = null;
        java.lang.reflect.Field field2 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter4 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter5 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter22 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter22, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList26, objArray25);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter5.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field28, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field31, (java.lang.Object) (-1L));
        java.lang.reflect.Field field34 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter36 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList26, field34, (java.lang.Object) "hi!");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter37 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter39 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter56 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter56, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter39.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field62, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field65, (java.lang.Object) (-1L));
        java.lang.reflect.Field field68 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter70 = finalMockCandidateFilter37.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field68, (java.lang.Object) "hi!");
        java.lang.reflect.Field field71 = null;
        java.lang.Object obj72 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter73 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList60, field71, obj72);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter74 = finalMockCandidateFilter0.filterCandidate(objCollection1, field2, (java.lang.Object) ongoingInjecter73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(ongoingInjecter36);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertNotNull(ongoingInjecter70);
        org.junit.Assert.assertNotNull(ongoingInjecter73);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter20, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field26, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field29, (java.lang.Object) (-1L));
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter33 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter50 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter50, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList54, field56, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter76 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter76, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList80 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList80, objArray79);
        java.lang.reflect.Field field82 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field82, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field85 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field85, (java.lang.Object) 1);
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field32, (java.lang.Object) finalMockCandidateFilter33);
        java.lang.reflect.Field field89 = null;
        java.lang.Object obj90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field89, obj90);
        java.lang.Class<?> wildcardClass92 = objList24.getClass();
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter28);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter84);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field56, obj57);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter77 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter77, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList81 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field83, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field86, (java.lang.Object) (-1.0f));
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field89, (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass92 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter20, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field26, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field29, (java.lang.Object) (-1L));
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter33 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter50 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter50, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList54, field56, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter76 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter76, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList80 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList80, objArray79);
        java.lang.reflect.Field field82 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field82, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field85 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field85, (java.lang.Object) 1);
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field32, (java.lang.Object) finalMockCandidateFilter33);
        java.lang.reflect.Field field89 = null;
        java.lang.Object obj90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field89, obj90);
        java.lang.Class<?> wildcardClass92 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter28);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter84);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1.0f));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        java.lang.Object obj88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, obj88);
        java.lang.reflect.Field field90 = null;
        java.lang.Object obj91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, obj91);
        java.lang.reflect.Field field93 = null;
        java.lang.Object obj94 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, obj94);
        java.lang.Class<?> wildcardClass96 = ongoingInjecter95.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter27 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter28 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter29 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter46 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter46, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList50 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList50, objArray49);
        java.lang.reflect.Field field52 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter54 = finalMockCandidateFilter29.filterCandidate((java.util.Collection<java.lang.Object>) objList50, field52, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter28.filterCandidate((java.util.Collection<java.lang.Object>) objList50, field55, (java.lang.Object) (-1L));
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList50, field58, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter27.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, (java.lang.Object) '4');
        java.lang.reflect.Field field90 = null;
        java.lang.Object obj91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, obj91);
        java.lang.reflect.Field field93 = null;
        java.lang.Object obj94 = new java.lang.Object();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, obj94);
        java.util.Collection<java.lang.Object> objCollection96 = null;
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate(objCollection96, field97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter54);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field56, obj57);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter77 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter77, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList81 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field83, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field86, (java.lang.Object) (-1.0f));
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field89, (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass92 = ongoingInjecter91.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter19 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter19, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.reflect.Field field25 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field25, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field28 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field28, (java.lang.Object) (-1L));
        java.lang.reflect.Field field31 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList23, field31, (java.lang.Object) 1.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter35 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter52 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter52, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter35.filterCandidate((java.util.Collection<java.lang.Object>) objList56, field58, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList56, field61, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter64 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter65 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter82 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray85 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter82, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList86 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList86, objArray85);
        java.lang.reflect.Field field88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter90 = finalMockCandidateFilter65.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field88, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter93 = finalMockCandidateFilter64.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field91, (java.lang.Object) (-1.0f));
        java.lang.reflect.Field field94 = null;
        java.lang.Object obj95 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter96 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field94, obj95);
        java.lang.reflect.Field field97 = null;
        java.lang.Object obj98 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter99 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field97, obj98);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter90);
        org.junit.Assert.assertNotNull(ongoingInjecter93);
        org.junit.Assert.assertNotNull(ongoingInjecter96);
        org.junit.Assert.assertNotNull(ongoingInjecter99);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1.0f));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        java.lang.Object obj88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, obj88);
        java.lang.reflect.Field field90 = null;
        java.lang.Object obj91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, obj91);
        java.lang.reflect.Field field93 = null;
        java.lang.Object obj94 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, obj94);
        java.lang.Class<?> wildcardClass96 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter20, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field26, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field29, (java.lang.Object) (-1L));
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter33 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter50 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter50, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList54, field56, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter76 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter76, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList80 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList80, objArray79);
        java.lang.reflect.Field field82 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field82, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field85 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter33.filterCandidate((java.util.Collection<java.lang.Object>) objList80, field85, (java.lang.Object) 1);
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field32, (java.lang.Object) finalMockCandidateFilter33);
        java.lang.reflect.Field field89 = null;
        java.lang.Object obj90 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList24, field89, obj90);
        java.lang.Class<?> wildcardClass92 = ongoingInjecter91.getClass();
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter28);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter84);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field61, (java.lang.Object) "hi!");
        java.lang.reflect.Field field64 = null;
        java.lang.Object obj65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field64, obj65);
        java.lang.Class<?> wildcardClass67 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field61, (java.lang.Object) "hi!");
        java.lang.reflect.Field field64 = null;
        java.lang.Object obj65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field64, obj65);
        java.lang.Class<?> wildcardClass67 = objList53.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter56 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter73 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter73, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList77 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList77, objArray76);
        java.lang.reflect.Field field79 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter81 = finalMockCandidateFilter56.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field79, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field82 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field82, (java.lang.Object) (-1L));
        java.lang.reflect.Field field85 = null;
        java.lang.Object obj86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter87 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList77, field85, obj86);
        java.util.Collection<java.lang.Object> objCollection88 = null;
        java.lang.reflect.Field field89 = null;
        java.lang.Object obj90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate(objCollection88, field89, obj90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter81);
        org.junit.Assert.assertNotNull(ongoingInjecter84);
        org.junit.Assert.assertNotNull(ongoingInjecter87);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field61, (java.lang.Object) "hi!");
        java.lang.reflect.Field field64 = null;
        java.lang.Object obj65 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field64, obj65);
        java.lang.Class<?> wildcardClass67 = ongoingInjecter66.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) (-1.0f));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter31 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter32 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter49 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter49, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter32.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter60 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field58, (java.lang.Object) (-1L));
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter61 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter78 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter78, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList82 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter86 = finalMockCandidateFilter61.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field84, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field87 = null;
        java.lang.Object obj88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter31.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field87, obj88);
        java.lang.reflect.Field field90 = null;
        java.lang.Object obj91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter92 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field90, obj91);
        java.lang.reflect.Field field93 = null;
        java.lang.Object obj94 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList82, field93, obj94);
        java.lang.Class<?> wildcardClass96 = objList82.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
        org.junit.Assert.assertNotNull(ongoingInjecter60);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter86);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertNotNull(ongoingInjecter92);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter29 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) '4');
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field56 = null;
        java.lang.Object obj57 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field56, obj57);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter59 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter60 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter77 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter77, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList81 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter60.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field83, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter59.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field86, (java.lang.Object) (-1.0f));
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList81, field89, (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass92 = objList81.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(ongoingInjecter29);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter18 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter18, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList22 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList22, objArray21);
        java.lang.reflect.Field field24 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field24, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter28 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter29 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter30 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter47 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter47, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.lang.reflect.Field field53 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter55 = finalMockCandidateFilter30.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field53, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field56 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter29.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field56, (java.lang.Object) (-1L));
        java.lang.reflect.Field field59 = null;
        java.lang.Object obj60 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter61 = finalMockCandidateFilter28.filterCandidate((java.util.Collection<java.lang.Object>) objList51, field59, obj60);
        java.lang.Class<?> wildcardClass62 = finalMockCandidateFilter28.getClass();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter63 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList22, field27, (java.lang.Object) wildcardClass62);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter64 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter65 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter82 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray85 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter82, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList86 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList86, objArray85);
        java.lang.reflect.Field field88 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter90 = finalMockCandidateFilter65.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field88, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field91 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter93 = finalMockCandidateFilter64.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field91, (java.lang.Object) '4');
        java.lang.reflect.Field field94 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter95 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass96 = finalMockCandidateFilter95.getClass();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter97 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList86, field94, (java.lang.Object) wildcardClass96);
        java.lang.Class<?> wildcardClass98 = ongoingInjecter97.getClass();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter55);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertNotNull(ongoingInjecter61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(ongoingInjecter63);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter90);
        org.junit.Assert.assertNotNull(ongoingInjecter93);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(ongoingInjecter97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter17 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter17, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        java.lang.reflect.Field field23 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter25 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList21, field23, (java.lang.Object) 10.0d);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter26 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter43 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter43, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList47 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList47, objArray46);
        java.lang.reflect.Field field49 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter51 = finalMockCandidateFilter26.filterCandidate((java.util.Collection<java.lang.Object>) objList47, field49, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field52 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter54 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList47, field52, (java.lang.Object) 1);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter55 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter56 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter57 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter74 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Object[] objArray77 = new java.lang.Object[] { 0L, 0.0d, (byte) 10, "", (short) 100, (-1.0f), 100.0f, false, (byte) 100, true, 100, (short) 0, (byte) -1, 10.0d, 1.0f, "hi!", finalMockCandidateFilter74, (short) 100, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList78 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList78, objArray77);
        java.lang.reflect.Field field80 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter82 = finalMockCandidateFilter57.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field80, (java.lang.Object) 10.0d);
        java.lang.reflect.Field field83 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter85 = finalMockCandidateFilter56.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field83, (java.lang.Object) (-1L));
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter88 = finalMockCandidateFilter55.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field86, (java.lang.Object) 1.0d);
        java.lang.reflect.Field field89 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter91 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList78, field89, (java.lang.Object) (-1.0f));
        java.util.Collection<java.lang.Object> objCollection92 = null;
        java.lang.reflect.Field field93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter0.filterCandidate(objCollection92, field93, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter25);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter51);
        org.junit.Assert.assertNotNull(ongoingInjecter54);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter82);
        org.junit.Assert.assertNotNull(ongoingInjecter85);
        org.junit.Assert.assertNotNull(ongoingInjecter88);
        org.junit.Assert.assertNotNull(ongoingInjecter91);
    }
}

