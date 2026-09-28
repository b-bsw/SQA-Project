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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator3 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator3.equals(entrySetIterator3)", entrySetIterator3.equals(entrySetIterator3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.util.Set set2 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator3 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator3.equals(keySetIterator3)", keySetIterator3.equals(keySetIterator3));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet1 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator2 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator2.equals(valuesIterator2)", valuesIterator2.equals(valuesIterator2));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator1 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator1.equals(valuesIterator1)", valuesIterator1.equals(valuesIterator1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet1 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator2 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator2.equals(entrySetIterator2)", entrySetIterator2.equals(entrySetIterator2));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        boolean boolean15 = values13.contains((java.lang.Object) 100L);
        java.util.Iterator iterator16 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator16.equals(iterator16)", iterator16.equals(iterator16));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator3 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator3.equals(keySetIterator3)", keySetIterator3.equals(keySetIterator3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj4 = flat3Map2.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet5 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map2);
        java.util.Set set6 = flat3Map2.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj9 = flat3Map7.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map11.clone();
        java.util.Set set13 = flat3Map11.entrySet();
        boolean boolean14 = keySet10.remove((java.lang.Object) flat3Map11);
        java.util.Set set15 = flat3Map11.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map16.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet19 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map20.clone();
        java.util.Set set22 = flat3Map20.entrySet();
        boolean boolean23 = keySet19.remove((java.lang.Object) flat3Map20);
        java.lang.Object obj24 = flat3Map2.put((java.lang.Object) flat3Map11, (java.lang.Object) keySet19);
        boolean boolean25 = flat3Map0.containsKey(obj24);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator26 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator26.equals(entrySetIterator26)", entrySetIterator26.equals(entrySetIterator26));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.lang.Object obj2 = null;
        boolean boolean3 = entrySet1.remove(obj2);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        int int5 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj9 = flat3Map7.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map7);
        java.util.Set set11 = flat3Map7.entrySet();
        java.util.Set set12 = flat3Map7.keySet();
        java.lang.Object obj13 = flat3Map4.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map7);
        org.apache.commons.collections.map.Flat3Map.Values values14 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map4);
        boolean boolean15 = entrySet1.remove((java.lang.Object) values14);
        java.util.Iterator iterator16 = values14.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator16.equals(iterator16)", iterator16.equals(iterator16));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int2 = flat3Map0.size();
        int int3 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator4 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator4.equals(entrySetIterator4)", entrySetIterator4.equals(entrySetIterator4));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator8 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator8.equals(entrySetIterator8)", entrySetIterator8.equals(entrySetIterator8));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator13 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator13.equals(keySetIterator13)", keySetIterator13.equals(keySetIterator13));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        boolean boolean11 = flat3Map0.containsValue((java.lang.Object) "Iterator[]");
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator12 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator12.equals(valuesIterator12)", valuesIterator12.equals(valuesIterator12));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator3 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator3.equals(valuesIterator3)", valuesIterator3.equals(valuesIterator3));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator4 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator4.equals(keySetIterator4)", keySetIterator4.equals(keySetIterator4));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        flat3Map0.clear();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator6 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator6.equals(keySetIterator6)", keySetIterator6.equals(keySetIterator6));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet44 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator45 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator45.equals(keySetIterator45)", keySetIterator45.equals(keySetIterator45));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator11 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator11.equals(entrySetIterator11)", entrySetIterator11.equals(entrySetIterator11));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        java.util.Iterator iterator25 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator25.equals(iterator25)", iterator25.equals(iterator25));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        boolean boolean6 = flat3Map0.containsKey((java.lang.Object) 1.0f);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator7 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator7.equals(entrySetIterator7)", entrySetIterator7.equals(entrySetIterator7));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        flat3Map12.clear();
        java.util.Collection collection18 = flat3Map12.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map12);
        boolean boolean20 = flat3Map4.containsValue((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator21 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map12);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator21.equals(keySetIterator21)", keySetIterator21.equals(keySetIterator21));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        int int3 = flat3Map2.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        java.util.Set set10 = flat3Map5.keySet();
        java.lang.Object obj11 = flat3Map2.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map2);
        boolean boolean13 = entrySet1.remove((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator14 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map2);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator14.equals(keySetIterator14)", keySetIterator14.equals(keySetIterator14));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.util.Set set2 = flat3Map0.entrySet();
        java.util.Set set3 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator4 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator4.equals(keySetIterator4)", keySetIterator4.equals(keySetIterator4));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = null;
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator1 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator1.equals(entrySetIterator1)", entrySetIterator1.equals(entrySetIterator1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator3 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        boolean boolean5 = flat3Map0.equals((java.lang.Object) true);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator6 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator6.equals(entrySetIterator6)", entrySetIterator6.equals(entrySetIterator6));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.util.Iterator iterator12 = entrySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator12.equals(iterator12)", iterator12.equals(iterator12));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        int int23 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator25 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator25.equals(valuesIterator25)", valuesIterator25.equals(valuesIterator25));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet14 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map15.clone();
        java.util.Set set17 = flat3Map15.entrySet();
        boolean boolean18 = keySet14.remove((java.lang.Object) flat3Map15);
        int int19 = flat3Map15.size();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        java.lang.Object obj33 = flat3Map21.get((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map21);
        boolean boolean36 = values34.contains((java.lang.Object) 100L);
        java.lang.Object obj37 = flat3Map20.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        int int40 = flat3Map38.size();
        int int41 = flat3Map38.size();
        boolean boolean42 = flat3Map20.containsKey((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        boolean boolean51 = flatMapIterator50.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.lang.Object obj57 = flat3Map43.put((java.lang.Object) flatMapIterator50, (java.lang.Object) flat3Map52);
        java.lang.Object obj58 = flat3Map20.remove((java.lang.Object) flat3Map52);
        boolean boolean59 = values10.contains(obj58);
        org.apache.commons.collections.map.Flat3Map flat3Map60 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator61 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map60);
        java.util.Collection collection62 = flat3Map60.values();
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator64 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map63);
        java.lang.Object obj65 = flat3Map60.remove((java.lang.Object) flat3Map63);
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator67 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map66);
        boolean boolean68 = flatMapIterator67.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj71 = flat3Map69.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet72 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map69);
        java.util.Set set73 = flat3Map69.entrySet();
        java.lang.Object obj74 = flat3Map60.put((java.lang.Object) flatMapIterator67, (java.lang.Object) flat3Map69);
        java.lang.String str75 = flatMapIterator67.toString();
        boolean boolean76 = values10.contains((java.lang.Object) flatMapIterator67);
        int int77 = values10.size();
        java.util.Iterator iterator78 = values10.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator78.equals(iterator78)", iterator78.equals(iterator78));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap14 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator16 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator16.equals(entrySetIterator16)", entrySetIterator16.equals(entrySetIterator16));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map16.get((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        int int31 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        java.util.Set set38 = flat3Map33.keySet();
        java.lang.Object obj39 = flat3Map30.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map33);
        boolean boolean40 = values29.contains((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        int int43 = flat3Map41.size();
        flat3Map33.putAll((java.util.Map) flat3Map41);
        java.lang.Object obj45 = flat3Map6.put((java.lang.Object) flat3Map11, (java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator46 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map11);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator46.equals(valuesIterator46)", valuesIterator46.equals(valuesIterator46));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj8 = flat3Map6.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet9 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map10.clone();
        java.util.Set set12 = flat3Map10.entrySet();
        boolean boolean13 = keySet9.remove((java.lang.Object) flat3Map10);
        java.util.Set set14 = flat3Map10.keySet();
        flat3Map0.putAll((java.util.Map) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator16 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator16.equals(entrySetIterator16)", entrySetIterator16.equals(entrySetIterator16));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Iterator iterator14 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator14.equals(iterator14)", iterator14.equals(iterator14));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator3 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator3.equals(keySetIterator3)", keySetIterator3.equals(keySetIterator3));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet14 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map11);
        java.util.Set set15 = flat3Map11.entrySet();
        boolean boolean16 = values10.contains((java.lang.Object) set15);
        java.util.Iterator iterator17 = values10.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator17.equals(iterator17)", iterator17.equals(iterator17));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator10 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator10.equals(valuesIterator10)", valuesIterator10.equals(valuesIterator10));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator6 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map3);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator6.equals(entrySetIterator6)", entrySetIterator6.equals(entrySetIterator6));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator11 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator11.equals(keySetIterator11)", keySetIterator11.equals(keySetIterator11));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Iterator iterator12 = keySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator12.equals(iterator12)", iterator12.equals(iterator12));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet44 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet45 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator46 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator46.equals(keySetIterator46)", keySetIterator46.equals(keySetIterator46));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        boolean boolean8 = flatMapIterator7.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        java.lang.Object obj14 = flat3Map0.put((java.lang.Object) flatMapIterator7, (java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.util.Collection collection18 = flat3Map16.values();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator20 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map19);
        java.lang.Object obj21 = flat3Map16.remove((java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator23 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map22);
        boolean boolean24 = flatMapIterator23.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map25.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet28 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map25);
        java.util.Set set29 = flat3Map25.entrySet();
        java.lang.Object obj30 = flat3Map16.put((java.lang.Object) flatMapIterator23, (java.lang.Object) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet31 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map25);
        int int32 = entrySet31.size();
        boolean boolean33 = entrySet15.remove((java.lang.Object) entrySet31);
        java.util.Iterator iterator34 = entrySet15.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator34.equals(iterator34)", iterator34.equals(iterator34));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map.Values values32 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map37.clone();
        java.util.Set set39 = flat3Map37.entrySet();
        boolean boolean40 = keySet36.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map41.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map41);
        java.util.Set set45 = flat3Map41.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map46.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet49 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map46);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj51 = flat3Map50.clone();
        java.util.Set set52 = flat3Map50.entrySet();
        boolean boolean53 = keySet49.remove((java.lang.Object) flat3Map50);
        java.util.Set set54 = flat3Map50.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map55 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map55.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet58 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map55);
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj60 = flat3Map59.clone();
        java.util.Set set61 = flat3Map59.entrySet();
        boolean boolean62 = keySet58.remove((java.lang.Object) flat3Map59);
        java.lang.Object obj63 = flat3Map41.put((java.lang.Object) flat3Map50, (java.lang.Object) keySet58);
        boolean boolean64 = keySet36.contains((java.lang.Object) flat3Map41);
        boolean boolean66 = flat3Map41.containsKey((java.lang.Object) 0);
        boolean boolean67 = flat3Map41.isEmpty();
        org.apache.commons.collections.map.Flat3Map.Values values68 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map41);
        boolean boolean69 = flat3Map27.containsValue((java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator70 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map27);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator70.equals(valuesIterator70)", valuesIterator70.equals(valuesIterator70));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        java.util.Set set28 = flat3Map23.keySet();
        java.lang.Object obj30 = flat3Map23.get((java.lang.Object) 10);
        java.lang.Object obj31 = flat3Map0.remove((java.lang.Object) 10);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator32 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator32.equals(valuesIterator32)", valuesIterator32.equals(valuesIterator32));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj4 = flat3Map2.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet5 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map2);
        java.util.Set set6 = flat3Map2.entrySet();
        flat3Map2.clear();
        java.util.Collection collection8 = flat3Map2.values();
        boolean boolean9 = entrySet1.remove((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map19.clone();
        java.util.Set set21 = flat3Map19.entrySet();
        boolean boolean22 = keySet18.remove((java.lang.Object) flat3Map19);
        java.util.Set set23 = flat3Map19.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map28.clone();
        java.util.Set set30 = flat3Map28.entrySet();
        boolean boolean31 = keySet27.remove((java.lang.Object) flat3Map28);
        java.lang.Object obj32 = flat3Map10.put((java.lang.Object) flat3Map19, (java.lang.Object) keySet27);
        boolean boolean34 = flat3Map19.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator35 = flat3Map19.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet37 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map36);
        java.lang.Object obj38 = flat3Map19.remove((java.lang.Object) flat3Map36);
        boolean boolean39 = entrySet1.remove((java.lang.Object) flat3Map19);
        java.lang.String str40 = flat3Map19.toString();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator41 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map19);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator41.equals(keySetIterator41)", keySetIterator41.equals(keySetIterator41));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsValue((java.lang.Object) 0);
        java.util.Set set25 = flat3Map9.entrySet();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator26 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator26.equals(entrySetIterator26)", entrySetIterator26.equals(entrySetIterator26));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator2 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator2.equals(keySetIterator2)", keySetIterator2.equals(keySetIterator2));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map44.clone();
        java.lang.Object obj48 = flat3Map44.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map44);
        flat3Map37.putAll((java.util.Map) flat3Map44);
        org.apache.commons.collections.map.Flat3Map.Values values51 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map44);
        java.util.Iterator iterator52 = values51.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator52.equals(iterator52)", iterator52.equals(iterator52));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator2 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator2.equals(keySetIterator2)", keySetIterator2.equals(keySetIterator2));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap3 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet4 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator5 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator5.equals(entrySetIterator5)", entrySetIterator5.equals(entrySetIterator5));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        java.lang.Object obj32 = flat3Map8.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet34 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map33);
        java.lang.Object obj35 = null;
        boolean boolean36 = entrySet34.remove(obj35);
        int int37 = entrySet34.size();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map47.clone();
        java.util.Set set49 = flat3Map47.entrySet();
        boolean boolean50 = keySet46.remove((java.lang.Object) flat3Map47);
        java.util.Set set51 = flat3Map47.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.lang.Object obj60 = flat3Map38.put((java.lang.Object) flat3Map47, (java.lang.Object) keySet55);
        boolean boolean61 = entrySet34.remove((java.lang.Object) flat3Map47);
        boolean boolean62 = flat3Map8.containsValue((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.Values values63 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map47);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator64 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map47);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator64.equals(keySetIterator64)", keySetIterator64.equals(keySetIterator64));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator32 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator32.equals(entrySetIterator32)", entrySetIterator32.equals(entrySetIterator32));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator11 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map6);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator11.equals(valuesIterator11)", valuesIterator11.equals(valuesIterator11));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Iterator iterator11 = values10.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator11.equals(iterator11)", iterator11.equals(iterator11));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet44 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet46 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map45);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj49 = flat3Map47.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet50 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map47);
        java.util.Set set51 = flat3Map47.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.util.Set set60 = flat3Map56.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj63 = flat3Map61.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet64 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map61);
        org.apache.commons.collections.map.Flat3Map flat3Map65 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj66 = flat3Map65.clone();
        java.util.Set set67 = flat3Map65.entrySet();
        boolean boolean68 = keySet64.remove((java.lang.Object) flat3Map65);
        java.lang.Object obj69 = flat3Map47.put((java.lang.Object) flat3Map56, (java.lang.Object) keySet64);
        org.apache.commons.collections.map.Flat3Map flat3Map70 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator71 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map70);
        java.util.Collection collection72 = flat3Map70.values();
        org.apache.commons.collections.map.Flat3Map flat3Map73 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator74 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map73);
        java.lang.Object obj75 = flat3Map70.remove((java.lang.Object) flat3Map73);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator76 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map73);
        java.lang.Object obj77 = flat3Map47.remove((java.lang.Object) flat3Map73);
        org.apache.commons.collections.map.Flat3Map flat3Map78 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet79 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map78);
        org.apache.commons.collections.map.Flat3Map.Values values80 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map78);
        org.apache.commons.collections.map.Flat3Map flat3Map81 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator82 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map81);
        java.util.Collection collection83 = flat3Map81.values();
        org.apache.commons.collections.map.Flat3Map flat3Map84 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator85 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map84);
        java.lang.Object obj86 = flat3Map81.remove((java.lang.Object) flat3Map84);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator87 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map84);
        flat3Map78.putAll((java.util.Map) flat3Map84);
        org.apache.commons.collections.map.Flat3Map.Values values89 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map84);
        flat3Map47.putAll((java.util.Map) flat3Map84);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet91 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map47);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet92 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map47);
        java.lang.Object obj93 = flat3Map0.put((java.lang.Object) entrySet46, (java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator94 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map47);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator94.equals(keySetIterator94)", keySetIterator94.equals(keySetIterator94));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        int int12 = entrySet11.size();
        java.util.Iterator iterator13 = entrySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator13.equals(iterator13)", iterator13.equals(iterator13));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        int int14 = values13.size();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        int int16 = flat3Map15.size();
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map18.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet21 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map18);
        java.util.Set set22 = flat3Map18.entrySet();
        java.util.Set set23 = flat3Map18.keySet();
        java.lang.Object obj24 = flat3Map15.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map18);
        org.apache.commons.collections.map.Flat3Map.Values values25 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map15);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map15);
        java.util.Collection collection28 = flat3Map27.values();
        org.apache.commons.collections.map.Flat3Map flat3Map29 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator30 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map29);
        java.util.Collection collection31 = flat3Map29.values();
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        java.lang.Object obj34 = flat3Map29.remove((java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        boolean boolean37 = flatMapIterator36.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        java.lang.Object obj43 = flat3Map29.put((java.lang.Object) flatMapIterator36, (java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map38);
        java.lang.Object obj46 = flat3Map27.get((java.lang.Object) flat3Map45);
        boolean boolean47 = values13.contains(obj46);
        java.util.Iterator iterator48 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator48.equals(iterator48)", iterator48.equals(iterator48));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        int int14 = values13.size();
        java.util.Iterator iterator15 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator15.equals(iterator15)", iterator15.equals(iterator15));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet23 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map9);
        boolean boolean24 = flat3Map9.isEmpty();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap25 = flat3Map9.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator26 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator26.equals(valuesIterator26)", valuesIterator26.equals(valuesIterator26));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        int int23 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator25 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator25.equals(entrySetIterator25)", entrySetIterator25.equals(entrySetIterator25));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map16.get((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        int int31 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        java.util.Set set38 = flat3Map33.keySet();
        java.lang.Object obj39 = flat3Map30.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map33);
        boolean boolean40 = values29.contains((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        int int43 = flat3Map41.size();
        flat3Map33.putAll((java.util.Map) flat3Map41);
        java.lang.Object obj45 = flat3Map6.put((java.lang.Object) flat3Map11, (java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator46 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map41);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator46.equals(entrySetIterator46)", entrySetIterator46.equals(entrySetIterator46));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = keySet3.size();
        keySet3.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        java.util.Set set15 = flat3Map10.keySet();
        java.lang.String str16 = flat3Map10.toString();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        flatMapIterator18.reset();
        boolean boolean20 = flatMapIterator18.hasNext();
        java.lang.Class<?> wildcardClass21 = flatMapIterator18.getClass();
        java.lang.Object obj22 = flat3Map10.remove((java.lang.Object) wildcardClass21);
        java.util.Collection collection23 = flat3Map10.values();
        boolean boolean24 = keySet3.remove((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator25 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map10);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator25.equals(valuesIterator25)", valuesIterator25.equals(valuesIterator25));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        java.util.Set set28 = flat3Map23.keySet();
        java.lang.Object obj30 = flat3Map23.get((java.lang.Object) 10);
        java.lang.Object obj31 = flat3Map0.remove((java.lang.Object) 10);
        java.util.Collection collection32 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.util.Iterator iterator34 = entrySet33.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator34.equals(iterator34)", iterator34.equals(iterator34));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        flatMapIterator12.reset();
        java.lang.String str14 = flatMapIterator12.toString();
        flatMapIterator12.reset();
        boolean boolean16 = flat3Map0.containsValue((java.lang.Object) flatMapIterator12);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values19 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.util.Collection collection22 = flat3Map20.values();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.lang.Object obj25 = flat3Map20.remove((java.lang.Object) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        flat3Map17.putAll((java.util.Map) flat3Map23);
        java.lang.Object obj28 = flat3Map0.remove((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator29 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator29.equals(valuesIterator29)", valuesIterator29.equals(valuesIterator29));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map8);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map32);
        java.util.Iterator iterator34 = keySet33.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator34.equals(iterator34)", iterator34.equals(iterator34));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        boolean boolean8 = flatMapIterator7.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        java.lang.Object obj14 = flat3Map0.put((java.lang.Object) flatMapIterator7, (java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.util.Iterator iterator16 = entrySet15.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator16.equals(iterator16)", iterator16.equals(iterator16));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        boolean boolean8 = flatMapIterator7.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        java.lang.Object obj14 = flat3Map0.put((java.lang.Object) flatMapIterator7, (java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map9);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map16.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        int int20 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        java.lang.Object obj31 = flat3Map21.clone();
        java.lang.Object obj32 = flat3Map16.get((java.lang.Object) flat3Map21);
        boolean boolean33 = flat3Map9.containsValue(obj32);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator34 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator34.equals(keySetIterator34)", keySetIterator34.equals(keySetIterator34));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator10 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator10.equals(entrySetIterator10)", entrySetIterator10.equals(entrySetIterator10));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator3 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int4 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map5);
        int int7 = flat3Map5.size();
        int int8 = flat3Map5.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map5);
        java.lang.Object obj10 = flat3Map0.get((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator11 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator11.equals(valuesIterator11)", valuesIterator11.equals(valuesIterator11));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        flat3Map12.clear();
        java.util.Collection collection18 = flat3Map12.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map12);
        boolean boolean20 = flat3Map4.containsValue((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap21 = flat3Map4.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator22 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map4);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator22.equals(keySetIterator22)", keySetIterator22.equals(keySetIterator22));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        int int25 = values13.size();
        java.util.Iterator iterator26 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator26.equals(iterator26)", iterator26.equals(iterator26));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap11 = flat3Map6.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap15 = flat3Map12.createDelegateMap();
        flat3Map6.putAll((java.util.Map) flat3Map12);
        org.apache.commons.collections.MapIterator mapIterator17 = flat3Map6.mapIterator();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator18 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map6);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator18.equals(valuesIterator18)", valuesIterator18.equals(valuesIterator18));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        flat3Map12.clear();
        java.util.Collection collection18 = flat3Map12.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map12);
        boolean boolean20 = flat3Map4.containsValue((java.lang.Object) flat3Map12);
        java.util.Set set21 = flat3Map12.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet23 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map22);
        java.lang.Object obj24 = flat3Map12.get((java.lang.Object) flat3Map22);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator25 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map22);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator25.equals(entrySetIterator25)", entrySetIterator25.equals(entrySetIterator25));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        java.util.Set set3 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet4 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        flat3Map0.putAll((java.util.Map) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator11 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator11.equals(keySetIterator11)", keySetIterator11.equals(keySetIterator11));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int2 = flat3Map0.size();
        int int3 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator4 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator4.equals(keySetIterator4)", keySetIterator4.equals(keySetIterator4));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator25 = flat3Map9.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map9.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap29 = flat3Map26.createDelegateMap();
        org.apache.commons.collections.MapIterator mapIterator30 = flat3Map26.mapIterator();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator31 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map26);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator31.equals(keySetIterator31)", keySetIterator31.equals(keySetIterator31));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map19.clone();
        java.util.Set set21 = flat3Map19.entrySet();
        boolean boolean22 = keySet18.remove((java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj30 = flat3Map28.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet31 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map28);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj33 = flat3Map32.clone();
        java.util.Set set34 = flat3Map32.entrySet();
        boolean boolean35 = keySet31.remove((java.lang.Object) flat3Map32);
        java.util.Set set36 = flat3Map32.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj42 = flat3Map41.clone();
        java.util.Set set43 = flat3Map41.entrySet();
        boolean boolean44 = keySet40.remove((java.lang.Object) flat3Map41);
        java.lang.Object obj45 = flat3Map23.put((java.lang.Object) flat3Map32, (java.lang.Object) keySet40);
        boolean boolean46 = keySet18.contains((java.lang.Object) flat3Map23);
        java.lang.Object obj47 = flat3Map23.clone();
        boolean boolean48 = flat3Map8.containsKey(obj47);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator49 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator49.equals(valuesIterator49)", valuesIterator49.equals(valuesIterator49));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator6 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator6.equals(valuesIterator6)", valuesIterator6.equals(valuesIterator6));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        boolean boolean8 = flatMapIterator7.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        java.lang.Object obj14 = flat3Map0.put((java.lang.Object) flatMapIterator7, (java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator16 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator16.equals(valuesIterator16)", valuesIterator16.equals(valuesIterator16));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator23 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator23.equals(valuesIterator23)", valuesIterator23.equals(valuesIterator23));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection5 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator11 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map10);
        java.lang.Object obj12 = flat3Map7.remove((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        boolean boolean15 = flatMapIterator14.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map16.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet19 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map16);
        java.util.Set set20 = flat3Map16.entrySet();
        java.lang.Object obj21 = flat3Map7.put((java.lang.Object) flatMapIterator14, (java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet22 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map16);
        java.lang.Object obj23 = flat3Map0.remove((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator24 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map16);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator24.equals(keySetIterator24)", keySetIterator24.equals(keySetIterator24));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        int int7 = flat3Map3.size();
        java.lang.Object obj8 = flat3Map0.get((java.lang.Object) int7);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator9 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator9.equals(valuesIterator9)", valuesIterator9.equals(valuesIterator9));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        java.util.Set set28 = flat3Map23.keySet();
        java.lang.Object obj30 = flat3Map23.get((java.lang.Object) 10);
        java.lang.Object obj31 = flat3Map0.remove((java.lang.Object) 10);
        java.util.Collection collection32 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator34 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator34.equals(keySetIterator34)", keySetIterator34.equals(keySetIterator34));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        java.lang.Object obj24 = null;
        boolean boolean25 = flat3Map14.equals(obj24);
        boolean boolean26 = values13.contains(obj24);
        java.util.Iterator iterator27 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator27.equals(iterator27)", iterator27.equals(iterator27));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.MapIterator mapIterator5 = flat3Map0.mapIterator();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator6 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator6.equals(valuesIterator6)", valuesIterator6.equals(valuesIterator6));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        java.lang.Object obj32 = flat3Map8.clone();
        java.util.Collection collection33 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator34 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator34.equals(entrySetIterator34)", entrySetIterator34.equals(entrySetIterator34));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map32);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.util.Collection collection37 = flat3Map35.values();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        java.lang.Object obj40 = flat3Map35.remove((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator41 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        flat3Map32.putAll((java.util.Map) flat3Map38);
        java.util.Set set43 = flat3Map32.keySet();
        boolean boolean44 = flat3Map9.equals((java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj47 = flat3Map45.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet48 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map45);
        java.util.Set set49 = flat3Map45.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map54.clone();
        java.util.Set set56 = flat3Map54.entrySet();
        boolean boolean57 = keySet53.remove((java.lang.Object) flat3Map54);
        java.util.Set set58 = flat3Map54.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj61 = flat3Map59.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet62 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map59);
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj64 = flat3Map63.clone();
        java.util.Set set65 = flat3Map63.entrySet();
        boolean boolean66 = keySet62.remove((java.lang.Object) flat3Map63);
        java.lang.Object obj67 = flat3Map45.put((java.lang.Object) flat3Map54, (java.lang.Object) keySet62);
        org.apache.commons.collections.map.Flat3Map flat3Map68 = new org.apache.commons.collections.map.Flat3Map();
        int int69 = flat3Map68.size();
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj73 = flat3Map71.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet74 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map71);
        java.util.Set set75 = flat3Map71.entrySet();
        java.util.Set set76 = flat3Map71.keySet();
        java.lang.Object obj77 = flat3Map68.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map71);
        org.apache.commons.collections.map.Flat3Map flat3Map78 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet79 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map78);
        java.lang.Object obj80 = flat3Map68.get((java.lang.Object) flat3Map78);
        org.apache.commons.collections.map.Flat3Map.Values values81 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map68);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap82 = flat3Map68.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator83 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map68);
        boolean boolean84 = keySet62.remove((java.lang.Object) flat3Map68);
        boolean boolean85 = flat3Map9.containsKey((java.lang.Object) keySet62);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap86 = flat3Map9.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator87 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator87.equals(entrySetIterator87)", entrySetIterator87.equals(entrySetIterator87));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator32 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        java.util.Collection collection33 = flat3Map31.values();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.lang.Object obj36 = flat3Map31.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.lang.Object obj38 = flat3Map8.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.MapIterator mapIterator39 = flat3Map8.mapIterator();
        java.lang.Object obj40 = flat3Map0.get((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator41 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator41.equals(entrySetIterator41)", entrySetIterator41.equals(entrySetIterator41));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        boolean boolean33 = flat3Map8.containsKey((java.lang.Object) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        int int35 = flat3Map34.size();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        java.util.Set set41 = flat3Map37.entrySet();
        java.util.Set set42 = flat3Map37.keySet();
        java.lang.Object obj43 = flat3Map34.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet45 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map44);
        java.lang.Object obj46 = flat3Map34.get((java.lang.Object) flat3Map44);
        org.apache.commons.collections.map.Flat3Map.Values values47 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map34);
        boolean boolean49 = values47.contains((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        int int51 = flat3Map50.size();
        org.apache.commons.collections.map.Flat3Map flat3Map53 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map53.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet56 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map53);
        java.util.Set set57 = flat3Map53.entrySet();
        java.util.Set set58 = flat3Map53.keySet();
        java.lang.Object obj59 = flat3Map50.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map53);
        boolean boolean60 = values47.contains((java.lang.Object) (byte) -1);
        boolean boolean61 = flat3Map8.containsKey((java.lang.Object) boolean60);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator62 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator62.equals(entrySetIterator62)", entrySetIterator62.equals(entrySetIterator62));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.lang.Object obj2 = null;
        boolean boolean3 = entrySet1.remove(obj2);
        int int4 = entrySet1.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map14.clone();
        java.util.Set set16 = flat3Map14.entrySet();
        boolean boolean17 = keySet13.remove((java.lang.Object) flat3Map14);
        java.util.Set set18 = flat3Map14.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map23.clone();
        java.util.Set set25 = flat3Map23.entrySet();
        boolean boolean26 = keySet22.remove((java.lang.Object) flat3Map23);
        java.lang.Object obj27 = flat3Map5.put((java.lang.Object) flat3Map14, (java.lang.Object) keySet22);
        boolean boolean28 = entrySet1.remove((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        flat3Map30.clear();
        java.util.Collection collection36 = flat3Map30.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        flatMapIterator37.reset();
        flatMapIterator37.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator41 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map40);
        java.lang.String str42 = flatMapIterator41.toString();
        boolean boolean43 = flatMapIterator41.hasNext();
        java.lang.Class<?> wildcardClass44 = flatMapIterator41.getClass();
        java.lang.Object obj45 = flat3Map5.put((java.lang.Object) flatMapIterator37, (java.lang.Object) flatMapIterator41);
        org.apache.commons.collections.map.Flat3Map.Values values46 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map5);
        java.util.Iterator iterator47 = values46.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator47.equals(iterator47)", iterator47.equals(iterator47));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        flat3Map0.clear();
        org.apache.commons.collections.MapIterator mapIterator3 = flat3Map0.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        int int5 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj9 = flat3Map7.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map7);
        java.util.Set set11 = flat3Map7.entrySet();
        java.util.Set set12 = flat3Map7.keySet();
        java.lang.Object obj13 = flat3Map4.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map7);
        org.apache.commons.collections.map.Flat3Map.Values values14 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map4);
        java.util.Collection collection15 = flat3Map4.values();
        flat3Map0.putAll((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        java.util.Collection collection19 = flat3Map17.values();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.lang.Object obj22 = flat3Map17.remove((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator23 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map24);
        java.util.Collection collection26 = flat3Map24.values();
        java.util.Set set27 = flat3Map24.entrySet();
        java.lang.Object obj28 = flat3Map17.get((java.lang.Object) flat3Map24);
        flat3Map24.clear();
        boolean boolean30 = flat3Map4.equals((java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap31 = flat3Map24.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator32 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map24);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator32.equals(valuesIterator32)", valuesIterator32.equals(valuesIterator32));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsKey((java.lang.Object) 10.0d);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator25 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator25.equals(entrySetIterator25)", entrySetIterator25.equals(entrySetIterator25));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        int int12 = flat3Map11.size();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        java.util.Set set18 = flat3Map14.entrySet();
        java.util.Set set19 = flat3Map14.keySet();
        java.lang.Object obj20 = flat3Map11.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet22 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map21);
        java.lang.Object obj23 = flat3Map11.get((java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map.Values values24 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet26 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        int int28 = flat3Map27.size();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        java.util.Set set35 = flat3Map30.keySet();
        java.lang.Object obj36 = flat3Map27.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map30);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        boolean boolean38 = entrySet26.remove((java.lang.Object) flat3Map27);
        java.lang.Object obj39 = flat3Map11.get((java.lang.Object) entrySet26);
        flat3Map11.clear();
        flat3Map0.putAll((java.util.Map) flat3Map11);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator42 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator42.equals(keySetIterator42)", keySetIterator42.equals(keySetIterator42));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        java.util.Set set29 = flat3Map25.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        int int31 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        java.util.Set set38 = flat3Map33.keySet();
        java.lang.Object obj39 = flat3Map30.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet41 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map30);
        java.lang.Object obj42 = flat3Map25.remove((java.lang.Object) flat3Map30);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator43 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map25);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator43.equals(keySetIterator43)", keySetIterator43.equals(keySetIterator43));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        flatMapIterator18.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map20.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet23 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map20);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map24.clone();
        java.util.Set set26 = flat3Map24.entrySet();
        boolean boolean27 = keySet23.remove((java.lang.Object) flat3Map24);
        java.util.Set set28 = flat3Map24.keySet();
        java.lang.Object obj29 = flat3Map8.put((java.lang.Object) flatMapIterator18, (java.lang.Object) set28);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        flat3Map30.clear();
        flat3Map30.clear();
        flat3Map8.putAll((java.util.Map) flat3Map30);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator38 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map30);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator38.equals(valuesIterator38)", valuesIterator38.equals(valuesIterator38));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Iterator iterator12 = keySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator12.equals(iterator12)", iterator12.equals(iterator12));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map4);
        flat3Map4.clear();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator12 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map4);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator12.equals(valuesIterator12)", valuesIterator12.equals(valuesIterator12));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet46 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map45);
        org.apache.commons.collections.map.Flat3Map.Values values47 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map45);
        org.apache.commons.collections.map.Flat3Map flat3Map48 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator49 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map48);
        java.util.Collection collection50 = flat3Map48.values();
        org.apache.commons.collections.map.Flat3Map flat3Map51 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator52 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map51);
        java.lang.Object obj53 = flat3Map48.remove((java.lang.Object) flat3Map51);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator54 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map51);
        flat3Map45.putAll((java.util.Map) flat3Map51);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap56 = flat3Map51.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map57 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj59 = flat3Map57.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap60 = flat3Map57.createDelegateMap();
        flat3Map51.putAll((java.util.Map) flat3Map57);
        boolean boolean62 = keySet44.remove((java.lang.Object) flat3Map57);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator63 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map57);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator63.equals(keySetIterator63)", keySetIterator63.equals(keySetIterator63));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        java.util.Collection collection10 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.util.Collection collection13 = flat3Map11.values();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map14);
        java.lang.Object obj16 = flat3Map11.remove((java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map11);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap19 = flat3Map18.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map20.clone();
        boolean boolean22 = flat3Map18.equals((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map20);
        int int24 = values23.size();
        int int25 = values23.size();
        java.lang.Object obj26 = flat3Map0.remove((java.lang.Object) values23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator28 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator28.equals(keySetIterator28)", keySetIterator28.equals(keySetIterator28));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        java.util.Set set32 = flat3Map27.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator34 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map27);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator34.equals(keySetIterator34)", keySetIterator34.equals(keySetIterator34));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        boolean boolean3 = flat3Map0.isEmpty();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator4 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator4.equals(entrySetIterator4)", entrySetIterator4.equals(entrySetIterator4));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        int int8 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet9 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator10 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator10.equals(valuesIterator10)", valuesIterator10.equals(valuesIterator10));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator12 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator12.equals(valuesIterator12)", valuesIterator12.equals(valuesIterator12));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map16.get((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        int int31 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        java.util.Set set38 = flat3Map33.keySet();
        java.lang.Object obj39 = flat3Map30.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map33);
        boolean boolean40 = values29.contains((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        int int43 = flat3Map41.size();
        flat3Map33.putAll((java.util.Map) flat3Map41);
        java.lang.Object obj45 = flat3Map6.put((java.lang.Object) flat3Map11, (java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map6);
        java.util.Iterator iterator47 = keySet46.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator47.equals(iterator47)", iterator47.equals(iterator47));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Collection collection11 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator12 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator12.equals(keySetIterator12)", keySetIterator12.equals(keySetIterator12));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        java.util.Set set12 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.MapIterator mapIterator22 = flat3Map17.mapIterator();
        java.lang.Object obj23 = flat3Map0.remove((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator25 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map24);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator25.equals(entrySetIterator25)", entrySetIterator25.equals(entrySetIterator25));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        java.util.Set set12 = flat3Map0.entrySet();
        flat3Map0.clear();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator14 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator14.equals(keySetIterator14)", keySetIterator14.equals(keySetIterator14));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        int int13 = flat3Map12.size();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        java.util.Set set19 = flat3Map15.entrySet();
        java.util.Set set20 = flat3Map15.keySet();
        java.lang.Object obj21 = flat3Map12.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map15);
        java.lang.Object obj22 = flat3Map12.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        boolean boolean30 = flat3Map12.equals((java.lang.Object) flat3Map26);
        boolean boolean31 = flat3Map4.equals((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map26);
        int int33 = flat3Map32.size();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map32);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator35 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map32);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator35.equals(keySetIterator35)", keySetIterator35.equals(keySetIterator35));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj31 = flat3Map0.clone();
        java.util.Set set32 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet34 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map33);
        org.apache.commons.collections.map.Flat3Map.Values values35 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map33);
        java.util.Iterator iterator36 = values35.iterator();
        values35.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        int int39 = flat3Map38.size();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map41.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map41);
        java.util.Set set45 = flat3Map41.entrySet();
        java.util.Set set46 = flat3Map41.keySet();
        java.lang.Object obj47 = flat3Map38.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map41);
        java.lang.Object obj48 = flat3Map38.clone();
        boolean boolean49 = values35.contains(obj48);
        boolean boolean50 = flat3Map0.containsValue(obj48);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator51 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator51.equals(entrySetIterator51)", entrySetIterator51.equals(entrySetIterator51));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj3 = flat3Map2.clone();
        java.lang.Object obj6 = flat3Map2.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values7 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map2);
        java.lang.Object obj8 = flat3Map0.get((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator9 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator9.equals(entrySetIterator9)", entrySetIterator9.equals(entrySetIterator9));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map29 = new org.apache.commons.collections.map.Flat3Map();
        int int30 = flat3Map29.size();
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj34 = flat3Map32.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet35 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map32);
        java.util.Set set36 = flat3Map32.entrySet();
        java.util.Set set37 = flat3Map32.keySet();
        java.lang.Object obj38 = flat3Map29.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map29);
        flat3Map17.putAll((java.util.Map) flat3Map29);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator41 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map29);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator41.equals(valuesIterator41)", valuesIterator41.equals(valuesIterator41));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection5 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        int int7 = flat3Map6.size();
        boolean boolean8 = flat3Map0.containsKey((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet9 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map19.clone();
        java.util.Set set21 = flat3Map19.entrySet();
        boolean boolean22 = keySet18.remove((java.lang.Object) flat3Map19);
        java.util.Set set23 = flat3Map19.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map28.clone();
        java.util.Set set30 = flat3Map28.entrySet();
        boolean boolean31 = keySet27.remove((java.lang.Object) flat3Map28);
        java.lang.Object obj32 = flat3Map10.put((java.lang.Object) flat3Map19, (java.lang.Object) keySet27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        java.util.Collection collection35 = flat3Map33.values();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj38 = flat3Map33.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj40 = flat3Map10.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet42 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map41);
        org.apache.commons.collections.map.Flat3Map.Values values43 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map41);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        java.util.Collection collection46 = flat3Map44.values();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator48 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        java.lang.Object obj49 = flat3Map44.remove((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        flat3Map41.putAll((java.util.Map) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.Values values52 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map47);
        flat3Map10.putAll((java.util.Map) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet54 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Iterator iterator56 = keySet55.iterator();
        boolean boolean57 = entrySet9.remove((java.lang.Object) keySet55);
        java.util.Iterator iterator58 = entrySet9.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator58.equals(iterator58)", iterator58.equals(iterator58));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet14 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map15.clone();
        java.util.Set set17 = flat3Map15.entrySet();
        boolean boolean18 = keySet14.remove((java.lang.Object) flat3Map15);
        int int19 = flat3Map15.size();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        java.lang.Object obj33 = flat3Map21.get((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map21);
        boolean boolean36 = values34.contains((java.lang.Object) 100L);
        java.lang.Object obj37 = flat3Map20.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        int int40 = flat3Map38.size();
        int int41 = flat3Map38.size();
        boolean boolean42 = flat3Map20.containsKey((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        boolean boolean51 = flatMapIterator50.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.lang.Object obj57 = flat3Map43.put((java.lang.Object) flatMapIterator50, (java.lang.Object) flat3Map52);
        java.lang.Object obj58 = flat3Map20.remove((java.lang.Object) flat3Map52);
        java.lang.Object obj59 = flat3Map20.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map60 = new org.apache.commons.collections.map.Flat3Map();
        int int61 = flat3Map60.size();
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj65 = flat3Map63.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet66 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map63);
        java.util.Set set67 = flat3Map63.entrySet();
        java.util.Set set68 = flat3Map63.keySet();
        java.lang.Object obj69 = flat3Map60.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map63);
        org.apache.commons.collections.map.Flat3Map flat3Map70 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet71 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map70);
        java.lang.Object obj72 = flat3Map60.get((java.lang.Object) flat3Map70);
        org.apache.commons.collections.map.Flat3Map.Values values73 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map70);
        boolean boolean74 = flat3Map20.equals((java.lang.Object) flat3Map70);
        org.apache.commons.collections.map.Flat3Map flat3Map75 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map20);
        java.lang.Object obj76 = flat3Map0.remove((java.lang.Object) flat3Map75);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator77 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator77.equals(entrySetIterator77)", entrySetIterator77.equals(entrySetIterator77));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        java.util.Set set3 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator4 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator4.equals(keySetIterator4)", keySetIterator4.equals(keySetIterator4));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        flat3Map0.clear();
        java.util.Collection collection6 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        int int9 = flat3Map8.size();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet14 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map11);
        java.util.Set set15 = flat3Map11.entrySet();
        java.util.Set set16 = flat3Map11.keySet();
        java.lang.Object obj17 = flat3Map8.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet19 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map18);
        java.lang.Object obj20 = flat3Map8.get((java.lang.Object) flat3Map18);
        org.apache.commons.collections.map.Flat3Map.Values values21 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        int int23 = flat3Map22.size();
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map25.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet28 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map25);
        java.util.Set set29 = flat3Map25.entrySet();
        java.util.Set set30 = flat3Map25.keySet();
        java.lang.Object obj31 = flat3Map22.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map25);
        boolean boolean32 = values21.contains((java.lang.Object) flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        int int35 = flat3Map33.size();
        flat3Map25.putAll((java.util.Map) flat3Map33);
        flat3Map25.clear();
        boolean boolean38 = flat3Map0.equals((java.lang.Object) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator39 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map25);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator39.equals(entrySetIterator39)", entrySetIterator39.equals(entrySetIterator39));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        flatMapIterator12.reset();
        java.lang.String str14 = flatMapIterator12.toString();
        flatMapIterator12.reset();
        boolean boolean16 = flat3Map0.containsValue((java.lang.Object) flatMapIterator12);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values19 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.util.Collection collection22 = flat3Map20.values();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.lang.Object obj25 = flat3Map20.remove((java.lang.Object) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        flat3Map17.putAll((java.util.Map) flat3Map23);
        java.lang.Object obj28 = flat3Map0.remove((java.lang.Object) flat3Map17);
        java.util.Set set29 = flat3Map17.entrySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap30 = flat3Map17.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        int int32 = flat3Map31.size();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj36 = flat3Map34.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet37 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map34);
        java.util.Set set38 = flat3Map34.entrySet();
        java.util.Set set39 = flat3Map34.keySet();
        java.lang.Object obj40 = flat3Map31.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map.Values values41 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet42 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        java.util.Iterator iterator47 = keySet46.iterator();
        boolean boolean48 = keySet42.remove((java.lang.Object) keySet46);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        int int50 = flat3Map49.size();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.util.Set set57 = flat3Map52.keySet();
        java.lang.Object obj58 = flat3Map49.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map52);
        org.apache.commons.collections.map.Flat3Map.Values values59 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map49);
        boolean boolean60 = keySet42.contains((java.lang.Object) values59);
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj63 = flat3Map61.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet64 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map61);
        java.util.Set set65 = flat3Map61.entrySet();
        java.util.Set set66 = flat3Map61.keySet();
        boolean boolean67 = values59.contains((java.lang.Object) flat3Map61);
        boolean boolean68 = flat3Map17.containsKey((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator69 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator69.equals(entrySetIterator69)", entrySetIterator69.equals(entrySetIterator69));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = null;
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator1 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator1.equals(valuesIterator1)", valuesIterator1.equals(valuesIterator1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map8);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map8);
        int int34 = entrySet33.size();
        java.util.Iterator iterator35 = entrySet33.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator35.equals(iterator35)", iterator35.equals(iterator35));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        flat3Map12.clear();
        java.util.Collection collection18 = flat3Map12.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map12);
        boolean boolean20 = flat3Map4.containsValue((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator21 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map4);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator21.equals(keySetIterator21)", keySetIterator21.equals(keySetIterator21));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        java.util.Set set32 = flat3Map27.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator35 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map27);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator35.equals(keySetIterator35)", keySetIterator35.equals(keySetIterator35));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        boolean boolean8 = flatMapIterator7.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        java.lang.Object obj14 = flat3Map0.put((java.lang.Object) flatMapIterator7, (java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map9);
        int int16 = flat3Map9.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        java.util.Collection collection19 = flat3Map17.values();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.lang.Object obj22 = flat3Map17.remove((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        boolean boolean25 = flatMapIterator24.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj28 = flat3Map26.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map26);
        java.util.Set set30 = flat3Map26.entrySet();
        java.lang.Object obj31 = flat3Map17.put((java.lang.Object) flatMapIterator24, (java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map42 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map42.clone();
        java.util.Set set44 = flat3Map42.entrySet();
        boolean boolean45 = keySet41.remove((java.lang.Object) flat3Map42);
        java.util.Set set46 = flat3Map42.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj49 = flat3Map47.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet50 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map47);
        org.apache.commons.collections.map.Flat3Map flat3Map51 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map51.clone();
        java.util.Set set53 = flat3Map51.entrySet();
        boolean boolean54 = keySet50.remove((java.lang.Object) flat3Map51);
        java.lang.Object obj55 = flat3Map33.put((java.lang.Object) flat3Map42, (java.lang.Object) keySet50);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj58 = flat3Map56.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet59 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map56);
        java.util.Set set60 = flat3Map56.entrySet();
        java.util.Set set61 = flat3Map56.keySet();
        java.lang.Object obj63 = flat3Map56.get((java.lang.Object) 10);
        java.lang.Object obj64 = flat3Map33.remove((java.lang.Object) 10);
        java.util.Collection collection65 = flat3Map33.values();
        java.util.Collection collection66 = flat3Map33.values();
        java.lang.Object obj67 = flat3Map17.get((java.lang.Object) collection66);
        boolean boolean68 = flat3Map9.containsValue(obj67);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator69 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator69.equals(keySetIterator69)", keySetIterator69.equals(keySetIterator69));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        java.util.Collection collection8 = flat3Map7.values();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator9 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map7);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator9.equals(valuesIterator9)", valuesIterator9.equals(valuesIterator9));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        flatMapIterator12.reset();
        java.lang.String str14 = flatMapIterator12.toString();
        flatMapIterator12.reset();
        boolean boolean16 = flat3Map0.containsValue((java.lang.Object) flatMapIterator12);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values19 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.util.Collection collection22 = flat3Map20.values();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.lang.Object obj25 = flat3Map20.remove((java.lang.Object) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        flat3Map17.putAll((java.util.Map) flat3Map23);
        java.lang.Object obj28 = flat3Map0.remove((java.lang.Object) flat3Map17);
        java.util.Set set29 = flat3Map17.entrySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap30 = flat3Map17.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        int int32 = flat3Map31.size();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj36 = flat3Map34.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet37 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map34);
        java.util.Set set38 = flat3Map34.entrySet();
        java.util.Set set39 = flat3Map34.keySet();
        java.lang.Object obj40 = flat3Map31.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map.Values values41 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet42 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        java.util.Iterator iterator47 = keySet46.iterator();
        boolean boolean48 = keySet42.remove((java.lang.Object) keySet46);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        int int50 = flat3Map49.size();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.util.Set set57 = flat3Map52.keySet();
        java.lang.Object obj58 = flat3Map49.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map52);
        org.apache.commons.collections.map.Flat3Map.Values values59 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map49);
        boolean boolean60 = keySet42.contains((java.lang.Object) values59);
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj63 = flat3Map61.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet64 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map61);
        java.util.Set set65 = flat3Map61.entrySet();
        java.util.Set set66 = flat3Map61.keySet();
        boolean boolean67 = values59.contains((java.lang.Object) flat3Map61);
        boolean boolean68 = flat3Map17.containsKey((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj71 = flat3Map69.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet72 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map69);
        org.apache.commons.collections.map.Flat3Map flat3Map73 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj74 = flat3Map73.clone();
        java.util.Set set75 = flat3Map73.entrySet();
        boolean boolean76 = keySet72.remove((java.lang.Object) flat3Map73);
        java.util.Set set77 = flat3Map73.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map78 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set79 = flat3Map78.entrySet();
        boolean boolean80 = flat3Map73.equals((java.lang.Object) set79);
        java.util.Set set81 = flat3Map73.entrySet();
        java.util.Set set82 = flat3Map73.keySet();
        flat3Map61.putAll((java.util.Map) flat3Map73);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator84 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map73);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator84.equals(entrySetIterator84)", entrySetIterator84.equals(entrySetIterator84));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        java.util.Set set3 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values4 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Iterator iterator5 = values4.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj8 = flat3Map6.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet9 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map10.clone();
        java.util.Set set12 = flat3Map10.entrySet();
        boolean boolean13 = keySet9.remove((java.lang.Object) flat3Map10);
        int int14 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map16.get((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map16);
        boolean boolean31 = values29.contains((java.lang.Object) 100L);
        java.lang.Object obj32 = flat3Map15.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        int int35 = flat3Map33.size();
        int int36 = flat3Map33.size();
        boolean boolean37 = flat3Map15.containsKey((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        java.util.Collection collection40 = flat3Map38.values();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        java.lang.Object obj43 = flat3Map38.remove((java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        boolean boolean46 = flatMapIterator45.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj49 = flat3Map47.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet50 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map47);
        java.util.Set set51 = flat3Map47.entrySet();
        java.lang.Object obj52 = flat3Map38.put((java.lang.Object) flatMapIterator45, (java.lang.Object) flat3Map47);
        java.lang.Object obj53 = flat3Map15.remove((java.lang.Object) flat3Map47);
        boolean boolean54 = values4.contains((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator55 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map47);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator55.equals(valuesIterator55)", valuesIterator55.equals(valuesIterator55));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.String str8 = flat3Map0.toString();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator9 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator9.equals(valuesIterator9)", valuesIterator9.equals(valuesIterator9));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map8);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator33 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator33.equals(keySetIterator33)", keySetIterator33.equals(keySetIterator33));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        flat3Map12.clear();
        java.util.Collection collection18 = flat3Map12.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map12);
        boolean boolean20 = flat3Map4.containsValue((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map25.clone();
        java.util.Set set27 = flat3Map25.entrySet();
        boolean boolean28 = keySet24.remove((java.lang.Object) flat3Map25);
        java.util.Set set29 = flat3Map25.keySet();
        org.apache.commons.collections.MapIterator mapIterator30 = flat3Map25.mapIterator();
        boolean boolean31 = flat3Map4.equals((java.lang.Object) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator32 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map4);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator32.equals(entrySetIterator32)", entrySetIterator32.equals(entrySetIterator32));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator3 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int4 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        int int6 = flat3Map5.size();
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        java.util.Set set13 = flat3Map8.keySet();
        java.lang.Object obj14 = flat3Map5.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map8);
        java.lang.Object obj15 = flat3Map5.clone();
        java.lang.Object obj16 = flat3Map0.get((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map5);
        org.apache.commons.collections.MapIterator mapIterator18 = flat3Map5.mapIterator();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator19 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator19.equals(valuesIterator19)", valuesIterator19.equals(valuesIterator19));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        boolean boolean15 = values13.contains((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        boolean boolean26 = values13.contains((java.lang.Object) (byte) -1);
        java.util.Iterator iterator27 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator27.equals(iterator27)", iterator27.equals(iterator27));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        java.util.Set set3 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet4 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        flat3Map0.putAll((java.util.Map) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator11 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator11.equals(keySetIterator11)", keySetIterator11.equals(keySetIterator11));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator25 = flat3Map9.mapIterator();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator26 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator26.equals(valuesIterator26)", valuesIterator26.equals(valuesIterator26));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsValue((java.lang.Object) 0);
        java.util.Set set25 = flat3Map9.entrySet();
        boolean boolean26 = flat3Map9.isEmpty();
        boolean boolean27 = flat3Map9.isEmpty();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator28 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator28.equals(valuesIterator28)", valuesIterator28.equals(valuesIterator28));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        int int11 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map16.clone();
        java.util.Set set18 = flat3Map16.entrySet();
        boolean boolean19 = keySet15.remove((java.lang.Object) flat3Map16);
        java.util.Set set20 = flat3Map16.keySet();
        boolean boolean21 = flat3Map0.containsKey((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.Values values22 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Iterator iterator23 = values22.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator23.equals(iterator23)", iterator23.equals(iterator23));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        java.util.Set set11 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        java.util.Collection collection15 = flat3Map13.values();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.lang.Object obj18 = flat3Map13.remove((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map21);
        java.util.Collection collection23 = flat3Map21.values();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map24);
        java.lang.Object obj26 = flat3Map21.remove((java.lang.Object) flat3Map24);
        boolean boolean27 = flat3Map13.equals((java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj30 = flat3Map28.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        flatMapIterator31.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map37.clone();
        java.util.Set set39 = flat3Map37.entrySet();
        boolean boolean40 = keySet36.remove((java.lang.Object) flat3Map37);
        java.util.Set set41 = flat3Map37.keySet();
        java.lang.Object obj42 = flat3Map21.put((java.lang.Object) flatMapIterator31, (java.lang.Object) set41);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator49 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map54.clone();
        java.util.Set set56 = flat3Map54.entrySet();
        boolean boolean57 = keySet53.remove((java.lang.Object) flat3Map54);
        int int58 = flat3Map54.size();
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map54);
        int int60 = flat3Map54.size();
        java.lang.Object obj61 = flat3Map21.put((java.lang.Object) flatMapIterator49, (java.lang.Object) flat3Map54);
        java.lang.Object obj62 = flat3Map0.remove((java.lang.Object) flat3Map21);
        java.util.Set set63 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values64 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map65 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj67 = flat3Map65.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet68 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map65);
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj70 = flat3Map69.clone();
        java.util.Set set71 = flat3Map69.entrySet();
        boolean boolean72 = keySet68.remove((java.lang.Object) flat3Map69);
        int int73 = flat3Map69.size();
        org.apache.commons.collections.map.Flat3Map flat3Map74 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map69);
        int int75 = flat3Map69.size();
        org.apache.commons.collections.map.Flat3Map flat3Map76 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator77 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map76);
        java.lang.String str78 = flatMapIterator77.toString();
        boolean boolean79 = flat3Map69.containsKey((java.lang.Object) str78);
        org.apache.commons.collections.map.Flat3Map.Values values80 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map69);
        java.lang.Object obj81 = flat3Map0.get((java.lang.Object) flat3Map69);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator82 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator82.equals(entrySetIterator82)", entrySetIterator82.equals(entrySetIterator82));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        java.util.Collection collection34 = flat3Map32.values();
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.lang.Object obj37 = flat3Map32.remove((java.lang.Object) flat3Map35);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        boolean boolean40 = flatMapIterator39.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map41.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map41);
        java.util.Set set45 = flat3Map41.entrySet();
        java.lang.Object obj46 = flat3Map32.put((java.lang.Object) flatMapIterator39, (java.lang.Object) flat3Map41);
        java.lang.Object obj47 = flat3Map9.remove((java.lang.Object) flat3Map41);
        java.lang.Object obj48 = flat3Map9.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        int int50 = flat3Map49.size();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.util.Set set57 = flat3Map52.keySet();
        java.lang.Object obj58 = flat3Map49.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet60 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map59);
        java.lang.Object obj61 = flat3Map49.get((java.lang.Object) flat3Map59);
        org.apache.commons.collections.map.Flat3Map.Values values62 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map59);
        boolean boolean63 = flat3Map9.equals((java.lang.Object) flat3Map59);
        org.apache.commons.collections.map.Flat3Map flat3Map64 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator65 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator65.equals(keySetIterator65)", keySetIterator65.equals(keySetIterator65));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        boolean boolean24 = flat3Map9.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator25 = flat3Map9.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.util.Collection collection28 = flat3Map26.values();
        org.apache.commons.collections.map.Flat3Map flat3Map29 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator30 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map29);
        java.lang.Object obj31 = flat3Map26.remove((java.lang.Object) flat3Map29);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator32 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map26);
        flat3Map9.putAll((java.util.Map) flat3Map33);
        java.lang.Object obj35 = flat3Map9.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map36.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet39 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj41 = flat3Map40.clone();
        java.util.Set set42 = flat3Map40.entrySet();
        boolean boolean43 = keySet39.remove((java.lang.Object) flat3Map40);
        java.util.Set set44 = flat3Map40.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set46 = flat3Map45.entrySet();
        boolean boolean47 = flat3Map40.equals((java.lang.Object) set46);
        org.apache.commons.collections.map.Flat3Map flat3Map48 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj50 = flat3Map48.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet51 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map48);
        java.util.Set set52 = flat3Map48.entrySet();
        flat3Map48.clear();
        java.util.Collection collection54 = flat3Map48.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator55 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map48);
        boolean boolean56 = flat3Map40.containsValue((java.lang.Object) flat3Map48);
        java.util.Set set57 = flat3Map48.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj60 = flat3Map58.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet61 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map58);
        java.util.Set set62 = flat3Map58.entrySet();
        flat3Map58.clear();
        java.util.Collection collection64 = flat3Map58.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator65 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map58);
        flatMapIterator65.reset();
        boolean boolean67 = flat3Map48.containsKey((java.lang.Object) flatMapIterator65);
        java.lang.String str68 = flat3Map48.toString();
        boolean boolean69 = flat3Map9.containsValue((java.lang.Object) flat3Map48);
        java.util.Collection collection70 = flat3Map48.values();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator71 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map48);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator71.equals(keySetIterator71)", keySetIterator71.equals(keySetIterator71));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Collection collection11 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator13 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map12);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator13.equals(entrySetIterator13)", entrySetIterator13.equals(entrySetIterator13));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.MapIterator mapIterator8 = flat3Map0.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj11 = flat3Map9.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet12 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map9);
        java.util.Set set13 = flat3Map9.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.util.Set set22 = flat3Map18.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj28 = flat3Map27.clone();
        java.util.Set set29 = flat3Map27.entrySet();
        boolean boolean30 = keySet26.remove((java.lang.Object) flat3Map27);
        java.lang.Object obj31 = flat3Map9.put((java.lang.Object) flat3Map18, (java.lang.Object) keySet26);
        boolean boolean33 = flat3Map18.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator34 = flat3Map18.mapIterator();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap35 = flat3Map18.createDelegateMap();
        java.lang.Object obj36 = flat3Map0.get((java.lang.Object) flat3Map18);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator37 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map18);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator37.equals(keySetIterator37)", keySetIterator37.equals(keySetIterator37));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        flatMapIterator18.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map20.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet23 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map20);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map24.clone();
        java.util.Set set26 = flat3Map24.entrySet();
        boolean boolean27 = keySet23.remove((java.lang.Object) flat3Map24);
        java.util.Set set28 = flat3Map24.keySet();
        java.lang.Object obj29 = flat3Map8.put((java.lang.Object) flatMapIterator18, (java.lang.Object) set28);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map34.clone();
        java.util.Set set36 = flat3Map34.entrySet();
        boolean boolean37 = keySet33.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map47.clone();
        java.util.Set set49 = flat3Map47.entrySet();
        boolean boolean50 = keySet46.remove((java.lang.Object) flat3Map47);
        java.util.Set set51 = flat3Map47.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.lang.Object obj60 = flat3Map38.put((java.lang.Object) flat3Map47, (java.lang.Object) keySet55);
        boolean boolean61 = keySet33.contains((java.lang.Object) flat3Map38);
        boolean boolean63 = flat3Map38.containsKey((java.lang.Object) 0);
        boolean boolean64 = flat3Map38.isEmpty();
        flat3Map8.putAll((java.util.Map) flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj68 = flat3Map66.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap69 = flat3Map66.createDelegateMap();
        flat3Map8.putAll((java.util.Map) abstractHashedMap69);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet71 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Iterator iterator72 = keySet71.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator72.equals(iterator72)", iterator72.equals(iterator72));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator6 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator6.equals(valuesIterator6)", valuesIterator6.equals(valuesIterator6));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.lang.Object obj2 = null;
        boolean boolean3 = entrySet1.remove(obj2);
        int int4 = entrySet1.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map14.clone();
        java.util.Set set16 = flat3Map14.entrySet();
        boolean boolean17 = keySet13.remove((java.lang.Object) flat3Map14);
        java.util.Set set18 = flat3Map14.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map23.clone();
        java.util.Set set25 = flat3Map23.entrySet();
        boolean boolean26 = keySet22.remove((java.lang.Object) flat3Map23);
        java.lang.Object obj27 = flat3Map5.put((java.lang.Object) flat3Map14, (java.lang.Object) keySet22);
        boolean boolean28 = entrySet1.remove((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator29 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator29.equals(entrySetIterator29)", entrySetIterator29.equals(entrySetIterator29));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        java.util.Set set11 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        java.util.Collection collection15 = flat3Map13.values();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.lang.Object obj18 = flat3Map13.remove((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map21);
        java.util.Collection collection23 = flat3Map21.values();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map24);
        java.lang.Object obj26 = flat3Map21.remove((java.lang.Object) flat3Map24);
        boolean boolean27 = flat3Map13.equals((java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj30 = flat3Map28.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        flatMapIterator31.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map37.clone();
        java.util.Set set39 = flat3Map37.entrySet();
        boolean boolean40 = keySet36.remove((java.lang.Object) flat3Map37);
        java.util.Set set41 = flat3Map37.keySet();
        java.lang.Object obj42 = flat3Map21.put((java.lang.Object) flatMapIterator31, (java.lang.Object) set41);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator49 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map54.clone();
        java.util.Set set56 = flat3Map54.entrySet();
        boolean boolean57 = keySet53.remove((java.lang.Object) flat3Map54);
        int int58 = flat3Map54.size();
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map54);
        int int60 = flat3Map54.size();
        java.lang.Object obj61 = flat3Map21.put((java.lang.Object) flatMapIterator49, (java.lang.Object) flat3Map54);
        java.lang.Object obj62 = flat3Map0.remove((java.lang.Object) flat3Map21);
        java.util.Set set63 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values64 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map65 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj67 = flat3Map65.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet68 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map65);
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj70 = flat3Map69.clone();
        java.util.Set set71 = flat3Map69.entrySet();
        boolean boolean72 = keySet68.remove((java.lang.Object) flat3Map69);
        int int73 = flat3Map69.size();
        org.apache.commons.collections.map.Flat3Map flat3Map74 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map69);
        int int75 = flat3Map69.size();
        org.apache.commons.collections.map.Flat3Map flat3Map76 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator77 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map76);
        java.lang.String str78 = flatMapIterator77.toString();
        boolean boolean79 = flat3Map69.containsKey((java.lang.Object) str78);
        org.apache.commons.collections.map.Flat3Map.Values values80 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map69);
        java.lang.Object obj81 = flat3Map0.get((java.lang.Object) flat3Map69);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator82 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator82.equals(valuesIterator82)", valuesIterator82.equals(valuesIterator82));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap11 = flat3Map6.createDelegateMap();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = flat3Map6.remove(obj12);
        java.util.Collection collection14 = flat3Map6.values();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator15 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map6);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator15.equals(entrySetIterator15)", entrySetIterator15.equals(entrySetIterator15));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        int int10 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.String str13 = flatMapIterator12.toString();
        boolean boolean14 = flat3Map4.containsKey((java.lang.Object) str13);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap19 = flat3Map15.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        java.util.Set set25 = flat3Map21.entrySet();
        java.util.Set set26 = flat3Map21.keySet();
        java.lang.Object obj28 = flat3Map21.get((java.lang.Object) 10);
        java.lang.Object obj30 = flat3Map21.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values31 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        flatMapIterator33.reset();
        java.lang.String str35 = flatMapIterator33.toString();
        flatMapIterator33.reset();
        boolean boolean37 = flat3Map21.containsValue((java.lang.Object) flatMapIterator33);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map47.clone();
        java.util.Set set49 = flat3Map47.entrySet();
        boolean boolean50 = keySet46.remove((java.lang.Object) flat3Map47);
        java.util.Set set51 = flat3Map47.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.lang.Object obj60 = flat3Map38.put((java.lang.Object) flat3Map47, (java.lang.Object) keySet55);
        boolean boolean62 = flat3Map47.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator63 = flat3Map47.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map64 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator65 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map64);
        java.util.Collection collection66 = flat3Map64.values();
        org.apache.commons.collections.map.Flat3Map flat3Map67 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator68 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map67);
        java.lang.Object obj69 = flat3Map64.remove((java.lang.Object) flat3Map67);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator70 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map64);
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map64);
        flat3Map47.putAll((java.util.Map) flat3Map71);
        flat3Map21.putAll((java.util.Map) flat3Map71);
        org.apache.commons.collections.MapIterator mapIterator74 = flat3Map71.mapIterator();
        java.lang.Object obj75 = flat3Map4.put((java.lang.Object) keySet20, (java.lang.Object) flat3Map71);
        org.apache.commons.collections.map.Flat3Map flat3Map76 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj78 = flat3Map76.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet79 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map76);
        java.util.Set set80 = flat3Map76.entrySet();
        java.util.Set set81 = flat3Map76.keySet();
        java.lang.Object obj83 = flat3Map76.get((java.lang.Object) 10);
        int int84 = flat3Map76.size();
        org.apache.commons.collections.map.Flat3Map flat3Map85 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator86 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map85);
        flatMapIterator86.reset();
        boolean boolean88 = flatMapIterator86.hasNext();
        java.lang.Object obj89 = flat3Map76.remove((java.lang.Object) boolean88);
        boolean boolean90 = flat3Map76.isEmpty();
        flat3Map4.putAll((java.util.Map) flat3Map76);
        java.util.Collection collection92 = flat3Map76.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator93 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map76);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator94 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map76);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator94.equals(keySetIterator94)", keySetIterator94.equals(keySetIterator94));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj4 = flat3Map2.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet5 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map2);
        java.util.Set set6 = flat3Map2.entrySet();
        flat3Map2.clear();
        java.util.Collection collection8 = flat3Map2.values();
        boolean boolean9 = entrySet1.remove((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator10 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map2);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator10.equals(keySetIterator10)", keySetIterator10.equals(keySetIterator10));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Iterator iterator16 = keySet15.iterator();
        boolean boolean17 = keySet11.remove((java.lang.Object) keySet15);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        boolean boolean20 = keySet11.contains(obj19);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map25.clone();
        java.util.Set set27 = flat3Map25.entrySet();
        boolean boolean28 = keySet24.remove((java.lang.Object) flat3Map25);
        java.util.Set set29 = flat3Map25.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set31 = flat3Map30.entrySet();
        boolean boolean32 = flat3Map25.equals((java.lang.Object) set31);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        flat3Map33.clear();
        java.util.Collection collection39 = flat3Map33.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        boolean boolean41 = flat3Map25.containsValue((java.lang.Object) flat3Map33);
        java.util.Set set42 = flat3Map33.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        java.util.Set set47 = flat3Map43.entrySet();
        flat3Map43.clear();
        java.util.Collection collection49 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        flatMapIterator50.reset();
        boolean boolean52 = flat3Map33.containsKey((java.lang.Object) flatMapIterator50);
        java.lang.String str53 = flat3Map33.toString();
        boolean boolean54 = keySet11.remove((java.lang.Object) str53);
        java.util.Iterator iterator55 = keySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator55.equals(iterator55)", iterator55.equals(iterator55));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        int int11 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map16.clone();
        java.util.Set set18 = flat3Map16.entrySet();
        boolean boolean19 = keySet15.remove((java.lang.Object) flat3Map16);
        java.util.Set set20 = flat3Map16.keySet();
        boolean boolean21 = flat3Map0.containsKey((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator22 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map16);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator22.equals(valuesIterator22)", valuesIterator22.equals(valuesIterator22));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        int int11 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map16.clone();
        java.util.Set set18 = flat3Map16.entrySet();
        boolean boolean19 = keySet15.remove((java.lang.Object) flat3Map16);
        java.util.Set set20 = flat3Map16.keySet();
        boolean boolean21 = flat3Map0.containsKey((java.lang.Object) flat3Map16);
        int int22 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator23 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator23.equals(valuesIterator23)", valuesIterator23.equals(valuesIterator23));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set1 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet2 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator3 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator4 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator4.equals(entrySetIterator4)", entrySetIterator4.equals(entrySetIterator4));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        java.util.Set set31 = flat3Map26.entrySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator32 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map26);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator32.equals(keySetIterator32)", keySetIterator32.equals(keySetIterator32));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        boolean boolean11 = flat3Map7.equals((java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap14 = flat3Map9.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator15 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator15.equals(keySetIterator15)", keySetIterator15.equals(keySetIterator15));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        boolean boolean11 = flat3Map7.equals((java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map9);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator13 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator13.equals(entrySetIterator13)", entrySetIterator13.equals(entrySetIterator13));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        flat3Map17.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj36 = flat3Map34.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        int int38 = flat3Map34.size();
        java.lang.Object obj39 = flat3Map31.get((java.lang.Object) int38);
        org.apache.commons.collections.MapIterator mapIterator40 = flat3Map31.mapIterator();
        boolean boolean41 = flat3Map17.containsValue((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator42 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator42.equals(valuesIterator42)", valuesIterator42.equals(valuesIterator42));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj3 = flat3Map2.clone();
        java.lang.Object obj6 = flat3Map2.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values7 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map2);
        java.lang.Object obj8 = flat3Map0.get((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator9 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map2);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator9.equals(keySetIterator9)", keySetIterator9.equals(keySetIterator9));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        java.util.Set set44 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator45 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator45.equals(keySetIterator45)", keySetIterator45.equals(keySetIterator45));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap14 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap16 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        java.util.Collection collection19 = flat3Map17.values();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.lang.Object obj22 = flat3Map17.remove((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator23 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        java.util.Collection collection27 = flat3Map25.values();
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        java.lang.Object obj30 = flat3Map25.remove((java.lang.Object) flat3Map28);
        boolean boolean31 = flat3Map17.equals((java.lang.Object) flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj34 = flat3Map32.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        flatMapIterator35.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj42 = flat3Map41.clone();
        java.util.Set set43 = flat3Map41.entrySet();
        boolean boolean44 = keySet40.remove((java.lang.Object) flat3Map41);
        java.util.Set set45 = flat3Map41.keySet();
        java.lang.Object obj46 = flat3Map25.put((java.lang.Object) flatMapIterator35, (java.lang.Object) set45);
        org.apache.commons.collections.map.Flat3Map.Values values47 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map25);
        org.apache.commons.collections.MapIterator mapIterator48 = flat3Map25.mapIterator();
        flat3Map0.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator50 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map25);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator50.equals(entrySetIterator50)", entrySetIterator50.equals(entrySetIterator50));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Iterator iterator4 = keySet3.iterator();
        int int5 = keySet3.size();
        java.util.Iterator iterator6 = keySet3.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        int int8 = flat3Map7.size();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        java.util.Set set15 = flat3Map10.keySet();
        java.lang.Object obj16 = flat3Map7.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        java.lang.Object obj19 = flat3Map7.get((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values20 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        boolean boolean31 = values20.contains((java.lang.Object) flat3Map24);
        org.apache.commons.collections.MapIterator mapIterator32 = flat3Map24.mapIterator();
        boolean boolean33 = keySet3.contains((java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet34 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator35 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map24);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator35.equals(keySetIterator35)", keySetIterator35.equals(keySetIterator35));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.String str6 = flat3Map0.toString();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator11 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map10);
        java.lang.Object obj12 = flat3Map7.remove((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator13 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map7);
        java.util.Collection collection15 = flat3Map14.values();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.util.Collection collection18 = flat3Map16.values();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator20 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map19);
        java.lang.Object obj21 = flat3Map16.remove((java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map16);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap24 = flat3Map23.createDelegateMap();
        flat3Map14.putAll((java.util.Map) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        boolean boolean27 = flat3Map0.containsValue((java.lang.Object) flat3Map23);
        java.lang.Object obj28 = flat3Map0.clone();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator29 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator29.equals(keySetIterator29)", keySetIterator29.equals(keySetIterator29));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map.Values values32 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map27);
        java.lang.String str34 = flat3Map33.toString();
        java.lang.Object obj35 = null;
        boolean boolean36 = flat3Map33.containsKey(obj35);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        java.util.Set set41 = flat3Map37.entrySet();
        java.util.Set set42 = flat3Map37.keySet();
        java.lang.Object obj44 = flat3Map37.get((java.lang.Object) 10);
        int int45 = flat3Map37.size();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        flatMapIterator47.reset();
        boolean boolean49 = flatMapIterator47.hasNext();
        java.lang.Object obj50 = flat3Map37.remove((java.lang.Object) boolean49);
        boolean boolean51 = flat3Map37.isEmpty();
        java.lang.Object obj52 = flat3Map37.clone();
        boolean boolean53 = flat3Map33.equals((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap54 = flat3Map37.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator55 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map37);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator55.equals(keySetIterator55)", keySetIterator55.equals(keySetIterator55));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        java.util.Set set11 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        java.util.Collection collection15 = flat3Map13.values();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.lang.Object obj18 = flat3Map13.remove((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map21);
        java.util.Collection collection23 = flat3Map21.values();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map24);
        java.lang.Object obj26 = flat3Map21.remove((java.lang.Object) flat3Map24);
        boolean boolean27 = flat3Map13.equals((java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj30 = flat3Map28.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        flatMapIterator31.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map37.clone();
        java.util.Set set39 = flat3Map37.entrySet();
        boolean boolean40 = keySet36.remove((java.lang.Object) flat3Map37);
        java.util.Set set41 = flat3Map37.keySet();
        java.lang.Object obj42 = flat3Map21.put((java.lang.Object) flatMapIterator31, (java.lang.Object) set41);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator49 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map54.clone();
        java.util.Set set56 = flat3Map54.entrySet();
        boolean boolean57 = keySet53.remove((java.lang.Object) flat3Map54);
        int int58 = flat3Map54.size();
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map54);
        int int60 = flat3Map54.size();
        java.lang.Object obj61 = flat3Map21.put((java.lang.Object) flatMapIterator49, (java.lang.Object) flat3Map54);
        java.lang.Object obj62 = flat3Map0.remove((java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator63 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator63.equals(keySetIterator63)", keySetIterator63.equals(keySetIterator63));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj4 = flat3Map2.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet5 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map2);
        java.util.Set set6 = flat3Map2.entrySet();
        flat3Map2.clear();
        java.util.Collection collection8 = flat3Map2.values();
        boolean boolean9 = entrySet1.remove((java.lang.Object) flat3Map2);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map2);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator11 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map2);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator11.equals(keySetIterator11)", keySetIterator11.equals(keySetIterator11));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        java.util.Set set31 = flat3Map26.entrySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap32 = flat3Map26.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator33 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map26);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator33.equals(keySetIterator33)", keySetIterator33.equals(keySetIterator33));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator11 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator11.equals(entrySetIterator11)", entrySetIterator11.equals(entrySetIterator11));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        java.util.Set set3 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        int int5 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj9 = flat3Map7.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet10 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map7);
        java.util.Set set11 = flat3Map7.entrySet();
        java.util.Set set12 = flat3Map7.keySet();
        java.lang.Object obj13 = flat3Map4.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet15 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map14);
        java.lang.Object obj16 = flat3Map4.get((java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map.Values values17 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map4);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap18 = flat3Map4.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map4);
        java.lang.Object obj20 = flatMapIterator19.next();
        java.lang.String str21 = flatMapIterator19.toString();
        java.lang.Object obj22 = flatMapIterator19.getKey();
        flatMapIterator19.reset();
        boolean boolean24 = flat3Map0.equals((java.lang.Object) flatMapIterator19);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator25 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator25.equals(keySetIterator25)", keySetIterator25.equals(keySetIterator25));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        int int10 = flat3Map4.size();
        boolean boolean11 = flat3Map4.isEmpty();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator12 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map4);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator12.equals(valuesIterator12)", valuesIterator12.equals(valuesIterator12));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        flat3Map0.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator5 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator5.equals(keySetIterator5)", keySetIterator5.equals(keySetIterator5));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator9 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map7);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator9.equals(keySetIterator9)", keySetIterator9.equals(keySetIterator9));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        java.util.Set set12 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map13);
        flat3Map13.clear();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator16 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map13);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator16.equals(keySetIterator16)", keySetIterator16.equals(keySetIterator16));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator12 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator12.equals(entrySetIterator12)", entrySetIterator12.equals(entrySetIterator12));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        java.util.Set set8 = flat3Map4.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set10 = flat3Map9.entrySet();
        boolean boolean11 = flat3Map4.equals((java.lang.Object) set10);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        int int13 = flat3Map12.size();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        java.util.Set set19 = flat3Map15.entrySet();
        java.util.Set set20 = flat3Map15.keySet();
        java.lang.Object obj21 = flat3Map12.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map15);
        java.lang.Object obj22 = flat3Map12.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        boolean boolean30 = flat3Map12.equals((java.lang.Object) flat3Map26);
        boolean boolean31 = flat3Map4.equals((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map26);
        int int33 = flat3Map32.size();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator34 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map32);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator34.equals(entrySetIterator34)", entrySetIterator34.equals(entrySetIterator34));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        boolean boolean11 = flat3Map0.containsValue((java.lang.Object) "Iterator[]");
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap12 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet13 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values14 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Iterator iterator15 = values14.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator15.equals(iterator15)", iterator15.equals(iterator15));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator32 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator32.equals(keySetIterator32)", keySetIterator32.equals(keySetIterator32));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet14 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map15.clone();
        java.util.Set set17 = flat3Map15.entrySet();
        boolean boolean18 = keySet14.remove((java.lang.Object) flat3Map15);
        int int19 = flat3Map15.size();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        java.lang.Object obj33 = flat3Map21.get((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map21);
        boolean boolean36 = values34.contains((java.lang.Object) 100L);
        java.lang.Object obj37 = flat3Map20.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        int int40 = flat3Map38.size();
        int int41 = flat3Map38.size();
        boolean boolean42 = flat3Map20.containsKey((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map43);
        java.util.Collection collection45 = flat3Map43.values();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.lang.Object obj48 = flat3Map43.remove((java.lang.Object) flat3Map46);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        boolean boolean51 = flatMapIterator50.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.lang.Object obj57 = flat3Map43.put((java.lang.Object) flatMapIterator50, (java.lang.Object) flat3Map52);
        java.lang.Object obj58 = flat3Map20.remove((java.lang.Object) flat3Map52);
        java.lang.Object obj59 = flat3Map20.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map60 = new org.apache.commons.collections.map.Flat3Map();
        int int61 = flat3Map60.size();
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj65 = flat3Map63.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet66 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map63);
        java.util.Set set67 = flat3Map63.entrySet();
        java.util.Set set68 = flat3Map63.keySet();
        java.lang.Object obj69 = flat3Map60.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map63);
        org.apache.commons.collections.map.Flat3Map flat3Map70 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet71 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map70);
        java.lang.Object obj72 = flat3Map60.get((java.lang.Object) flat3Map70);
        org.apache.commons.collections.map.Flat3Map.Values values73 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map70);
        boolean boolean74 = flat3Map20.equals((java.lang.Object) flat3Map70);
        org.apache.commons.collections.map.Flat3Map flat3Map75 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map20);
        java.lang.Object obj76 = flat3Map0.remove((java.lang.Object) flat3Map75);
        org.apache.commons.collections.MapIterator mapIterator77 = flat3Map0.mapIterator();
        java.util.Set set78 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator79 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator80 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator80.equals(keySetIterator80)", keySetIterator80.equals(keySetIterator80));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet31 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map30);
        org.apache.commons.collections.map.Flat3Map.Values values32 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        java.util.Collection collection35 = flat3Map33.values();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj38 = flat3Map33.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        flat3Map30.putAll((java.util.Map) flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map30);
        java.lang.Object obj42 = flat3Map17.get((java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator43 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator43.equals(valuesIterator43)", valuesIterator43.equals(valuesIterator43));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        java.util.Collection collection34 = flat3Map32.values();
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.lang.Object obj37 = flat3Map32.remove((java.lang.Object) flat3Map35);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        boolean boolean40 = flatMapIterator39.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map41.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map41);
        java.util.Set set45 = flat3Map41.entrySet();
        java.lang.Object obj46 = flat3Map32.put((java.lang.Object) flatMapIterator39, (java.lang.Object) flat3Map41);
        java.lang.Object obj47 = flat3Map9.remove((java.lang.Object) flat3Map41);
        java.lang.Object obj48 = flat3Map9.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        int int50 = flat3Map49.size();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Set set56 = flat3Map52.entrySet();
        java.util.Set set57 = flat3Map52.keySet();
        java.lang.Object obj58 = flat3Map49.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet60 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map59);
        java.lang.Object obj61 = flat3Map49.get((java.lang.Object) flat3Map59);
        org.apache.commons.collections.map.Flat3Map.Values values62 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map59);
        boolean boolean63 = flat3Map9.equals((java.lang.Object) flat3Map59);
        java.util.Set set64 = flat3Map59.entrySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap65 = flat3Map59.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map59);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator67 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map66);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator67.equals(valuesIterator67)", valuesIterator67.equals(valuesIterator67));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map19.clone();
        java.util.Set set21 = flat3Map19.entrySet();
        boolean boolean22 = keySet18.remove((java.lang.Object) flat3Map19);
        java.util.Set set23 = flat3Map19.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map28.clone();
        java.util.Set set30 = flat3Map28.entrySet();
        boolean boolean31 = keySet27.remove((java.lang.Object) flat3Map28);
        java.lang.Object obj32 = flat3Map10.put((java.lang.Object) flat3Map19, (java.lang.Object) keySet27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        java.util.Collection collection35 = flat3Map33.values();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj38 = flat3Map33.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj40 = flat3Map10.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet42 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map41);
        org.apache.commons.collections.map.Flat3Map.Values values43 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map41);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        java.util.Collection collection46 = flat3Map44.values();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator48 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        java.lang.Object obj49 = flat3Map44.remove((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        flat3Map41.putAll((java.util.Map) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.Values values52 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map47);
        flat3Map10.putAll((java.util.Map) flat3Map47);
        java.lang.Object obj54 = flat3Map7.put((java.lang.Object) 10, (java.lang.Object) flat3Map47);
        java.lang.Object obj55 = flat3Map7.clone();
        java.lang.Object obj56 = null;
        boolean boolean57 = flat3Map7.equals(obj56);
        boolean boolean58 = flat3Map7.isEmpty();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator59 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map7);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator59.equals(keySetIterator59)", keySetIterator59.equals(keySetIterator59));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj13 = flat3Map11.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator15 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        int int17 = flat3Map16.size();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        java.util.Set set23 = flat3Map19.entrySet();
        java.util.Set set24 = flat3Map19.keySet();
        java.lang.Object obj25 = flat3Map16.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet27 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map26);
        java.lang.Object obj28 = flat3Map16.get((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        int int31 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map33.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet36 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map33);
        java.util.Set set37 = flat3Map33.entrySet();
        java.util.Set set38 = flat3Map33.keySet();
        java.lang.Object obj39 = flat3Map30.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map33);
        boolean boolean40 = values29.contains((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        int int43 = flat3Map41.size();
        flat3Map33.putAll((java.util.Map) flat3Map41);
        java.lang.Object obj45 = flat3Map6.put((java.lang.Object) flat3Map11, (java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map6);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator47 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map6);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator47.equals(entrySetIterator47)", entrySetIterator47.equals(entrySetIterator47));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        boolean boolean11 = flat3Map7.equals((java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map14);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet25 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map14);
        boolean boolean26 = flat3Map9.equals((java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map9);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map27);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator30 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map27);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator30.equals(keySetIterator30)", keySetIterator30.equals(keySetIterator30));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        flatMapIterator18.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map20.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet23 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map20);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map24.clone();
        java.util.Set set26 = flat3Map24.entrySet();
        boolean boolean27 = keySet23.remove((java.lang.Object) flat3Map24);
        java.util.Set set28 = flat3Map24.keySet();
        java.lang.Object obj29 = flat3Map8.put((java.lang.Object) flatMapIterator18, (java.lang.Object) set28);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map34.clone();
        java.util.Set set36 = flat3Map34.entrySet();
        boolean boolean37 = keySet33.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map47.clone();
        java.util.Set set49 = flat3Map47.entrySet();
        boolean boolean50 = keySet46.remove((java.lang.Object) flat3Map47);
        java.util.Set set51 = flat3Map47.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.lang.Object obj60 = flat3Map38.put((java.lang.Object) flat3Map47, (java.lang.Object) keySet55);
        boolean boolean61 = keySet33.contains((java.lang.Object) flat3Map38);
        boolean boolean63 = flat3Map38.containsKey((java.lang.Object) 0);
        boolean boolean64 = flat3Map38.isEmpty();
        flat3Map8.putAll((java.util.Map) flat3Map38);
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj68 = flat3Map66.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap69 = flat3Map66.createDelegateMap();
        flat3Map8.putAll((java.util.Map) abstractHashedMap69);
        java.lang.String str71 = flat3Map8.toString();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator72 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator72.equals(valuesIterator72)", valuesIterator72.equals(valuesIterator72));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection5 = flat3Map0.values();
        java.util.Set set6 = flat3Map0.keySet();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator7 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator7.equals(entrySetIterator7)", entrySetIterator7.equals(entrySetIterator7));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.lang.Object obj2 = null;
        boolean boolean3 = entrySet1.remove(obj2);
        int int4 = entrySet1.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map14.clone();
        java.util.Set set16 = flat3Map14.entrySet();
        boolean boolean17 = keySet13.remove((java.lang.Object) flat3Map14);
        java.util.Set set18 = flat3Map14.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map23.clone();
        java.util.Set set25 = flat3Map23.entrySet();
        boolean boolean26 = keySet22.remove((java.lang.Object) flat3Map23);
        java.lang.Object obj27 = flat3Map5.put((java.lang.Object) flat3Map14, (java.lang.Object) keySet22);
        boolean boolean28 = entrySet1.remove((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.Values values29 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map5);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator30 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator30.equals(valuesIterator30)", valuesIterator30.equals(valuesIterator30));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Iterator iterator4 = keySet3.iterator();
        int int5 = keySet3.size();
        java.util.Iterator iterator6 = keySet3.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        int int8 = flat3Map7.size();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        java.util.Set set15 = flat3Map10.keySet();
        java.lang.Object obj16 = flat3Map7.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        java.lang.Object obj19 = flat3Map7.get((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values20 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        int int22 = flat3Map21.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        java.util.Set set29 = flat3Map24.keySet();
        java.lang.Object obj30 = flat3Map21.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map24);
        boolean boolean31 = values20.contains((java.lang.Object) flat3Map24);
        org.apache.commons.collections.MapIterator mapIterator32 = flat3Map24.mapIterator();
        boolean boolean33 = keySet3.contains((java.lang.Object) flat3Map24);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet34 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet36 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map35);
        org.apache.commons.collections.map.Flat3Map.Values values37 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map35);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        java.util.Collection collection40 = flat3Map38.values();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator42 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        java.lang.Object obj43 = flat3Map38.remove((java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator44 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        flat3Map35.putAll((java.util.Map) flat3Map41);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap46 = flat3Map41.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj49 = flat3Map47.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap50 = flat3Map47.createDelegateMap();
        flat3Map41.putAll((java.util.Map) flat3Map47);
        flat3Map47.clear();
        flat3Map24.putAll((java.util.Map) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator54 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map24);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator54.equals(keySetIterator54)", keySetIterator54.equals(keySetIterator54));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        java.lang.Object obj32 = flat3Map8.clone();
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        int int35 = flat3Map34.size();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        java.util.Set set41 = flat3Map37.entrySet();
        java.util.Set set42 = flat3Map37.keySet();
        java.lang.Object obj43 = flat3Map34.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet45 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map44);
        java.lang.Object obj46 = flat3Map34.get((java.lang.Object) flat3Map44);
        java.util.Set set47 = flat3Map44.keySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap48 = flat3Map44.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map44);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        boolean boolean51 = flat3Map8.containsKey((java.lang.Object) flat3Map49);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator52 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map49);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator52.equals(keySetIterator52)", keySetIterator52.equals(keySetIterator52));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set1 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator2 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator2.equals(valuesIterator2)", valuesIterator2.equals(valuesIterator2));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        flat3Map0.clear();
        java.util.Collection collection6 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator8 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator8.equals(keySetIterator8)", keySetIterator8.equals(keySetIterator8));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator32 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map26);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator32.equals(keySetIterator32)", keySetIterator32.equals(keySetIterator32));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int2 = flat3Map0.size();
        int int3 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map14.clone();
        java.util.Set set16 = flat3Map14.entrySet();
        boolean boolean17 = keySet13.remove((java.lang.Object) flat3Map14);
        java.util.Set set18 = flat3Map14.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map23.clone();
        java.util.Set set25 = flat3Map23.entrySet();
        boolean boolean26 = keySet22.remove((java.lang.Object) flat3Map23);
        java.lang.Object obj27 = flat3Map5.put((java.lang.Object) flat3Map14, (java.lang.Object) keySet22);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj30 = flat3Map28.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet31 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map28);
        java.util.Set set32 = flat3Map28.entrySet();
        java.util.Set set33 = flat3Map28.keySet();
        java.lang.Object obj35 = flat3Map28.get((java.lang.Object) 10);
        java.lang.Object obj36 = flat3Map5.remove((java.lang.Object) 10);
        java.util.Collection collection37 = flat3Map5.values();
        java.util.Collection collection38 = flat3Map5.values();
        org.apache.commons.collections.map.Flat3Map flat3Map39 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map39);
        int int41 = flat3Map39.size();
        java.lang.Object obj42 = flat3Map4.put((java.lang.Object) collection38, (java.lang.Object) flat3Map39);
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet44 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map.Values values45 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator47 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map46);
        java.util.Collection collection48 = flat3Map46.values();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        java.lang.Object obj51 = flat3Map46.remove((java.lang.Object) flat3Map49);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator52 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        flat3Map43.putAll((java.util.Map) flat3Map49);
        java.lang.Object obj54 = flat3Map39.get((java.lang.Object) flat3Map49);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap55 = flat3Map49.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator56 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map49);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator56.equals(valuesIterator56)", valuesIterator56.equals(valuesIterator56));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        boolean boolean11 = flat3Map7.equals((java.lang.Object) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.Values values12 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map14);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet25 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map14);
        boolean boolean26 = flat3Map9.equals((java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map9);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator28 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator28.equals(valuesIterator28)", valuesIterator28.equals(valuesIterator28));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Iterator iterator16 = keySet15.iterator();
        boolean boolean17 = keySet11.remove((java.lang.Object) keySet15);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        int int19 = flat3Map18.size();
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        java.util.Set set25 = flat3Map21.entrySet();
        java.util.Set set26 = flat3Map21.keySet();
        java.lang.Object obj27 = flat3Map18.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map.Values values28 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map18);
        boolean boolean29 = keySet11.contains((java.lang.Object) values28);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        java.util.Set set35 = flat3Map30.keySet();
        boolean boolean36 = values28.contains((java.lang.Object) flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        java.util.Set set41 = flat3Map37.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map42 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj44 = flat3Map42.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet45 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map42);
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj47 = flat3Map46.clone();
        java.util.Set set48 = flat3Map46.entrySet();
        boolean boolean49 = keySet45.remove((java.lang.Object) flat3Map46);
        java.util.Set set50 = flat3Map46.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map51 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj53 = flat3Map51.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet54 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map51);
        org.apache.commons.collections.map.Flat3Map flat3Map55 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj56 = flat3Map55.clone();
        java.util.Set set57 = flat3Map55.entrySet();
        boolean boolean58 = keySet54.remove((java.lang.Object) flat3Map55);
        java.lang.Object obj59 = flat3Map37.put((java.lang.Object) flat3Map46, (java.lang.Object) keySet54);
        org.apache.commons.collections.map.Flat3Map flat3Map60 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator61 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map60);
        java.util.Collection collection62 = flat3Map60.values();
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator64 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map63);
        java.lang.Object obj65 = flat3Map60.remove((java.lang.Object) flat3Map63);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator66 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map63);
        java.lang.Object obj67 = flat3Map37.remove((java.lang.Object) flat3Map63);
        org.apache.commons.collections.map.Flat3Map flat3Map68 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet69 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map68);
        org.apache.commons.collections.map.Flat3Map.Values values70 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map68);
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator72 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map71);
        java.util.Collection collection73 = flat3Map71.values();
        org.apache.commons.collections.map.Flat3Map flat3Map74 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator75 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map74);
        java.lang.Object obj76 = flat3Map71.remove((java.lang.Object) flat3Map74);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator77 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map74);
        flat3Map68.putAll((java.util.Map) flat3Map74);
        org.apache.commons.collections.map.Flat3Map.Values values79 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map74);
        flat3Map37.putAll((java.util.Map) flat3Map74);
        flat3Map37.clear();
        java.util.Set set82 = flat3Map37.keySet();
        flat3Map30.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.MapIterator mapIterator84 = flat3Map37.mapIterator();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator85 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map37);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator85.equals(keySetIterator85)", keySetIterator85.equals(keySetIterator85));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        flat3Map0.clear();
        org.apache.commons.collections.MapIterator mapIterator3 = flat3Map0.mapIterator();
        java.util.Collection collection4 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.Values values5 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet7 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map6);
        java.lang.Object obj8 = null;
        boolean boolean9 = entrySet7.remove(obj8);
        int int10 = entrySet7.size();
        entrySet7.clear();
        entrySet7.clear();
        boolean boolean13 = values5.contains((java.lang.Object) entrySet7);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        java.util.Set set26 = flat3Map22.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map27.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet30 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map31.clone();
        java.util.Set set33 = flat3Map31.entrySet();
        boolean boolean34 = keySet30.remove((java.lang.Object) flat3Map31);
        java.util.Set set35 = flat3Map31.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map36.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet39 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj41 = flat3Map40.clone();
        java.util.Set set42 = flat3Map40.entrySet();
        boolean boolean43 = keySet39.remove((java.lang.Object) flat3Map40);
        java.lang.Object obj44 = flat3Map22.put((java.lang.Object) flat3Map31, (java.lang.Object) keySet39);
        boolean boolean45 = keySet17.contains((java.lang.Object) flat3Map22);
        boolean boolean47 = flat3Map22.containsKey((java.lang.Object) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map48 = new org.apache.commons.collections.map.Flat3Map();
        int int49 = flat3Map48.size();
        org.apache.commons.collections.map.Flat3Map flat3Map51 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj53 = flat3Map51.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet54 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map51);
        java.util.Set set55 = flat3Map51.entrySet();
        java.util.Set set56 = flat3Map51.keySet();
        java.lang.Object obj57 = flat3Map48.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map51);
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet59 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map58);
        java.lang.Object obj60 = flat3Map48.get((java.lang.Object) flat3Map58);
        org.apache.commons.collections.map.Flat3Map.Values values61 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map48);
        boolean boolean63 = values61.contains((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map64 = new org.apache.commons.collections.map.Flat3Map();
        int int65 = flat3Map64.size();
        org.apache.commons.collections.map.Flat3Map flat3Map67 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj69 = flat3Map67.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet70 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map67);
        java.util.Set set71 = flat3Map67.entrySet();
        java.util.Set set72 = flat3Map67.keySet();
        java.lang.Object obj73 = flat3Map64.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map67);
        boolean boolean74 = values61.contains((java.lang.Object) (byte) -1);
        boolean boolean75 = flat3Map22.containsKey((java.lang.Object) boolean74);
        java.util.Set set76 = flat3Map22.keySet();
        boolean boolean77 = values5.contains((java.lang.Object) flat3Map22);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator78 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map22);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator78.equals(entrySetIterator78)", entrySetIterator78.equals(entrySetIterator78));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        boolean boolean31 = keySet3.contains((java.lang.Object) flat3Map8);
        java.lang.Object obj32 = flat3Map8.clone();
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        int int35 = flat3Map34.size();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        java.util.Set set41 = flat3Map37.entrySet();
        java.util.Set set42 = flat3Map37.keySet();
        java.lang.Object obj43 = flat3Map34.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet45 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map44);
        java.lang.Object obj46 = flat3Map34.get((java.lang.Object) flat3Map44);
        java.util.Set set47 = flat3Map44.keySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap48 = flat3Map44.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map44);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        boolean boolean51 = flat3Map8.containsKey((java.lang.Object) flat3Map49);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator52 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator52.equals(valuesIterator52)", valuesIterator52.equals(valuesIterator52));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.Values values11 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map6);
        boolean boolean13 = flat3Map6.equals((java.lang.Object) 100);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator14 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map6);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator14.equals(keySetIterator14)", keySetIterator14.equals(keySetIterator14));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        java.util.Collection collection27 = flat3Map25.values();
        boolean boolean28 = values13.contains((java.lang.Object) collection27);
        int int29 = values13.size();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet31 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj34 = flat3Map32.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet35 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map32);
        java.util.Set set36 = flat3Map32.entrySet();
        flat3Map32.clear();
        java.util.Collection collection38 = flat3Map32.values();
        boolean boolean39 = entrySet31.remove((java.lang.Object) flat3Map32);
        boolean boolean40 = values13.contains((java.lang.Object) boolean39);
        java.util.Iterator iterator41 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator41.equals(iterator41)", iterator41.equals(iterator41));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        java.lang.Object obj2 = null;
        boolean boolean3 = entrySet1.remove(obj2);
        int int4 = entrySet1.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        java.util.Set set9 = flat3Map5.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map14.clone();
        java.util.Set set16 = flat3Map14.entrySet();
        boolean boolean17 = keySet13.remove((java.lang.Object) flat3Map14);
        java.util.Set set18 = flat3Map14.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj21 = flat3Map19.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet22 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map23.clone();
        java.util.Set set25 = flat3Map23.entrySet();
        boolean boolean26 = keySet22.remove((java.lang.Object) flat3Map23);
        java.lang.Object obj27 = flat3Map5.put((java.lang.Object) flat3Map14, (java.lang.Object) keySet22);
        boolean boolean28 = entrySet1.remove((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        flat3Map30.clear();
        java.util.Collection collection36 = flat3Map30.values();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        flatMapIterator37.reset();
        flatMapIterator37.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator41 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map40);
        java.lang.String str42 = flatMapIterator41.toString();
        boolean boolean43 = flatMapIterator41.hasNext();
        java.lang.Class<?> wildcardClass44 = flatMapIterator41.getClass();
        java.lang.Object obj45 = flat3Map5.put((java.lang.Object) flatMapIterator37, (java.lang.Object) flatMapIterator41);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = flat3Map5.remove(obj46);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator48 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator48.equals(entrySetIterator48)", entrySetIterator48.equals(entrySetIterator48));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map32);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.util.Collection collection37 = flat3Map35.values();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        java.lang.Object obj40 = flat3Map35.remove((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator41 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        flat3Map32.putAll((java.util.Map) flat3Map38);
        java.util.Set set43 = flat3Map32.keySet();
        boolean boolean44 = flat3Map9.equals((java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj47 = flat3Map45.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet48 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map45);
        java.util.Set set49 = flat3Map45.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map54.clone();
        java.util.Set set56 = flat3Map54.entrySet();
        boolean boolean57 = keySet53.remove((java.lang.Object) flat3Map54);
        java.util.Set set58 = flat3Map54.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map59 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj61 = flat3Map59.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet62 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map59);
        org.apache.commons.collections.map.Flat3Map flat3Map63 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj64 = flat3Map63.clone();
        java.util.Set set65 = flat3Map63.entrySet();
        boolean boolean66 = keySet62.remove((java.lang.Object) flat3Map63);
        java.lang.Object obj67 = flat3Map45.put((java.lang.Object) flat3Map54, (java.lang.Object) keySet62);
        org.apache.commons.collections.map.Flat3Map flat3Map68 = new org.apache.commons.collections.map.Flat3Map();
        int int69 = flat3Map68.size();
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj73 = flat3Map71.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet74 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map71);
        java.util.Set set75 = flat3Map71.entrySet();
        java.util.Set set76 = flat3Map71.keySet();
        java.lang.Object obj77 = flat3Map68.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map71);
        org.apache.commons.collections.map.Flat3Map flat3Map78 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet79 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map78);
        java.lang.Object obj80 = flat3Map68.get((java.lang.Object) flat3Map78);
        org.apache.commons.collections.map.Flat3Map.Values values81 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map68);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap82 = flat3Map68.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator83 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map68);
        boolean boolean84 = keySet62.remove((java.lang.Object) flat3Map68);
        boolean boolean85 = flat3Map9.containsKey((java.lang.Object) keySet62);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator86 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator86.equals(keySetIterator86)", keySetIterator86.equals(keySetIterator86));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap8 = flat3Map7.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj12 = flat3Map10.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet13 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map10);
        java.util.Set set14 = flat3Map10.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet18 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj20 = flat3Map19.clone();
        java.util.Set set21 = flat3Map19.entrySet();
        boolean boolean22 = keySet18.remove((java.lang.Object) flat3Map19);
        java.util.Set set23 = flat3Map19.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map28.clone();
        java.util.Set set30 = flat3Map28.entrySet();
        boolean boolean31 = keySet27.remove((java.lang.Object) flat3Map28);
        java.lang.Object obj32 = flat3Map10.put((java.lang.Object) flat3Map19, (java.lang.Object) keySet27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        java.util.Collection collection35 = flat3Map33.values();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj38 = flat3Map33.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map36);
        java.lang.Object obj40 = flat3Map10.remove((java.lang.Object) flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet42 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map41);
        org.apache.commons.collections.map.Flat3Map.Values values43 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map41);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        java.util.Collection collection46 = flat3Map44.values();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator48 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        java.lang.Object obj49 = flat3Map44.remove((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        flat3Map41.putAll((java.util.Map) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.Values values52 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map47);
        flat3Map10.putAll((java.util.Map) flat3Map47);
        java.lang.Object obj54 = flat3Map7.put((java.lang.Object) 10, (java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator55 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map47);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator55.equals(valuesIterator55)", valuesIterator55.equals(valuesIterator55));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        boolean boolean15 = values13.contains((java.lang.Object) 100L);
        int int16 = values13.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.util.Set set30 = flat3Map26.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj33 = flat3Map31.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet34 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj36 = flat3Map35.clone();
        java.util.Set set37 = flat3Map35.entrySet();
        boolean boolean38 = keySet34.remove((java.lang.Object) flat3Map35);
        java.lang.Object obj39 = flat3Map17.put((java.lang.Object) flat3Map26, (java.lang.Object) keySet34);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj42 = flat3Map40.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet43 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map40);
        java.util.Set set44 = flat3Map40.entrySet();
        java.util.Set set45 = flat3Map40.keySet();
        java.lang.Object obj47 = flat3Map40.get((java.lang.Object) 10);
        java.lang.Object obj48 = flat3Map17.remove((java.lang.Object) 10);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        java.util.Collection collection51 = flat3Map49.values();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator53 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map52);
        java.lang.Object obj54 = flat3Map49.remove((java.lang.Object) flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map55 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator56 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map55);
        boolean boolean57 = flatMapIterator56.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj60 = flat3Map58.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet61 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map58);
        java.util.Set set62 = flat3Map58.entrySet();
        java.lang.Object obj63 = flat3Map49.put((java.lang.Object) flatMapIterator56, (java.lang.Object) flat3Map58);
        java.lang.Object obj65 = flat3Map17.put(obj63, (java.lang.Object) (short) -1);
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator67 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map66);
        java.util.Collection collection68 = flat3Map66.values();
        java.util.Set set69 = flat3Map66.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values70 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map66);
        boolean boolean71 = flat3Map17.containsValue((java.lang.Object) values70);
        boolean boolean72 = values13.contains((java.lang.Object) boolean71);
        java.util.Iterator iterator73 = values13.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator73.equals(iterator73)", iterator73.equals(iterator73));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.util.Collection collection25 = flat3Map23.values();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj28 = flat3Map23.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map26);
        java.lang.Object obj30 = flat3Map0.remove((java.lang.Object) flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet32 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values33 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.util.Collection collection36 = flat3Map34.values();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator38 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        java.lang.Object obj39 = flat3Map34.remove((java.lang.Object) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator40 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map37);
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map.Values values42 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map37);
        flat3Map0.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        java.util.Collection collection46 = flat3Map44.values();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator48 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        java.lang.Object obj49 = flat3Map44.remove((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator51 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map50);
        boolean boolean52 = flatMapIterator51.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map53 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map53.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet56 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map53);
        java.util.Set set57 = flat3Map53.entrySet();
        java.lang.Object obj58 = flat3Map44.put((java.lang.Object) flatMapIterator51, (java.lang.Object) flat3Map53);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet59 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map53);
        flat3Map0.putAll((java.util.Map) flat3Map53);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet61 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map53);
        org.apache.commons.collections.map.Flat3Map flat3Map62 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj64 = flat3Map62.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet65 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map62);
        java.util.Set set66 = flat3Map62.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map67 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj69 = flat3Map67.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet70 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map67);
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj72 = flat3Map71.clone();
        java.util.Set set73 = flat3Map71.entrySet();
        boolean boolean74 = keySet70.remove((java.lang.Object) flat3Map71);
        java.util.Set set75 = flat3Map71.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map76 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj78 = flat3Map76.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet79 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map76);
        org.apache.commons.collections.map.Flat3Map flat3Map80 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj81 = flat3Map80.clone();
        java.util.Set set82 = flat3Map80.entrySet();
        boolean boolean83 = keySet79.remove((java.lang.Object) flat3Map80);
        java.lang.Object obj84 = flat3Map62.put((java.lang.Object) flat3Map71, (java.lang.Object) keySet79);
        boolean boolean86 = flat3Map71.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator87 = flat3Map71.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map88 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet89 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map88);
        java.lang.Object obj90 = flat3Map71.remove((java.lang.Object) flat3Map88);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap91 = flat3Map88.createDelegateMap();
        org.apache.commons.collections.MapIterator mapIterator92 = flat3Map88.mapIterator();
        java.lang.Object obj93 = flat3Map53.remove((java.lang.Object) flat3Map88);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator94 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map88);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator94.equals(valuesIterator94)", valuesIterator94.equals(valuesIterator94));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        java.lang.Object obj10 = flat3Map4.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator12 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map11);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator12.equals(keySetIterator12)", keySetIterator12.equals(keySetIterator12));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        flatMapIterator12.reset();
        java.lang.String str14 = flatMapIterator12.toString();
        flatMapIterator12.reset();
        boolean boolean16 = flat3Map0.containsValue((java.lang.Object) flatMapIterator12);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet18 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map.Values values19 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map20);
        java.util.Collection collection22 = flat3Map20.values();
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator24 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        java.lang.Object obj25 = flat3Map20.remove((java.lang.Object) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        flat3Map17.putAll((java.util.Map) flat3Map23);
        java.lang.Object obj28 = flat3Map0.remove((java.lang.Object) flat3Map17);
        java.util.Set set29 = flat3Map17.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        int int32 = flat3Map30.size();
        int int33 = flat3Map30.size();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj37 = flat3Map35.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet38 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map35);
        java.util.Set set39 = flat3Map35.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj42 = flat3Map40.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet43 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map40);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map44.clone();
        java.util.Set set46 = flat3Map44.entrySet();
        boolean boolean47 = keySet43.remove((java.lang.Object) flat3Map44);
        java.util.Set set48 = flat3Map44.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj51 = flat3Map49.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet52 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map49);
        org.apache.commons.collections.map.Flat3Map flat3Map53 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map53.clone();
        java.util.Set set55 = flat3Map53.entrySet();
        boolean boolean56 = keySet52.remove((java.lang.Object) flat3Map53);
        java.lang.Object obj57 = flat3Map35.put((java.lang.Object) flat3Map44, (java.lang.Object) keySet52);
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj60 = flat3Map58.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet61 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map58);
        java.util.Set set62 = flat3Map58.entrySet();
        java.util.Set set63 = flat3Map58.keySet();
        java.lang.Object obj65 = flat3Map58.get((java.lang.Object) 10);
        java.lang.Object obj66 = flat3Map35.remove((java.lang.Object) 10);
        java.util.Collection collection67 = flat3Map35.values();
        java.util.Collection collection68 = flat3Map35.values();
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator70 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map69);
        int int71 = flat3Map69.size();
        java.lang.Object obj72 = flat3Map34.put((java.lang.Object) collection68, (java.lang.Object) flat3Map69);
        boolean boolean73 = flat3Map17.containsKey((java.lang.Object) collection68);
        org.apache.commons.collections.map.Flat3Map flat3Map74 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map17);
        int int75 = flat3Map17.size();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator76 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator76.equals(valuesIterator76)", valuesIterator76.equals(valuesIterator76));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        java.util.Set set13 = flat3Map10.keySet();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap14 = flat3Map10.createDelegateMap();
        flat3Map10.clear();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator16 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.String str23 = flat3Map17.toString();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map24);
        flatMapIterator25.reset();
        boolean boolean27 = flatMapIterator25.hasNext();
        java.lang.Class<?> wildcardClass28 = flatMapIterator25.getClass();
        java.lang.Object obj29 = flat3Map17.remove((java.lang.Object) wildcardClass28);
        boolean boolean30 = flat3Map10.containsKey((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator31 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map10);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator31.equals(entrySetIterator31)", entrySetIterator31.equals(entrySetIterator31));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection5 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        int int7 = flat3Map6.size();
        boolean boolean8 = flat3Map0.containsKey((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator10 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator10.equals(keySetIterator10)", keySetIterator10.equals(keySetIterator10));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet13 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map.Values values14 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator16 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        java.util.Collection collection17 = flat3Map15.values();
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator19 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map18);
        java.lang.Object obj20 = flat3Map15.remove((java.lang.Object) flat3Map18);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator21 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map18);
        flat3Map12.putAll((java.util.Map) flat3Map18);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map23);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        int int29 = flat3Map28.size();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj33 = flat3Map31.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet34 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map31);
        java.util.Set set35 = flat3Map31.entrySet();
        java.util.Set set36 = flat3Map31.keySet();
        java.lang.Object obj37 = flat3Map28.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet39 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map38);
        java.lang.Object obj40 = flat3Map28.get((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map.Values values41 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map28);
        org.apache.commons.collections.map.Flat3Map flat3Map42 = new org.apache.commons.collections.map.Flat3Map();
        int int43 = flat3Map42.size();
        org.apache.commons.collections.map.Flat3Map flat3Map45 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj47 = flat3Map45.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet48 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map45);
        java.util.Set set49 = flat3Map45.entrySet();
        java.util.Set set50 = flat3Map45.keySet();
        java.lang.Object obj51 = flat3Map42.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map45);
        boolean boolean52 = values41.contains((java.lang.Object) flat3Map45);
        org.apache.commons.collections.map.Flat3Map flat3Map53 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator54 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map53);
        int int55 = flat3Map53.size();
        flat3Map45.putAll((java.util.Map) flat3Map53);
        java.lang.Object obj57 = flat3Map18.put((java.lang.Object) flat3Map23, (java.lang.Object) flat3Map53);
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        int int59 = flat3Map58.size();
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj63 = flat3Map61.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet64 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map61);
        java.util.Set set65 = flat3Map61.entrySet();
        java.util.Set set66 = flat3Map61.keySet();
        java.lang.Object obj67 = flat3Map58.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map61);
        boolean boolean68 = flat3Map53.containsKey((java.lang.Object) flat3Map61);
        boolean boolean69 = flat3Map7.containsKey((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator70 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map7);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator70.equals(keySetIterator70)", keySetIterator70.equals(keySetIterator70));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map29 = new org.apache.commons.collections.map.Flat3Map();
        int int30 = flat3Map29.size();
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj34 = flat3Map32.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet35 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map32);
        java.util.Set set36 = flat3Map32.entrySet();
        java.util.Set set37 = flat3Map32.keySet();
        java.lang.Object obj38 = flat3Map29.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map29);
        flat3Map17.putAll((java.util.Map) flat3Map29);
        int int41 = flat3Map17.size();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator42 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator42.equals(valuesIterator42)", valuesIterator42.equals(valuesIterator42));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map32);
        org.apache.commons.collections.map.Flat3Map.Values values34 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map32);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.util.Collection collection37 = flat3Map35.values();
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        java.lang.Object obj40 = flat3Map35.remove((java.lang.Object) flat3Map38);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator41 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        flat3Map32.putAll((java.util.Map) flat3Map38);
        java.util.Set set43 = flat3Map32.keySet();
        boolean boolean44 = flat3Map9.equals((java.lang.Object) flat3Map32);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator45 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator45.equals(entrySetIterator45)", entrySetIterator45.equals(entrySetIterator45));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map17.clone();
        java.util.Set set19 = flat3Map17.entrySet();
        boolean boolean20 = keySet16.remove((java.lang.Object) flat3Map17);
        java.util.Set set21 = flat3Map17.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj27 = flat3Map26.clone();
        java.util.Set set28 = flat3Map26.entrySet();
        boolean boolean29 = keySet25.remove((java.lang.Object) flat3Map26);
        java.lang.Object obj30 = flat3Map8.put((java.lang.Object) flat3Map17, (java.lang.Object) keySet25);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator32 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        java.util.Collection collection33 = flat3Map31.values();
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator35 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.lang.Object obj36 = flat3Map31.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator37 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map34);
        java.lang.Object obj38 = flat3Map8.remove((java.lang.Object) flat3Map34);
        org.apache.commons.collections.MapIterator mapIterator39 = flat3Map8.mapIterator();
        java.lang.Object obj40 = flat3Map0.get((java.lang.Object) flat3Map8);
        org.apache.commons.collections.MapIterator mapIterator41 = flat3Map8.mapIterator();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator42 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator42.equals(keySetIterator42)", keySetIterator42.equals(keySetIterator42));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator3 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int4 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        int int6 = flat3Map5.size();
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map8.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map8);
        java.util.Set set12 = flat3Map8.entrySet();
        java.util.Set set13 = flat3Map8.keySet();
        java.lang.Object obj14 = flat3Map5.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map8);
        java.lang.Object obj15 = flat3Map5.clone();
        java.lang.Object obj16 = flat3Map0.get((java.lang.Object) flat3Map5);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map5);
        java.util.Collection collection18 = flat3Map5.values();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator19 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map5);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator19.equals(valuesIterator19)", valuesIterator19.equals(valuesIterator19));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.String str6 = flat3Map0.toString();
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator11 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map10);
        java.lang.Object obj12 = flat3Map7.remove((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator13 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map7);
        java.util.Collection collection15 = flat3Map14.values();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator17 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        java.util.Collection collection18 = flat3Map16.values();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator20 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map19);
        java.lang.Object obj21 = flat3Map16.remove((java.lang.Object) flat3Map19);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map16);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap24 = flat3Map23.createDelegateMap();
        flat3Map14.putAll((java.util.Map) flat3Map23);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        boolean boolean27 = flat3Map0.containsValue((java.lang.Object) flat3Map23);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        java.util.Collection collection30 = flat3Map28.values();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator32 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        java.lang.Object obj33 = flat3Map28.remove((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        org.apache.commons.collections.map.Flat3Map.Values values35 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map31);
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map31);
        boolean boolean37 = flat3Map23.containsKey((java.lang.Object) flat3Map36);
        int int38 = flat3Map23.size();
        org.apache.commons.collections.map.Flat3Map flat3Map39 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set40 = flat3Map39.entrySet();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet41 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map39);
        java.util.Iterator iterator42 = entrySet41.iterator();
        java.util.Iterator iterator43 = entrySet41.iterator();
        java.lang.Object obj44 = flat3Map23.remove((java.lang.Object) iterator43);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator45 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map23);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator45.equals(keySetIterator45)", keySetIterator45.equals(keySetIterator45));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet23 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map9);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj26 = flat3Map24.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet27 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Set set28 = flat3Map24.entrySet();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map24);
        java.util.Iterator iterator30 = keySet29.iterator();
        java.lang.Object obj31 = flat3Map9.get((java.lang.Object) iterator30);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator32 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map9);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator32.equals(valuesIterator32)", valuesIterator32.equals(valuesIterator32));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        java.util.Set set15 = flat3Map8.keySet();
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator16 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map8);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator16.equals(entrySetIterator16)", entrySetIterator16.equals(entrySetIterator16));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        java.util.Set set28 = flat3Map23.keySet();
        java.lang.Object obj30 = flat3Map23.get((java.lang.Object) 10);
        java.lang.Object obj31 = flat3Map0.remove((java.lang.Object) 10);
        java.util.Collection collection32 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet33 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        entrySet33.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj37 = flat3Map35.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet38 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map35);
        org.apache.commons.collections.map.Flat3Map flat3Map39 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map39.clone();
        java.util.Set set41 = flat3Map39.entrySet();
        boolean boolean42 = keySet38.remove((java.lang.Object) flat3Map39);
        java.util.Set set43 = flat3Map39.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set45 = flat3Map44.entrySet();
        boolean boolean46 = flat3Map39.equals((java.lang.Object) set45);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        int int48 = flat3Map47.size();
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj52 = flat3Map50.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map50);
        java.util.Set set54 = flat3Map50.entrySet();
        java.util.Set set55 = flat3Map50.keySet();
        java.lang.Object obj56 = flat3Map47.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map50);
        java.lang.Object obj57 = flat3Map47.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map58 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator59 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map58);
        java.util.Collection collection60 = flat3Map58.values();
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator62 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map61);
        java.lang.Object obj63 = flat3Map58.remove((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator64 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map61);
        boolean boolean65 = flat3Map47.equals((java.lang.Object) flat3Map61);
        boolean boolean66 = flat3Map39.equals((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map flat3Map67 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map61);
        java.lang.Object obj68 = flat3Map61.clone();
        boolean boolean69 = entrySet33.remove((java.lang.Object) flat3Map61);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator70 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map61);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator70.equals(keySetIterator70)", keySetIterator70.equals(keySetIterator70));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        int int23 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator25 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map24);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator25.equals(entrySetIterator25)", entrySetIterator25.equals(entrySetIterator25));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map5 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj7 = flat3Map5.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet8 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map5);
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj10 = flat3Map9.clone();
        java.util.Set set11 = flat3Map9.entrySet();
        boolean boolean12 = keySet8.remove((java.lang.Object) flat3Map9);
        java.util.Set set13 = flat3Map9.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map18.clone();
        java.util.Set set20 = flat3Map18.entrySet();
        boolean boolean21 = keySet17.remove((java.lang.Object) flat3Map18);
        java.lang.Object obj22 = flat3Map0.put((java.lang.Object) flat3Map9, (java.lang.Object) keySet17);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map23.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet26 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map23);
        java.util.Set set27 = flat3Map23.entrySet();
        java.util.Set set28 = flat3Map23.keySet();
        java.lang.Object obj30 = flat3Map23.get((java.lang.Object) 10);
        java.lang.Object obj31 = flat3Map0.remove((java.lang.Object) 10);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        java.util.Collection collection34 = flat3Map32.values();
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map35);
        java.lang.Object obj37 = flat3Map32.remove((java.lang.Object) flat3Map35);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator39 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map38);
        boolean boolean40 = flatMapIterator39.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj43 = flat3Map41.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet44 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map41);
        java.util.Set set45 = flat3Map41.entrySet();
        java.lang.Object obj46 = flat3Map32.put((java.lang.Object) flatMapIterator39, (java.lang.Object) flat3Map41);
        java.lang.Object obj48 = flat3Map0.put(obj46, (java.lang.Object) (short) -1);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator50 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map49);
        java.util.Collection collection51 = flat3Map49.values();
        java.util.Set set52 = flat3Map49.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values53 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map49);
        boolean boolean54 = flat3Map0.containsValue((java.lang.Object) values53);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator55 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator55.equals(entrySetIterator55)", entrySetIterator55.equals(entrySetIterator55));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator10 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet13 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj16 = flat3Map14.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet17 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map14);
        java.util.Set set18 = flat3Map14.entrySet();
        flat3Map14.clear();
        java.util.Collection collection20 = flat3Map14.values();
        boolean boolean21 = entrySet13.remove((java.lang.Object) flat3Map14);
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj24 = flat3Map22.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet25 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map22);
        java.util.Set set26 = flat3Map22.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj29 = flat3Map27.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet30 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map31.clone();
        java.util.Set set33 = flat3Map31.entrySet();
        boolean boolean34 = keySet30.remove((java.lang.Object) flat3Map31);
        java.util.Set set35 = flat3Map31.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map36 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj38 = flat3Map36.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet39 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map36);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj41 = flat3Map40.clone();
        java.util.Set set42 = flat3Map40.entrySet();
        boolean boolean43 = keySet39.remove((java.lang.Object) flat3Map40);
        java.lang.Object obj44 = flat3Map22.put((java.lang.Object) flat3Map31, (java.lang.Object) keySet39);
        boolean boolean46 = flat3Map31.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator47 = flat3Map31.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map48 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet49 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map48);
        java.lang.Object obj50 = flat3Map31.remove((java.lang.Object) flat3Map48);
        boolean boolean51 = entrySet13.remove((java.lang.Object) flat3Map31);
        int int52 = entrySet13.size();
        boolean boolean53 = flat3Map0.equals((java.lang.Object) entrySet13);
        org.apache.commons.collections.map.Flat3Map flat3Map54 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj56 = flat3Map54.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet57 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map54);
        java.util.Iterator iterator58 = keySet57.iterator();
        java.util.Iterator iterator59 = keySet57.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map60 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj62 = flat3Map60.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet63 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map60);
        org.apache.commons.collections.map.Flat3Map flat3Map64 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj65 = flat3Map64.clone();
        java.util.Set set66 = flat3Map64.entrySet();
        boolean boolean67 = keySet63.remove((java.lang.Object) flat3Map64);
        java.util.Set set68 = flat3Map64.keySet();
        org.apache.commons.collections.MapIterator mapIterator69 = flat3Map64.mapIterator();
        boolean boolean70 = keySet57.contains((java.lang.Object) flat3Map64);
        int int71 = flat3Map64.size();
        org.apache.commons.collections.MapIterator mapIterator72 = flat3Map64.mapIterator();
        java.lang.Object obj73 = flat3Map0.remove((java.lang.Object) mapIterator72);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator74 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator74.equals(valuesIterator74)", valuesIterator74.equals(valuesIterator74));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        int int11 = flat3Map10.size();
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj15 = flat3Map13.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet16 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map13);
        java.util.Set set17 = flat3Map13.entrySet();
        java.util.Set set18 = flat3Map13.keySet();
        java.lang.Object obj19 = flat3Map10.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map13);
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet21 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map20);
        java.lang.Object obj22 = flat3Map10.get((java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.Values values23 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map10);
        boolean boolean25 = values23.contains((java.lang.Object) 100L);
        java.lang.Object obj26 = flat3Map9.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map27 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator28 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map27);
        int int29 = flat3Map27.size();
        int int30 = flat3Map27.size();
        boolean boolean31 = flat3Map9.containsKey((java.lang.Object) flat3Map27);
        org.apache.commons.collections.map.Flat3Map.Values values32 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map27);
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map27);
        java.lang.String str34 = flat3Map33.toString();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator35 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map33);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator35.equals(keySetIterator35)", keySetIterator35.equals(keySetIterator35));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        flat3Map0.clear();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        int int5 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator6 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator6.equals(valuesIterator6)", valuesIterator6.equals(valuesIterator6));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        java.util.Set set29 = flat3Map25.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map34 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj35 = flat3Map34.clone();
        java.util.Set set36 = flat3Map34.entrySet();
        boolean boolean37 = keySet33.remove((java.lang.Object) flat3Map34);
        int int38 = flat3Map34.size();
        org.apache.commons.collections.map.Flat3Map flat3Map39 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map34);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map();
        int int41 = flat3Map40.size();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        java.util.Set set47 = flat3Map43.entrySet();
        java.util.Set set48 = flat3Map43.keySet();
        java.lang.Object obj49 = flat3Map40.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet51 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map50);
        java.lang.Object obj52 = flat3Map40.get((java.lang.Object) flat3Map50);
        org.apache.commons.collections.map.Flat3Map.Values values53 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map40);
        boolean boolean55 = values53.contains((java.lang.Object) 100L);
        java.lang.Object obj56 = flat3Map39.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map flat3Map57 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator58 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map57);
        int int59 = flat3Map57.size();
        int int60 = flat3Map57.size();
        boolean boolean61 = flat3Map39.containsKey((java.lang.Object) flat3Map57);
        boolean boolean62 = flat3Map39.isEmpty();
        boolean boolean63 = flat3Map25.containsKey((java.lang.Object) flat3Map39);
        java.lang.Object obj64 = null;
        boolean boolean65 = flat3Map25.equals(obj64);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator66 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map25);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator66.equals(entrySetIterator66)", entrySetIterator66.equals(entrySetIterator66));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet11 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map10);
        java.lang.Object obj12 = flat3Map0.get((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map.Values values13 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map14 = new org.apache.commons.collections.map.Flat3Map();
        int int15 = flat3Map14.size();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        java.util.Set set21 = flat3Map17.entrySet();
        java.util.Set set22 = flat3Map17.keySet();
        java.lang.Object obj23 = flat3Map14.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map17);
        boolean boolean24 = values13.contains((java.lang.Object) flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator26 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map25);
        int int27 = flat3Map25.size();
        flat3Map17.putAll((java.util.Map) flat3Map25);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator30 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map17);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator30.equals(entrySetIterator30)", entrySetIterator30.equals(entrySetIterator30));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        int int11 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map16.clone();
        java.util.Set set18 = flat3Map16.entrySet();
        boolean boolean19 = keySet15.remove((java.lang.Object) flat3Map16);
        java.util.Set set20 = flat3Map16.keySet();
        boolean boolean21 = flat3Map0.containsKey((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.Values values22 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        flat3Map0.clear();
        java.util.Set set24 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator25 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator25.equals(keySetIterator25)", keySetIterator25.equals(keySetIterator25));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        java.util.Set set3 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values4 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator5 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator5.equals(keySetIterator5)", keySetIterator5.equals(keySetIterator5));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        java.util.Collection collection11 = flat3Map0.values();
        java.lang.Object obj13 = flat3Map0.get((java.lang.Object) 100L);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet14 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet16 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        int int18 = flat3Map17.size();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map20.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet23 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map20);
        java.util.Set set24 = flat3Map20.entrySet();
        java.util.Set set25 = flat3Map20.keySet();
        java.lang.Object obj26 = flat3Map17.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map20);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator27 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map17);
        boolean boolean28 = entrySet16.remove((java.lang.Object) flat3Map17);
        java.util.Iterator iterator29 = entrySet16.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj32 = flat3Map30.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet33 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map30);
        java.util.Set set34 = flat3Map30.entrySet();
        java.util.Set set35 = flat3Map30.keySet();
        java.lang.Object obj37 = flat3Map30.get((java.lang.Object) 10);
        java.lang.Object obj39 = flat3Map30.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map40 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        int int42 = flat3Map41.size();
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj46 = flat3Map44.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet47 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map44);
        java.util.Set set48 = flat3Map44.entrySet();
        java.util.Set set49 = flat3Map44.keySet();
        java.lang.Object obj50 = flat3Map41.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map44);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator51 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map41);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet52 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map41);
        java.lang.Object obj53 = flat3Map40.remove((java.lang.Object) entrySet52);
        java.lang.Object obj54 = flat3Map0.put((java.lang.Object) iterator29, (java.lang.Object) entrySet52);
        org.apache.commons.collections.map.Flat3Map flat3Map55 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj56 = flat3Map55.clone();
        java.lang.Object obj59 = flat3Map55.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection60 = flat3Map55.values();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet61 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map55);
        java.lang.Object obj62 = flat3Map55.clone();
        java.lang.Object obj63 = flat3Map0.remove(obj62);
        int int64 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator65 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator65.equals(valuesIterator65)", valuesIterator65.equals(valuesIterator65));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator11 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map10);
        java.lang.Object obj12 = flat3Map7.remove((java.lang.Object) flat3Map10);
        org.apache.commons.collections.map.Flat3Map flat3Map13 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map13);
        boolean boolean15 = flatMapIterator14.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj18 = flat3Map16.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet19 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map16);
        java.util.Set set20 = flat3Map16.entrySet();
        java.lang.Object obj21 = flat3Map7.put((java.lang.Object) flatMapIterator14, (java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator22 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map23 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map16);
        java.lang.Object obj24 = flat3Map0.remove((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map flat3Map25 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet26 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map25);
        org.apache.commons.collections.map.Flat3Map.Values values27 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map25);
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator29 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map28);
        java.util.Collection collection30 = flat3Map28.values();
        org.apache.commons.collections.map.Flat3Map flat3Map31 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator32 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        java.lang.Object obj33 = flat3Map28.remove((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map31);
        flat3Map25.putAll((java.util.Map) flat3Map31);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap36 = flat3Map31.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap40 = flat3Map37.createDelegateMap();
        flat3Map31.putAll((java.util.Map) flat3Map37);
        org.apache.commons.collections.MapIterator mapIterator42 = flat3Map31.mapIterator();
        java.util.Collection collection43 = flat3Map31.values();
        boolean boolean44 = flat3Map0.equals((java.lang.Object) flat3Map31);
        org.apache.commons.collections.map.Flat3Map.EntrySetIterator entrySetIterator45 = new org.apache.commons.collections.map.Flat3Map.EntrySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: entrySetIterator45.equals(entrySetIterator45)", entrySetIterator45.equals(entrySetIterator45));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj6 = flat3Map4.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet7 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map4);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj9 = flat3Map8.clone();
        java.util.Set set10 = flat3Map8.entrySet();
        boolean boolean11 = keySet7.remove((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map21.clone();
        java.util.Set set23 = flat3Map21.entrySet();
        boolean boolean24 = keySet20.remove((java.lang.Object) flat3Map21);
        java.util.Set set25 = flat3Map21.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj28 = flat3Map26.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj31 = flat3Map30.clone();
        java.util.Set set32 = flat3Map30.entrySet();
        boolean boolean33 = keySet29.remove((java.lang.Object) flat3Map30);
        java.lang.Object obj34 = flat3Map12.put((java.lang.Object) flat3Map21, (java.lang.Object) keySet29);
        boolean boolean35 = keySet7.contains((java.lang.Object) flat3Map12);
        boolean boolean37 = flat3Map12.containsKey((java.lang.Object) 0);
        java.util.Set set38 = flat3Map12.keySet();
        boolean boolean39 = keySet3.contains((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator40 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map12);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator40.equals(valuesIterator40)", valuesIterator40.equals(valuesIterator40));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap11 = flat3Map6.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap15 = flat3Map12.createDelegateMap();
        flat3Map6.putAll((java.util.Map) flat3Map12);
        flat3Map12.clear();
        java.util.Set set18 = flat3Map12.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map19 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator20 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map19);
        java.util.Collection collection21 = flat3Map19.values();
        org.apache.commons.collections.map.Flat3Map flat3Map22 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator23 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map22);
        java.lang.Object obj24 = flat3Map19.remove((java.lang.Object) flat3Map22);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator25 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map19);
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map19);
        java.util.Set set27 = flat3Map26.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map28 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map26);
        flat3Map12.putAll((java.util.Map) flat3Map26);
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator30 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map12);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator30.equals(valuesIterator30)", valuesIterator30.equals(valuesIterator30));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        flatMapIterator18.reset();
        org.apache.commons.collections.map.Flat3Map flat3Map20 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map20.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet23 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map20);
        org.apache.commons.collections.map.Flat3Map flat3Map24 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj25 = flat3Map24.clone();
        java.util.Set set26 = flat3Map24.entrySet();
        boolean boolean27 = keySet23.remove((java.lang.Object) flat3Map24);
        java.util.Set set28 = flat3Map24.keySet();
        java.lang.Object obj29 = flat3Map8.put((java.lang.Object) flatMapIterator18, (java.lang.Object) set28);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator31 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        java.util.Collection collection32 = flat3Map30.values();
        org.apache.commons.collections.map.Flat3Map flat3Map33 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator34 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map33);
        java.lang.Object obj35 = flat3Map30.remove((java.lang.Object) flat3Map33);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator36 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map30);
        org.apache.commons.collections.map.Flat3Map flat3Map37 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj39 = flat3Map37.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet40 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map37);
        org.apache.commons.collections.map.Flat3Map flat3Map41 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj42 = flat3Map41.clone();
        java.util.Set set43 = flat3Map41.entrySet();
        boolean boolean44 = keySet40.remove((java.lang.Object) flat3Map41);
        int int45 = flat3Map41.size();
        org.apache.commons.collections.map.Flat3Map flat3Map46 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map41);
        int int47 = flat3Map41.size();
        java.lang.Object obj48 = flat3Map8.put((java.lang.Object) flatMapIterator36, (java.lang.Object) flat3Map41);
        org.apache.commons.collections.map.Flat3Map flat3Map49 = new org.apache.commons.collections.map.Flat3Map();
        java.util.Set set50 = flat3Map49.entrySet();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet51 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map49);
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet53 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        java.util.Iterator iterator54 = keySet53.iterator();
        boolean boolean55 = flat3Map49.containsKey((java.lang.Object) keySet53);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.lang.Object obj60 = flat3Map56.put((java.lang.Object) "Iterator[]", (java.lang.Object) (byte) 0);
        java.util.Collection collection61 = flat3Map56.values();
        org.apache.commons.collections.map.Flat3Map flat3Map62 = new org.apache.commons.collections.map.Flat3Map();
        int int63 = flat3Map62.size();
        boolean boolean64 = flat3Map56.containsKey((java.lang.Object) flat3Map62);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator65 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map62);
        org.apache.commons.collections.map.Flat3Map flat3Map66 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet67 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map66);
        org.apache.commons.collections.map.Flat3Map.Values values68 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map66);
        org.apache.commons.collections.map.Flat3Map flat3Map69 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator70 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map69);
        java.util.Collection collection71 = flat3Map69.values();
        org.apache.commons.collections.map.Flat3Map flat3Map72 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator73 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map72);
        java.lang.Object obj74 = flat3Map69.remove((java.lang.Object) flat3Map72);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator75 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map72);
        flat3Map66.putAll((java.util.Map) flat3Map72);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap77 = flat3Map72.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map78 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj80 = flat3Map78.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap81 = flat3Map78.createDelegateMap();
        flat3Map72.putAll((java.util.Map) flat3Map78);
        boolean boolean83 = flat3Map62.containsKey((java.lang.Object) flat3Map78);
        boolean boolean84 = keySet53.contains((java.lang.Object) flat3Map78);
        java.util.Set set85 = flat3Map78.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map86 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map78);
        java.lang.Object obj87 = flat3Map41.get((java.lang.Object) flat3Map78);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator88 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map78);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator88.equals(keySetIterator88)", keySetIterator88.equals(keySetIterator88));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet1 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values2 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.util.Collection collection5 = flat3Map3.values();
        org.apache.commons.collections.map.Flat3Map flat3Map6 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator7 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        java.lang.Object obj8 = flat3Map3.remove((java.lang.Object) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map6);
        flat3Map0.putAll((java.util.Map) flat3Map6);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Set set16 = flat3Map12.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map17 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj19 = flat3Map17.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map17);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj22 = flat3Map21.clone();
        java.util.Set set23 = flat3Map21.entrySet();
        boolean boolean24 = keySet20.remove((java.lang.Object) flat3Map21);
        java.util.Set set25 = flat3Map21.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map26 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj28 = flat3Map26.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet29 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map26);
        org.apache.commons.collections.map.Flat3Map flat3Map30 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj31 = flat3Map30.clone();
        java.util.Set set32 = flat3Map30.entrySet();
        boolean boolean33 = keySet29.remove((java.lang.Object) flat3Map30);
        java.lang.Object obj34 = flat3Map12.put((java.lang.Object) flat3Map21, (java.lang.Object) keySet29);
        org.apache.commons.collections.map.Flat3Map flat3Map35 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj37 = flat3Map35.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet38 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map35);
        java.util.Set set39 = flat3Map35.entrySet();
        java.util.Set set40 = flat3Map35.keySet();
        java.lang.Object obj42 = flat3Map35.get((java.lang.Object) 10);
        java.lang.Object obj43 = flat3Map12.remove((java.lang.Object) 10);
        org.apache.commons.collections.map.Flat3Map flat3Map44 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator45 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map44);
        java.util.Collection collection46 = flat3Map44.values();
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator48 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map47);
        java.lang.Object obj49 = flat3Map44.remove((java.lang.Object) flat3Map47);
        org.apache.commons.collections.map.Flat3Map flat3Map50 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator51 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map50);
        boolean boolean52 = flatMapIterator51.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map53 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj55 = flat3Map53.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet56 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map53);
        java.util.Set set57 = flat3Map53.entrySet();
        java.lang.Object obj58 = flat3Map44.put((java.lang.Object) flatMapIterator51, (java.lang.Object) flat3Map53);
        java.lang.Object obj60 = flat3Map12.put(obj58, (java.lang.Object) (short) -1);
        org.apache.commons.collections.map.Flat3Map flat3Map61 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator62 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map61);
        java.util.Collection collection63 = flat3Map61.values();
        java.util.Set set64 = flat3Map61.entrySet();
        org.apache.commons.collections.map.Flat3Map.Values values65 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map61);
        boolean boolean66 = flat3Map12.containsValue((java.lang.Object) values65);
        boolean boolean67 = keySet11.remove((java.lang.Object) flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map68 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj70 = flat3Map68.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet71 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map68);
        java.util.Set set72 = flat3Map68.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map73 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj75 = flat3Map73.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet76 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map73);
        org.apache.commons.collections.map.Flat3Map flat3Map77 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj78 = flat3Map77.clone();
        java.util.Set set79 = flat3Map77.entrySet();
        boolean boolean80 = keySet76.remove((java.lang.Object) flat3Map77);
        java.util.Set set81 = flat3Map77.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map82 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj84 = flat3Map82.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet85 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map82);
        org.apache.commons.collections.map.Flat3Map flat3Map86 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj87 = flat3Map86.clone();
        java.util.Set set88 = flat3Map86.entrySet();
        boolean boolean89 = keySet85.remove((java.lang.Object) flat3Map86);
        java.lang.Object obj90 = flat3Map68.put((java.lang.Object) flat3Map77, (java.lang.Object) keySet85);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet91 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map77);
        boolean boolean92 = flat3Map77.isEmpty();
        java.lang.Object obj93 = flat3Map12.get((java.lang.Object) flat3Map77);
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet94 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map12);
        flat3Map12.clear();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator96 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map12);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator96.equals(keySetIterator96)", keySetIterator96.equals(keySetIterator96));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map8 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator9 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map8);
        java.util.Collection collection10 = flat3Map8.values();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.Object obj13 = flat3Map8.remove((java.lang.Object) flat3Map11);
        boolean boolean14 = flat3Map0.equals((java.lang.Object) flat3Map8);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        int int19 = flat3Map15.size();
        boolean boolean20 = flat3Map8.equals((java.lang.Object) flat3Map15);
        java.lang.String str21 = flat3Map15.toString();
        boolean boolean22 = flat3Map15.isEmpty();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator23 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map15);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator23.equals(keySetIterator23)", keySetIterator23.equals(keySetIterator23));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map4 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map4.clone();
        java.util.Set set6 = flat3Map4.entrySet();
        boolean boolean7 = keySet3.remove((java.lang.Object) flat3Map4);
        int int8 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map9 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map4);
        int int10 = flat3Map4.size();
        org.apache.commons.collections.map.Flat3Map flat3Map11 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator12 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map11);
        java.lang.String str13 = flatMapIterator12.toString();
        boolean boolean14 = flat3Map4.containsKey((java.lang.Object) str13);
        org.apache.commons.collections.map.Flat3Map flat3Map15 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map15.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator18 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map15);
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap19 = flat3Map15.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet20 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map15);
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        java.util.Set set25 = flat3Map21.entrySet();
        java.util.Set set26 = flat3Map21.keySet();
        java.lang.Object obj28 = flat3Map21.get((java.lang.Object) 10);
        java.lang.Object obj30 = flat3Map21.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map.Values values31 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map21);
        org.apache.commons.collections.map.Flat3Map flat3Map32 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator33 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map32);
        flatMapIterator33.reset();
        java.lang.String str35 = flatMapIterator33.toString();
        flatMapIterator33.reset();
        boolean boolean37 = flat3Map21.containsValue((java.lang.Object) flatMapIterator33);
        org.apache.commons.collections.map.Flat3Map flat3Map38 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj40 = flat3Map38.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet41 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map38);
        java.util.Set set42 = flat3Map38.entrySet();
        org.apache.commons.collections.map.Flat3Map flat3Map43 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj45 = flat3Map43.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet46 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map43);
        org.apache.commons.collections.map.Flat3Map flat3Map47 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj48 = flat3Map47.clone();
        java.util.Set set49 = flat3Map47.entrySet();
        boolean boolean50 = keySet46.remove((java.lang.Object) flat3Map47);
        java.util.Set set51 = flat3Map47.keySet();
        org.apache.commons.collections.map.Flat3Map flat3Map52 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj54 = flat3Map52.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet55 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map52);
        org.apache.commons.collections.map.Flat3Map flat3Map56 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj57 = flat3Map56.clone();
        java.util.Set set58 = flat3Map56.entrySet();
        boolean boolean59 = keySet55.remove((java.lang.Object) flat3Map56);
        java.lang.Object obj60 = flat3Map38.put((java.lang.Object) flat3Map47, (java.lang.Object) keySet55);
        boolean boolean62 = flat3Map47.containsValue((java.lang.Object) 0);
        org.apache.commons.collections.MapIterator mapIterator63 = flat3Map47.mapIterator();
        org.apache.commons.collections.map.Flat3Map flat3Map64 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator65 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map64);
        java.util.Collection collection66 = flat3Map64.values();
        org.apache.commons.collections.map.Flat3Map flat3Map67 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator68 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map67);
        java.lang.Object obj69 = flat3Map64.remove((java.lang.Object) flat3Map67);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator70 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map64);
        org.apache.commons.collections.map.Flat3Map flat3Map71 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map64);
        flat3Map47.putAll((java.util.Map) flat3Map71);
        flat3Map21.putAll((java.util.Map) flat3Map71);
        org.apache.commons.collections.MapIterator mapIterator74 = flat3Map71.mapIterator();
        java.lang.Object obj75 = flat3Map4.put((java.lang.Object) keySet20, (java.lang.Object) flat3Map71);
        java.util.Iterator iterator76 = keySet20.iterator();
        org.apache.commons.collections.map.Flat3Map flat3Map77 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator78 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map77);
        java.util.Collection collection79 = flat3Map77.values();
        org.apache.commons.collections.map.Flat3Map flat3Map80 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator81 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map80);
        java.lang.Object obj82 = flat3Map77.remove((java.lang.Object) flat3Map80);
        org.apache.commons.collections.map.Flat3Map flat3Map83 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator84 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map83);
        boolean boolean85 = flatMapIterator84.hasNext();
        org.apache.commons.collections.map.Flat3Map flat3Map86 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj88 = flat3Map86.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet89 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map86);
        java.util.Set set90 = flat3Map86.entrySet();
        java.lang.Object obj91 = flat3Map77.put((java.lang.Object) flatMapIterator84, (java.lang.Object) flat3Map86);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator92 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map86);
        org.apache.commons.collections.map.Flat3Map flat3Map93 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map86);
        boolean boolean94 = keySet20.remove((java.lang.Object) flat3Map86);
        java.util.Set set95 = flat3Map86.keySet();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator96 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map86);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator96.equals(keySetIterator96)", keySetIterator96.equals(keySetIterator96));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj2 = flat3Map0.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet3 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        java.util.Set set4 = flat3Map0.entrySet();
        java.util.Set set5 = flat3Map0.keySet();
        java.lang.Object obj7 = flat3Map0.get((java.lang.Object) 10);
        java.lang.Object obj9 = flat3Map0.remove((java.lang.Object) (byte) 0);
        org.apache.commons.collections.map.Flat3Map flat3Map10 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        boolean boolean11 = flat3Map0.isEmpty();
        java.util.Set set12 = flat3Map0.keySet();
        java.util.Set set13 = flat3Map0.entrySet();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator14 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator15 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator15.equals(keySetIterator15)", keySetIterator15.equals(keySetIterator15));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator8 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map7);
        java.util.Collection collection9 = flat3Map7.values();
        java.util.Set set10 = flat3Map7.entrySet();
        java.lang.Object obj11 = flat3Map0.get((java.lang.Object) flat3Map7);
        java.util.Set set12 = flat3Map0.entrySet();
        java.util.Set set13 = flat3Map0.entrySet();
        flat3Map0.clear();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator15 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator15.equals(keySetIterator15)", keySetIterator15.equals(keySetIterator15));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.Values values10 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet11 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        java.util.Iterator iterator16 = keySet15.iterator();
        boolean boolean17 = keySet11.remove((java.lang.Object) keySet15);
        org.apache.commons.collections.map.Flat3Map flat3Map18 = new org.apache.commons.collections.map.Flat3Map();
        int int19 = flat3Map18.size();
        org.apache.commons.collections.map.Flat3Map flat3Map21 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj23 = flat3Map21.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet24 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map21);
        java.util.Set set25 = flat3Map21.entrySet();
        java.util.Set set26 = flat3Map21.keySet();
        java.lang.Object obj27 = flat3Map18.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map21);
        org.apache.commons.collections.map.Flat3Map.Values values28 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map18);
        boolean boolean29 = keySet11.contains((java.lang.Object) values28);
        java.util.Iterator iterator30 = keySet11.iterator();
        org.junit.Assert.assertTrue("Contract failed: iterator30.equals(iterator30)", iterator30.equals(iterator30));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj5 = flat3Map3.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet6 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map3);
        java.util.Set set7 = flat3Map3.entrySet();
        java.util.Set set8 = flat3Map3.keySet();
        java.lang.Object obj9 = flat3Map0.put((java.lang.Object) (byte) -1, (java.lang.Object) flat3Map3);
        java.lang.Object obj10 = flat3Map0.clone();
        int int11 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map flat3Map12 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj14 = flat3Map12.get((java.lang.Object) (byte) 10);
        org.apache.commons.collections.map.Flat3Map.KeySet keySet15 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map12);
        org.apache.commons.collections.map.Flat3Map flat3Map16 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj17 = flat3Map16.clone();
        java.util.Set set18 = flat3Map16.entrySet();
        boolean boolean19 = keySet15.remove((java.lang.Object) flat3Map16);
        java.util.Set set20 = flat3Map16.keySet();
        boolean boolean21 = flat3Map0.containsKey((java.lang.Object) flat3Map16);
        org.apache.commons.collections.map.Flat3Map.Values values22 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator23 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator23.equals(keySetIterator23)", keySetIterator23.equals(keySetIterator23));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        java.util.Collection collection2 = flat3Map0.values();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator4 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map3);
        java.lang.Object obj5 = flat3Map0.remove((java.lang.Object) flat3Map3);
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator6 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        org.apache.commons.collections.map.Flat3Map flat3Map7 = new org.apache.commons.collections.map.Flat3Map((java.util.Map) flat3Map0);
        java.lang.String str8 = flat3Map0.toString();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator9 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator9.equals(keySetIterator9)", keySetIterator9.equals(keySetIterator9));
    }
}

