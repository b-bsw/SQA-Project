package org.apache.commons.collections.list;

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
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableItor85.set;
        java.io.Serializable serializable87 = serializableItor85.next();
        boolean boolean88 = serializableItor85.hasNext();
        boolean boolean89 = serializableItor85.hasPrevious();
        int int90 = serializableItor85.previousIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNull(serializableSet86);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + (byte) 1 + "'", serializable87, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.Iterator<java.io.Serializable> serializableItor38 = serializableList31.iterator();
        int int39 = serializableList31.size();
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList31.listIterator();
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableItor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertNotNull(serializableItor40);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.io.Serializable serializable86 = null;
        serializableItor85.last = serializable86;
        int int88 = serializableItor85.previousIndex();
        java.io.Serializable serializable89 = serializableItor85.next();
        java.io.Serializable serializable90 = serializableItor85.next();
        int int91 = serializableItor85.nextIndex();
        boolean boolean92 = serializableItor85.hasNext();
        boolean boolean93 = serializableItor85.hasNext();
        boolean boolean94 = serializableItor85.hasPrevious();
        boolean boolean95 = serializableItor85.hasPrevious();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + serializable89 + "' != '" + (byte) 1 + "'", serializable89, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable90 + "' != '" + 100L + "'", serializable90, 100L);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.String str32 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet33 = serializableList31.asSet();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator34 = serializableList31.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable36 = serializableList31.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str32, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet33);
        org.junit.Assert.assertNotNull(serializableSpliterator34);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet70 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet70, serializableArray69);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList72 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList48, (java.util.Set<java.io.Serializable>) serializableSet70);
        java.io.Serializable serializable75 = serializableList72.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet76 = serializableList72.set;
        java.lang.Object obj77 = null;
        boolean boolean78 = serializableList72.contains(obj77);
        java.util.stream.Stream<java.io.Serializable> serializableStream79 = serializableList72.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet80 = serializableList72.asSet();
        java.io.Serializable serializable81 = serializableList31.set((int) (byte) 0, (java.io.Serializable) serializableList72);
        serializableList31.add((int) (byte) 10, (java.io.Serializable) '#');
        java.util.stream.Stream<java.io.Serializable> serializableStream85 = serializableList31.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable87 = serializableList31.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + serializable75 + "' != '" + 1.0d + "'", serializable75, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableStream79);
        org.junit.Assert.assertNotNull(serializableSet80);
        org.junit.Assert.assertEquals("'" + serializable81 + "' != '" + (byte) 1 + "'", serializable81, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream85);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        java.io.Serializable serializable94 = serializableItor89.next();
        java.util.Set<java.io.Serializable> serializableSet95 = serializableItor89.set;
        int int96 = serializableItor89.previousIndex();
        boolean boolean97 = serializableItor89.hasPrevious();
        java.io.Serializable serializable98 = serializableItor89.previous();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 100 + "'", serializable94, (short) 100);
        org.junit.Assert.assertNull(serializableSet95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertEquals("'" + serializable98 + "' != '" + (short) 100 + "'", serializable98, (short) 100);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.Object[] objArray32 = serializableList31.toArray();
        boolean boolean33 = serializableList31.isEmpty();
        serializableList31.clear();
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList42 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList42, serializableArray41);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet64 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet64, serializableArray63);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList66 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList42, (java.util.Set<java.io.Serializable>) serializableSet64);
        java.io.Serializable serializable69 = serializableList66.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet70 = serializableList66.set;
        java.lang.Object obj71 = null;
        boolean boolean72 = serializableList66.contains(obj71);
        boolean boolean74 = serializableList66.contains((java.lang.Object) false);
        java.util.Iterator<java.io.Serializable> serializableItor75 = serializableList66.iterator();
        boolean boolean76 = serializableList31.contains((java.lang.Object) serializableItor75);
        java.util.stream.Stream<java.io.Serializable> serializableStream77 = serializableList31.stream();
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList31.equals(obj78);
        java.util.ListIterator<java.io.Serializable> serializableItor80 = serializableList31.listIterator();
        java.util.Set<java.io.Serializable> serializableSet81 = serializableList31.set;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable83 = serializableList31.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(serializableArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + serializable69 + "' != '" + 1.0d + "'", serializable69, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(serializableItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(serializableStream77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(serializableItor80);
        org.junit.Assert.assertNotNull(serializableSet81);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.previous();
        boolean boolean93 = serializableItor89.hasNext();
        boolean boolean94 = serializableItor89.hasPrevious();
        int int95 = serializableItor89.previousIndex();
        int int96 = serializableItor89.nextIndex();
        int int97 = serializableItor89.nextIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + 100L + "'", serializable92, 100L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList32 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.Set<java.io.Serializable> serializableSet33 = serializableList32.asSet();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(serializableList32);
        org.junit.Assert.assertNotNull(serializableSet33);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        boolean boolean79 = serializableList71.contains((java.lang.Object) false);
        boolean boolean80 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        java.util.stream.Stream<java.io.Serializable> serializableStream81 = serializableList71.parallelStream();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList82 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList71);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator83 = serializableList82.spliterator();
        java.util.Set<java.io.Serializable> serializableSet84 = serializableList82.set;
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList85 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList82);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableStream81);
        org.junit.Assert.assertNotNull(serializableList82);
        org.junit.Assert.assertNotNull(serializableSpliterator83);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertNotNull(serializableList85);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        java.util.Set<java.io.Serializable> serializableSet92 = serializableItor89.set;
        java.io.Serializable serializable93 = serializableItor89.last;
        // The following exception was thrown during execution in test generation
        try {
            serializableItor89.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertNull(serializableSet92);
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean74 = serializableList70.isEmpty();
        boolean boolean75 = serializableList31.containsAll((java.util.Collection<java.io.Serializable>) serializableList70);
        boolean boolean76 = serializableList70.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        java.util.stream.Stream<java.io.Serializable> serializableStream43 = serializableList31.stream();
        java.lang.Object[] objArray44 = serializableList31.toArray();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList45 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        boolean boolean46 = serializableList31.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableStream43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Iterator<java.io.Serializable> serializableItor40 = serializableList31.iterator();
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList31.listIterator(0);
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor42);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList38 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList31.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList31.listIterator();
        boolean boolean42 = serializableList31.remove((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableList38);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList43, serializableArray42);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet65 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet65, serializableArray64);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList67 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList43, (java.util.Set<java.io.Serializable>) serializableSet65);
        java.io.Serializable serializable70 = serializableList67.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet71 = serializableList67.set;
        boolean boolean72 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableSet71);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList31.set;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable75 = serializableList31.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 8 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + serializable70 + "' != '" + 1.0d + "'", serializable70, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(serializableSet73);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableList73.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList87 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList73);
        java.lang.Object obj88 = null;
        int int89 = serializableList87.lastIndexOf(obj88);
        java.util.ListIterator<java.io.Serializable> serializableItor90 = serializableList87.listIterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableSet86);
        org.junit.Assert.assertNotNull(serializableList87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(serializableItor90);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        int int43 = serializableList31.size();
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList51, (java.util.Set<java.io.Serializable>) serializableSet73);
        java.io.Serializable serializable78 = serializableList75.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet79 = serializableList75.set;
        boolean boolean81 = serializableList75.remove((java.lang.Object) 100.0f);
        boolean boolean82 = serializableList31.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        boolean boolean84 = serializableList31.remove((java.lang.Object) (byte) 1);
        serializableList31.clear();
        java.util.Iterator<java.io.Serializable> serializableItor86 = serializableList31.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor87 = serializableList31.iterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + serializable78 + "' != '" + 1.0d + "'", serializable78, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(serializableItor86);
        org.junit.Assert.assertNotNull(serializableItor87);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.previous();
        boolean boolean93 = serializableItor89.hasNext();
        int int94 = serializableItor89.nextIndex();
        int int95 = serializableItor89.previousIndex();
        boolean boolean96 = serializableItor89.hasPrevious();
        java.util.Set<java.io.Serializable> serializableSet97 = serializableItor89.set;
        // The following exception was thrown during execution in test generation
        try {
            serializableItor89.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + 100L + "'", serializable92, 100L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(serializableSet97);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.io.Serializable[] serializableArray88 = new java.io.Serializable[] { (-1.0f), 100, 10L, 0.0d, 0.0f, (-1), "", (-1.0f), 1, '#', 100, 10L, 'a', ' ', 1.0d, (short) 10 };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet89 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet89, serializableArray88);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList91 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList31, (java.util.Set<java.io.Serializable>) serializableSet89);
        java.lang.String str92 = serializableList91.toString();
        int int93 = serializableList91.size();
        java.util.stream.Stream<java.io.Serializable> serializableStream94 = serializableList91.stream();
        serializableList91.clear();
        serializableList91.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]" + "'", str92, "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 12 + "'", int93 == 12);
        org.junit.Assert.assertNotNull(serializableStream94);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.String str32 = serializableList31.toString();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator33 = serializableList31.spliterator();
        serializableList31.clear();
        java.util.stream.Stream<java.io.Serializable> serializableStream35 = serializableList31.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList38 = serializableList31.subList(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str32, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSpliterator33);
        org.junit.Assert.assertNotNull(serializableStream35);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        boolean boolean72 = serializableList31.isEmpty();
        java.lang.Object[] objArray73 = serializableList31.toArray();
        java.util.stream.Stream<java.io.Serializable> serializableStream74 = serializableList31.stream();
        java.io.Serializable serializable76 = serializableList31.get(0);
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableStream74);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + (byte) 1 + "'", serializable76, (byte) 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator38 = serializableList31.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor39 = serializableList31.listIterator();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.lang.String str72 = serializableList71.toString();
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList71.asSet();
        boolean boolean74 = serializableList31.equals((java.lang.Object) serializableSet73);
        java.lang.String str75 = serializableList31.toString();
        java.io.Serializable serializable78 = serializableList31.set((int) (byte) 1, (java.io.Serializable) '4');
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator38);
        org.junit.Assert.assertNotNull(serializableItor39);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str72, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str75, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals("'" + serializable78 + "' != '" + 100L + "'", serializable78, 100L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        boolean boolean91 = serializableItor89.hasNext();
        int int92 = serializableItor89.nextIndex();
        java.io.Serializable serializable93 = serializableItor89.previous();
        java.io.Serializable serializable94 = serializableItor89.last;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + 100L + "'", serializable94, 100L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList43, serializableArray42);
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet65 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet65, serializableArray64);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList67 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList43, (java.util.Set<java.io.Serializable>) serializableSet65);
        java.io.Serializable serializable70 = serializableList67.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet71 = serializableList67.set;
        java.lang.Object obj72 = null;
        boolean boolean73 = serializableList67.contains(obj72);
        java.util.stream.Stream<java.io.Serializable> serializableStream74 = serializableList67.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList67.asSet();
        java.lang.Object[] objArray76 = serializableList67.toArray();
        boolean boolean77 = serializableList31.contains((java.lang.Object) objArray76);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator79 = serializableList31.spliterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertNotNull(serializableArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + serializable70 + "' != '" + 1.0d + "'", serializable70, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(serializableStream74);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableList78);
        org.junit.Assert.assertNotNull(serializableSpliterator79);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable43 = serializableList31.remove(0);
        java.util.Iterator<java.io.Serializable> serializableItor44 = serializableList31.iterator();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList45 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList45.replaceAll(serializableUnaryOperator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableList45);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        boolean boolean79 = serializableList71.contains((java.lang.Object) false);
        boolean boolean80 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        java.util.ListIterator<java.io.Serializable> serializableItor82 = serializableList31.listIterator((int) (byte) 0);
        int int83 = serializableList31.size();
        boolean boolean84 = serializableList31.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream85 = serializableList31.stream();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableItor82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(serializableStream85);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        int int43 = serializableList31.size();
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList51, (java.util.Set<java.io.Serializable>) serializableSet73);
        java.io.Serializable serializable78 = serializableList75.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet79 = serializableList75.set;
        boolean boolean81 = serializableList75.remove((java.lang.Object) 100.0f);
        boolean boolean82 = serializableList31.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.util.Iterator<java.io.Serializable> serializableItor83 = serializableList75.iterator();
        java.lang.Object obj84 = null;
        boolean boolean85 = serializableList75.contains(obj84);
        java.util.ListIterator<java.io.Serializable> serializableItor86 = serializableList75.listIterator();
        java.io.Serializable serializable88 = serializableList75.remove(5);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + serializable78 + "' != '" + 1.0d + "'", serializable78, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableItor86);
        org.junit.Assert.assertEquals("'" + serializable88 + "' != '" + 10L + "'", serializable88, 10L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        java.io.Serializable serializable94 = serializableItor89.next();
        java.io.Serializable serializable95 = serializableItor89.next();
        boolean boolean96 = serializableItor89.hasNext();
        java.io.Serializable serializable97 = serializableItor89.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 100 + "'", serializable94, (short) 100);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + (-1.0f) + "'", serializable95, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertEquals("'" + serializable97 + "' != '" + 10.0d + "'", serializable97, 10.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.previous();
        boolean boolean93 = serializableItor89.hasNext();
        boolean boolean94 = serializableItor89.hasPrevious();
        int int95 = serializableItor89.previousIndex();
        boolean boolean96 = serializableItor89.hasPrevious();
        java.io.Serializable serializable97 = serializableItor89.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + 100L + "'", serializable92, 100L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + serializable97 + "' != '" + 100L + "'", serializable97, 100L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable43 = serializableList31.remove(0);
        java.util.Iterator<java.io.Serializable> serializableItor44 = serializableList31.iterator();
        serializableList31.clear();
        java.util.Set<java.io.Serializable> serializableSet46 = serializableList31.set;
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList47 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.Set<java.io.Serializable> serializableSet48 = serializableList47.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableSet46);
        org.junit.Assert.assertNotNull(serializableList47);
        org.junit.Assert.assertNotNull(serializableSet48);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.String str32 = serializableList31.toString();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator33 = serializableList31.spliterator();
        serializableList31.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator35 = serializableList31.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList38 = serializableList31.subList(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str32, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSpliterator33);
        org.junit.Assert.assertNotNull(serializableSpliterator35);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList31.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable74 = serializableList31.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableItor72);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableItor85.set;
        boolean boolean87 = serializableItor85.hasNext();
        java.io.Serializable serializable88 = serializableItor85.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNull(serializableSet86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + serializable88 + "' != '" + (byte) 1 + "'", serializable88, (byte) 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet39 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList40 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList43 = serializableList40.subList((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableSet39);
        org.junit.Assert.assertNotNull(serializableList40);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        serializableList31.clear();
        java.util.stream.Stream<java.io.Serializable> serializableStream73 = serializableList31.parallelStream();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList74 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableStream73);
        org.junit.Assert.assertNotNull(serializableList74);
        org.junit.Assert.assertNotNull(serializableList75);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        java.lang.String str43 = serializableList31.toString();
        boolean boolean44 = serializableList31.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor45 = serializableList31.listIterator();
        java.util.Set<java.io.Serializable> serializableSet46 = serializableList31.set;
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList54 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList54, serializableArray53);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList54, (java.util.Set<java.io.Serializable>) serializableSet76);
        java.io.Serializable serializable81 = serializableList78.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet82 = serializableList78.set;
        boolean boolean84 = serializableList78.remove((java.lang.Object) 100.0f);
        java.util.Set<java.io.Serializable> serializableSet85 = serializableList78.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList86 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList78);
        int int87 = serializableList31.lastIndexOf((java.lang.Object) serializableList86);
        java.util.Set<java.io.Serializable> serializableSet88 = serializableList31.asSet();
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str43, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(serializableItor45);
        org.junit.Assert.assertNotNull(serializableSet46);
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + serializable81 + "' != '" + 1.0d + "'", serializable81, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(serializableSet85);
        org.junit.Assert.assertNotNull(serializableList86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(serializableSet88);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.io.Serializable serializable86 = null;
        serializableItor85.last = serializable86;
        int int88 = serializableItor85.previousIndex();
        boolean boolean89 = serializableItor85.hasNext();
        int int90 = serializableItor85.previousIndex();
        boolean boolean91 = serializableItor85.hasPrevious();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        boolean boolean85 = serializableList31.add((java.io.Serializable) 1.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator86 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet87 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList88 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator86);
        org.junit.Assert.assertNotNull(serializableSet87);
        org.junit.Assert.assertNotNull(serializableList88);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet39 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList40 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.lang.Object[] objArray41 = serializableList40.toArray();
        java.lang.Object obj42 = null;
        boolean boolean43 = serializableList40.equals(obj42);
        java.util.stream.Stream<java.io.Serializable> serializableStream44 = serializableList40.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableSet39);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(serializableStream44);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.io.Serializable serializable86 = null;
        serializableItor85.last = serializable86;
        java.io.Serializable serializable88 = serializableItor85.next();
        java.util.Set<java.io.Serializable> serializableSet89 = serializableItor85.set;
        int int90 = serializableItor85.nextIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertEquals("'" + serializable88 + "' != '" + (byte) 1 + "'", serializable88, (byte) 1);
        org.junit.Assert.assertNull(serializableSet89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        boolean boolean79 = serializableList71.contains((java.lang.Object) false);
        boolean boolean80 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        java.util.stream.Stream<java.io.Serializable> serializableStream81 = serializableList71.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList71.listIterator(1);
        boolean boolean85 = serializableList71.contains((java.lang.Object) (byte) 10);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList71.listIterator(6);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableStream81);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableItor87);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList70.set;
        java.lang.Object obj75 = null;
        boolean boolean76 = serializableList70.contains(obj75);
        boolean boolean78 = serializableList70.contains((java.lang.Object) false);
        boolean boolean80 = serializableList70.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable82 = serializableList70.remove(0);
        boolean boolean83 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList70);
        java.lang.Object[] objArray84 = serializableList70.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator85 = serializableList70.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable87 = serializableList70.remove(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 12 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + serializable82 + "' != '" + (byte) 1 + "'", serializable82, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[100, 100, -1.0, 10.0, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[100, 100, -1.0, 10.0, 10, -1.0]");
        org.junit.Assert.assertNotNull(serializableSpliterator85);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        boolean boolean84 = serializableList73.isEmpty();
        java.util.Set<java.io.Serializable> serializableSet85 = serializableList73.set;
        java.util.Set<java.io.Serializable> serializableSet86 = serializableList73.set;
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator87 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList73.replaceAll(serializableUnaryOperator87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(serializableSet85);
        org.junit.Assert.assertNotNull(serializableSet86);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableItor85.set;
        java.io.Serializable serializable87 = serializableItor85.next();
        java.util.Set<java.io.Serializable> serializableSet88 = serializableItor85.set;
        int int89 = serializableItor85.previousIndex();
        boolean boolean90 = serializableItor85.hasPrevious();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNull(serializableSet86);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + (byte) 1 + "'", serializable87, (byte) 1);
        org.junit.Assert.assertNull(serializableSet88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        boolean boolean79 = serializableList71.contains((java.lang.Object) false);
        boolean boolean80 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList81 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable83 = serializableList81.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableList81);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        int int43 = serializableList31.size();
        int int44 = serializableList31.size();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList45 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.stream.Stream<java.io.Serializable> serializableStream46 = serializableList31.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertNotNull(serializableList45);
        org.junit.Assert.assertNotNull(serializableStream46);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        int int95 = serializableItor89.previousIndex();
        java.io.Serializable serializable96 = serializableItor89.last;
        boolean boolean97 = serializableItor89.hasNext();
        boolean boolean98 = serializableItor89.hasPrevious();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertNull(serializableSet94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet40 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList41 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        boolean boolean43 = serializableList31.remove((java.lang.Object) 0L);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator44 = serializableList31.spliterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet40);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator44);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        boolean boolean93 = serializableItor89.hasPrevious();
        boolean boolean94 = serializableItor89.hasNext();
        java.io.Serializable serializable95 = serializableItor89.next();
        java.io.Serializable serializable96 = serializableItor89.last;
        java.io.Serializable serializable97 = serializableItor89.last;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + 100L + "'", serializable95, 100L);
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
        org.junit.Assert.assertEquals("'" + serializable97 + "' != '" + 100L + "'", serializable97, 100L);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        java.io.Serializable serializable94 = serializableItor89.next();
        java.util.Set<java.io.Serializable> serializableSet95 = serializableItor89.set;
        java.util.Set<java.io.Serializable> serializableSet96 = serializableItor89.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 100 + "'", serializable94, (short) 100);
        org.junit.Assert.assertNull(serializableSet95);
        org.junit.Assert.assertNull(serializableSet96);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        boolean boolean95 = serializableItor89.hasPrevious();
        java.util.Set<java.io.Serializable> serializableSet96 = serializableItor89.set;
        int int97 = serializableItor89.previousIndex();
        int int98 = serializableItor89.previousIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertNull(serializableSet94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(serializableSet96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        serializableList31.add(0, (java.io.Serializable) 0);
        int int43 = serializableList31.size();
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList51, (java.util.Set<java.io.Serializable>) serializableSet73);
        java.io.Serializable serializable78 = serializableList75.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet79 = serializableList75.set;
        boolean boolean81 = serializableList75.remove((java.lang.Object) 100.0f);
        boolean boolean82 = serializableList31.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        boolean boolean84 = serializableList31.remove((java.lang.Object) (byte) 1);
        java.util.ListIterator<java.io.Serializable> serializableItor86 = serializableList31.listIterator(0);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + serializable78 + "' != '" + 1.0d + "'", serializable78, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(serializableItor86);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.util.Set<java.io.Serializable> serializableSet38 = serializableList31.asSet();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList31.spliterator();
        java.lang.String str40 = serializableList31.toString();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableSet38);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str40, "[1, 100, 100, -1.0, 10.0, 10]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]", "[1, 100, 100, -1.0, 10.0, 10]", "[1.0, 100, 100, -1.0, 10.0, 10]", "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "[]", "[1]", "[1.0, 100, 100, -1.0, 10.0, 10]", "[1.0, 100, 100, -1.0, 10.0, 10]", "[]", "[1]", "[1.0, 100, 100, -1.0, 10.0, 10]" };
        java.util.LinkedHashSet<java.lang.CharSequence> charSequenceSet17 = new java.util.LinkedHashSet<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceSet17, charSequenceArray16);
        org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence> charSequenceList19 = new org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList7, (java.util.Set<java.lang.CharSequence>) charSequenceSet17);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "[]", "[100, 100, -1.0, 10.0, 10, -1.0]", "hi!", "[100, 100, -1.0, 10.0, 10, -1.0]", "[1, 100, 100, -1.0, 10.0, 10]", "[100, 100, -1.0, 10.0, 10, -1.0]", "[1, 100, 100, -1.0, 10.0, 10]" };
        java.util.LinkedHashSet<java.lang.CharSequence> charSequenceSet28 = new java.util.LinkedHashSet<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceSet28, charSequenceArray27);
        org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence> charSequenceList30 = new org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList19, (java.util.Set<java.lang.CharSequence>) charSequenceSet28);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "[100, 100, -1.0, 10.0, 10]", "[1, 100, 100, -1.0, 10.0, 10]", "[null]", "[null]", "[100, 100, -1.0, 10.0, 10]", "[1, 100, 100, -1.0, 10.0, 10, -1]", "[1, -1, 100, 100, -1.0, 10.0, 10]", "[1, 100, 100, -1.0, 10.0, 10, -1]", "[100, 100, -1.0, 10.0, 10, -1.0]", "[10.0, 100, 100, -1.0, 10.0, 10]", "[1]" };
        java.util.LinkedHashSet<java.lang.CharSequence> charSequenceSet43 = new java.util.LinkedHashSet<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceSet43, charSequenceArray42);
        org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence> charSequenceList45 = new org.apache.commons.collections.list.SetUniqueList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList19, (java.util.Set<java.lang.CharSequence>) charSequenceSet43);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.util.ListIterator<java.io.Serializable> serializableItor43 = serializableList31.listIterator((int) (short) 0);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList51, (java.util.Set<java.io.Serializable>) serializableSet73);
        java.lang.String str76 = serializableList75.toString();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator77 = serializableList75.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList75.listIterator();
        boolean boolean79 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList75);
        boolean boolean81 = serializableList31.contains((java.lang.Object) 0L);
        java.util.ListIterator<java.io.Serializable> serializableItor82 = serializableList31.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream83 = serializableList31.parallelStream();
        int int85 = serializableList31.indexOf((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(serializableItor43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str76, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSpliterator77);
        org.junit.Assert.assertNotNull(serializableItor78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(serializableItor82);
        org.junit.Assert.assertNotNull(serializableStream83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        java.lang.String str36 = serializableList31.toString();
        int int38 = serializableList31.indexOf((java.lang.Object) "");
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.lang.Object[] objArray71 = serializableList70.toArray();
        boolean boolean72 = serializableList70.isEmpty();
        boolean boolean73 = serializableList31.containsAll((java.util.Collection<java.io.Serializable>) serializableList70);
        serializableList31.clear();
        java.util.stream.Stream<java.io.Serializable> serializableStream75 = serializableList31.stream();
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str36, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(serializableStream75);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.String str32 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet33 = serializableList31.asSet();
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray41 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList42 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList42, serializableArray41);
        java.io.Serializable[] serializableArray63 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet64 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet64, serializableArray63);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList66 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList42, (java.util.Set<java.io.Serializable>) serializableSet64);
        java.io.Serializable serializable69 = serializableList66.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet70 = serializableList66.set;
        boolean boolean72 = serializableList66.remove((java.lang.Object) 100.0f);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList66.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList74 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList66);
        boolean boolean76 = serializableList31.contains((java.lang.Object) serializableList75);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable78 = serializableList75.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str32, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(serializableArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + serializable69 + "' != '" + 1.0d + "'", serializable69, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertNotNull(serializableList74);
        org.junit.Assert.assertNotNull(serializableList75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        boolean boolean94 = serializableItor89.hasNext();
        java.util.Set<java.io.Serializable> serializableSet95 = serializableItor89.set;
        int int96 = serializableItor89.nextIndex();
        int int97 = serializableItor89.previousIndex();
        java.util.Set<java.io.Serializable> serializableSet98 = serializableItor89.set;
        java.io.Serializable serializable99 = serializableItor89.previous();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(serializableSet95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNull(serializableSet98);
        org.junit.Assert.assertEquals("'" + serializable99 + "' != '" + 100L + "'", serializable99, 100L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.util.Set<java.io.Serializable> serializableSet91 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor92 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>((java.util.ListIterator<java.io.Serializable>) serializableItor89, serializableSet91);
        boolean boolean93 = serializableItor92.hasPrevious();
        int int94 = serializableItor92.nextIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.io.Serializable serializable42 = serializableList31.remove((int) (short) 1);
        java.util.Iterator<java.io.Serializable> serializableItor43 = serializableList31.iterator();
        serializableList31.clear();
        java.util.Iterator<java.io.Serializable> serializableItor45 = serializableList31.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor46 = serializableList31.iterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + 100L + "'", serializable42, 100L);
        org.junit.Assert.assertNotNull(serializableItor43);
        org.junit.Assert.assertNotNull(serializableItor45);
        org.junit.Assert.assertNotNull(serializableItor46);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.Iterator<java.io.Serializable> serializableItor38 = serializableList31.iterator();
        int int39 = serializableList31.size();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.lang.Object[] objArray72 = serializableList71.toArray();
        boolean boolean73 = serializableList71.isEmpty();
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList71.asSet();
        java.io.Serializable serializable76 = serializableList71.get((int) (byte) 0);
        int int77 = serializableList31.indexOf((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableItor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        boolean boolean91 = serializableItor89.hasPrevious();
        boolean boolean92 = serializableItor89.hasPrevious();
        java.util.Set<java.io.Serializable> serializableSet93 = serializableItor89.set;
        boolean boolean94 = serializableItor89.hasPrevious();
        java.io.Serializable serializable95 = serializableItor89.last;
        boolean boolean96 = serializableItor89.hasNext();
        boolean boolean97 = serializableItor89.hasPrevious();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNull(serializableSet93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(serializable95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean82 = serializableList69.add((java.io.Serializable) 0.0f);
        serializableList69.add((int) '4', (java.io.Serializable) 0.0d);
        int int86 = serializableList31.lastIndexOf((java.lang.Object) 0.0d);
        boolean boolean87 = serializableList31.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream88 = serializableList31.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor89 = serializableList31.listIterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(serializableStream88);
        org.junit.Assert.assertNotNull(serializableItor89);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        java.io.Serializable serializable94 = serializableItor89.next();
        java.util.Set<java.io.Serializable> serializableSet95 = serializableItor89.set;
        int int96 = serializableItor89.previousIndex();
        java.util.Set<java.io.Serializable> serializableSet97 = serializableItor89.set;
        java.io.Serializable serializable98 = serializableItor89.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + (short) 100 + "'", serializable94, (short) 100);
        org.junit.Assert.assertNull(serializableSet95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNull(serializableSet97);
        org.junit.Assert.assertEquals("'" + serializable98 + "' != '" + (-1.0f) + "'", serializable98, (-1.0f));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        boolean boolean94 = serializableItor89.hasNext();
        boolean boolean95 = serializableItor89.hasNext();
        boolean boolean96 = serializableItor89.hasNext();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        java.lang.String str36 = serializableList31.toString();
        int int38 = serializableList31.indexOf((java.lang.Object) "");
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList70.set;
        java.lang.Object obj75 = null;
        boolean boolean76 = serializableList70.contains(obj75);
        boolean boolean78 = serializableList70.contains((java.lang.Object) false);
        serializableList70.add(0, (java.io.Serializable) 0);
        java.io.Serializable serializable84 = serializableList70.set((int) (byte) 0, (java.io.Serializable) 10.0f);
        boolean boolean85 = serializableList70.isEmpty();
        boolean boolean86 = serializableList31.add((java.io.Serializable) serializableList70);
        boolean boolean87 = serializableList31.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor89 = serializableList31.listIterator(0);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList90 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.io.Serializable serializable92 = serializableList31.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList95 = serializableList31.subList(5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str36, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + serializable84 + "' != '" + (byte) 1 + "'", serializable84, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(serializableItor89);
        org.junit.Assert.assertNotNull(serializableList90);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + (short) 100 + "'", serializable92, (short) 100);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableItor85.set;
        java.io.Serializable serializable87 = serializableItor85.next();
        boolean boolean88 = serializableItor85.hasNext();
        java.io.Serializable serializable89 = serializableItor85.previous();
        int int90 = serializableItor85.nextIndex();
        java.io.Serializable serializable91 = serializableItor85.last;
        boolean boolean92 = serializableItor85.hasNext();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNull(serializableSet86);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + (byte) 1 + "'", serializable87, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + serializable89 + "' != '" + (byte) 1 + "'", serializable89, (byte) 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + (byte) 1 + "'", serializable91, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor37 = serializableList31.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet70 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet70, serializableArray69);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList72 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList48, (java.util.Set<java.io.Serializable>) serializableSet70);
        java.io.Serializable serializable75 = serializableList72.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet76 = serializableList72.set;
        boolean boolean77 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList72);
        serializableList31.clear();
        serializableList31.clear();
        boolean boolean80 = serializableList31.isEmpty();
        serializableList31.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList31.spliterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + serializable75 + "' != '" + 1.0d + "'", serializable75, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.previous();
        boolean boolean93 = serializableItor89.hasNext();
        boolean boolean94 = serializableItor89.hasPrevious();
        int int95 = serializableItor89.previousIndex();
        java.util.Set<java.io.Serializable> serializableSet96 = serializableItor89.set;
        int int97 = serializableItor89.previousIndex();
        boolean boolean98 = serializableItor89.hasNext();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + 100L + "'", serializable92, 100L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNull(serializableSet96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        int int36 = serializableList31.size();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet66 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet66, serializableArray65);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList68 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList44, (java.util.Set<java.io.Serializable>) serializableSet66);
        java.util.AbstractList[] abstractListArray70 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.io.Serializable>[] serializableListArray71 = (java.util.AbstractList<java.io.Serializable>[]) abstractListArray70;
        serializableListArray71[0] = serializableList44;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<java.io.Serializable>[] serializableListArray74 = serializableList31.toArray(serializableListArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.util.AbstractList");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(abstractListArray70);
        org.junit.Assert.assertNotNull(serializableListArray71);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable43 = serializableList31.remove(0);
        java.lang.Object[] objArray44 = serializableList31.toArray();
        java.io.Serializable serializable46 = serializableList31.remove((int) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream47 = serializableList31.stream();
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList56 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList56, serializableArray55);
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet78 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet78, serializableArray77);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList80 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList56, (java.util.Set<java.io.Serializable>) serializableSet78);
        java.io.Serializable serializable83 = serializableList80.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet84 = serializableList80.set;
        java.lang.Object obj85 = null;
        boolean boolean86 = serializableList80.contains(obj85);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList87 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList80);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator88 = serializableList80.spliterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator89 = serializableList80.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            serializableList31.add((int) '#', (java.io.Serializable) serializableList80);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (byte) 1 + "'", serializable43, (byte) 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, 100, -1.0, 10.0, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, 100, -1.0, 10.0, 10, -1.0]");
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + (short) 100 + "'", serializable46, (short) 100);
        org.junit.Assert.assertNotNull(serializableStream47);
        org.junit.Assert.assertNotNull(serializableArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + serializable83 + "' != '" + 1.0d + "'", serializable83, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(serializableList87);
        org.junit.Assert.assertNotNull(serializableSpliterator88);
        org.junit.Assert.assertNotNull(serializableSpliterator89);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.util.ListIterator<java.io.Serializable> serializableItor43 = serializableList31.listIterator((int) (short) 0);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList51, (java.util.Set<java.io.Serializable>) serializableSet73);
        java.io.Serializable serializable78 = serializableList75.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet79 = serializableList75.set;
        java.lang.Object obj80 = null;
        boolean boolean81 = serializableList75.contains(obj80);
        boolean boolean82 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.lang.Class<?> wildcardClass83 = serializableList31.getClass();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(serializableItor43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + serializable78 + "' != '" + 1.0d + "'", serializable78, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet39 = serializableList31.asSet();
        boolean boolean40 = serializableList31.isEmpty();
        serializableList31.clear();
        serializableList31.clear();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator43 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList31.replaceAll(serializableUnaryOperator43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableSet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        boolean boolean79 = serializableList71.contains((java.lang.Object) false);
        boolean boolean80 = serializableList31.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList81 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList71);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList71.spliterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream83 = serializableList71.parallelStream();
        java.lang.Object[] objArray84 = serializableList71.toArray();
        java.util.Set<java.io.Serializable> serializableSet85 = serializableList71.set;
        java.util.Spliterator<java.io.Serializable> serializableSpliterator86 = serializableList71.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList71.listIterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableList81);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertNotNull(serializableStream83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet85);
        org.junit.Assert.assertNotNull(serializableSpliterator86);
        org.junit.Assert.assertNotNull(serializableItor87);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet70 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet70, serializableArray69);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList72 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList48, (java.util.Set<java.io.Serializable>) serializableSet70);
        java.io.Serializable serializable75 = serializableList72.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet76 = serializableList72.set;
        boolean boolean77 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList72);
        serializableList31.clear();
        java.util.Iterator<java.io.Serializable> serializableItor79 = serializableList31.iterator();
        java.lang.String str80 = serializableList31.toString();
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "[]", "[1, 100, 100, -1.0, 10.0, 10, 1.0, 100, 100, -1.0, 10.0, 10]" };
        java.lang.CharSequence[] charSequenceArray84 = serializableList31.toArray(charSequenceArray83);
        java.lang.Class<?> wildcardClass85 = serializableList31.getClass();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + serializable75 + "' != '" + 1.0d + "'", serializable75, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[]" + "'", str80, "[]");
        org.junit.Assert.assertNotNull(charSequenceArray83);
        org.junit.Assert.assertNotNull(charSequenceArray84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.io.Serializable serializable86 = null;
        serializableItor85.last = serializable86;
        int int88 = serializableItor85.previousIndex();
        java.util.Set<java.io.Serializable> serializableSet89 = serializableItor85.set;
        int int90 = serializableItor85.nextIndex();
        java.util.Set<java.io.Serializable> serializableSet91 = serializableItor85.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(serializableSet89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(serializableSet91);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList70.set;
        java.lang.Object obj75 = null;
        boolean boolean76 = serializableList70.contains(obj75);
        boolean boolean78 = serializableList70.contains((java.lang.Object) false);
        boolean boolean80 = serializableList70.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable82 = serializableList70.remove(0);
        boolean boolean83 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList70);
        java.util.Set<java.io.Serializable> serializableSet84 = serializableList70.asSet();
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList70.listIterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator86 = serializableList70.spliterator();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList87 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList70);
        java.util.Set<java.io.Serializable> serializableSet88 = serializableList70.asSet();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + serializable82 + "' != '" + (byte) 1 + "'", serializable82, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertNotNull(serializableItor85);
        org.junit.Assert.assertNotNull(serializableSpliterator86);
        org.junit.Assert.assertNotNull(serializableList87);
        org.junit.Assert.assertNotNull(serializableSet88);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        boolean boolean41 = serializableList31.add((java.io.Serializable) (-1.0d));
        java.util.ListIterator<java.io.Serializable> serializableItor43 = serializableList31.listIterator((int) (short) 0);
        java.io.Serializable serializable45 = serializableList31.remove(0);
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList53 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList53, serializableArray52);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList53, (java.util.Set<java.io.Serializable>) serializableSet75);
        java.io.Serializable serializable80 = serializableList77.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet81 = serializableList77.set;
        java.lang.Object obj82 = null;
        boolean boolean83 = serializableList77.contains(obj82);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList84 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList77);
        java.lang.Class<?> wildcardClass85 = serializableList84.getClass();
        boolean boolean86 = serializableList31.remove((java.lang.Object) wildcardClass85);
        java.util.stream.Stream<java.io.Serializable> serializableStream87 = serializableList31.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(serializableItor43);
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + (byte) 1 + "'", serializable45, (byte) 1);
        org.junit.Assert.assertNotNull(serializableArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + serializable80 + "' != '" + 1.0d + "'", serializable80, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableList84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(serializableStream87);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList31.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor73 = serializableList31.listIterator();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.io.Serializable serializable94 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet95 = serializableItor89.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertEquals("'" + serializable94 + "' != '" + 100L + "'", serializable94, 100L);
        org.junit.Assert.assertNull(serializableSet95);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.util.Set<java.io.Serializable> serializableSet86 = serializableItor85.set;
        boolean boolean87 = serializableItor85.hasNext();
        int int88 = serializableItor85.previousIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNull(serializableSet86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.util.Set<java.io.Serializable> serializableSet36 = serializableList31.set;
        java.io.Serializable serializable38 = serializableList31.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertNotNull(serializableSet36);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + 100L + "'", serializable38, 100L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.util.Set<java.io.Serializable> serializableSet38 = serializableList31.asSet();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList31.spliterator();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.io.Serializable serializable74 = serializableList71.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet75 = serializableList71.set;
        java.lang.Object obj76 = null;
        boolean boolean77 = serializableList71.contains(obj76);
        java.util.stream.Stream<java.io.Serializable> serializableStream78 = serializableList71.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet79 = serializableList71.asSet();
        java.lang.Object[] objArray80 = serializableList71.toArray();
        int int81 = serializableList31.lastIndexOf((java.lang.Object) serializableList71);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableSet38);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + serializable74 + "' != '" + 1.0d + "'", serializable74, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableStream78);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.util.Set<java.io.Serializable> serializableSet91 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor92 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>((java.util.ListIterator<java.io.Serializable>) serializableItor89, serializableSet91);
        boolean boolean93 = serializableItor89.hasNext();
        boolean boolean94 = serializableItor89.hasNext();
        java.io.Serializable serializable95 = serializableItor89.previous();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + 100L + "'", serializable95, 100L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.lang.String str32 = serializableList31.toString();
        int int33 = serializableList31.size();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList34 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.lang.Object[] objArray35 = serializableList34.toArray();
        java.lang.Object[] objArray36 = serializableList34.toArray();
        java.lang.Object[] objArray37 = serializableList34.toArray();
        java.lang.String str38 = serializableList34.toString();
        java.lang.String str39 = serializableList34.toString();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet69 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet69, serializableArray68);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList71 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList47, (java.util.Set<java.io.Serializable>) serializableSet69);
        java.lang.String str72 = serializableList71.toString();
        int int73 = serializableList71.size();
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList71.set;
        java.util.stream.Stream<java.io.Serializable> serializableStream75 = serializableList71.parallelStream();
        boolean boolean76 = serializableList34.remove((java.lang.Object) serializableStream75);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str32, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str38, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str72, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 6 + "'", int73 == 6);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertNotNull(serializableStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        boolean boolean95 = serializableItor89.hasPrevious();
        java.util.Set<java.io.Serializable> serializableSet96 = serializableItor89.set;
        int int97 = serializableItor89.previousIndex();
        boolean boolean98 = serializableItor89.hasPrevious();
        int int99 = serializableItor89.nextIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertNull(serializableSet94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(serializableSet96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet40 = serializableList31.asSet();
        java.util.ListIterator<java.io.Serializable> serializableItor41 = serializableList31.listIterator();
        java.lang.String str42 = serializableList31.toString();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet40);
        org.junit.Assert.assertNotNull(serializableItor41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str42, "[1, 100, 100, -1.0, 10.0, 10]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.io.Serializable[] serializableArray88 = new java.io.Serializable[] { (-1.0f), 100, 10L, 0.0d, 0.0f, (-1), "", (-1.0f), 1, '#', 100, 10L, 'a', ' ', 1.0d, (short) 10 };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet89 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet89, serializableArray88);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList91 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList31, (java.util.Set<java.io.Serializable>) serializableSet89);
        boolean boolean92 = serializableList31.isEmpty();
        java.util.Set<java.io.Serializable> serializableSet93 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList94 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(serializableSet93);
        org.junit.Assert.assertNotNull(serializableList94);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        boolean boolean95 = serializableItor89.hasPrevious();
        java.io.Serializable serializable96 = serializableItor89.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertNull(serializableSet94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        boolean boolean85 = serializableList31.add((java.io.Serializable) 1.0d);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList86 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        int int87 = serializableList86.size();
        java.io.Serializable serializable89 = serializableList86.remove(2);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(serializableList86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 8 + "'", int87 == 8);
        org.junit.Assert.assertEquals("'" + serializable89 + "' != '" + (short) 100 + "'", serializable89, (short) 100);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.io.Serializable serializable72 = serializableList69.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet73 = serializableList69.set;
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList69.contains(obj74);
        boolean boolean77 = serializableList69.contains((java.lang.Object) false);
        serializableList69.add(0, (java.io.Serializable) 0);
        boolean boolean81 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList31.listIterator((int) (short) 0);
        java.util.Set<java.io.Serializable> serializableSet84 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor85 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor83, serializableSet84);
        java.io.Serializable serializable86 = null;
        serializableItor85.last = serializable86;
        int int88 = serializableItor85.previousIndex();
        java.io.Serializable serializable89 = serializableItor85.next();
        java.io.Serializable serializable90 = serializableItor85.next();
        int int91 = serializableItor85.nextIndex();
        java.util.Set<java.io.Serializable> serializableSet92 = serializableItor85.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + serializable72 + "' != '" + 1.0d + "'", serializable72, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + serializable89 + "' != '" + (byte) 1 + "'", serializable89, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable90 + "' != '" + 100L + "'", serializable90, 100L);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertNull(serializableSet92);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.util.Set<java.io.Serializable> serializableSet38 = serializableList31.asSet();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList39 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList40 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.stream.Stream[] streamArray42 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.io.Serializable>[] serializableStreamArray43 = (java.util.stream.Stream<java.io.Serializable>[]) streamArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.io.Serializable>[] serializableStreamArray44 = serializableList40.toArray((java.util.stream.Stream<java.io.Serializable>[]) streamArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.util.stream.Stream");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableSet38);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertNotNull(streamArray42);
        org.junit.Assert.assertArrayEquals(streamArray42, new java.util.stream.Stream[] {});
        org.junit.Assert.assertNotNull(serializableStreamArray43);
        org.junit.Assert.assertArrayEquals(serializableStreamArray43, new java.util.stream.Stream[] {});
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList70.set;
        java.lang.Object obj75 = null;
        boolean boolean76 = serializableList70.contains(obj75);
        boolean boolean78 = serializableList70.contains((java.lang.Object) false);
        boolean boolean80 = serializableList70.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable82 = serializableList70.remove(0);
        boolean boolean83 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList70);
        java.util.Set<java.io.Serializable> serializableSet84 = serializableList70.asSet();
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList70.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor86 = serializableList70.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor88 = serializableList70.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable90 = serializableList70.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + serializable82 + "' != '" + (byte) 1 + "'", serializable82, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertNotNull(serializableItor85);
        org.junit.Assert.assertNotNull(serializableItor86);
        org.junit.Assert.assertNotNull(serializableItor88);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        int int95 = serializableItor89.previousIndex();
        java.io.Serializable serializable96 = serializableItor89.last;
        boolean boolean97 = serializableItor89.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable98 = serializableItor89.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertNull(serializableSet94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        boolean boolean91 = serializableItor89.hasNext();
        int int92 = serializableItor89.nextIndex();
        boolean boolean93 = serializableItor89.hasPrevious();
        int int94 = serializableItor89.previousIndex();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet68 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet68, serializableArray67);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList70 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList46, (java.util.Set<java.io.Serializable>) serializableSet68);
        java.io.Serializable serializable73 = serializableList70.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList70.set;
        java.lang.Object obj75 = null;
        boolean boolean76 = serializableList70.contains(obj75);
        boolean boolean78 = serializableList70.contains((java.lang.Object) false);
        boolean boolean80 = serializableList70.add((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable82 = serializableList70.remove(0);
        boolean boolean83 = serializableList31.removeAll((java.util.Collection<java.io.Serializable>) serializableList70);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList31.parallelStream();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList85 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList31);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator86 = serializableList31.spliterator();
        java.lang.String str87 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet88 = serializableList31.set;
        java.util.stream.Stream<java.io.Serializable> serializableStream89 = serializableSet88.stream();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + serializable73 + "' != '" + 1.0d + "'", serializable73, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + serializable82 + "' != '" + (byte) 1 + "'", serializable82, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertNotNull(serializableList85);
        org.junit.Assert.assertNotNull(serializableSpliterator86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str87, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet88);
        org.junit.Assert.assertNotNull(serializableStream89);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        boolean boolean93 = serializableItor89.hasPrevious();
        boolean boolean94 = serializableItor89.hasNext();
        java.io.Serializable serializable95 = serializableItor89.next();
        java.io.Serializable serializable96 = serializableItor89.last;
        boolean boolean97 = serializableItor89.hasNext();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + 100L + "'", serializable95, 100L);
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.util.Set<java.io.Serializable> serializableSet91 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor92 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>((java.util.ListIterator<java.io.Serializable>) serializableItor89, serializableSet91);
        boolean boolean93 = serializableItor89.hasNext();
        java.util.Set<java.io.Serializable> serializableSet94 = serializableItor89.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(serializableSet94);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Set<java.io.Serializable> serializableSet40 = serializableList31.asSet();
        java.lang.Object[] objArray41 = serializableList31.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList31.listIterator();
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableItor42);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.util.ListIterator<java.io.Serializable> serializableItor0 = null;
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList8, serializableArray7);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet30 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet30, serializableArray29);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList32 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList8, (java.util.Set<java.io.Serializable>) serializableSet30);
        java.io.Serializable serializable35 = serializableList32.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet36 = serializableList32.set;
        boolean boolean38 = serializableList32.remove((java.lang.Object) 100.0f);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList32.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList32.listIterator();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet70 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet70, serializableArray69);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList72 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList48, (java.util.Set<java.io.Serializable>) serializableSet70);
        java.lang.String str73 = serializableList72.toString();
        java.util.Set<java.io.Serializable> serializableSet74 = serializableList72.asSet();
        boolean boolean75 = serializableList32.equals((java.lang.Object) serializableSet74);
        java.util.stream.Stream<java.io.Serializable> serializableStream76 = serializableSet74.stream();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor77 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor0, serializableSet74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ListIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + 1.0d + "'", serializable35, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str73, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(serializableStream76);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.util.stream.Stream<java.io.Serializable> serializableStream38 = serializableList31.parallelStream();
        java.lang.String str39 = serializableList31.toString();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream41 = serializableList31.stream();
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.lang.Object[] objArray74 = serializableList73.toArray();
        int int75 = serializableList31.lastIndexOf((java.lang.Object) objArray74);
        int int76 = serializableList31.size();
        java.util.Collection<java.io.Serializable> serializableCollection77 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = serializableList31.containsAll(serializableCollection77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableStream38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[1, 100, 100, -1.0, 10.0, 10]" + "'", str39, "[1, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableStream41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 6 + "'", int76 == 6);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        java.io.Serializable serializable91 = serializableItor89.previous();
        int int92 = serializableItor89.previousIndex();
        java.io.Serializable serializable93 = serializableItor89.next();
        int int94 = serializableItor89.previousIndex();
        int int95 = serializableItor89.nextIndex();
        java.io.Serializable serializable96 = serializableItor89.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable97 = serializableItor89.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + serializable91 + "' != '" + 100L + "'", serializable91, 100L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + serializable93 + "' != '" + 100L + "'", serializable93, 100L);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        boolean boolean91 = serializableItor89.hasPrevious();
        boolean boolean92 = serializableItor89.hasPrevious();
        java.util.Set<java.io.Serializable> serializableSet93 = serializableItor89.set;
        boolean boolean94 = serializableItor89.hasPrevious();
        int int95 = serializableItor89.previousIndex();
        java.util.Set<java.io.Serializable> serializableSet96 = serializableItor89.set;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNull(serializableSet93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNull(serializableSet96);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.List<java.io.Serializable> serializableList0 = null;
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList8, serializableArray7);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet30 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet30, serializableArray29);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList32 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList8, (java.util.Set<java.io.Serializable>) serializableSet30);
        java.io.Serializable serializable35 = serializableList32.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet36 = serializableList32.set;
        boolean boolean38 = serializableList32.remove((java.lang.Object) 100.0f);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList32.spliterator();
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList40 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList32);
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList40.listIterator((int) (byte) 0);
        java.util.Set<java.io.Serializable> serializableSet43 = serializableList40.asSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList44 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>(serializableList0, serializableSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Collection must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + 1.0d + "'", serializable35, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertNotNull(serializableSet43);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.last;
        java.util.Set<java.io.Serializable> serializableSet93 = serializableItor89.set;
        java.io.Serializable serializable94 = serializableItor89.last;
        int int95 = serializableItor89.nextIndex();
        int int96 = serializableItor89.nextIndex();
        java.io.Serializable serializable97 = serializableItor89.next();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNull(serializable92);
        org.junit.Assert.assertNull(serializableSet93);
        org.junit.Assert.assertNull(serializable94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertEquals("'" + serializable97 + "' != '" + (short) 100 + "'", serializable97, (short) 100);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        boolean boolean35 = serializableList31.isEmpty();
        int int36 = serializableList31.size();
        int int37 = serializableList31.size();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        boolean boolean39 = serializableList31.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator40 = serializableList31.spliterator();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList31.set;
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet71 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, serializableArray70);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList73 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList49, (java.util.Set<java.io.Serializable>) serializableSet71);
        java.io.Serializable serializable76 = serializableList73.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet77 = serializableList73.set;
        java.lang.Object obj78 = null;
        boolean boolean79 = serializableList73.contains(obj78);
        boolean boolean81 = serializableList73.contains((java.lang.Object) false);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList73.spliterator();
        boolean boolean83 = serializableList31.add((java.io.Serializable) serializableList73);
        java.io.Serializable serializable85 = serializableList73.remove(0);
        java.util.ListIterator<java.io.Serializable> serializableItor87 = serializableList73.listIterator((int) (short) 1);
        java.util.Set<java.io.Serializable> serializableSet88 = null;
        org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable> serializableItor89 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.io.Serializable>(serializableItor87, serializableSet88);
        int int90 = serializableItor89.nextIndex();
        int int91 = serializableItor89.previousIndex();
        java.io.Serializable serializable92 = serializableItor89.previous();
        boolean boolean93 = serializableItor89.hasNext();
        boolean boolean94 = serializableItor89.hasPrevious();
        int int95 = serializableItor89.nextIndex();
        java.io.Serializable serializable96 = serializableItor89.last;
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator40);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + serializable76 + "' != '" + 1.0d + "'", serializable76, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + serializable85 + "' != '" + (byte) 1 + "'", serializable85, (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + 100L + "'", serializable92, 100L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertEquals("'" + serializable96 + "' != '" + 100L + "'", serializable96, 100L);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        java.lang.Object obj36 = null;
        boolean boolean37 = serializableList31.contains(obj36);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList45, serializableArray44);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet67 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet67, serializableArray66);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList45, (java.util.Set<java.io.Serializable>) serializableSet67);
        java.lang.String str70 = serializableList69.toString();
        boolean boolean71 = serializableList31.addAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.io.Serializable[] serializableArray88 = new java.io.Serializable[] { (-1.0f), 100, 10L, 0.0d, 0.0f, (-1), "", (-1.0f), 1, '#', 100, 10L, 'a', ' ', 1.0d, (short) 10 };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet89 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet89, serializableArray88);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList91 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList31, (java.util.Set<java.io.Serializable>) serializableSet89);
        serializableList31.clear();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[1.0, 100, 100, -1.0, 10.0, 10]" + "'", str70, "[1.0, 100, 100, -1.0, 10.0, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(serializableArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1.0d, 100L, (short) 100, (-1.0f), 10.0d, 10L };
        java.util.ArrayList<java.io.Serializable> serializableList7 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList7, serializableArray6);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { (-1L), false, (-1L), "", (byte) -1, false, 100.0f, '#', (short) 0, 100.0f, true, '4', 1.0d, 0, 0L, (byte) -1, 0.0d, 0L, 1L };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet29 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet29, serializableArray28);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList31 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList7, (java.util.Set<java.io.Serializable>) serializableSet29);
        java.io.Serializable serializable34 = serializableList31.set((int) (short) 0, (java.io.Serializable) (byte) 1);
        java.util.Set<java.io.Serializable> serializableSet35 = serializableList31.set;
        boolean boolean37 = serializableList31.remove((java.lang.Object) 100.0f);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator38 = serializableList31.spliterator();
        java.util.ListIterator<java.io.Serializable> serializableItor39 = serializableList31.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream40 = serializableList31.stream();
        serializableList31.clear();
        java.util.Set<java.io.Serializable> serializableSet42 = serializableList31.asSet();
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + 1.0d + "'", serializable34, 1.0d);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator38);
        org.junit.Assert.assertNotNull(serializableItor39);
        org.junit.Assert.assertNotNull(serializableStream40);
        org.junit.Assert.assertNotNull(serializableSet42);
    }
}

