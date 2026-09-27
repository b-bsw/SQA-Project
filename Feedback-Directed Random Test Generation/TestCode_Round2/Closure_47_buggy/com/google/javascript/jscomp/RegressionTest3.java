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
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        sourceMap4.setWrapperPrefix("hi!");
        sourceMap4.validate(false);
        sourceMap4.setStartingPosition((int) (short) 100, (int) (short) 100);
        com.google.javascript.jscomp.SourceMap.Format format12 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap13 = format12.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap14 = format12.getInstance();
        sourceMap14.setStartingPosition((int) 'a', 10);
        com.google.javascript.jscomp.SourceMap.Format format18 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap19 = format18.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap20 = format18.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping23 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping26 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray30 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping23, locationMapping26, locationMapping29 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList31 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList31, locationMappingArray30);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList31);
        sourceMap20.validate(false);
        sourceMap20.reset();
        sourceMap20.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format39 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap40 = format39.getInstance();
        sourceMap40.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        sourceMap46.validate(true);
        sourceMap46.setWrapperPrefix("hi!");
        sourceMap46.setWrapperPrefix("");
        sourceMap46.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray57 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping56 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList58 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58, locationMappingArray57);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap40.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap14.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap4.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        java.lang.Class<?> wildcardClass66 = locationMappingList58.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertNotNull(sourceMap13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(format18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertNotNull(sourceMap20);
        org.junit.Assert.assertNotNull(locationMappingArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(format39);
        org.junit.Assert.assertNotNull(sourceMap40);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(locationMappingArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        sourceMap3.setStartingPosition(100, (int) (byte) 1);
        sourceMap3.validate(false);
        // The following exception was thrown during execution in test generation
        try {
            sourceMap3.setStartingPosition((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        org.json.JSONObject jSONObject22 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.validate(false);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.validate(false);
        sourceMap2.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.rhino.Node node24 = null;
        com.google.debugging.sourcemap.FilePosition filePosition25 = null;
        com.google.debugging.sourcemap.FilePosition filePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node24, filePosition25, filePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.reset();
        sourceMap2.setStartingPosition((int) (short) 100, (int) (byte) 1);
        sourceMap2.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) -1);
        org.json.JSONObject jSONObject22 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject22, sourceMapSupplier23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = originalMapping21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format5 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap6 = format5.getInstance();
        sourceMap6.validate(true);
        sourceMap6.setWrapperPrefix("hi!");
        sourceMap6.setWrapperPrefix("");
        sourceMap6.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray17 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping16 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList18 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18, locationMappingArray17);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18);
        sourceMap6.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap6.setStartingPosition((int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.SourceMap.Format format27 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap28 = format27.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap29 = format27.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping35 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray39 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping32, locationMapping35, locationMapping38 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList40 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40, locationMappingArray39);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList40);
        sourceMap29.reset();
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format46 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap47 = format46.getInstance();
        sourceMap47.validate(true);
        sourceMap47.setWrapperPrefix("hi!");
        sourceMap47.setWrapperPrefix("");
        sourceMap47.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping57 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray58 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping57 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList59 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59, locationMappingArray58);
        sourceMap47.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap29.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList59);
        sourceMap2.setWrapperPrefix("");
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.setStartingPosition((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(locationMappingArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(format27);
        org.junit.Assert.assertNotNull(sourceMap28);
        org.junit.Assert.assertNotNull(sourceMap29);
        org.junit.Assert.assertNotNull(locationMappingArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(format46);
        org.junit.Assert.assertNotNull(sourceMap47);
        org.junit.Assert.assertNotNull(locationMappingArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (short) 0, (int) '#');
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.rhino.Node node30 = null;
        com.google.debugging.sourcemap.FilePosition filePosition31 = null;
        com.google.debugging.sourcemap.FilePosition filePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node30, filePosition31, filePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.setStartingPosition(100, (int) (byte) 10);
        sourceMap2.reset();
        sourceMap2.setStartingPosition(10, 100);
        com.google.javascript.rhino.Node node12 = null;
        com.google.debugging.sourcemap.FilePosition filePosition13 = null;
        com.google.debugging.sourcemap.FilePosition filePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.addMapping(node12, filePosition13, filePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format8 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap9 = format8.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format8.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping13, locationMapping16, locationMapping19 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21);
        sourceMap10.validate(false);
        sourceMap10.reset();
        sourceMap10.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format29 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap30 = format29.getInstance();
        sourceMap30.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format33 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap34 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format35 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap36 = format35.getInstance();
        sourceMap36.validate(true);
        sourceMap36.setWrapperPrefix("hi!");
        sourceMap36.setWrapperPrefix("");
        sourceMap36.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping46 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray47 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping46 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList48 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48, locationMappingArray47);
        sourceMap36.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap34.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap30.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        java.lang.Appendable appendable58 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable58, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(format29);
        org.junit.Assert.assertNotNull(sourceMap30);
        org.junit.Assert.assertNotNull(format33);
        org.junit.Assert.assertNotNull(sourceMap34);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertNotNull(locationMappingArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str7 = locationMapping6.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping10 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str11 = locationMapping10.replacement;
        java.lang.String str12 = locationMapping10.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str16 = locationMapping15.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping10, locationMapping15, locationMapping19 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21);
        sourceMap1.reset();
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.validate(true);
        sourceMap2.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 1, (int) 'a');
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.setStartingPosition(100, (int) (byte) 10);
        sourceMap2.reset();
        sourceMap2.setStartingPosition(10, 100);
        sourceMap2.reset();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.setStartingPosition(100, 0);
        sourceMap2.reset();
        sourceMap2.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 0, (int) (byte) 0);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap28 = format26.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray38 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping31, locationMapping34, locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList39 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39, locationMappingArray38);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap28.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        sourceMap46.validate(true);
        sourceMap46.setWrapperPrefix("hi!");
        sourceMap46.setWrapperPrefix("");
        sourceMap46.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray57 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping56 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList58 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58, locationMappingArray57);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        com.google.javascript.jscomp.SourceMap.Format format63 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap64 = format63.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format65 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap66 = format65.getInstance();
        sourceMap66.validate(true);
        sourceMap66.setWrapperPrefix("hi!");
        sourceMap66.setWrapperPrefix("");
        sourceMap66.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping76 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray77 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping76 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList78 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList78, locationMappingArray77);
        sourceMap66.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList78);
        sourceMap64.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList78);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList78);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList78);
        sourceMap1.reset();
        java.lang.Appendable appendable85 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable85, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(sourceMap28);
        org.junit.Assert.assertNotNull(locationMappingArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(locationMappingArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(format63);
        org.junit.Assert.assertNotNull(sourceMap64);
        org.junit.Assert.assertNotNull(format65);
        org.junit.Assert.assertNotNull(sourceMap66);
        org.junit.Assert.assertNotNull(locationMappingArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping14, locationMapping17, locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 1, (int) (byte) 0);
        sourceMap1.setStartingPosition((int) (byte) 0, 100);
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        sourceMap8.setWrapperPrefix("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sourceMap8.setStartingPosition((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        sourceMap17.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str23 = locationMapping22.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping26 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str27 = locationMapping26.replacement;
        java.lang.String str28 = locationMapping26.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str32 = locationMapping31.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping35 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray36 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping22, locationMapping26, locationMapping31, locationMapping35 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList37 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList37, locationMappingArray36);
        sourceMap17.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList37);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList37);
        sourceMap2.setStartingPosition(10, 0);
        sourceMap2.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locationMappingArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        sourceMap6.setStartingPosition((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = sourceMap6.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.Class<?> wildcardClass9 = locationMapping2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format8 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap9 = format8.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format8.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping13, locationMapping16, locationMapping19 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21);
        sourceMap10.validate(false);
        sourceMap10.reset();
        sourceMap10.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format29 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap30 = format29.getInstance();
        sourceMap30.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format33 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap34 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format35 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap36 = format35.getInstance();
        sourceMap36.validate(true);
        sourceMap36.setWrapperPrefix("hi!");
        sourceMap36.setWrapperPrefix("");
        sourceMap36.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping46 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray47 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping46 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList48 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48, locationMappingArray47);
        sourceMap36.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap34.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap30.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(format29);
        org.junit.Assert.assertNotNull(sourceMap30);
        org.junit.Assert.assertNotNull(format33);
        org.junit.Assert.assertNotNull(sourceMap34);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertNotNull(locationMappingArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass5 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping27 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) '#');
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("", sourceMapSupplier29);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
        org.junit.Assert.assertNull(originalMapping24);
        org.junit.Assert.assertNull(originalMapping27);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition(100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap2.reset();
        sourceMap2.validate(false);
        sourceMap2.validate(true);
        sourceMap2.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.setStartingPosition((int) (short) 100, 100);
        sourceMap2.validate(true);
        sourceMap2.setWrapperPrefix("hi!");
        java.lang.Class<?> wildcardClass26 = sourceMap2.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format7 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap8 = format7.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format7.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping12 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray19 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping12, locationMapping15, locationMapping18 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList20 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList20, locationMappingArray19);
        sourceMap9.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList20);
        sourceMap9.reset();
        com.google.javascript.jscomp.SourceMap.Format format24 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap25 = format24.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.validate(true);
        sourceMap27.setWrapperPrefix("hi!");
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray38 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList39 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39, locationMappingArray38);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap25.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap9.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition(100, (int) (short) 10);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(format7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(locationMappingArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(format24);
        org.junit.Assert.assertNotNull(sourceMap25);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(locationMappingArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.setStartingPosition(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.reset();
        com.google.javascript.jscomp.SourceMap.Format format17 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap18 = format17.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format19 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap20 = format19.getInstance();
        sourceMap20.validate(true);
        sourceMap20.setWrapperPrefix("hi!");
        sourceMap20.setWrapperPrefix("");
        sourceMap20.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping30 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray31 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping30 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList32 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList32, locationMappingArray31);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList32);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList32);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList32);
        sourceMap2.reset();
        sourceMap2.reset();
        com.google.javascript.rhino.Node node39 = null;
        com.google.debugging.sourcemap.FilePosition filePosition40 = null;
        com.google.debugging.sourcemap.FilePosition filePosition41 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.addMapping(node39, filePosition40, filePosition41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format17);
        org.junit.Assert.assertNotNull(sourceMap18);
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertNotNull(sourceMap20);
        org.junit.Assert.assertNotNull(locationMappingArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) -1);
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("", sourceMapSupplier11);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap32 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format33 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap34 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap35 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping41 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping44 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray45 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping41, locationMapping44 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList46 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList46, locationMappingArray45);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList46);
        sourceMap35.reset();
        com.google.javascript.jscomp.SourceMap.Format format50 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap51 = format50.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format52 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap53 = format52.getInstance();
        sourceMap53.validate(true);
        sourceMap53.setWrapperPrefix("hi!");
        sourceMap53.setWrapperPrefix("");
        sourceMap53.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping63 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray64 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping63 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList65 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65, locationMappingArray64);
        sourceMap53.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap51.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap32.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65);
        sourceMap1.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertNotNull(sourceMap32);
        org.junit.Assert.assertNotNull(format33);
        org.junit.Assert.assertNotNull(sourceMap34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(locationMappingArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(format50);
        org.junit.Assert.assertNotNull(sourceMap51);
        org.junit.Assert.assertNotNull(format52);
        org.junit.Assert.assertNotNull(sourceMap53);
        org.junit.Assert.assertNotNull(locationMappingArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (byte) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping24 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
        org.junit.Assert.assertNull(originalMapping24);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping14, locationMapping17, locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("hi!");
        java.lang.Appendable appendable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable30, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine(0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 10);
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap18 = format16.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping21 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping27 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray28 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping21, locationMapping24, locationMapping27 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList29 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList29, locationMappingArray28);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList29);
        sourceMap18.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping36 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray37 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping36 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList38 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38, locationMappingArray37);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38);
        sourceMap2.reset();
        sourceMap2.validate(true);
        sourceMap2.setStartingPosition(100, (int) '4');
        java.lang.Class<?> wildcardClass48 = sourceMap2.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(sourceMap18);
        org.junit.Assert.assertNotNull(locationMappingArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(locationMappingArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        sourceMap5.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format8 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap9 = format8.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format8.getInstance();
        sourceMap10.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format13 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap14 = format13.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap15 = format13.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping21 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray25 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping18, locationMapping21, locationMapping24 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList26 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26, locationMappingArray25);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26);
        sourceMap15.validate(false);
        sourceMap15.reset();
        sourceMap15.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        sourceMap35.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format38 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap39 = format38.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format40 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap41 = format40.getInstance();
        sourceMap41.validate(true);
        sourceMap41.setWrapperPrefix("hi!");
        sourceMap41.setWrapperPrefix("");
        sourceMap41.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping51 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping51 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        sourceMap41.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap39.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap5.setStartingPosition((int) '#', (int) (byte) 1);
        sourceMap5.setWrapperPrefix("hi!");
        sourceMap5.reset();
        sourceMap5.setStartingPosition((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(format13);
        org.junit.Assert.assertNotNull(sourceMap14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertNotNull(locationMappingArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(format38);
        org.junit.Assert.assertNotNull(sourceMap39);
        org.junit.Assert.assertNotNull(format40);
        org.junit.Assert.assertNotNull(sourceMap41);
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.prefix;
        java.lang.String str9 = locationMapping2.prefix;
        java.lang.String str10 = locationMapping2.prefix;
        java.lang.String str11 = locationMapping2.prefix;
        java.lang.String str12 = locationMapping2.replacement;
        java.lang.String str13 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.validate(true);
        sourceMap7.setWrapperPrefix("hi!");
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray18 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping17 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList19 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19, locationMappingArray18);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(locationMappingArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format2 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap3 = format2.getInstance();
        sourceMap3.validate(true);
        sourceMap3.setWrapperPrefix("hi!");
        sourceMap3.setWrapperPrefix("");
        sourceMap3.reset();
        com.google.javascript.jscomp.SourceMap.Format format11 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap12 = format11.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap13 = format11.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping16, locationMapping19, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap13.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.validate(true);
        sourceMap1.setStartingPosition(0, (int) (short) 1);
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        sourceMap35.validate(true);
        sourceMap35.setWrapperPrefix("hi!");
        sourceMap35.setWrapperPrefix("");
        sourceMap35.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap45 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping48 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping51 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping54 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray55 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping48, locationMapping51, locationMapping54 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList56 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList56, locationMappingArray55);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList56);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList56);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList56);
        sourceMap1.validate(true);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setStartingPosition(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(format11);
        org.junit.Assert.assertNotNull(sourceMap12);
        org.junit.Assert.assertNotNull(sourceMap13);
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(locationMappingArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.reset();
        sourceMap2.validate(false);
        java.lang.Class<?> wildcardClass8 = sourceMap2.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.replacement;
        java.lang.String str11 = locationMapping2.prefix;
        java.lang.String str12 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format2 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap3 = format2.getInstance();
        sourceMap3.validate(true);
        sourceMap3.setWrapperPrefix("hi!");
        sourceMap3.setWrapperPrefix("");
        sourceMap3.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray14 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping13 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList15 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15, locationMappingArray14);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.reset();
        sourceMap1.setStartingPosition(0, 100);
        sourceMap1.validate(false);
        java.lang.Appendable appendable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(locationMappingArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.validate(false);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.validate(false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.debugging.sourcemap.FilePosition filePosition26 = null;
        com.google.debugging.sourcemap.FilePosition filePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.addMapping(node25, filePosition26, filePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format2 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap3 = format2.getInstance();
        sourceMap3.validate(true);
        sourceMap3.setWrapperPrefix("hi!");
        sourceMap3.setWrapperPrefix("");
        sourceMap3.reset();
        com.google.javascript.jscomp.SourceMap.Format format11 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap12 = format11.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap13 = format11.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping16, locationMapping19, locationMapping22 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        sourceMap13.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24);
        sourceMap1.validate(false);
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(format11);
        org.junit.Assert.assertNotNull(sourceMap12);
        org.junit.Assert.assertNotNull(sourceMap13);
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(false);
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setStartingPosition((int) 'a', (int) (byte) 10);
        com.google.javascript.jscomp.SourceMap.Format format5 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap6 = format5.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format5.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format5.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        sourceMap10.validate(true);
        sourceMap10.setWrapperPrefix("hi!");
        sourceMap10.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format17 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap18 = format17.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap19 = format17.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping22 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping25 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray29 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping22, locationMapping25, locationMapping28 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList30 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30, locationMappingArray29);
        sourceMap19.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30);
        sourceMap19.validate(false);
        sourceMap19.reset();
        sourceMap19.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format38 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap39 = format38.getInstance();
        sourceMap39.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        sourceMap45.validate(true);
        sourceMap45.setWrapperPrefix("hi!");
        sourceMap45.setWrapperPrefix("");
        sourceMap45.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping55 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray56 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping55 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList57 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57, locationMappingArray56);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap39.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap19.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap8.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        com.google.javascript.jscomp.SourceMap.Format format65 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap66 = format65.getInstance();
        sourceMap66.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping71 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str72 = locationMapping71.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping75 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str76 = locationMapping75.replacement;
        java.lang.String str77 = locationMapping75.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping80 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str81 = locationMapping80.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping84 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray85 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping71, locationMapping75, locationMapping80, locationMapping84 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList86 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList86, locationMappingArray85);
        sourceMap66.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList86);
        sourceMap8.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList86);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList86);
        sourceMap1.setStartingPosition(0, (int) '4');
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(format17);
        org.junit.Assert.assertNotNull(sourceMap18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertNotNull(locationMappingArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(format38);
        org.junit.Assert.assertNotNull(sourceMap39);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(locationMappingArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(format65);
        org.junit.Assert.assertNotNull(sourceMap66);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locationMappingArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition((int) ' ', (int) (short) 1);
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.validate(true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.debugging.sourcemap.FilePosition filePosition11 = null;
        com.google.debugging.sourcemap.FilePosition filePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node10, filePosition11, filePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) (short) 10, (int) (short) 100);
        com.google.javascript.jscomp.SourceMap.Format format21 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap22 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap23 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping26 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray33 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping26, locationMapping29, locationMapping32 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList34 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34, locationMappingArray33);
        sourceMap23.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34);
        sourceMap23.reset();
        sourceMap23.setStartingPosition((int) (short) 100, (int) (byte) 1);
        sourceMap23.setStartingPosition(0, 100);
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format46 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap47 = format46.getInstance();
        sourceMap47.validate(true);
        sourceMap47.setWrapperPrefix("hi!");
        sourceMap47.setWrapperPrefix("");
        sourceMap47.reset();
        com.google.javascript.jscomp.SourceMap.Format format55 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap56 = format55.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap57 = format55.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping60 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping63 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping66 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray67 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping60, locationMapping63, locationMapping66 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList68 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68, locationMappingArray67);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap47.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap23.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList68);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format21);
        org.junit.Assert.assertNotNull(sourceMap22);
        org.junit.Assert.assertNotNull(sourceMap23);
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(format46);
        org.junit.Assert.assertNotNull(sourceMap47);
        org.junit.Assert.assertNotNull(format55);
        org.junit.Assert.assertNotNull(sourceMap56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertNotNull(locationMappingArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setStartingPosition(0, (int) (byte) 100);
        sourceMap1.validate(false);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.appendTo(appendable7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format2 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap3 = format2.getInstance();
        sourceMap3.validate(true);
        sourceMap3.setWrapperPrefix("hi!");
        sourceMap3.setWrapperPrefix("");
        sourceMap3.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray14 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping13 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList15 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15, locationMappingArray14);
        sourceMap3.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList15);
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format21 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap22 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap23 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap24 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format25 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap26 = format25.getInstance();
        sourceMap26.validate(true);
        sourceMap26.setWrapperPrefix("hi!");
        sourceMap26.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format33 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap34 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap35 = format33.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping38 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping41 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping44 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray45 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping38, locationMapping41, locationMapping44 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList46 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList46, locationMappingArray45);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList46);
        sourceMap35.validate(false);
        sourceMap35.reset();
        sourceMap35.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format54 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap55 = format54.getInstance();
        sourceMap55.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format58 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap59 = format58.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format60 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap61 = format60.getInstance();
        sourceMap61.validate(true);
        sourceMap61.setWrapperPrefix("hi!");
        sourceMap61.setWrapperPrefix("");
        sourceMap61.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping71 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray72 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping71 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList73 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73, locationMappingArray72);
        sourceMap61.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap59.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap55.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap26.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap24.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList73);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(locationMappingArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(format21);
        org.junit.Assert.assertNotNull(sourceMap22);
        org.junit.Assert.assertNotNull(sourceMap23);
        org.junit.Assert.assertNotNull(sourceMap24);
        org.junit.Assert.assertNotNull(format25);
        org.junit.Assert.assertNotNull(sourceMap26);
        org.junit.Assert.assertNotNull(format33);
        org.junit.Assert.assertNotNull(sourceMap34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(locationMappingArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(format54);
        org.junit.Assert.assertNotNull(sourceMap55);
        org.junit.Assert.assertNotNull(format58);
        org.junit.Assert.assertNotNull(sourceMap59);
        org.junit.Assert.assertNotNull(format60);
        org.junit.Assert.assertNotNull(sourceMap61);
        org.junit.Assert.assertNotNull(locationMappingArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format5 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap6 = format5.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format5.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping10 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray17 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping10, locationMapping13, locationMapping16 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList18 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18, locationMappingArray17);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18);
        sourceMap7.validate(false);
        sourceMap7.reset();
        sourceMap7.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format32 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap33 = format32.getInstance();
        sourceMap33.validate(true);
        sourceMap33.setWrapperPrefix("hi!");
        sourceMap33.setWrapperPrefix("");
        sourceMap33.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping43 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray44 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping43 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList45 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45, locationMappingArray44);
        sourceMap33.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList45);
        sourceMap2.reset();
        java.lang.Appendable appendable53 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.appendTo(appendable53, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(locationMappingArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertNotNull(format32);
        org.junit.Assert.assertNotNull(sourceMap33);
        org.junit.Assert.assertNotNull(locationMappingArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str7 = locationMapping6.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping10 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str11 = locationMapping10.replacement;
        java.lang.String str12 = locationMapping10.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str16 = locationMapping15.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping10, locationMapping15, locationMapping19 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        com.google.javascript.jscomp.SourceMap.Format format16 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap17 = format16.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap18 = format16.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping21 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping27 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray28 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping21, locationMapping24, locationMapping27 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList29 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList29, locationMappingArray28);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList29);
        sourceMap18.reset();
        sourceMap18.setStartingPosition((int) (short) 100, (int) (byte) 1);
        sourceMap18.setStartingPosition(0, 100);
        sourceMap18.setStartingPosition((int) (short) 0, (int) '#');
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        sourceMap43.validate(true);
        sourceMap43.setWrapperPrefix("hi!");
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format51 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap52 = format51.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap53 = format51.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping59 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping62 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray63 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping56, locationMapping59, locationMapping62 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList64 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64, locationMappingArray63);
        sourceMap53.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList64);
        sourceMap43.setWrapperPrefix("");
        sourceMap43.reset();
        com.google.javascript.jscomp.SourceMap.Format format71 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap72 = format71.getInstance();
        sourceMap72.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format75 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap76 = format75.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format77 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap78 = format77.getInstance();
        sourceMap78.validate(true);
        sourceMap78.setWrapperPrefix("hi!");
        sourceMap78.setWrapperPrefix("");
        sourceMap78.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping88 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray89 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping88 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList90 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90, locationMappingArray89);
        sourceMap78.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap76.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap72.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap18.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        java.lang.Class<?> wildcardClass98 = locationMappingList90.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(sourceMap17);
        org.junit.Assert.assertNotNull(sourceMap18);
        org.junit.Assert.assertNotNull(locationMappingArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format51);
        org.junit.Assert.assertNotNull(sourceMap52);
        org.junit.Assert.assertNotNull(sourceMap53);
        org.junit.Assert.assertNotNull(locationMappingArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(format71);
        org.junit.Assert.assertNotNull(sourceMap72);
        org.junit.Assert.assertNotNull(format75);
        org.junit.Assert.assertNotNull(sourceMap76);
        org.junit.Assert.assertNotNull(format77);
        org.junit.Assert.assertNotNull(sourceMap78);
        org.junit.Assert.assertNotNull(locationMappingArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (short) 0, (int) '#');
        sourceMap1.reset();
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.prefix;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.prefix;
        java.lang.Class<?> wildcardClass11 = locationMapping2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine(0, (int) ' ');
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!", sourceMapSupplier23);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.prefix;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 0, (int) (byte) 0);
        com.google.javascript.rhino.Node node26 = null;
        com.google.debugging.sourcemap.FilePosition filePosition27 = null;
        com.google.debugging.sourcemap.FilePosition filePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node26, filePosition27, filePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.replacement;
        java.lang.String str10 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format7 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap8 = format7.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format7.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping12 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping18 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray19 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping12, locationMapping15, locationMapping18 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList20 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList20, locationMappingArray19);
        sourceMap9.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList20);
        sourceMap9.reset();
        com.google.javascript.jscomp.SourceMap.Format format24 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap25 = format24.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        sourceMap27.validate(true);
        sourceMap27.setWrapperPrefix("hi!");
        sourceMap27.setWrapperPrefix("");
        sourceMap27.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray38 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList39 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39, locationMappingArray38);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap25.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap9.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.rhino.Node node51 = null;
        com.google.debugging.sourcemap.FilePosition filePosition52 = null;
        com.google.debugging.sourcemap.FilePosition filePosition53 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node51, filePosition52, filePosition53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(format7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(locationMappingArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(format24);
        org.junit.Assert.assertNotNull(sourceMap25);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(locationMappingArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping14, locationMapping17, locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) (byte) 0, (int) (short) 0);
        sourceMap1.setStartingPosition((int) 'a', (int) '4');
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping6 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str7 = locationMapping6.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping10 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str11 = locationMapping10.replacement;
        java.lang.String str12 = locationMapping10.prefix;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str16 = locationMapping15.replacement;
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping19 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping6, locationMapping10, locationMapping15, locationMapping19 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21);
        sourceMap1.validate(false);
        sourceMap1.reset();
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition(0, 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.setStartingPosition((int) (short) 1, 1);
        com.google.javascript.jscomp.SourceMap.Format format22 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap23 = format22.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap24 = format22.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap25 = format22.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap26 = format22.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap27 = format22.getInstance();
        sourceMap27.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format32 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap33 = format32.getInstance();
        sourceMap33.validate(true);
        sourceMap33.setWrapperPrefix("hi!");
        sourceMap33.setWrapperPrefix("");
        sourceMap33.reset();
        com.google.javascript.jscomp.SourceMap.Format format41 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap42 = format41.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap43 = format41.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping46 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping49 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping52 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray53 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping46, locationMapping49, locationMapping52 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList54 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54, locationMappingArray53);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54);
        sourceMap33.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format22);
        org.junit.Assert.assertNotNull(sourceMap23);
        org.junit.Assert.assertNotNull(sourceMap24);
        org.junit.Assert.assertNotNull(sourceMap25);
        org.junit.Assert.assertNotNull(sourceMap26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertNotNull(format32);
        org.junit.Assert.assertNotNull(sourceMap33);
        org.junit.Assert.assertNotNull(format41);
        org.junit.Assert.assertNotNull(sourceMap42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(locationMappingArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping9 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping12 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping15 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping9, locationMapping12, locationMapping15 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17);
        com.google.javascript.jscomp.SourceMap.Format format20 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap21 = format20.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap22 = format20.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping25 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray32 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping25, locationMapping28, locationMapping31 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList33 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList33, locationMappingArray32);
        sourceMap22.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList33);
        sourceMap22.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping40 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray41 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping40 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList42 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList42, locationMappingArray41);
        sourceMap22.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList42);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList42);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList42);
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(format20);
        org.junit.Assert.assertNotNull(sourceMap21);
        org.junit.Assert.assertNotNull(sourceMap22);
        org.junit.Assert.assertNotNull(locationMappingArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locationMappingArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.validate(false);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.validate(true);
        java.lang.Class<?> wildcardClass27 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, (int) ' ');
        org.json.JSONObject jSONObject16 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject16, sourceMapSupplier17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) -1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 0);
        org.json.JSONObject jSONObject13 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject13, sourceMapSupplier14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.validate(false);
        sourceMap1.reset();
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = null;
        sourceMap1.setPrefixMappings(locationMappingList22);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.prefix;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format31 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap32 = format31.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap33 = format31.getInstance();
        sourceMap33.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format36 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap37 = format36.getInstance();
        sourceMap37.validate(true);
        sourceMap37.setWrapperPrefix("hi!");
        sourceMap37.setWrapperPrefix("");
        sourceMap37.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping47 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray48 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping47 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList49 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49, locationMappingArray48);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap37.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap37.setStartingPosition((int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.SourceMap.Format format58 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap59 = format58.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap60 = format58.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping63 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping66 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping69 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray70 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping63, locationMapping66, locationMapping69 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList71 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList71, locationMappingArray70);
        sourceMap60.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList71);
        sourceMap60.reset();
        com.google.javascript.jscomp.SourceMap.Format format75 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap76 = format75.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format77 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap78 = format77.getInstance();
        sourceMap78.validate(true);
        sourceMap78.setWrapperPrefix("hi!");
        sourceMap78.setWrapperPrefix("");
        sourceMap78.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping88 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray89 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping88 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList90 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90, locationMappingArray89);
        sourceMap78.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap76.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap60.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap33.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList90);
        sourceMap2.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(format31);
        org.junit.Assert.assertNotNull(sourceMap32);
        org.junit.Assert.assertNotNull(sourceMap33);
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(locationMappingArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(format58);
        org.junit.Assert.assertNotNull(sourceMap59);
        org.junit.Assert.assertNotNull(sourceMap60);
        org.junit.Assert.assertNotNull(locationMappingArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(format75);
        org.junit.Assert.assertNotNull(sourceMap76);
        org.junit.Assert.assertNotNull(format77);
        org.junit.Assert.assertNotNull(sourceMap78);
        org.junit.Assert.assertNotNull(locationMappingArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (byte) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.validate(false);
        sourceMap1.setStartingPosition((int) (short) 10, (int) (short) 100);
        sourceMap1.setWrapperPrefix("");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) 1);
        org.json.JSONObject jSONObject13 = null;
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse(jSONObject13, sourceMapSupplier14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping14, locationMapping17, locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setStartingPosition((int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.reset();
        sourceMap2.reset();
        sourceMap2.reset();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V3;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap5 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap6 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap7 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap9 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap10 = format0.getInstance();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(sourceMap9);
        org.junit.Assert.assertNotNull(sourceMap10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((-1), 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((-1), (int) (short) 0);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, 100);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping21 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
        org.junit.Assert.assertNull(originalMapping21);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.prefix;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.prefix;
        java.lang.String str8 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        sourceMap1.setStartingPosition((int) 'a', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.setStartingPosition((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) 'a', 100);
        sourceMap1.setStartingPosition((int) (short) 10, (int) 'a');
        com.google.javascript.jscomp.SourceMap.Format format27 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap28 = format27.getInstance();
        sourceMap28.validate(true);
        sourceMap28.setWrapperPrefix("hi!");
        sourceMap28.setWrapperPrefix("");
        sourceMap28.reset();
        com.google.javascript.jscomp.SourceMap.Format format36 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap37 = format36.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap38 = format36.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping41 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping44 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping47 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray48 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping41, locationMapping44, locationMapping47 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList49 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49, locationMappingArray48);
        sourceMap38.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap1.setStartingPosition((int) ' ', 1);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setStartingPosition((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(format27);
        org.junit.Assert.assertNotNull(sourceMap28);
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(sourceMap38);
        org.junit.Assert.assertNotNull(locationMappingArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.replacement;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.prefix;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        java.lang.String str9 = locationMapping2.prefix;
        java.lang.String str10 = locationMapping2.replacement;
        java.lang.String str11 = locationMapping2.prefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        com.google.javascript.jscomp.SourceMap.Format format25 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap26 = format25.getInstance();
        sourceMap26.validate(true);
        sourceMap26.setWrapperPrefix("hi!");
        sourceMap26.setWrapperPrefix("");
        sourceMap26.reset();
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap36 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping39 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping45 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray46 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping39, locationMapping42, locationMapping45 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList47 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47, locationMappingArray46);
        sourceMap36.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        sourceMap26.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47);
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.setWrapperPrefix("");
        com.google.javascript.jscomp.SourceMap.Format format56 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap57 = format56.getInstance();
        sourceMap57.validate(true);
        sourceMap57.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format62 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap63 = format62.getInstance();
        sourceMap63.validate(true);
        sourceMap63.setWrapperPrefix("hi!");
        sourceMap63.setWrapperPrefix("");
        sourceMap63.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping73 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray74 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping73 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList75 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList75, locationMappingArray74);
        sourceMap63.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList75);
        sourceMap57.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList75);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList75);
        com.google.javascript.rhino.Node node80 = null;
        com.google.debugging.sourcemap.FilePosition filePosition81 = null;
        com.google.debugging.sourcemap.FilePosition filePosition82 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.addMapping(node80, filePosition81, filePosition82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(format25);
        org.junit.Assert.assertNotNull(sourceMap26);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertNotNull(locationMappingArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(format56);
        org.junit.Assert.assertNotNull(sourceMap57);
        org.junit.Assert.assertNotNull(format62);
        org.junit.Assert.assertNotNull(sourceMap63);
        org.junit.Assert.assertNotNull(locationMappingArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        sourceMap2.reset();
        sourceMap2.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap2.reset();
        sourceMap2.setWrapperPrefix("");
        sourceMap2.validate(true);
        sourceMap2.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("");
        sourceMap1.setWrapperPrefix("");
        java.lang.Class<?> wildcardClass21 = sourceMap1.getClass();
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        java.lang.String str3 = locationMapping2.prefix;
        java.lang.String str4 = locationMapping2.replacement;
        java.lang.String str5 = locationMapping2.replacement;
        java.lang.String str6 = locationMapping2.replacement;
        java.lang.String str7 = locationMapping2.replacement;
        java.lang.String str8 = locationMapping2.replacement;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap4 = format0.getInstance();
        sourceMap4.setWrapperPrefix("hi!");
        sourceMap4.validate(false);
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        sourceMap10.reset();
        sourceMap10.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format14 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap15 = format14.getInstance();
        sourceMap15.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format18 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap19 = format18.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap20 = format18.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format21 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap22 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap23 = format21.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping26 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping32 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray33 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping26, locationMapping29, locationMapping32 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList34 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34, locationMappingArray33);
        sourceMap23.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34);
        sourceMap23.reset();
        com.google.javascript.jscomp.SourceMap.Format format38 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap39 = format38.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format40 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap41 = format40.getInstance();
        sourceMap41.validate(true);
        sourceMap41.setWrapperPrefix("hi!");
        sourceMap41.setWrapperPrefix("");
        sourceMap41.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping51 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping51 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        sourceMap41.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap39.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap23.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap20.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap15.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap10.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap4.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53);
        sourceMap4.setStartingPosition(1, (int) (short) 0);
        sourceMap4.validate(true);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
        org.junit.Assert.assertNotNull(sourceMap4);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(format14);
        org.junit.Assert.assertNotNull(sourceMap15);
        org.junit.Assert.assertNotNull(format18);
        org.junit.Assert.assertNotNull(sourceMap19);
        org.junit.Assert.assertNotNull(sourceMap20);
        org.junit.Assert.assertNotNull(format21);
        org.junit.Assert.assertNotNull(sourceMap22);
        org.junit.Assert.assertNotNull(sourceMap23);
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(format38);
        org.junit.Assert.assertNotNull(sourceMap39);
        org.junit.Assert.assertNotNull(format40);
        org.junit.Assert.assertNotNull(sourceMap41);
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap3 = format0.getInstance();
        sourceMap3.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(sourceMap3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        sourceMap2.setWrapperPrefix("hi!");
        sourceMap2.reset();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap8 = format6.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format9 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap10 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap11 = format9.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping14, locationMapping17, locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        sourceMap11.validate(false);
        sourceMap11.reset();
        sourceMap11.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format30 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap31 = format30.getInstance();
        sourceMap31.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format34 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap35 = format34.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format36 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap37 = format36.getInstance();
        sourceMap37.validate(true);
        sourceMap37.setWrapperPrefix("hi!");
        sourceMap37.setWrapperPrefix("");
        sourceMap37.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping47 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray48 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping47 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList49 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49, locationMappingArray48);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap35.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap31.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap11.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap8.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList49);
        sourceMap2.validate(true);
        java.lang.Appendable appendable59 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap2.appendTo(appendable59, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(sourceMap8);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertNotNull(sourceMap10);
        org.junit.Assert.assertNotNull(sourceMap11);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(format30);
        org.junit.Assert.assertNotNull(sourceMap31);
        org.junit.Assert.assertNotNull(format34);
        org.junit.Assert.assertNotNull(sourceMap35);
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(locationMappingArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("");
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 0");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.setWrapperPrefix("");
        sourceMap1.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap1.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap1.setStartingPosition(0, (int) (byte) 10);
        sourceMap1.validate(false);
        sourceMap1.setWrapperPrefix("hi!");
        sourceMap1.reset();
        com.google.javascript.rhino.Node node27 = null;
        com.google.debugging.sourcemap.FilePosition filePosition28 = null;
        com.google.debugging.sourcemap.FilePosition filePosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMap1.addMapping(node27, filePosition28, filePosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.debugging.sourcemap.SourceMapConsumerV3 sourceMapConsumerV3_0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping3 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (byte) 10);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping6 = sourceMapConsumerV3_0.getMappingForLine((int) (byte) 0, 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping9 = sourceMapConsumerV3_0.getMappingForLine((int) (short) -1, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping12 = sourceMapConsumerV3_0.getMappingForLine(0, (int) 'a');
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping15 = sourceMapConsumerV3_0.getMappingForLine(0, (int) (short) 1);
        com.google.debugging.sourcemap.proto.Mapping.OriginalMapping originalMapping18 = sourceMapConsumerV3_0.getMappingForLine(0, 0);
        com.google.debugging.sourcemap.SourceMapSupplier sourceMapSupplier20 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceMapConsumerV3_0.parse("hi!", sourceMapSupplier20);
            org.junit.Assert.fail("Expected exception of type com.google.debugging.sourcemap.SourceMapParseException; message: JSON parse exception: org.json.JSONException: A JSONObject text must begin with '{' at character 1");
        } catch (com.google.debugging.sourcemap.SourceMapParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(originalMapping3);
        org.junit.Assert.assertNull(originalMapping6);
        org.junit.Assert.assertNull(originalMapping9);
        org.junit.Assert.assertNull(originalMapping12);
        org.junit.Assert.assertNull(originalMapping15);
        org.junit.Assert.assertNull(originalMapping18);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap2 = format0.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping5 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping11 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping5, locationMapping8, locationMapping11 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13);
        sourceMap2.validate(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping20 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping20 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22);
        com.google.javascript.jscomp.SourceMap.Format format25 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap26 = format25.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap27 = format25.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping30 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping33 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping36 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray37 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping30, locationMapping33, locationMapping36 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList38 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38, locationMappingArray37);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38);
        sourceMap27.reset();
        com.google.javascript.jscomp.SourceMap.Format format42 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap43 = format42.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format44 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap45 = format44.getInstance();
        sourceMap45.validate(true);
        sourceMap45.setWrapperPrefix("hi!");
        sourceMap45.setWrapperPrefix("");
        sourceMap45.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping55 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray56 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping55 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList57 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57, locationMappingArray56);
        sourceMap45.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap43.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap27.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap2.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList57);
        sourceMap2.setStartingPosition((int) ' ', (int) (byte) 10);
        sourceMap2.setStartingPosition((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(sourceMap2);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(format25);
        org.junit.Assert.assertNotNull(sourceMap26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(locationMappingArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(format42);
        org.junit.Assert.assertNotNull(sourceMap43);
        org.junit.Assert.assertNotNull(format44);
        org.junit.Assert.assertNotNull(sourceMap45);
        org.junit.Assert.assertNotNull(locationMappingArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format4 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap5 = format4.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format6 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap7 = format6.getInstance();
        sourceMap7.validate(true);
        sourceMap7.setWrapperPrefix("hi!");
        sourceMap7.setWrapperPrefix("");
        sourceMap7.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping17 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray18 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping17 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList19 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19, locationMappingArray18);
        sourceMap7.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap5.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList19);
        sourceMap1.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format26 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap27 = format26.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap28 = format26.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping37 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray38 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping31, locationMapping34, locationMapping37 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList39 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39, locationMappingArray38);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList39);
        sourceMap28.reset();
        com.google.javascript.jscomp.SourceMap.Format format43 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap44 = format43.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format45 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap46 = format45.getInstance();
        sourceMap46.validate(true);
        sourceMap46.setWrapperPrefix("hi!");
        sourceMap46.setWrapperPrefix("");
        sourceMap46.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping56 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray57 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping56 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList58 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58, locationMappingArray57);
        sourceMap46.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap44.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap28.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList58);
        sourceMap1.setWrapperPrefix("hi!");
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format4);
        org.junit.Assert.assertNotNull(sourceMap5);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertNotNull(sourceMap7);
        org.junit.Assert.assertNotNull(locationMappingArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertNotNull(sourceMap27);
        org.junit.Assert.assertNotNull(sourceMap28);
        org.junit.Assert.assertNotNull(locationMappingArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(format43);
        org.junit.Assert.assertNotNull(sourceMap44);
        org.junit.Assert.assertNotNull(format45);
        org.junit.Assert.assertNotNull(sourceMap46);
        org.junit.Assert.assertNotNull(locationMappingArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap1 = format0.getInstance();
        sourceMap1.reset();
        sourceMap1.setWrapperPrefix("hi!");
        com.google.javascript.jscomp.SourceMap.Format format5 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap6 = format5.getInstance();
        sourceMap6.validate(true);
        sourceMap6.setWrapperPrefix("hi!");
        sourceMap6.setWrapperPrefix("");
        sourceMap6.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray17 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping16 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList18 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18, locationMappingArray17);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList18);
        sourceMap6.setStartingPosition((int) (short) 1, (int) 'a');
        sourceMap6.setStartingPosition(0, (int) (byte) 10);
        sourceMap6.setWrapperPrefix("");
        sourceMap6.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format31 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap32 = format31.getInstance();
        sourceMap32.validate(true);
        com.google.javascript.jscomp.SourceMap.Format format35 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap36 = format35.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap37 = format35.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format38 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap39 = format38.getInstance();
        com.google.javascript.jscomp.SourceMap sourceMap40 = format38.getInstance();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping43 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping46 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping49 = new com.google.javascript.jscomp.SourceMap.LocationMapping("hi!", "");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray50 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping43, locationMapping46, locationMapping49 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList51 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList51, locationMappingArray50);
        sourceMap40.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList51);
        sourceMap40.reset();
        com.google.javascript.jscomp.SourceMap.Format format55 = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;
        com.google.javascript.jscomp.SourceMap sourceMap56 = format55.getInstance();
        com.google.javascript.jscomp.SourceMap.Format format57 = com.google.javascript.jscomp.SourceMap.Format.V2;
        com.google.javascript.jscomp.SourceMap sourceMap58 = format57.getInstance();
        sourceMap58.validate(true);
        sourceMap58.setWrapperPrefix("hi!");
        sourceMap58.setWrapperPrefix("");
        sourceMap58.reset();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping68 = new com.google.javascript.jscomp.SourceMap.LocationMapping("", "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray69 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping68 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList70 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70, locationMappingArray69);
        sourceMap58.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap56.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap40.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap37.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap32.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap6.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        sourceMap1.setPrefixMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList70);
        org.junit.Assert.assertNotNull(format0);
        org.junit.Assert.assertNotNull(sourceMap1);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(sourceMap6);
        org.junit.Assert.assertNotNull(locationMappingArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(format31);
        org.junit.Assert.assertNotNull(sourceMap32);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertNotNull(sourceMap36);
        org.junit.Assert.assertNotNull(sourceMap37);
        org.junit.Assert.assertNotNull(format38);
        org.junit.Assert.assertNotNull(sourceMap39);
        org.junit.Assert.assertNotNull(sourceMap40);
        org.junit.Assert.assertNotNull(locationMappingArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(format55);
        org.junit.Assert.assertNotNull(sourceMap56);
        org.junit.Assert.assertNotNull(format57);
        org.junit.Assert.assertNotNull(sourceMap58);
        org.junit.Assert.assertNotNull(locationMappingArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }
}

