package org.apache.commons.collections.set;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor5 = serializableSet3.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet6 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean7 = serializableItorSet6.add((java.util.Iterator<java.io.Serializable>) serializableItor5);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str9 = serializableSet8.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor10 = serializableSet8.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList11 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean12 = serializableItorList11.add((java.util.Iterator<java.io.Serializable>) serializableItor10);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet6, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList11);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet14 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str15 = serializableSet14.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor16 = serializableSet14.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet17 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean18 = serializableItorSet17.add((java.util.Iterator<java.io.Serializable>) serializableItor16);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet19 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str20 = serializableSet19.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor21 = serializableSet19.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList22 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean23 = serializableItorList22.add((java.util.Iterator<java.io.Serializable>) serializableItor21);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet17, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList22);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str26 = serializableSet25.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet25.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet28 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean29 = serializableItorSet28.add((java.util.Iterator<java.io.Serializable>) serializableItor27);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str31 = serializableSet30.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor32 = serializableSet30.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList33 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean34 = serializableItorList33.add((java.util.Iterator<java.io.Serializable>) serializableItor32);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet35 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet28, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList33);
        java.util.AbstractCollection[] abstractCollectionArray37 = new java.util.AbstractCollection[3];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>[] serializableItorCollectionArray38 = (java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>[]) abstractCollectionArray37;
        serializableItorCollectionArray38[0] = serializableItorList11;
        serializableItorCollectionArray38[1] = serializableItorSet17;
        serializableItorCollectionArray38[2] = serializableItorSet28;
        java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>[] serializableItorCollectionArray45 = serializableSet0.toArray(serializableItorCollectionArray38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet6 and serializableItorSet13.", serializableItorSet6.equals(serializableItorSet13) == serializableItorSet13.equals(serializableItorSet6));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator7 = serializableSet6.spliterator();
        org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>>();
        boolean boolean9 = serializableSet6.add((java.io.Serializable) serializableStreamSet8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str12 = serializableSet11.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor13 = serializableSet11.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet14 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean15 = serializableItorSet14.add((java.util.Iterator<java.io.Serializable>) serializableItor13);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str17 = serializableSet16.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor18 = serializableSet16.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList19 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean20 = serializableItorList19.add((java.util.Iterator<java.io.Serializable>) serializableItor18);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet14, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet22 = new java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean23 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet3);
        boolean boolean24 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet14);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str26 = serializableSet25.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet25.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet28 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean29 = serializableItorSet28.add((java.util.Iterator<java.io.Serializable>) serializableItor27);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str31 = serializableSet30.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor32 = serializableSet30.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList33 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean34 = serializableItorList33.add((java.util.Iterator<java.io.Serializable>) serializableItor32);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet35 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet28, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet36 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str37 = serializableSet36.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor38 = serializableSet36.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet39 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean40 = serializableItorSet39.add((java.util.Iterator<java.io.Serializable>) serializableItor38);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet41 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str42 = serializableSet41.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor43 = serializableSet41.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList44 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean45 = serializableItorList44.add((java.util.Iterator<java.io.Serializable>) serializableItor43);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet46 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet39, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList44);
        java.util.ArrayList<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionList47 = new java.util.ArrayList<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean48 = serializableItorCollectionList47.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet28);
        boolean boolean49 = serializableItorCollectionList47.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet39);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet50 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionSet22, (java.util.List<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionList47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet11 = new java.util.LinkedHashSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorSetSet11.add(serializableItorSet3);
        org.apache.commons.collections.set.ListOrderedSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetSet11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        java.util.stream.Stream<java.io.Serializable> serializableStream27 = serializableSet16.parallelStream();
        java.lang.Object obj29 = serializableSet16.remove(0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet16 and serializableSet26.", serializableSet16.equals(serializableSet26) == serializableSet26.equals(serializableSet16));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet11 = new java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorCollectionSet11.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet3);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionSet11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet11 = new java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorCollectionSet11.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionSet11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        java.lang.Object obj28 = serializableSet16.remove((int) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet16 and serializableSet26.", serializableSet16.equals(serializableSet26) == serializableSet26.equals(serializableSet16));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet16.iterator();
        java.lang.Object obj29 = serializableSet16.remove(0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet16 and serializableSet26.", serializableSet16.equals(serializableSet26) == serializableSet26.equals(serializableSet16));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableSet6.contains(obj7);
        serializableSet6.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet6);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet23, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet27, serializableArray26);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableSet29.parallelStream();
        boolean boolean31 = serializableSet27.removeAll((java.util.Collection<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet44 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet44, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet48 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet48, serializableArray47);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet50 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream51 = serializableSet50.parallelStream();
        boolean boolean52 = serializableSet48.removeAll((java.util.Collection<java.io.Serializable>) serializableSet50);
        java.io.Serializable serializable54 = serializableSet48.get((int) (short) 1);
        boolean boolean55 = serializableSet29.retainAll((java.util.Collection<java.io.Serializable>) serializableSet48);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet56 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet48);
        boolean boolean57 = serializableSet10.add((java.io.Serializable) serializableSet48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableSet6.contains(obj7);
        serializableSet6.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet6);
        boolean boolean11 = serializableSet6.isEmpty();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean14 = serializableSet12.retainAll((java.util.Collection<java.io.Serializable>) serializableSet13);
        int int15 = serializableSet12.size();
        serializableSet12.clear();
        boolean boolean17 = serializableSet6.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        serializableSet6.add((int) (byte) 0, (java.io.Serializable) 0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableSet0.parallelStream();
        java.util.LinkedHashSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet3 = new java.util.LinkedHashSet<java.util.stream.Stream<java.io.Serializable>>();
        boolean boolean4 = serializableStreamSet3.add(serializableStream2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableSet5.parallelStream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet7 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str8 = serializableSet7.toString();
        java.util.List<java.io.Serializable> serializableList9 = serializableSet7.setOrder;
        java.lang.String str10 = serializableSet7.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean12 = serializableSet7.remove((java.lang.Object) serializableSet11);
        java.lang.String str13 = serializableSet11.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableSet11.parallelStream();
        java.util.ArrayList<java.util.stream.Stream<java.io.Serializable>> serializableStreamList15 = new java.util.ArrayList<java.util.stream.Stream<java.io.Serializable>>();
        boolean boolean16 = serializableStreamList15.add(serializableStream6);
        boolean boolean17 = serializableStreamList15.add(serializableStream14);
        org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>>((java.util.Set<java.util.stream.Stream<java.io.Serializable>>) serializableStreamSet3, (java.util.List<java.util.stream.Stream<java.io.Serializable>>) serializableStreamList15);
        org.junit.Assert.assertEquals("Contract failed: serializableStreamSet18.toArray().length == serializableStreamSet18.size()", serializableStreamSet18.toArray().length, serializableStreamSet18.size());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "[]", "[]", "[]" };
        java.util.LinkedHashSet<java.lang.CharSequence> charSequenceSet4 = new java.util.LinkedHashSet<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceSet4, charSequenceArray3);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "[]", "[]" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.CharSequence> charSequenceSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.CharSequence>((java.util.Set<java.lang.CharSequence>) charSequenceSet4, (java.util.List<java.lang.CharSequence>) charSequenceList10);
        org.junit.Assert.assertEquals("Contract failed: charSequenceSet12.toArray().length == charSequenceSet12.size()", charSequenceSet12.toArray().length, charSequenceSet12.size());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableSet6.contains(obj7);
        serializableSet6.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet6);
        java.util.List<java.io.Serializable> serializableList11 = serializableSet10.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet24, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet28, serializableArray27);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream31 = serializableSet30.parallelStream();
        boolean boolean32 = serializableSet28.removeAll((java.util.Collection<java.io.Serializable>) serializableSet30);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet45 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet45, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet49, serializableArray48);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet51 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream52 = serializableSet51.parallelStream();
        boolean boolean53 = serializableSet49.removeAll((java.util.Collection<java.io.Serializable>) serializableSet51);
        java.io.Serializable serializable55 = serializableSet49.get((int) (short) 1);
        boolean boolean56 = serializableSet30.retainAll((java.util.Collection<java.io.Serializable>) serializableSet49);
        boolean boolean58 = serializableSet30.add((java.io.Serializable) false);
        boolean boolean59 = serializableSet10.add((java.io.Serializable) serializableSet30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.String> strSet9 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.String>((java.util.Set<java.lang.String>) strSet2, (java.util.List<java.lang.String>) strList7);
        org.junit.Assert.assertEquals("Contract failed: strSet9.toArray().length == strSet9.size()", strSet9.toArray().length, strSet9.size());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        java.lang.String str23 = serializableSet16.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str25 = serializableSet24.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor26 = serializableSet24.iterator();
        boolean boolean27 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean30 = serializableSet28.retainAll((java.util.Collection<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet28, serializableList33);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator35 = serializableSet34.spliterator();
        boolean boolean36 = serializableSet24.containsAll((java.util.Collection<java.io.Serializable>) serializableSet34);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet38 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet39 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet38);
        java.util.HashSet[] hashSetArray41 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray42 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray41;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray43 = serializableSet39.toArray(serializableItorSetArray42);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet44 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet39);
        serializableSet34.add(0, (java.io.Serializable) serializableSet39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet12 and serializableSet31.", serializableSet12.equals(serializableSet31) == serializableSet31.equals(serializableSet12));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Comparable<java.lang.String>[]> strComparableArraySet0 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Comparable<java.lang.String>[]>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet2 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean3 = serializableSet1.retainAll((java.util.Collection<java.io.Serializable>) serializableSet2);
        int int4 = serializableSet1.size();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet17, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet21, serializableArray20);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableSet23.parallelStream();
        boolean boolean25 = serializableSet21.removeAll((java.util.Collection<java.io.Serializable>) serializableSet23);
        java.io.Serializable serializable27 = serializableSet21.get((int) (short) 1);
        boolean boolean28 = serializableSet21.isEmpty();
        boolean boolean30 = serializableSet21.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet21);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet32 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet33 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean34 = serializableSet32.retainAll((java.util.Collection<java.io.Serializable>) serializableSet33);
        boolean boolean35 = serializableSet31.removeAll((java.util.Collection<java.io.Serializable>) serializableSet32);
        boolean boolean36 = serializableSet1.contains((java.lang.Object) serializableSet31);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "[[], a, true, -1, 1, 4, 1, 0, -1, 1.0, 10, [], 10]", "[]", "" };
        java.lang.String[] strArray42 = serializableSet1.toArray(strArray41);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>[]> strComparableArrayList43 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>[]>();
        boolean boolean44 = strComparableArrayList43.add((java.lang.Comparable<java.lang.String>[]) strArray41);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Comparable<java.lang.String>[]> strComparableArraySet45 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Comparable<java.lang.String>[]>((java.util.Set<java.lang.Comparable<java.lang.String>[]>) strComparableArraySet0, (java.util.List<java.lang.Comparable<java.lang.String>[]>) strComparableArrayList43);
        org.junit.Assert.assertEquals("Contract failed: strComparableArraySet45.toArray().length == strComparableArraySet45.size()", strComparableArraySet45.toArray().length, strComparableArraySet45.size());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet11 = new java.util.LinkedHashSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorSetSet11.add(serializableItorSet3);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str14 = serializableSet13.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor15 = serializableSet13.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet16 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean17 = serializableItorSet16.add((java.util.Iterator<java.io.Serializable>) serializableItor15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str19 = serializableSet18.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor20 = serializableSet18.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList21 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean22 = serializableItorList21.add((java.util.Iterator<java.io.Serializable>) serializableItor20);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet16, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList21);
        java.util.ArrayList<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetList24 = new java.util.ArrayList<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean25 = serializableItorSetList24.add(serializableItorSet16);
        org.apache.commons.collections.set.ListOrderedSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet26 = new org.apache.commons.collections.set.ListOrderedSet<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetSet11, (java.util.List<java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetList24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        java.lang.String str23 = serializableSet16.toString();
        boolean boolean25 = serializableSet16.remove((java.lang.Object) 100.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator26 = serializableSet16.spliterator();
        java.util.List<java.io.Serializable> serializableList27 = serializableSet16.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean30 = serializableSet28.retainAll((java.util.Collection<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet28, serializableList33);
        java.lang.Object obj35 = null;
        boolean boolean36 = serializableSet34.contains(obj35);
        serializableSet34.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet38 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet34);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet39 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet34);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet40 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet41 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet40);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet42 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean44 = serializableSet42.retainAll((java.util.Collection<java.io.Serializable>) serializableSet43);
        int int45 = serializableSet42.size();
        boolean boolean46 = serializableSet40.containsAll((java.util.Collection<java.io.Serializable>) serializableSet42);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet47 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet47);
        boolean boolean49 = serializableSet40.retainAll((java.util.Collection<java.io.Serializable>) serializableSet48);
        java.lang.String str50 = serializableSet40.toString();
        boolean boolean51 = serializableSet34.retainAll((java.util.Collection<java.io.Serializable>) serializableSet40);
        boolean boolean52 = serializableSet16.containsAll((java.util.Collection<java.io.Serializable>) serializableSet34);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream54 = serializableSet53.parallelStream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str56 = serializableSet55.toString();
        serializableSet55.clear();
        boolean boolean58 = serializableSet53.retainAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet60 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet59);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet61 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet62 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean63 = serializableSet61.retainAll((java.util.Collection<java.io.Serializable>) serializableSet62);
        int int64 = serializableSet61.size();
        boolean boolean65 = serializableSet59.containsAll((java.util.Collection<java.io.Serializable>) serializableSet61);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet67 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str68 = serializableSet67.toString();
        java.util.List<java.io.Serializable> serializableList69 = serializableSet67.setOrder;
        java.lang.String str70 = serializableSet67.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean72 = serializableSet67.remove((java.lang.Object) serializableSet71);
        boolean boolean73 = serializableSet61.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet71);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet74 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet75 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean76 = serializableSet74.retainAll((java.util.Collection<java.io.Serializable>) serializableSet75);
        java.util.List<java.io.Serializable> serializableList77 = serializableSet74.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet78 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet61, serializableList77);
        boolean boolean79 = serializableSet53.retainAll((java.util.Collection<java.io.Serializable>) serializableSet61);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet80 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet81 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean82 = serializableSet80.retainAll((java.util.Collection<java.io.Serializable>) serializableSet81);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet83 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str84 = serializableSet83.toString();
        java.util.List<java.io.Serializable> serializableList85 = serializableSet83.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet86 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet80, serializableList85);
        boolean boolean87 = serializableSet53.contains((java.lang.Object) serializableList85);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet88 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet16, serializableList85);
        org.junit.Assert.assertEquals("Contract failed: serializableSet88.toArray().length == serializableSet88.size()", serializableSet88.toArray().length, serializableSet88.size());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        int int3 = serializableSet0.size();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet4 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet0);
        java.lang.String str5 = serializableSet0.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableSet0.stream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet19 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet19, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet23, serializableArray22);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream26 = serializableSet25.parallelStream();
        boolean boolean27 = serializableSet23.removeAll((java.util.Collection<java.io.Serializable>) serializableSet25);
        java.io.Serializable serializable29 = serializableSet23.get((int) (short) 1);
        boolean boolean30 = serializableSet23.isEmpty();
        boolean boolean32 = serializableSet23.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet33 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet23);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor34 = serializableSet23.iterator();
        boolean boolean35 = serializableSet0.remove((java.lang.Object) serializableSet23);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet49, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet53, serializableArray52);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream56 = serializableSet55.parallelStream();
        boolean boolean57 = serializableSet53.removeAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet58 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str59 = serializableSet58.toString();
        serializableSet58.clear();
        boolean boolean61 = serializableSet55.removeAll((java.util.Collection<java.io.Serializable>) serializableSet58);
        int int63 = serializableSet55.indexOf((java.lang.Object) 0);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet64 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str65 = serializableSet64.toString();
        java.util.List<java.io.Serializable> serializableList66 = serializableSet64.setOrder;
        java.lang.String str67 = serializableSet64.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet68 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean69 = serializableSet64.remove((java.lang.Object) serializableSet68);
        boolean boolean70 = serializableSet55.addAll((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.List<java.io.Serializable> serializableList71 = serializableSet64.setOrder;
        java.util.stream.Stream<java.io.Serializable> serializableStream72 = serializableSet64.parallelStream();
        boolean boolean73 = serializableSet23.addAll(100, (java.util.Collection<java.io.Serializable>) serializableSet64);
        java.lang.Object obj75 = serializableSet23.remove(0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet23 and serializableSet33.", serializableSet23.equals(serializableSet33) == serializableSet33.equals(serializableSet23));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet2 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean4 = serializableSet2.retainAll((java.util.Collection<java.io.Serializable>) serializableSet3);
        int int5 = serializableSet2.size();
        boolean boolean6 = serializableSet0.containsAll((java.util.Collection<java.io.Serializable>) serializableSet2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet7 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean9 = serializableSet7.retainAll((java.util.Collection<java.io.Serializable>) serializableSet8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str11 = serializableSet10.toString();
        java.util.List<java.io.Serializable> serializableList12 = serializableSet10.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet7, serializableList12);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet14 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet15 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean16 = serializableSet14.retainAll((java.util.Collection<java.io.Serializable>) serializableSet15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str18 = serializableSet17.toString();
        java.util.List<java.io.Serializable> serializableList19 = serializableSet17.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet20 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet14, serializableList19);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableList19.stream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet22 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet7, serializableList19);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet2, serializableList19);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean26 = serializableSet24.retainAll((java.util.Collection<java.io.Serializable>) serializableSet25);
        int int27 = serializableSet24.size();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet24);
        java.lang.String str29 = serializableSet24.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream30 = serializableSet24.stream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet43, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet47 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet47, serializableArray46);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream50 = serializableSet49.parallelStream();
        boolean boolean51 = serializableSet47.removeAll((java.util.Collection<java.io.Serializable>) serializableSet49);
        java.io.Serializable serializable53 = serializableSet47.get((int) (short) 1);
        boolean boolean54 = serializableSet47.isEmpty();
        boolean boolean56 = serializableSet47.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet57 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet47);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor58 = serializableSet47.iterator();
        boolean boolean59 = serializableSet24.remove((java.lang.Object) serializableSet47);
        boolean boolean60 = serializableSet23.add((java.io.Serializable) serializableSet24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet0 and serializableSet17.", serializableSet0.equals(serializableSet17) == serializableSet17.equals(serializableSet0));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        java.lang.String str23 = serializableSet16.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str25 = serializableSet24.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor26 = serializableSet24.iterator();
        boolean boolean27 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean30 = serializableSet28.retainAll((java.util.Collection<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet28, serializableList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet35 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet24, serializableList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet36 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet(serializableList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet37 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet38 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet39 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet38);
        java.util.stream.Stream<java.io.Serializable> serializableStream40 = serializableSet38.parallelStream();
        int int41 = serializableSet37.indexOf((java.lang.Object) serializableSet38);
        int int42 = serializableSet36.indexOf((java.lang.Object) int41);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str44 = serializableSet43.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor45 = serializableSet43.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet46 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean47 = serializableItorSet46.add((java.util.Iterator<java.io.Serializable>) serializableItor45);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet48 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str49 = serializableSet48.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor50 = serializableSet48.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList51 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean52 = serializableItorList51.add((java.util.Iterator<java.io.Serializable>) serializableItor50);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet46, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList51);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str55 = serializableSet54.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor56 = serializableSet54.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet57 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean58 = serializableItorSet57.add((java.util.Iterator<java.io.Serializable>) serializableItor56);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str60 = serializableSet59.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor61 = serializableSet59.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList62 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean63 = serializableItorList62.add((java.util.Iterator<java.io.Serializable>) serializableItor61);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet64 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet57, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList62);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet65 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str66 = serializableSet65.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor67 = serializableSet65.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet68 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean69 = serializableItorSet68.add((java.util.Iterator<java.io.Serializable>) serializableItor67);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet70 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str71 = serializableSet70.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor72 = serializableSet70.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList73 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean74 = serializableItorList73.add((java.util.Iterator<java.io.Serializable>) serializableItor72);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet75 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet68, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList73);
        java.util.ArrayList[] arrayListArray77 = new java.util.ArrayList[3];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>>[] serializableItorListArray78 = (java.util.ArrayList<java.util.Iterator<java.io.Serializable>>[]) arrayListArray77;
        serializableItorListArray78[0] = serializableItorList51;
        serializableItorListArray78[1] = serializableItorList62;
        serializableItorListArray78[2] = serializableItorList73;
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>>[] serializableItorListArray85 = serializableSet36.toArray(serializableItorListArray78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet46 and serializableItorSet53.", serializableItorSet46.equals(serializableItorSet53) == serializableItorSet53.equals(serializableItorSet46));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>> serializableItorListSet11 = new java.util.LinkedHashSet<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorListSet11.add((java.util.AbstractList<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str14 = serializableSet13.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor15 = serializableSet13.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet16 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean17 = serializableItorSet16.add((java.util.Iterator<java.io.Serializable>) serializableItor15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str19 = serializableSet18.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor20 = serializableSet18.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList21 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean22 = serializableItorList21.add((java.util.Iterator<java.io.Serializable>) serializableItor20);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet16, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList21);
        java.util.ArrayList<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>> serializableItorListList24 = new java.util.ArrayList<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean25 = serializableItorListList24.add((java.util.AbstractList<java.util.Iterator<java.io.Serializable>>) serializableItorList21);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>> serializableItorListSet26 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>>) serializableItorListSet11, (java.util.List<java.util.AbstractList<java.util.Iterator<java.io.Serializable>>>) serializableItorListList24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.ArrayList<java.util.Iterator<java.io.Serializable>>> serializableItorListSet11 = new java.util.LinkedHashSet<java.util.ArrayList<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorListSet11.add(serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.util.ArrayList<java.util.Iterator<java.io.Serializable>>> serializableItorListSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.ArrayList<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.ArrayList<java.util.Iterator<java.io.Serializable>>>) serializableItorListSet11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str12 = serializableSet11.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor13 = serializableSet11.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet14 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean15 = serializableItorSet14.add((java.util.Iterator<java.io.Serializable>) serializableItor13);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str17 = serializableSet16.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor18 = serializableSet16.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList19 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean20 = serializableItorList19.add((java.util.Iterator<java.io.Serializable>) serializableItor18);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet14, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet22 = new java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean23 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorSet3);
        boolean boolean24 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionSet22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet16.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet40 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet40, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet44 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet44, serializableArray43);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet46 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream47 = serializableSet46.parallelStream();
        boolean boolean48 = serializableSet44.removeAll((java.util.Collection<java.io.Serializable>) serializableSet46);
        java.io.Serializable serializable50 = serializableSet44.get((int) (short) 1);
        boolean boolean51 = serializableSet44.isEmpty();
        boolean boolean53 = serializableSet44.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet54);
        boolean boolean56 = serializableSet44.retainAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        boolean boolean57 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet44);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet58 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet60 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet59);
        java.util.List<java.io.Serializable> serializableList61 = serializableSet59.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet62 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet16, serializableList61);
        org.junit.Assert.assertEquals("Contract failed: serializableSet62.toArray().length == serializableSet62.size()", serializableSet62.toArray().length, serializableSet62.size());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        boolean boolean27 = serializableSet16.isEmpty();
        serializableSet16.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet12 and serializableSet26.", serializableSet12.equals(serializableSet26) == serializableSet26.equals(serializableSet12));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "[]" };
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList2, serializableArray1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet4 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.List<java.io.Serializable>) serializableList2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.List<java.io.Serializable>) serializableList2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet5);
        java.lang.Object[] objArray7 = serializableSet5.toArray();
        serializableSet5.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet5 and serializableSet6.", serializableSet5.equals(serializableSet6) == serializableSet6.equals(serializableSet5));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        java.lang.String str23 = serializableSet16.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str25 = serializableSet24.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor26 = serializableSet24.iterator();
        boolean boolean27 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean30 = serializableSet28.retainAll((java.util.Collection<java.io.Serializable>) serializableSet29);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet28, serializableList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet35 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet24, serializableList33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet36 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet(serializableList33);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor37 = serializableSet36.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet50 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet50, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet54, serializableArray53);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet56 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream57 = serializableSet56.parallelStream();
        boolean boolean58 = serializableSet54.removeAll((java.util.Collection<java.io.Serializable>) serializableSet56);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str60 = serializableSet59.toString();
        serializableSet59.clear();
        boolean boolean62 = serializableSet56.removeAll((java.util.Collection<java.io.Serializable>) serializableSet59);
        org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet63 = new org.apache.commons.collections.set.ListOrderedSet<java.util.stream.Stream<java.io.Serializable>>();
        boolean boolean64 = serializableSet56.add((java.io.Serializable) serializableStreamSet63);
        boolean boolean65 = serializableSet56.isEmpty();
        java.util.List<java.io.Serializable> serializableList66 = serializableSet56.setOrder;
        int int67 = serializableSet36.indexOf((java.lang.Object) serializableSet56);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet68 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet69 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet70 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet69);
        java.util.stream.Stream<java.io.Serializable> serializableStream71 = serializableSet69.parallelStream();
        int int72 = serializableSet68.indexOf((java.lang.Object) serializableSet69);
        java.util.stream.Stream<java.io.Serializable> serializableStream73 = serializableSet69.stream();
        boolean boolean74 = serializableSet36.add((java.io.Serializable) serializableSet69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet12 and serializableSet31.", serializableSet12.equals(serializableSet31) == serializableSet31.equals(serializableSet12));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "[]" };
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList2, serializableArray1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet4 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.List<java.io.Serializable>) serializableList2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean7 = serializableSet5.retainAll((java.util.Collection<java.io.Serializable>) serializableSet6);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str9 = serializableSet8.toString();
        java.util.List<java.io.Serializable> serializableList10 = serializableSet8.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet5, serializableList10);
        java.lang.Object obj12 = null;
        boolean boolean13 = serializableSet11.contains(obj12);
        boolean boolean14 = serializableSet4.removeAll((java.util.Collection<java.io.Serializable>) serializableSet11);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet27, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet31, serializableArray30);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet33 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableSet33.parallelStream();
        boolean boolean35 = serializableSet31.removeAll((java.util.Collection<java.io.Serializable>) serializableSet33);
        java.io.Serializable serializable37 = serializableSet31.get((int) (short) 1);
        serializableSet31.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableSet31.spliterator();
        int int40 = serializableSet11.indexOf((java.lang.Object) serializableSet31);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet53, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet57 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet57, serializableArray56);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream60 = serializableSet59.parallelStream();
        boolean boolean61 = serializableSet57.removeAll((java.util.Collection<java.io.Serializable>) serializableSet59);
        java.io.Serializable serializable63 = serializableSet57.get((int) (short) 1);
        boolean boolean64 = serializableSet57.isEmpty();
        boolean boolean66 = serializableSet57.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet67 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet57);
        java.util.List<java.io.Serializable> serializableList68 = serializableSet67.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet69 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet31, serializableList68);
        org.junit.Assert.assertEquals("Contract failed: serializableSet69.toArray().length == serializableSet69.size()", serializableSet69.toArray().length, serializableSet69.size());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet28 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean29 = serializableSet27.retainAll((java.util.Collection<java.io.Serializable>) serializableSet28);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str31 = serializableSet30.toString();
        java.util.List<java.io.Serializable> serializableList32 = serializableSet30.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet33 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet27, serializableList32);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator34 = serializableSet33.spliterator();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet47 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet47, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet51 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet51, serializableArray50);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream54 = serializableSet53.parallelStream();
        boolean boolean55 = serializableSet51.removeAll((java.util.Collection<java.io.Serializable>) serializableSet53);
        java.io.Serializable serializable57 = serializableSet51.get((int) (short) 1);
        boolean boolean58 = serializableSet51.isEmpty();
        boolean boolean60 = serializableSet51.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet61 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet62 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet61);
        boolean boolean63 = serializableSet51.retainAll((java.util.Collection<java.io.Serializable>) serializableSet62);
        boolean boolean64 = serializableSet33.removeAll((java.util.Collection<java.io.Serializable>) serializableSet51);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet65 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet33);
        boolean boolean66 = serializableSet16.remove((java.lang.Object) serializableSet65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet16 and serializableSet26.", serializableSet16.equals(serializableSet26) == serializableSet26.equals(serializableSet16));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        boolean boolean23 = serializableSet16.isEmpty();
        boolean boolean25 = serializableSet16.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet16.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet40 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet40, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet44 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet44, serializableArray43);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet46 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream47 = serializableSet46.parallelStream();
        boolean boolean48 = serializableSet44.removeAll((java.util.Collection<java.io.Serializable>) serializableSet46);
        java.io.Serializable serializable50 = serializableSet44.get((int) (short) 1);
        boolean boolean51 = serializableSet44.isEmpty();
        boolean boolean53 = serializableSet44.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet54);
        boolean boolean56 = serializableSet44.retainAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        boolean boolean57 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet44);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet58 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        serializableSet16.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet12 and serializableSet26.", serializableSet12.equals(serializableSet26) == serializableSet26.equals(serializableSet12));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableSet6.contains(obj7);
        serializableSet6.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean12 = serializableSet10.retainAll((java.util.Collection<java.io.Serializable>) serializableSet11);
        int int13 = serializableSet10.size();
        serializableSet10.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet15 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str16 = serializableSet15.toString();
        java.util.List<java.io.Serializable> serializableList17 = serializableSet15.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet30, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet36 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream37 = serializableSet36.parallelStream();
        boolean boolean38 = serializableSet34.removeAll((java.util.Collection<java.io.Serializable>) serializableSet36);
        java.io.Serializable serializable40 = serializableSet34.get((int) (short) 1);
        java.lang.String str41 = serializableSet34.toString();
        int int42 = serializableSet34.size();
        org.apache.commons.collections.set.ListOrderedSet[] listOrderedSetArray44 = new org.apache.commons.collections.set.ListOrderedSet[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[] serializableSetArray45 = (org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[]) listOrderedSetArray44;
        serializableSetArray45[0] = serializableSet15;
        serializableSetArray45[1] = serializableSet34;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[] serializableSetArray50 = serializableSet10.toArray(serializableSetArray45);
        boolean boolean51 = serializableSet6.addAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        boolean boolean52 = serializableSet6.isEmpty();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean55 = serializableSet53.retainAll((java.util.Collection<java.io.Serializable>) serializableSet54);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet56 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str57 = serializableSet56.toString();
        java.util.List<java.io.Serializable> serializableList58 = serializableSet56.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet53, serializableList58);
        java.lang.Object obj60 = null;
        boolean boolean61 = serializableSet59.contains(obj60);
        serializableSet59.clear();
        boolean boolean63 = serializableSet6.add((java.io.Serializable) serializableSet59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str12 = serializableSet11.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor13 = serializableSet11.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet14 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean15 = serializableItorSet14.add((java.util.Iterator<java.io.Serializable>) serializableItor13);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str17 = serializableSet16.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor18 = serializableSet16.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList19 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean20 = serializableItorList19.add((java.util.Iterator<java.io.Serializable>) serializableItor18);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet14, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet22 = new java.util.LinkedHashSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean23 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        boolean boolean24 = serializableItorCollectionSet22.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str26 = serializableSet25.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor27 = serializableSet25.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet28 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean29 = serializableItorSet28.add((java.util.Iterator<java.io.Serializable>) serializableItor27);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str31 = serializableSet30.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor32 = serializableSet30.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList33 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean34 = serializableItorList33.add((java.util.Iterator<java.io.Serializable>) serializableItor32);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet35 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet28, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList33);
        java.util.ArrayList<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionList36 = new java.util.ArrayList<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean37 = serializableItorCollectionList36.add((java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>) serializableItorList33);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>> serializableItorCollectionSet38 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionSet22, (java.util.List<java.util.AbstractCollection<java.util.Iterator<java.io.Serializable>>>) serializableItorCollectionList36);
        org.junit.Assert.assertEquals("Contract failed: serializableItorCollectionSet38.toArray().length == serializableItorCollectionSet38.size()", serializableItorCollectionSet38.toArray().length, serializableItorCollectionSet38.size());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet7 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean9 = serializableSet7.retainAll((java.util.Collection<java.io.Serializable>) serializableSet8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str11 = serializableSet10.toString();
        java.util.List<java.io.Serializable> serializableList12 = serializableSet10.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet7, serializableList12);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableList12.stream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet15 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet0, serializableList12);
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableSet15.parallelStream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean19 = serializableSet17.retainAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet20 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str21 = serializableSet20.toString();
        java.util.List<java.io.Serializable> serializableList22 = serializableSet20.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet17, serializableList22);
        java.lang.Object obj24 = null;
        boolean boolean25 = serializableSet23.contains(obj24);
        serializableSet23.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet23);
        boolean boolean28 = serializableSet23.isEmpty();
        boolean boolean29 = serializableSet15.add((java.io.Serializable) serializableSet23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet10.", serializableSet1.equals(serializableSet10) == serializableSet10.equals(serializableSet1));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator7 = serializableSet6.spliterator();
        java.lang.String str8 = serializableSet6.toString();
        boolean boolean9 = serializableSet6.isEmpty();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet10);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean14 = serializableSet12.retainAll((java.util.Collection<java.io.Serializable>) serializableSet13);
        int int15 = serializableSet12.size();
        boolean boolean16 = serializableSet10.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet17);
        boolean boolean19 = serializableSet10.retainAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.lang.String str20 = serializableSet10.toString();
        java.util.List<java.io.Serializable> serializableList21 = serializableSet10.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet34, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet38 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet38, serializableArray37);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet40 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream41 = serializableSet40.parallelStream();
        boolean boolean42 = serializableSet38.removeAll((java.util.Collection<java.io.Serializable>) serializableSet40);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str44 = serializableSet43.toString();
        serializableSet43.clear();
        boolean boolean46 = serializableSet40.removeAll((java.util.Collection<java.io.Serializable>) serializableSet43);
        int int48 = serializableSet40.indexOf((java.lang.Object) 0);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str50 = serializableSet49.toString();
        java.util.List<java.io.Serializable> serializableList51 = serializableSet49.setOrder;
        java.lang.String str52 = serializableSet49.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean54 = serializableSet49.remove((java.lang.Object) serializableSet53);
        boolean boolean55 = serializableSet40.addAll((java.util.Collection<java.io.Serializable>) serializableSet49);
        java.util.List<java.io.Serializable> serializableList56 = serializableSet49.setOrder;
        java.util.stream.Stream<java.io.Serializable> serializableStream57 = serializableSet49.parallelStream();
        boolean boolean58 = serializableSet10.remove((java.lang.Object) serializableSet49);
        boolean boolean59 = serializableSet6.add((java.io.Serializable) boolean58);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet1 and serializableSet3.", serializableSet1.equals(serializableSet3) == serializableSet3.equals(serializableSet1));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str12 = serializableSet11.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor13 = serializableSet11.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet14 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean15 = serializableItorSet14.add((java.util.Iterator<java.io.Serializable>) serializableItor13);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str17 = serializableSet16.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor18 = serializableSet16.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList19 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean20 = serializableItorList19.add((java.util.Iterator<java.io.Serializable>) serializableItor18);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet14, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet22 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet2 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean4 = serializableSet2.retainAll((java.util.Collection<java.io.Serializable>) serializableSet3);
        int int5 = serializableSet2.size();
        boolean boolean6 = serializableSet0.containsAll((java.util.Collection<java.io.Serializable>) serializableSet2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str9 = serializableSet8.toString();
        java.util.List<java.io.Serializable> serializableList10 = serializableSet8.setOrder;
        java.lang.String str11 = serializableSet8.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean13 = serializableSet8.remove((java.lang.Object) serializableSet12);
        boolean boolean14 = serializableSet2.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet12);
        java.lang.String str15 = serializableSet2.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean18 = serializableSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableSet17);
        java.lang.String str19 = serializableSet17.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet20 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str21 = serializableSet20.toString();
        java.util.List<java.io.Serializable> serializableList22 = serializableSet20.setOrder;
        java.lang.String str23 = serializableSet20.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean25 = serializableSet20.remove((java.lang.Object) serializableSet24);
        java.lang.String str26 = serializableSet24.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream27 = serializableSet24.parallelStream();
        boolean boolean28 = serializableSet17.retainAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        boolean boolean30 = serializableSet24.add((java.io.Serializable) 1.0d);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet43, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet47 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet47, serializableArray46);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream50 = serializableSet49.parallelStream();
        boolean boolean51 = serializableSet47.removeAll((java.util.Collection<java.io.Serializable>) serializableSet49);
        java.io.Serializable serializable53 = serializableSet47.get((int) (short) 1);
        java.lang.String str54 = serializableSet47.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str56 = serializableSet55.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor57 = serializableSet55.iterator();
        boolean boolean58 = serializableSet47.removeAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet71, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet75 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet77 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream78 = serializableSet77.parallelStream();
        boolean boolean79 = serializableSet75.removeAll((java.util.Collection<java.io.Serializable>) serializableSet77);
        java.io.Serializable serializable81 = serializableSet75.get((int) (short) 1);
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor82 = serializableSet75.iterator();
        int int83 = serializableSet55.indexOf((java.lang.Object) serializableSet75);
        java.util.List<java.io.Serializable> serializableList84 = serializableSet75.setOrder;
        boolean boolean85 = serializableSet24.retainAll((java.util.Collection<java.io.Serializable>) serializableSet75);
        java.lang.Object obj87 = serializableSet75.remove((int) (byte) 10);
        java.io.Serializable serializable89 = serializableSet75.get((int) (byte) 0);
        java.lang.Object[] objArray90 = serializableSet75.toArray();
        java.util.List<java.io.Serializable> serializableList91 = serializableSet75.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet92 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet2, serializableList91);
        org.junit.Assert.assertEquals("Contract failed: serializableSet92.toArray().length == serializableSet92.size()", serializableSet92.toArray().length, serializableSet92.size());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str1 = serializableSet0.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor2 = serializableSet0.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet3 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean4 = serializableItorSet3.add((java.util.Iterator<java.io.Serializable>) serializableItor2);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet5 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str6 = serializableSet5.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor7 = serializableSet5.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList8 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean9 = serializableItorList8.add((java.util.Iterator<java.io.Serializable>) serializableItor7);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet10 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet3, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList8);
        java.util.LinkedHashSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet11 = new java.util.LinkedHashSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean12 = serializableItorSetSet11.add((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>) serializableItorSet3);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetSet11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet3 and serializableItorSet10.", serializableItorSet3.equals(serializableItorSet10) == serializableItorSet10.equals(serializableItorSet3));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str4 = serializableSet3.toString();
        java.util.List<java.io.Serializable> serializableList5 = serializableSet3.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0, serializableList5);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableList5.stream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet(serializableList5);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet9 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableSet9.parallelStream();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str12 = serializableSet11.toString();
        serializableSet11.clear();
        boolean boolean14 = serializableSet9.retainAll((java.util.Collection<java.io.Serializable>) serializableSet11);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet15 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean19 = serializableSet17.retainAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        int int20 = serializableSet17.size();
        boolean boolean21 = serializableSet15.containsAll((java.util.Collection<java.io.Serializable>) serializableSet17);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet22 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet22);
        boolean boolean24 = serializableSet15.retainAll((java.util.Collection<java.io.Serializable>) serializableSet23);
        java.lang.String str25 = serializableSet15.toString();
        java.util.List<java.io.Serializable> serializableList26 = serializableSet15.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet9, serializableList26);
        boolean boolean28 = serializableSet8.removeAll((java.util.Collection<java.io.Serializable>) serializableSet27);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet29 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str30 = serializableSet29.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor31 = serializableSet29.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet32 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean33 = serializableItorSet32.add((java.util.Iterator<java.io.Serializable>) serializableItor31);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet34 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str35 = serializableSet34.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor36 = serializableSet34.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList37 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean38 = serializableItorList37.add((java.util.Iterator<java.io.Serializable>) serializableItor36);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet39 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet32, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList37);
        java.util.AbstractList[] abstractListArray41 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.util.Iterator<java.io.Serializable>>[] serializableItorListArray42 = (java.util.AbstractList<java.util.Iterator<java.io.Serializable>>[]) abstractListArray41;
        serializableItorListArray42[0] = serializableItorList37;
        java.util.AbstractList<java.util.Iterator<java.io.Serializable>>[] serializableItorListArray45 = serializableSet27.toArray(serializableItorListArray42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableItorSet32 and serializableItorSet39.", serializableItorSet32.equals(serializableItorSet39) == serializableItorSet39.equals(serializableItorSet32));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean2 = serializableSet0.retainAll((java.util.Collection<java.io.Serializable>) serializableSet1);
        int int3 = serializableSet0.size();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet16, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet20 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet20, serializableArray19);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet22 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream23 = serializableSet22.parallelStream();
        boolean boolean24 = serializableSet20.removeAll((java.util.Collection<java.io.Serializable>) serializableSet22);
        java.io.Serializable serializable26 = serializableSet20.get((int) (short) 1);
        boolean boolean27 = serializableSet20.isEmpty();
        boolean boolean29 = serializableSet20.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet30 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet20);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet32 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean33 = serializableSet31.retainAll((java.util.Collection<java.io.Serializable>) serializableSet32);
        boolean boolean34 = serializableSet30.removeAll((java.util.Collection<java.io.Serializable>) serializableSet31);
        boolean boolean35 = serializableSet0.contains((java.lang.Object) serializableSet30);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet36 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet30);
        serializableSet30.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet0 and serializableSet36.", serializableSet0.equals(serializableSet36) == serializableSet36.equals(serializableSet0));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet12, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, serializableArray15);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet18 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream19 = serializableSet18.parallelStream();
        boolean boolean20 = serializableSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable serializable22 = serializableSet16.get((int) (short) 1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean25 = serializableSet23.retainAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        int int26 = serializableSet23.size();
        boolean boolean27 = serializableSet16.equals((java.lang.Object) int26);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet40 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet40, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet44 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet44, serializableArray43);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet46 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream47 = serializableSet46.parallelStream();
        boolean boolean48 = serializableSet44.removeAll((java.util.Collection<java.io.Serializable>) serializableSet46);
        java.io.Serializable serializable50 = serializableSet44.get((int) (short) 1);
        boolean boolean51 = serializableSet44.isEmpty();
        boolean boolean53 = serializableSet44.add((java.io.Serializable) "[]");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet54);
        boolean boolean56 = serializableSet44.retainAll((java.util.Collection<java.io.Serializable>) serializableSet55);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet57 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet58 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet57);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet59 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet60 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean61 = serializableSet59.retainAll((java.util.Collection<java.io.Serializable>) serializableSet60);
        int int62 = serializableSet59.size();
        boolean boolean63 = serializableSet57.containsAll((java.util.Collection<java.io.Serializable>) serializableSet59);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet65 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str66 = serializableSet65.toString();
        java.util.List<java.io.Serializable> serializableList67 = serializableSet65.setOrder;
        java.lang.String str68 = serializableSet65.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet69 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean70 = serializableSet65.remove((java.lang.Object) serializableSet69);
        boolean boolean71 = serializableSet59.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet69);
        boolean boolean72 = serializableSet55.equals((java.lang.Object) 0);
        boolean boolean73 = serializableSet16.equals((java.lang.Object) 0);
        java.util.List<java.io.Serializable> serializableList74 = serializableSet16.setOrder;
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor75 = serializableSet16.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet76 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        serializableSet16.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet12 and serializableSet76.", serializableSet12.equals(serializableSet76) == serializableSet76.equals(serializableSet12));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str2 = serializableSet1.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor3 = serializableSet1.iterator();
        java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>> serializableItorSet4 = new java.util.LinkedHashSet<java.util.Iterator<java.io.Serializable>>();
        boolean boolean5 = serializableItorSet4.add((java.util.Iterator<java.io.Serializable>) serializableItor3);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet6 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str7 = serializableSet6.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor8 = serializableSet6.iterator();
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList9 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
        boolean boolean10 = serializableItorList9.add((java.util.Iterator<java.io.Serializable>) serializableItor8);
        org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Iterator<java.io.Serializable>>((java.util.Set<java.util.Iterator<java.io.Serializable>>) serializableItorSet4, (java.util.List<java.util.Iterator<java.io.Serializable>>) serializableItorList9);
        java.util.ArrayList<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetList12 = new java.util.ArrayList<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>();
        boolean boolean13 = serializableItorSetList12.add((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>) serializableItorSet4);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>> serializableItorSetSet14 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>((java.util.Set<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetSet0, (java.util.List<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>>) serializableItorSetList12);
        org.junit.Assert.assertEquals("Contract failed: serializableItorSetSet14.toArray().length == serializableItorSetSet14.size()", serializableItorSetSet14.toArray().length, serializableItorSetSet14.size());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet0);
        java.util.HashSet[] hashSetArray3 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray4 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray3;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray5 = serializableSet1.toArray(serializableItorSetArray4);
        boolean boolean6 = serializableSet1.isEmpty();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet7 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet8 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet7);
        java.util.List<java.io.Serializable> serializableList9 = serializableSet7.asList();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet11 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet12 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean13 = serializableSet11.retainAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet14 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str15 = serializableSet14.toString();
        java.util.List<java.io.Serializable> serializableList16 = serializableSet14.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet11, serializableList16);
        java.lang.Object obj18 = null;
        boolean boolean19 = serializableSet17.contains(obj18);
        serializableSet17.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet21 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet17);
        serializableSet17.clear();
        int int23 = serializableSet17.size();
        java.util.List<java.io.Serializable> serializableList24 = serializableSet17.setOrder;
        boolean boolean25 = serializableSet7.addAll((int) (byte) -1, (java.util.Collection<java.io.Serializable>) serializableList24);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet27 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean28 = serializableSet26.retainAll((java.util.Collection<java.io.Serializable>) serializableSet27);
        int int29 = serializableSet26.size();
        serializableSet26.clear();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet46 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.io.Serializable[] serializableArray49 = new java.io.Serializable[] { "[]", 'a', true, (-1), (byte) 1, '4', 1, (short) 0, (-1L), (short) 0, 1.0f, (short) 10, serializableSet46, 10L, true };
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet50 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet50, serializableArray49);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet52 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.util.stream.Stream<java.io.Serializable> serializableStream53 = serializableSet52.parallelStream();
        boolean boolean54 = serializableSet50.removeAll((java.util.Collection<java.io.Serializable>) serializableSet52);
        java.io.Serializable serializable56 = serializableSet50.get((int) (short) 1);
        java.lang.String str57 = serializableSet50.toString();
        int int58 = serializableSet50.size();
        org.apache.commons.collections.set.ListOrderedSet[] listOrderedSetArray60 = new org.apache.commons.collections.set.ListOrderedSet[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[] serializableSetArray61 = (org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[]) listOrderedSetArray60;
        serializableSetArray61[0] = serializableSet31;
        serializableSetArray61[1] = serializableSet50;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>[] serializableSetArray66 = serializableSet26.toArray(serializableSetArray61);
        java.util.stream.Stream<java.io.Serializable> serializableStream67 = serializableSet26.stream();
        java.lang.String str68 = serializableSet26.toString();
        boolean boolean69 = serializableSet7.containsAll((java.util.Collection<java.io.Serializable>) serializableSet26);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet70 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet7);
        java.util.List<java.io.Serializable> serializableList71 = serializableSet7.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet72 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet1, serializableList71);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet73 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str74 = serializableSet73.toString();
        org.apache.commons.collections.OrderedIterator<java.io.Serializable> serializableItor75 = serializableSet73.iterator();
        boolean boolean77 = serializableSet73.contains((java.lang.Object) 100L);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet78 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet79 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean80 = serializableSet78.retainAll((java.util.Collection<java.io.Serializable>) serializableSet79);
        int int81 = serializableSet78.size();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet82 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>((java.util.Set<java.io.Serializable>) serializableSet78);
        boolean boolean83 = serializableSet73.addAll((java.util.Collection<java.io.Serializable>) serializableSet78);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet84 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean85 = serializableSet72.add((java.io.Serializable) serializableSet73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableSet7 and serializableSet11.", serializableSet7.equals(serializableSet11) == serializableSet11.equals(serializableSet7));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]> itorSetArraySet0 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet1 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet2 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet1);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet3 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet4 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean5 = serializableSet3.retainAll((java.util.Collection<java.io.Serializable>) serializableSet4);
        int int6 = serializableSet3.size();
        boolean boolean7 = serializableSet1.containsAll((java.util.Collection<java.io.Serializable>) serializableSet3);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet9 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str10 = serializableSet9.toString();
        java.util.List<java.io.Serializable> serializableList11 = serializableSet9.setOrder;
        java.lang.String str12 = serializableSet9.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet13 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean14 = serializableSet9.remove((java.lang.Object) serializableSet13);
        boolean boolean15 = serializableSet3.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet13);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet16 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet17 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet16);
        java.util.HashSet[] hashSetArray19 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray20 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray19;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray21 = serializableSet17.toArray(serializableItorSetArray20);
        java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray22 = serializableSet13.toArray((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]) serializableItorSetArray21);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet23 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet24 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet23);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet25 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet26 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean27 = serializableSet25.retainAll((java.util.Collection<java.io.Serializable>) serializableSet26);
        int int28 = serializableSet25.size();
        boolean boolean29 = serializableSet23.containsAll((java.util.Collection<java.io.Serializable>) serializableSet25);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str32 = serializableSet31.toString();
        java.util.List<java.io.Serializable> serializableList33 = serializableSet31.setOrder;
        java.lang.String str34 = serializableSet31.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet35 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean36 = serializableSet31.remove((java.lang.Object) serializableSet35);
        boolean boolean37 = serializableSet25.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet35);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet38 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet39 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet38);
        java.util.HashSet[] hashSetArray41 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray42 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray41;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray43 = serializableSet39.toArray(serializableItorSetArray42);
        java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray44 = serializableSet35.toArray((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]) serializableItorSetArray43);
        java.util.LinkedHashSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]> itorSetArraySet45 = new java.util.LinkedHashSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>();
        boolean boolean46 = itorSetArraySet45.add(serializableItorSetArray22);
        boolean boolean47 = itorSetArraySet45.add(serializableItorSetArray44);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet48 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet49 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet48);
        java.util.HashSet[] hashSetArray51 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray52 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray51;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray53 = serializableSet49.toArray(serializableItorSetArray52);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet54 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet55 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet54);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet56 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet57 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean58 = serializableSet56.retainAll((java.util.Collection<java.io.Serializable>) serializableSet57);
        int int59 = serializableSet56.size();
        boolean boolean60 = serializableSet54.containsAll((java.util.Collection<java.io.Serializable>) serializableSet56);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet62 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        java.lang.String str63 = serializableSet62.toString();
        java.util.List<java.io.Serializable> serializableList64 = serializableSet62.setOrder;
        java.lang.String str65 = serializableSet62.toString();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet66 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        boolean boolean67 = serializableSet62.remove((java.lang.Object) serializableSet66);
        boolean boolean68 = serializableSet56.addAll(0, (java.util.Collection<java.io.Serializable>) serializableSet66);
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet69 = new org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable>();
        org.apache.commons.collections.set.ListOrderedSet<java.io.Serializable> serializableSet70 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.io.Serializable>) serializableSet69);
        java.util.HashSet[] hashSetArray72 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray73 = (java.util.HashSet<java.util.Iterator<java.io.Serializable>>[]) hashSetArray72;
        java.util.HashSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray74 = serializableSet70.toArray(serializableItorSetArray73);
        java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[] serializableItorSetArray75 = serializableSet66.toArray((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]) serializableItorSetArray74);
        java.util.ArrayList<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]> itorSetArrayList76 = new java.util.ArrayList<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>();
        boolean boolean77 = itorSetArrayList76.add((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]) serializableItorSetArray52);
        boolean boolean78 = itorSetArrayList76.add((java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]) serializableItorSetArray74);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]> itorSetArraySet79 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>((java.util.Set<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>) itorSetArraySet45, (java.util.List<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>) itorSetArrayList76);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]> itorSetArraySet80 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>((java.util.Set<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>) itorSetArraySet0, (java.util.List<java.util.AbstractSet<java.util.Iterator<java.io.Serializable>>[]>) itorSetArrayList76);
        org.junit.Assert.assertEquals("Contract failed: itorSetArraySet80.toArray().length == itorSetArraySet80.size()", itorSetArraySet80.toArray().length, itorSetArraySet80.size());
    }
}

