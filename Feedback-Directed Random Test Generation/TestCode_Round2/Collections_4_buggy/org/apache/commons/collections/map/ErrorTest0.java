package org.apache.commons.collections.map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set1 = multiValueMap0.keySet();
        org.apache.commons.collections.map.MultiValueMap multiValueMap2 = new org.apache.commons.collections.map.MultiValueMap();
        multiValueMap0.putAll((java.util.Map) multiValueMap2);
        java.util.Set set4 = multiValueMap0.keySet();
        java.lang.Object obj6 = multiValueMap0.get((java.lang.Object) 100.0d);
        org.apache.commons.collections.map.MultiValueMap multiValueMap7 = org.apache.commons.collections.map.MultiValueMap.decorate((java.util.Map) multiValueMap0);
        org.apache.commons.collections.map.MultiValueMap multiValueMap8 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set9 = multiValueMap8.keySet();
        java.lang.Object obj11 = multiValueMap8.get((java.lang.Object) "hi!");
        org.apache.commons.collections.map.MultiValueMap multiValueMap12 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set13 = multiValueMap12.keySet();
        java.lang.Object obj14 = multiValueMap8.remove((java.lang.Object) multiValueMap12);
        org.apache.commons.collections.map.MultiValueMap multiValueMap15 = org.apache.commons.collections.map.MultiValueMap.decorate((java.util.Map) multiValueMap8);
        org.apache.commons.collections.map.MultiValueMap multiValueMap16 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set17 = multiValueMap16.keySet();
        org.apache.commons.collections.map.MultiValueMap multiValueMap18 = new org.apache.commons.collections.map.MultiValueMap();
        multiValueMap16.putAll((java.util.Map) multiValueMap18);
        int int20 = multiValueMap16.totalSize();
        java.util.Collection collection22 = multiValueMap16.getCollection((java.lang.Object) 100.0f);
        multiValueMap16.clear();
        java.lang.Object obj24 = multiValueMap7.put((java.lang.Object) multiValueMap15, (java.lang.Object) multiValueMap16);
        java.util.Set set25 = multiValueMap15.keySet();
        org.apache.commons.collections.map.MultiValueMap multiValueMap26 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set27 = multiValueMap26.keySet();
        org.apache.commons.collections.map.MultiValueMap multiValueMap28 = new org.apache.commons.collections.map.MultiValueMap();
        multiValueMap26.putAll((java.util.Map) multiValueMap28);
        int int30 = multiValueMap26.totalSize();
        java.util.Collection collection32 = multiValueMap26.getCollection((java.lang.Object) 100.0f);
        org.apache.commons.collections.map.MultiValueMap multiValueMap33 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set34 = multiValueMap33.keySet();
        java.lang.Object obj36 = multiValueMap33.get((java.lang.Object) "hi!");
        org.apache.commons.collections.map.MultiValueMap multiValueMap37 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Set set38 = multiValueMap37.keySet();
        java.lang.Object obj39 = multiValueMap33.remove((java.lang.Object) multiValueMap37);
        org.apache.commons.collections.map.MultiValueMap multiValueMap40 = org.apache.commons.collections.map.MultiValueMap.decorate((java.util.Map) multiValueMap33);
        org.apache.commons.collections.map.MultiValueMap multiValueMap41 = new org.apache.commons.collections.map.MultiValueMap();
        java.util.Collection collection43 = multiValueMap41.getCollection((java.lang.Object) (-1L));
        java.util.Set set44 = multiValueMap41.keySet();
        multiValueMap40.putAll((java.util.Map) multiValueMap41);
        java.lang.Object obj46 = multiValueMap15.put((java.lang.Object) collection32, (java.lang.Object) multiValueMap41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on multiValueMap0 and multiValueMap7.", multiValueMap0.equals(multiValueMap7) == multiValueMap7.equals(multiValueMap0));
    }
}

