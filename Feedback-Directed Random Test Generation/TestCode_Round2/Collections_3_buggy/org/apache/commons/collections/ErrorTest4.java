package org.apache.commons.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection0);
        org.apache.commons.collections.Predicate predicate4 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection0, predicate4);
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection8 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate9 = null;
        int int10 = org.apache.commons.collections.CollectionUtils.countMatches(collection8, predicate9);
        int int11 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection8);
        org.apache.commons.collections.Closure closure12 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection8, closure12);
        java.lang.Object obj15 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection8, (int) (short) 1);
        java.util.Collection collection16 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate17 = null;
        int int18 = org.apache.commons.collections.CollectionUtils.countMatches(collection16, predicate17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection16);
        org.apache.commons.collections.Predicate predicate20 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection16, predicate20);
        boolean boolean22 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection8, collection16);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections.CollectionUtils.addAll(collection8, objArray23);
        java.util.Collection collection26 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate27 = null;
        int int28 = org.apache.commons.collections.CollectionUtils.countMatches(collection26, predicate27);
        org.apache.commons.collections.Transformer transformer29 = null;
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate32 = null;
        int int33 = org.apache.commons.collections.CollectionUtils.countMatches(collection31, predicate32);
        int int34 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection31);
        java.util.Collection collection35 = org.apache.commons.collections.CollectionUtils.collect(collection26, transformer29, collection31);
        org.apache.commons.collections.Closure closure36 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection31, closure36);
        java.util.Iterator iterator38 = null;
        org.apache.commons.collections.Transformer transformer39 = null;
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection41 = org.apache.commons.collections.CollectionUtils.collect(iterator38, transformer39, collection40);
        boolean boolean42 = org.apache.commons.collections.CollectionUtils.containsAny(collection31, collection40);
        boolean boolean43 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection8, collection40);
        java.util.Collection collection44 = org.apache.commons.collections.CollectionUtils.collect(collection0, transformer6, collection8);
        org.apache.commons.collections.Predicate predicate45 = null;
        boolean boolean46 = org.apache.commons.collections.CollectionUtils.exists(collection44, predicate45);
        boolean boolean47 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection44);
        java.util.Iterator iterator48 = null;
        org.apache.commons.collections.Transformer transformer49 = null;
        java.util.Collection collection50 = org.apache.commons.collections.CollectionUtils.collect(iterator48, transformer49);
        org.apache.commons.collections.Predicate predicate51 = null;
        boolean boolean52 = org.apache.commons.collections.CollectionUtils.exists(collection50, predicate51);
        java.util.Collection collection53 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection50);
        boolean boolean54 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection44, collection53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection44 and collection50.", collection44.equals(collection50) == collection50.equals(collection44));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        org.apache.commons.collections.Transformer transformer3 = null;
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        int int8 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection5);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.collect(collection0, transformer3, collection5);
        org.apache.commons.collections.Closure closure10 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection5, closure10);
        java.util.Iterator iterator12 = null;
        org.apache.commons.collections.Transformer transformer13 = null;
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.collect(iterator12, transformer13, collection14);
        boolean boolean16 = org.apache.commons.collections.CollectionUtils.containsAny(collection5, collection14);
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.collect(collection5, transformer17, collection18);
        java.util.Collection collection20 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(collection18);
        org.apache.commons.collections.Predicate predicate21 = null;
        java.util.Collection collection22 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate23 = null;
        int int24 = org.apache.commons.collections.CollectionUtils.countMatches(collection22, predicate23);
        int int25 = org.apache.commons.collections.CollectionUtils.maxSize(collection22);
        org.apache.commons.collections.Predicate predicate26 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection22, predicate26);
        boolean boolean28 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection22);
        java.util.Iterator iterator29 = null;
        org.apache.commons.collections.Transformer transformer30 = null;
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate32 = null;
        int int33 = org.apache.commons.collections.CollectionUtils.countMatches(collection31, predicate32);
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.collect(iterator29, transformer30, collection31);
        org.apache.commons.collections.Predicate predicate35 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection31, predicate35);
        org.apache.commons.collections.Predicate predicate37 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection31, predicate37);
        boolean boolean39 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection22, collection31);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection20, predicate21, collection31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection31 and collection20.", collection31.equals(collection20) == collection20.equals(collection31));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate2 = null;
        int int3 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate2);
        int int4 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection1);
        org.apache.commons.collections.Closure closure5 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection1, closure5);
        java.lang.Object obj8 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (int) (short) 1);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate10 = null;
        int int11 = org.apache.commons.collections.CollectionUtils.countMatches(collection9, predicate10);
        int int12 = org.apache.commons.collections.CollectionUtils.maxSize(collection9);
        org.apache.commons.collections.Predicate predicate13 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection9, predicate13);
        boolean boolean15 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection1, collection9);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray16);
        org.apache.commons.collections.CollectionUtils.addAll(collection1, objArray16);
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate20 = null;
        int int21 = org.apache.commons.collections.CollectionUtils.countMatches(collection19, predicate20);
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate25 = null;
        int int26 = org.apache.commons.collections.CollectionUtils.countMatches(collection24, predicate25);
        int int27 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection24);
        java.util.Collection collection28 = org.apache.commons.collections.CollectionUtils.collect(collection19, transformer22, collection24);
        org.apache.commons.collections.Closure closure29 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection24, closure29);
        java.util.Iterator iterator31 = null;
        org.apache.commons.collections.Transformer transformer32 = null;
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.collect(iterator31, transformer32, collection33);
        boolean boolean35 = org.apache.commons.collections.CollectionUtils.containsAny(collection24, collection33);
        boolean boolean36 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection1, collection33);
        org.apache.commons.collections.Predicate predicate37 = null;
        int int38 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate37);
        org.apache.commons.collections.Predicate predicate39 = null;
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.select(collection1, predicate39);
        java.util.Iterator iterator41 = null;
        org.apache.commons.collections.Transformer transformer42 = null;
        java.util.Collection collection43 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate44 = null;
        int int45 = org.apache.commons.collections.CollectionUtils.countMatches(collection43, predicate44);
        org.apache.commons.collections.Transformer transformer46 = null;
        java.util.Collection collection48 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate49 = null;
        int int50 = org.apache.commons.collections.CollectionUtils.countMatches(collection48, predicate49);
        int int51 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection48);
        java.util.Collection collection52 = org.apache.commons.collections.CollectionUtils.collect(collection43, transformer46, collection48);
        org.apache.commons.collections.Closure closure53 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection48, closure53);
        java.util.Collection collection55 = org.apache.commons.collections.CollectionUtils.collect(iterator41, transformer42, collection48);
        java.util.Collection collection56 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection55);
        java.lang.Object[] objArray57 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray57);
        boolean boolean59 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray57);
        org.apache.commons.collections.CollectionUtils.addAll(collection55, objArray57);
        org.apache.commons.collections.Transformer transformer61 = null;
        java.util.Collection collection62 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate63 = null;
        int int64 = org.apache.commons.collections.CollectionUtils.countMatches(collection62, predicate63);
        org.apache.commons.collections.Transformer transformer65 = null;
        java.util.Collection collection67 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate68 = null;
        int int69 = org.apache.commons.collections.CollectionUtils.countMatches(collection67, predicate68);
        int int70 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection67);
        java.util.Collection collection71 = org.apache.commons.collections.CollectionUtils.collect(collection62, transformer65, collection67);
        boolean boolean72 = org.apache.commons.collections.CollectionUtils.isEmpty(collection71);
        java.util.Collection collection73 = org.apache.commons.collections.CollectionUtils.collect(collection55, transformer61, collection71);
        java.util.Map map74 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(collection55);
        java.lang.Object obj75 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (java.lang.Object) collection55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on obj75 and collection40.", obj75.equals(collection40) == collection40.equals(obj75));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        org.apache.commons.collections.Transformer transformer3 = null;
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        int int8 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection5);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.collect(collection0, transformer3, collection5);
        org.apache.commons.collections.Closure closure10 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection5, closure10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.lang.Object obj13 = org.apache.commons.collections.CollectionUtils.find(collection5, predicate12);
        boolean boolean14 = org.apache.commons.collections.CollectionUtils.isEmpty(collection5);
        org.apache.commons.collections.Transformer transformer15 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection5, transformer15);
        boolean boolean17 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection5);
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate19 = null;
        int int20 = org.apache.commons.collections.CollectionUtils.countMatches(collection18, predicate19);
        org.apache.commons.collections.Transformer transformer21 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate24 = null;
        int int25 = org.apache.commons.collections.CollectionUtils.countMatches(collection23, predicate24);
        int int26 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection23);
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(collection18, transformer21, collection23);
        org.apache.commons.collections.Closure closure28 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection23, closure28);
        java.util.Iterator iterator30 = null;
        org.apache.commons.collections.Transformer transformer31 = null;
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.collect(iterator30, transformer31, collection32);
        boolean boolean34 = org.apache.commons.collections.CollectionUtils.containsAny(collection23, collection32);
        org.apache.commons.collections.Transformer transformer35 = null;
        java.util.Collection collection36 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection37 = org.apache.commons.collections.CollectionUtils.collect(collection23, transformer35, collection36);
        java.util.Collection collection38 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate39 = null;
        int int40 = org.apache.commons.collections.CollectionUtils.countMatches(collection38, predicate39);
        int int41 = org.apache.commons.collections.CollectionUtils.maxSize(collection38);
        java.lang.Object obj42 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection23, (java.lang.Object) int41);
        org.apache.commons.collections.Predicate predicate43 = null;
        java.util.Collection collection44 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean46 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection44, collection45);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection23, predicate43, collection44);
        boolean boolean48 = org.apache.commons.collections.CollectionUtils.containsAny(collection5, collection44);
        java.util.Iterator iterator49 = null;
        org.apache.commons.collections.Transformer transformer50 = null;
        java.util.Collection collection51 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection52 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean53 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection51, collection52);
        org.apache.commons.collections.Predicate predicate54 = null;
        boolean boolean55 = org.apache.commons.collections.CollectionUtils.exists(collection51, predicate54);
        java.util.Collection collection56 = org.apache.commons.collections.CollectionUtils.collect(iterator49, transformer50, collection51);
        java.util.Collection collection57 = org.apache.commons.collections.CollectionUtils.retainAll(collection44, collection56);
        java.util.Iterator iterator59 = null;
        org.apache.commons.collections.Transformer transformer60 = null;
        java.util.Collection collection61 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection62 = org.apache.commons.collections.CollectionUtils.collect(iterator59, transformer60, collection61);
        int int63 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) '4', collection62);
        java.util.Collection collection64 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate65 = null;
        int int66 = org.apache.commons.collections.CollectionUtils.countMatches(collection64, predicate65);
        org.apache.commons.collections.Transformer transformer67 = null;
        java.util.Collection collection69 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate70 = null;
        int int71 = org.apache.commons.collections.CollectionUtils.countMatches(collection69, predicate70);
        int int72 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection69);
        java.util.Collection collection73 = org.apache.commons.collections.CollectionUtils.collect(collection64, transformer67, collection69);
        java.util.Collection collection74 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection75 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean76 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection74, collection75);
        boolean boolean77 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection64, collection74);
        int int78 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) '4', collection64);
        org.apache.commons.collections.Transformer transformer79 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection64, transformer79);
        java.util.Collection collection81 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection82 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean83 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection81, collection82);
        org.apache.commons.collections.Transformer transformer84 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection81, transformer84);
        boolean boolean86 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) collection81);
        boolean boolean87 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection64, collection81);
        org.apache.commons.collections.Predicate predicate88 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection81, predicate88);
        boolean boolean90 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(collection44, (java.lang.Object) predicate88);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection44 and collection57.", collection44.equals(collection57) == collection57.equals(collection44));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate3 = null;
        int int4 = org.apache.commons.collections.CollectionUtils.countMatches(collection2, predicate3);
        org.apache.commons.collections.Transformer transformer5 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate8 = null;
        int int9 = org.apache.commons.collections.CollectionUtils.countMatches(collection7, predicate8);
        int int10 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection7);
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(collection2, transformer5, collection7);
        org.apache.commons.collections.Closure closure12 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection7, closure12);
        org.apache.commons.collections.Predicate predicate14 = null;
        java.lang.Object obj15 = org.apache.commons.collections.CollectionUtils.find(collection7, predicate14);
        boolean boolean16 = org.apache.commons.collections.CollectionUtils.isEmpty(collection7);
        org.apache.commons.collections.Transformer transformer17 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection7, transformer17);
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1, collection7);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.lang.Object obj21 = org.apache.commons.collections.CollectionUtils.find(collection7, predicate20);
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate24 = null;
        int int25 = org.apache.commons.collections.CollectionUtils.countMatches(collection23, predicate24);
        int int26 = org.apache.commons.collections.CollectionUtils.maxSize(collection23);
        org.apache.commons.collections.Predicate predicate27 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection23, predicate27);
        boolean boolean29 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection23);
        int int30 = org.apache.commons.collections.CollectionUtils.size((java.lang.Object) collection23);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.collect(collection7, transformer22, collection23);
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection33);
        int int35 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) 1.0f, collection34);
        java.util.Map map36 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(collection34);
        org.apache.commons.collections.Closure closure37 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection34, closure37);
        java.util.Collection collection39 = org.apache.commons.collections.CollectionUtils.intersection(collection23, collection34);
        java.lang.Class<?> wildcardClass40 = collection34.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection34 and collection39.", collection34.equals(collection39) == collection39.equals(collection34));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate3 = null;
        int int4 = org.apache.commons.collections.CollectionUtils.countMatches(collection2, predicate3);
        org.apache.commons.collections.Transformer transformer5 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate8 = null;
        int int9 = org.apache.commons.collections.CollectionUtils.countMatches(collection7, predicate8);
        int int10 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection7);
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(collection2, transformer5, collection7);
        org.apache.commons.collections.Closure closure12 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection7, closure12);
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1, collection7);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection14);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray16);
        boolean boolean18 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray16);
        org.apache.commons.collections.CollectionUtils.addAll(collection14, objArray16);
        org.apache.commons.collections.Transformer transformer20 = null;
        java.util.Collection collection21 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate22 = null;
        int int23 = org.apache.commons.collections.CollectionUtils.countMatches(collection21, predicate22);
        org.apache.commons.collections.Transformer transformer24 = null;
        java.util.Collection collection26 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate27 = null;
        int int28 = org.apache.commons.collections.CollectionUtils.countMatches(collection26, predicate27);
        int int29 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection26);
        java.util.Collection collection30 = org.apache.commons.collections.CollectionUtils.collect(collection21, transformer24, collection26);
        boolean boolean31 = org.apache.commons.collections.CollectionUtils.isEmpty(collection30);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.collect(collection14, transformer20, collection30);
        org.apache.commons.collections.Transformer transformer33 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection14, transformer33);
        java.util.Collection collection36 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate37 = null;
        int int38 = org.apache.commons.collections.CollectionUtils.countMatches(collection36, predicate37);
        int int39 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection36);
        org.apache.commons.collections.Closure closure40 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection36, closure40);
        java.lang.Object obj43 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection36, (int) (short) 1);
        java.util.Collection collection44 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate45 = null;
        int int46 = org.apache.commons.collections.CollectionUtils.countMatches(collection44, predicate45);
        int int47 = org.apache.commons.collections.CollectionUtils.maxSize(collection44);
        org.apache.commons.collections.Predicate predicate48 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection44, predicate48);
        boolean boolean50 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection36, collection44);
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray51);
        org.apache.commons.collections.CollectionUtils.addAll(collection36, objArray51);
        java.util.Collection collection55 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate56 = null;
        int int57 = org.apache.commons.collections.CollectionUtils.countMatches(collection55, predicate56);
        int int58 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection55);
        org.apache.commons.collections.Closure closure59 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection55, closure59);
        java.lang.Object obj62 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection55, (int) (short) 1);
        java.util.Collection collection63 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate64 = null;
        int int65 = org.apache.commons.collections.CollectionUtils.countMatches(collection63, predicate64);
        int int66 = org.apache.commons.collections.CollectionUtils.maxSize(collection63);
        org.apache.commons.collections.Predicate predicate67 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection63, predicate67);
        boolean boolean69 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection55, collection63);
        java.lang.Object[] objArray70 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray70);
        org.apache.commons.collections.CollectionUtils.addAll(collection55, objArray70);
        java.util.Collection collection73 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate74 = null;
        int int75 = org.apache.commons.collections.CollectionUtils.countMatches(collection73, predicate74);
        org.apache.commons.collections.Transformer transformer76 = null;
        java.util.Collection collection78 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate79 = null;
        int int80 = org.apache.commons.collections.CollectionUtils.countMatches(collection78, predicate79);
        int int81 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection78);
        java.util.Collection collection82 = org.apache.commons.collections.CollectionUtils.collect(collection73, transformer76, collection78);
        org.apache.commons.collections.Closure closure83 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection78, closure83);
        java.util.Iterator iterator85 = null;
        org.apache.commons.collections.Transformer transformer86 = null;
        java.util.Collection collection87 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection88 = org.apache.commons.collections.CollectionUtils.collect(iterator85, transformer86, collection87);
        boolean boolean89 = org.apache.commons.collections.CollectionUtils.containsAny(collection78, collection87);
        boolean boolean90 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection55, collection87);
        boolean boolean91 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection36, collection87);
        org.apache.commons.collections.Predicate predicate92 = null;
        boolean boolean93 = org.apache.commons.collections.CollectionUtils.exists(collection36, predicate92);
        boolean boolean94 = org.apache.commons.collections.CollectionUtils.isFull(collection36);
        java.util.Collection collection95 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(collection36);
        boolean boolean96 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection14, collection36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection14 and collection95.", collection14.equals(collection95) == collection95.equals(collection14));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        boolean boolean3 = org.apache.commons.collections.CollectionUtils.isEmpty(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        int int5 = org.apache.commons.collections.CollectionUtils.countMatches(collection2, predicate4);
        java.util.Collection collection6 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean8 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection6, collection7);
        org.apache.commons.collections.Predicate predicate9 = null;
        java.util.Collection collection10 = org.apache.commons.collections.CollectionUtils.select(collection7, predicate9);
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.intersection(collection2, collection10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection2 and collection6.", collection2.equals(collection6) == collection6.equals(collection2));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate2 = null;
        int int3 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate2);
        int int4 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection1);
        org.apache.commons.collections.Closure closure5 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection1, closure5);
        java.lang.Object obj8 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (int) (short) 1);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate10 = null;
        int int11 = org.apache.commons.collections.CollectionUtils.countMatches(collection9, predicate10);
        int int12 = org.apache.commons.collections.CollectionUtils.maxSize(collection9);
        org.apache.commons.collections.Predicate predicate13 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection9, predicate13);
        boolean boolean15 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection1, collection9);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray16);
        org.apache.commons.collections.CollectionUtils.addAll(collection1, objArray16);
        java.util.Collection collection20 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate21 = null;
        int int22 = org.apache.commons.collections.CollectionUtils.countMatches(collection20, predicate21);
        int int23 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection20);
        org.apache.commons.collections.Closure closure24 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection20, closure24);
        java.lang.Object obj27 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection20, (int) (short) 1);
        java.util.Collection collection28 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate29 = null;
        int int30 = org.apache.commons.collections.CollectionUtils.countMatches(collection28, predicate29);
        int int31 = org.apache.commons.collections.CollectionUtils.maxSize(collection28);
        org.apache.commons.collections.Predicate predicate32 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection28, predicate32);
        boolean boolean34 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection20, collection28);
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray35);
        org.apache.commons.collections.CollectionUtils.addAll(collection20, objArray35);
        java.util.Collection collection38 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate39 = null;
        int int40 = org.apache.commons.collections.CollectionUtils.countMatches(collection38, predicate39);
        org.apache.commons.collections.Transformer transformer41 = null;
        java.util.Collection collection43 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate44 = null;
        int int45 = org.apache.commons.collections.CollectionUtils.countMatches(collection43, predicate44);
        int int46 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection43);
        java.util.Collection collection47 = org.apache.commons.collections.CollectionUtils.collect(collection38, transformer41, collection43);
        org.apache.commons.collections.Closure closure48 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection43, closure48);
        java.util.Iterator iterator50 = null;
        org.apache.commons.collections.Transformer transformer51 = null;
        java.util.Collection collection52 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection53 = org.apache.commons.collections.CollectionUtils.collect(iterator50, transformer51, collection52);
        boolean boolean54 = org.apache.commons.collections.CollectionUtils.containsAny(collection43, collection52);
        boolean boolean55 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection20, collection52);
        boolean boolean56 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection1, collection52);
        org.apache.commons.collections.Predicate predicate57 = null;
        boolean boolean58 = org.apache.commons.collections.CollectionUtils.exists(collection1, predicate57);
        boolean boolean59 = org.apache.commons.collections.CollectionUtils.isFull(collection1);
        org.apache.commons.collections.Predicate predicate60 = null;
        java.util.Collection collection61 = org.apache.commons.collections.CollectionUtils.select(collection1, predicate60);
        org.apache.commons.collections.Transformer transformer62 = null;
        java.util.Iterator iterator64 = null;
        org.apache.commons.collections.Transformer transformer65 = null;
        java.util.Collection collection66 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection67 = org.apache.commons.collections.CollectionUtils.collect(iterator64, transformer65, collection66);
        int int68 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) '4', collection67);
        java.util.Collection collection69 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection67);
        java.util.Collection collection70 = org.apache.commons.collections.CollectionUtils.collect(collection61, transformer62, collection69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection70 and collection61.", collection70.equals(collection61) == collection61.equals(collection70));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate2 = null;
        int int3 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate2);
        int int4 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection1);
        org.apache.commons.collections.Closure closure5 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection1, closure5);
        java.lang.Object obj8 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (int) (short) 1);
        java.lang.Object obj10 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (int) (short) 10);
        java.util.Collection collection11 = null;
        org.apache.commons.collections.Transformer transformer12 = null;
        java.util.Collection collection13 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate14 = null;
        int int15 = org.apache.commons.collections.CollectionUtils.countMatches(collection13, predicate14);
        org.apache.commons.collections.Transformer transformer16 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate19 = null;
        int int20 = org.apache.commons.collections.CollectionUtils.countMatches(collection18, predicate19);
        int int21 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection18);
        java.util.Collection collection22 = org.apache.commons.collections.CollectionUtils.collect(collection13, transformer16, collection18);
        org.apache.commons.collections.Closure closure23 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection18, closure23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection28 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26, collection27);
        boolean boolean29 = org.apache.commons.collections.CollectionUtils.containsAny(collection18, collection27);
        java.util.Collection collection30 = org.apache.commons.collections.CollectionUtils.collect(collection11, transformer12, collection18);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate32 = null;
        int int33 = org.apache.commons.collections.CollectionUtils.countMatches(collection31, predicate32);
        org.apache.commons.collections.Transformer transformer34 = null;
        java.util.Collection collection36 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate37 = null;
        int int38 = org.apache.commons.collections.CollectionUtils.countMatches(collection36, predicate37);
        int int39 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection36);
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.collect(collection31, transformer34, collection36);
        org.apache.commons.collections.Closure closure41 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection36, closure41);
        java.util.Iterator iterator43 = null;
        org.apache.commons.collections.Transformer transformer44 = null;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection46 = org.apache.commons.collections.CollectionUtils.collect(iterator43, transformer44, collection45);
        boolean boolean47 = org.apache.commons.collections.CollectionUtils.containsAny(collection36, collection45);
        org.apache.commons.collections.Transformer transformer48 = null;
        java.util.Collection collection49 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection50 = org.apache.commons.collections.CollectionUtils.collect(collection36, transformer48, collection49);
        boolean boolean51 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection30, collection36);
        org.apache.commons.collections.Predicate predicate52 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection36, predicate52);
        org.apache.commons.collections.Predicate predicate54 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection36, predicate54);
        org.apache.commons.collections.Predicate predicate56 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection36, predicate56);
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection36);
        java.util.Collection collection59 = org.apache.commons.collections.CollectionUtils.union(collection1, collection58);
        int int60 = org.apache.commons.collections.CollectionUtils.size((java.lang.Object) collection59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection1 and collection59.", collection1.equals(collection59) == collection59.equals(collection1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate2 = null;
        int int3 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate2);
        int int4 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection1);
        boolean boolean5 = org.apache.commons.collections.CollectionUtils.isFull(collection1);
        java.util.Collection collection6 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate7 = null;
        int int8 = org.apache.commons.collections.CollectionUtils.countMatches(collection6, predicate7);
        org.apache.commons.collections.Transformer transformer9 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate12 = null;
        int int13 = org.apache.commons.collections.CollectionUtils.countMatches(collection11, predicate12);
        int int14 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection11);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.collect(collection6, transformer9, collection11);
        org.apache.commons.collections.Closure closure16 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection11, closure16);
        java.util.Iterator iterator18 = null;
        org.apache.commons.collections.Transformer transformer19 = null;
        java.util.Collection collection20 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection21 = org.apache.commons.collections.CollectionUtils.collect(iterator18, transformer19, collection20);
        boolean boolean22 = org.apache.commons.collections.CollectionUtils.containsAny(collection11, collection20);
        org.apache.commons.collections.Transformer transformer23 = null;
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection25 = org.apache.commons.collections.CollectionUtils.collect(collection11, transformer23, collection24);
        java.util.Collection collection26 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate27 = null;
        int int28 = org.apache.commons.collections.CollectionUtils.countMatches(collection26, predicate27);
        int int29 = org.apache.commons.collections.CollectionUtils.maxSize(collection26);
        java.lang.Object obj30 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection11, (java.lang.Object) int29);
        boolean boolean31 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection1, collection11);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean34 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection32, collection33);
        org.apache.commons.collections.Transformer transformer35 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection32, transformer35);
        java.util.Collection collection37 = org.apache.commons.collections.CollectionUtils.subtract(collection11, collection32);
        java.util.Collection collection38 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection38 and collection37.", collection38.equals(collection37) == collection37.equals(collection38));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        org.apache.commons.collections.Transformer transformer8 = null;
        java.util.Collection collection10 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate11 = null;
        int int12 = org.apache.commons.collections.CollectionUtils.countMatches(collection10, predicate11);
        int int13 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection10);
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.collect(collection5, transformer8, collection10);
        org.apache.commons.collections.Closure closure15 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection10, closure15);
        java.util.Iterator iterator17 = null;
        org.apache.commons.collections.Transformer transformer18 = null;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection20 = org.apache.commons.collections.CollectionUtils.collect(iterator17, transformer18, collection19);
        boolean boolean21 = org.apache.commons.collections.CollectionUtils.containsAny(collection10, collection19);
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.collect(collection10, transformer22, collection23);
        java.util.Collection collection25 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate26 = null;
        int int27 = org.apache.commons.collections.CollectionUtils.countMatches(collection25, predicate26);
        int int28 = org.apache.commons.collections.CollectionUtils.maxSize(collection25);
        java.lang.Object obj29 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection10, (java.lang.Object) int28);
        org.apache.commons.collections.Predicate predicate30 = null;
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean33 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection31, collection32);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection10, predicate30, collection31);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection2, predicate4, collection10);
        java.util.Collection collection36 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1, collection2);
        java.util.Collection collection37 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection38 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection37);
        boolean boolean39 = org.apache.commons.collections.CollectionUtils.isFull(collection37);
        boolean boolean40 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) collection37);
        java.util.Collection collection41 = org.apache.commons.collections.CollectionUtils.removeAll(collection36, collection37);
        boolean boolean42 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection37 and collection41.", collection37.equals(collection41) == collection41.equals(collection37));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate2 = null;
        int int3 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate2);
        int int4 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection1);
        org.apache.commons.collections.Closure closure5 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection1, closure5);
        java.lang.Object obj8 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection1, (int) (short) 1);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate10 = null;
        int int11 = org.apache.commons.collections.CollectionUtils.countMatches(collection9, predicate10);
        int int12 = org.apache.commons.collections.CollectionUtils.maxSize(collection9);
        org.apache.commons.collections.Predicate predicate13 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection9, predicate13);
        boolean boolean15 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection1, collection9);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.collections.CollectionUtils.reverseArray(objArray16);
        org.apache.commons.collections.CollectionUtils.addAll(collection1, objArray16);
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate20 = null;
        int int21 = org.apache.commons.collections.CollectionUtils.countMatches(collection19, predicate20);
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate25 = null;
        int int26 = org.apache.commons.collections.CollectionUtils.countMatches(collection24, predicate25);
        int int27 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection24);
        java.util.Collection collection28 = org.apache.commons.collections.CollectionUtils.collect(collection19, transformer22, collection24);
        org.apache.commons.collections.Closure closure29 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection24, closure29);
        java.util.Iterator iterator31 = null;
        org.apache.commons.collections.Transformer transformer32 = null;
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.collect(iterator31, transformer32, collection33);
        boolean boolean35 = org.apache.commons.collections.CollectionUtils.containsAny(collection24, collection33);
        boolean boolean36 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection1, collection33);
        org.apache.commons.collections.Predicate predicate37 = null;
        int int38 = org.apache.commons.collections.CollectionUtils.countMatches(collection1, predicate37);
        org.apache.commons.collections.Closure closure39 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection1, closure39);
        java.util.Collection collection41 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection1);
        java.util.Collection collection42 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection43 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean44 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection42, collection43);
        org.apache.commons.collections.Predicate predicate45 = null;
        int int46 = org.apache.commons.collections.CollectionUtils.countMatches(collection43, predicate45);
        java.util.Collection collection47 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection43);
        java.util.Collection collection48 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate49 = null;
        int int50 = org.apache.commons.collections.CollectionUtils.countMatches(collection48, predicate49);
        org.apache.commons.collections.Transformer transformer51 = null;
        java.util.Collection collection53 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate54 = null;
        int int55 = org.apache.commons.collections.CollectionUtils.countMatches(collection53, predicate54);
        int int56 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection53);
        java.util.Collection collection57 = org.apache.commons.collections.CollectionUtils.collect(collection48, transformer51, collection53);
        org.apache.commons.collections.Closure closure58 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection53, closure58);
        java.util.Iterator iterator60 = null;
        org.apache.commons.collections.Transformer transformer61 = null;
        java.util.Collection collection62 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection63 = org.apache.commons.collections.CollectionUtils.collect(iterator60, transformer61, collection62);
        boolean boolean64 = org.apache.commons.collections.CollectionUtils.containsAny(collection53, collection62);
        org.apache.commons.collections.Transformer transformer65 = null;
        java.util.Collection collection66 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection67 = org.apache.commons.collections.CollectionUtils.collect(collection53, transformer65, collection66);
        boolean boolean68 = org.apache.commons.collections.CollectionUtils.isEmpty(collection66);
        org.apache.commons.collections.Transformer transformer69 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection66, transformer69);
        java.lang.Class<?> wildcardClass71 = collection66.getClass();
        java.util.Collection collection72 = org.apache.commons.collections.CollectionUtils.typedCollection(collection47, (java.lang.Class) wildcardClass71);
        java.util.Collection collection73 = org.apache.commons.collections.CollectionUtils.typedCollection(collection41, (java.lang.Class) wildcardClass71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection41 and collection72.", collection41.equals(collection72) == collection72.equals(collection41));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        org.apache.commons.collections.Transformer transformer3 = null;
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        int int8 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection5);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.collect(collection0, transformer3, collection5);
        org.apache.commons.collections.Closure closure10 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection5, closure10);
        java.util.Iterator iterator12 = null;
        org.apache.commons.collections.Transformer transformer13 = null;
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.collect(iterator12, transformer13, collection14);
        boolean boolean16 = org.apache.commons.collections.CollectionUtils.containsAny(collection5, collection14);
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.collect(collection5, transformer17, collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.lang.Object obj21 = org.apache.commons.collections.CollectionUtils.find(collection19, predicate20);
        java.lang.Object obj23 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection19, 0);
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate25 = null;
        int int26 = org.apache.commons.collections.CollectionUtils.countMatches(collection24, predicate25);
        org.apache.commons.collections.Transformer transformer27 = null;
        java.util.Collection collection29 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate30 = null;
        int int31 = org.apache.commons.collections.CollectionUtils.countMatches(collection29, predicate30);
        int int32 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection29);
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.collect(collection24, transformer27, collection29);
        org.apache.commons.collections.Closure closure34 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection29, closure34);
        org.apache.commons.collections.Predicate predicate36 = null;
        java.lang.Object obj37 = org.apache.commons.collections.CollectionUtils.find(collection29, predicate36);
        boolean boolean38 = org.apache.commons.collections.CollectionUtils.isEmpty(collection29);
        org.apache.commons.collections.Predicate predicate39 = null;
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate41 = null;
        int int42 = org.apache.commons.collections.CollectionUtils.countMatches(collection40, predicate41);
        org.apache.commons.collections.Transformer transformer43 = null;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate46 = null;
        int int47 = org.apache.commons.collections.CollectionUtils.countMatches(collection45, predicate46);
        int int48 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection45);
        java.util.Collection collection49 = org.apache.commons.collections.CollectionUtils.collect(collection40, transformer43, collection45);
        org.apache.commons.collections.Closure closure50 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection45, closure50);
        java.util.Iterator iterator52 = null;
        org.apache.commons.collections.Transformer transformer53 = null;
        java.util.Collection collection54 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection55 = org.apache.commons.collections.CollectionUtils.collect(iterator52, transformer53, collection54);
        boolean boolean56 = org.apache.commons.collections.CollectionUtils.containsAny(collection45, collection54);
        org.apache.commons.collections.Transformer transformer57 = null;
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection59 = org.apache.commons.collections.CollectionUtils.collect(collection45, transformer57, collection58);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection29, predicate39, collection59);
        int int61 = org.apache.commons.collections.CollectionUtils.size((java.lang.Object) collection29);
        java.util.Collection collection62 = org.apache.commons.collections.CollectionUtils.disjunction(collection19, collection29);
        java.util.Collection collection63 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate64 = null;
        int int65 = org.apache.commons.collections.CollectionUtils.countMatches(collection63, predicate64);
        boolean boolean66 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection63);
        boolean boolean67 = org.apache.commons.collections.CollectionUtils.isFull(collection63);
        java.util.Iterator iterator68 = null;
        org.apache.commons.collections.Transformer transformer69 = null;
        java.util.Collection collection70 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate71 = null;
        int int72 = org.apache.commons.collections.CollectionUtils.countMatches(collection70, predicate71);
        java.util.Collection collection73 = org.apache.commons.collections.CollectionUtils.collect(iterator68, transformer69, collection70);
        org.apache.commons.collections.Predicate predicate74 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection70, predicate74);
        boolean boolean76 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection63, collection70);
        org.apache.commons.collections.Predicate predicate77 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection63, predicate77);
        int int79 = org.apache.commons.collections.CollectionUtils.maxSize(collection63);
        java.util.Collection collection80 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection81 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean82 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection80, collection81);
        org.apache.commons.collections.Transformer transformer83 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection80, transformer83);
        boolean boolean85 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) collection80);
        java.util.Collection collection86 = org.apache.commons.collections.CollectionUtils.retainAll(collection63, collection80);
        java.util.Collection collection87 = org.apache.commons.collections.CollectionUtils.subtract(collection62, collection80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection80 and collection62.", collection80.equals(collection62) == collection62.equals(collection80));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean2 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection0, collection1);
        org.apache.commons.collections.Closure closure3 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection0, closure3);
        boolean boolean5 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection0);
        int int6 = org.apache.commons.collections.CollectionUtils.maxSize(collection0);
        org.apache.commons.collections.Predicate predicate7 = null;
        int int8 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate7);
        org.apache.commons.collections.Predicate predicate9 = null;
        java.util.Collection collection10 = org.apache.commons.collections.CollectionUtils.selectRejected(collection0, predicate9);
        java.util.Map map11 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(collection10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection0 and collection10.", collection0.equals(collection10) == collection10.equals(collection0));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean2 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection0, collection1);
        java.util.Collection collection3 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate4 = null;
        int int5 = org.apache.commons.collections.CollectionUtils.countMatches(collection3, predicate4);
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection8 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate9 = null;
        int int10 = org.apache.commons.collections.CollectionUtils.countMatches(collection8, predicate9);
        int int11 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection8);
        java.util.Collection collection12 = org.apache.commons.collections.CollectionUtils.collect(collection3, transformer6, collection8);
        org.apache.commons.collections.Closure closure13 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection8, closure13);
        java.util.Iterator iterator15 = null;
        org.apache.commons.collections.Transformer transformer16 = null;
        java.util.Collection collection17 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator15, transformer16, collection17);
        boolean boolean19 = org.apache.commons.collections.CollectionUtils.containsAny(collection8, collection17);
        org.apache.commons.collections.Transformer transformer20 = null;
        java.util.Collection collection21 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection22 = org.apache.commons.collections.CollectionUtils.collect(collection8, transformer20, collection21);
        org.apache.commons.collections.Predicate predicate23 = null;
        java.lang.Object obj24 = org.apache.commons.collections.CollectionUtils.find(collection22, predicate23);
        java.lang.Object obj26 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection22, 0);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.util.Collection collection28 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection29 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(collection28);
        org.apache.commons.collections.Predicate predicate30 = null;
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate32 = null;
        int int33 = org.apache.commons.collections.CollectionUtils.countMatches(collection31, predicate32);
        org.apache.commons.collections.Transformer transformer34 = null;
        java.util.Collection collection36 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate37 = null;
        int int38 = org.apache.commons.collections.CollectionUtils.countMatches(collection36, predicate37);
        int int39 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection36);
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.collect(collection31, transformer34, collection36);
        org.apache.commons.collections.Closure closure41 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection36, closure41);
        java.util.Iterator iterator43 = null;
        org.apache.commons.collections.Transformer transformer44 = null;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection46 = org.apache.commons.collections.CollectionUtils.collect(iterator43, transformer44, collection45);
        boolean boolean47 = org.apache.commons.collections.CollectionUtils.containsAny(collection36, collection45);
        org.apache.commons.collections.Transformer transformer48 = null;
        java.util.Collection collection49 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection50 = org.apache.commons.collections.CollectionUtils.collect(collection36, transformer48, collection49);
        java.util.Collection collection51 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate52 = null;
        int int53 = org.apache.commons.collections.CollectionUtils.countMatches(collection51, predicate52);
        int int54 = org.apache.commons.collections.CollectionUtils.maxSize(collection51);
        java.lang.Object obj55 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection36, (java.lang.Object) int54);
        org.apache.commons.collections.Predicate predicate56 = null;
        java.util.Collection collection57 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean59 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection57, collection58);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection36, predicate56, collection57);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection28, predicate30, collection36);
        java.lang.Object obj62 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) wildcardClass27, (java.lang.Object) collection36);
        java.util.Collection collection63 = org.apache.commons.collections.CollectionUtils.typedCollection(collection1, (java.lang.Class) wildcardClass27);
        boolean boolean64 = org.apache.commons.collections.CollectionUtils.isFull(collection63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection0 and collection63.", collection0.equals(collection63) == collection63.equals(collection0));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        org.apache.commons.collections.Transformer transformer3 = null;
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        int int8 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection5);
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.collect(collection0, transformer3, collection5);
        org.apache.commons.collections.Closure closure10 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection5, closure10);
        java.util.Iterator iterator12 = null;
        org.apache.commons.collections.Transformer transformer13 = null;
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.collect(iterator12, transformer13, collection14);
        boolean boolean16 = org.apache.commons.collections.CollectionUtils.containsAny(collection5, collection14);
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.collect(collection5, transformer17, collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.lang.Object obj21 = org.apache.commons.collections.CollectionUtils.find(collection19, predicate20);
        java.util.Iterator iterator22 = null;
        org.apache.commons.collections.Transformer transformer23 = null;
        java.util.Collection collection24 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate25 = null;
        int int26 = org.apache.commons.collections.CollectionUtils.countMatches(collection24, predicate25);
        org.apache.commons.collections.Transformer transformer27 = null;
        java.util.Collection collection29 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate30 = null;
        int int31 = org.apache.commons.collections.CollectionUtils.countMatches(collection29, predicate30);
        int int32 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection29);
        java.util.Collection collection33 = org.apache.commons.collections.CollectionUtils.collect(collection24, transformer27, collection29);
        org.apache.commons.collections.Closure closure34 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection29, closure34);
        org.apache.commons.collections.Predicate predicate36 = null;
        java.lang.Object obj37 = org.apache.commons.collections.CollectionUtils.find(collection29, predicate36);
        boolean boolean38 = org.apache.commons.collections.CollectionUtils.isEmpty(collection29);
        org.apache.commons.collections.Transformer transformer39 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection29, transformer39);
        java.util.Collection collection41 = org.apache.commons.collections.CollectionUtils.collect(iterator22, transformer23, collection29);
        org.apache.commons.collections.Predicate predicate42 = null;
        java.util.Collection collection44 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate45 = null;
        int int46 = org.apache.commons.collections.CollectionUtils.countMatches(collection44, predicate45);
        int int47 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection44);
        boolean boolean48 = org.apache.commons.collections.CollectionUtils.isFull(collection44);
        java.util.Collection collection49 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate50 = null;
        int int51 = org.apache.commons.collections.CollectionUtils.countMatches(collection49, predicate50);
        org.apache.commons.collections.Transformer transformer52 = null;
        java.util.Collection collection54 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate55 = null;
        int int56 = org.apache.commons.collections.CollectionUtils.countMatches(collection54, predicate55);
        int int57 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection54);
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.collect(collection49, transformer52, collection54);
        org.apache.commons.collections.Closure closure59 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection54, closure59);
        java.util.Iterator iterator61 = null;
        org.apache.commons.collections.Transformer transformer62 = null;
        java.util.Collection collection63 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection64 = org.apache.commons.collections.CollectionUtils.collect(iterator61, transformer62, collection63);
        boolean boolean65 = org.apache.commons.collections.CollectionUtils.containsAny(collection54, collection63);
        org.apache.commons.collections.Transformer transformer66 = null;
        java.util.Collection collection67 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection68 = org.apache.commons.collections.CollectionUtils.collect(collection54, transformer66, collection67);
        java.util.Collection collection69 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate70 = null;
        int int71 = org.apache.commons.collections.CollectionUtils.countMatches(collection69, predicate70);
        int int72 = org.apache.commons.collections.CollectionUtils.maxSize(collection69);
        java.lang.Object obj73 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection54, (java.lang.Object) int72);
        boolean boolean74 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection44, collection54);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection41, predicate42, collection44);
        boolean boolean76 = org.apache.commons.collections.CollectionUtils.isFull(collection41);
        java.util.Collection collection77 = org.apache.commons.collections.CollectionUtils.removeAll(collection19, collection41);
        org.apache.commons.collections.Predicate predicate78 = null;
        java.util.Collection collection79 = org.apache.commons.collections.CollectionUtils.selectRejected(collection77, predicate78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection0 and collection77.", collection0.equals(collection77) == collection77.equals(collection0));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        java.util.Collection collection0 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection1 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean2 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(collection0, collection1);
        org.apache.commons.collections.Transformer transformer3 = null;
        org.apache.commons.collections.CollectionUtils.transform(collection0, transformer3);
        java.util.Collection collection5 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate6 = null;
        int int7 = org.apache.commons.collections.CollectionUtils.countMatches(collection5, predicate6);
        org.apache.commons.collections.Transformer transformer8 = null;
        java.util.Collection collection10 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        org.apache.commons.collections.Predicate predicate11 = null;
        int int12 = org.apache.commons.collections.CollectionUtils.countMatches(collection10, predicate11);
        int int13 = org.apache.commons.collections.CollectionUtils.cardinality((java.lang.Object) (-1L), collection10);
        java.util.Collection collection14 = org.apache.commons.collections.CollectionUtils.collect(collection5, transformer8, collection10);
        org.apache.commons.collections.Closure closure15 = null;
        org.apache.commons.collections.CollectionUtils.forAllDo(collection10, closure15);
        java.util.Iterator iterator17 = null;
        org.apache.commons.collections.Transformer transformer18 = null;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        java.util.Collection collection20 = org.apache.commons.collections.CollectionUtils.collect(iterator17, transformer18, collection19);
        boolean boolean21 = org.apache.commons.collections.CollectionUtils.containsAny(collection10, collection19);
        java.lang.Class<?> wildcardClass22 = collection19.getClass();
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.typedCollection(collection0, (java.lang.Class) wildcardClass22);
        org.apache.commons.collections.Predicate predicate24 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection0, predicate24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection0 and collection23.", collection0.equals(collection23) == collection23.equals(collection0));
    }
}

