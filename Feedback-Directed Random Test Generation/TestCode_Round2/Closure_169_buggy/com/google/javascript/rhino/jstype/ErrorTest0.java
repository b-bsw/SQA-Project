package com.google.javascript.rhino.jstype;

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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry5, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = unionType4.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        com.google.javascript.rhino.jstype.EnumType enumType11 = unionType4.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.UnionType unionType16 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry12, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.UnionType unionType21 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry17, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = unionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType21);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair23 = unionType4.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.jstype.UnionType unionType29 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry25, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.jstype.UnionType unionType34 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry30, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair35 = unionType29.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.UnionType unionType40 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry36, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.jstype.UnionType unionType45 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry41, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair46 = unionType40.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType45);
        com.google.javascript.rhino.jstype.EnumType enumType47 = unionType40.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.jstype.UnionType unionType52 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry48, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.UnionType unionType57 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry53, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair58 = unionType52.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType57);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair59 = unionType40.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType57);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.jstype.UnionType unionType64 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry60, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.UnionType unionType69 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry65, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair70 = unionType64.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType69);
        com.google.javascript.rhino.jstype.EnumType enumType71 = unionType64.toMaybeEnumType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = unionType40.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType64);
        java.lang.String str73 = unionType40.toDebugHashCodeString();
        java.lang.String str74 = unionType40.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] { unionType29, unionType40 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList76 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76, jSTypeArray75);
        com.google.javascript.rhino.jstype.UnionType unionType78 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry24, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        unionType4.alternates = jSTypeList76;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on unionType4 and unionType78", unionType4.equals(unionType78) ? unionType4.hashCode() == unionType78.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        boolean boolean5 = unionType4.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.jstype.UnionType unionType11 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry7, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.UnionType unionType16 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry12, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair17 = unionType11.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.jstype.UnionType unionType22 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry18, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.UnionType unionType27 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry23, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair28 = unionType22.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType27);
        com.google.javascript.rhino.jstype.EnumType enumType29 = unionType22.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.jstype.UnionType unionType34 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry30, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.UnionType unionType39 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry35, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = unionType34.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType39);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair41 = unionType22.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType39);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44, jSTypeArray43);
        com.google.javascript.rhino.jstype.UnionType unionType46 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry42, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.jstype.UnionType unionType51 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry47, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair52 = unionType46.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType51);
        com.google.javascript.rhino.jstype.EnumType enumType53 = unionType46.toMaybeEnumType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = unionType22.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType46);
        java.lang.String str55 = unionType22.toDebugHashCodeString();
        java.lang.String str56 = unionType22.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] { unionType11, unionType22 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList58, jSTypeArray57);
        com.google.javascript.rhino.jstype.UnionType unionType60 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry6, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList58);
        unionType4.alternates = jSTypeList58;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on unionType4 and unionType60", unionType4.equals(unionType60) ? unionType4.hashCode() == unionType60.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry5, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = unionType4.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isUnknownType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.UnionType unionType16 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry12, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.UnionType unionType21 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry17, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = unionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType21);
        boolean boolean23 = unionType16.matchesUint32Context();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.jstype.UnionType unionType28 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry24, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.jstype.UnionType unionType33 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry29, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair34 = unionType28.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType33);
        boolean boolean35 = unionType33.isRegexpType();
        unionType16.matchConstraint((com.google.javascript.rhino.jstype.JSType) unionType33);
        boolean boolean37 = unionType16.isInterface();
        boolean boolean38 = unionType16.isNumberObjectType();
        boolean boolean39 = unionType9.canAssignTo((com.google.javascript.rhino.jstype.JSType) unionType16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44, jSTypeArray43);
        com.google.javascript.rhino.jstype.UnionType unionType46 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry42, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.jstype.UnionType unionType51 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry47, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair52 = unionType46.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType51);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.UnionType unionType57 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry53, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.UnionType unionType62 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry58, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair63 = unionType57.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType62);
        com.google.javascript.rhino.jstype.EnumType enumType64 = unionType57.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.UnionType unionType69 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry65, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList72 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList72, jSTypeArray71);
        com.google.javascript.rhino.jstype.UnionType unionType74 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry70, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList72);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair75 = unionType69.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType74);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = unionType57.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType74);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList79 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList79, jSTypeArray78);
        com.google.javascript.rhino.jstype.UnionType unionType81 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry77, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList79);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList84 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList84, jSTypeArray83);
        com.google.javascript.rhino.jstype.UnionType unionType86 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry82, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList84);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair87 = unionType81.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unionType86);
        com.google.javascript.rhino.jstype.EnumType enumType88 = unionType81.toMaybeEnumType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = unionType57.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType81);
        java.lang.String str90 = unionType57.toDebugHashCodeString();
        java.lang.String str91 = unionType57.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] { unionType46, unionType57 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList93 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList93, jSTypeArray92);
        com.google.javascript.rhino.jstype.UnionType unionType95 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry41, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        com.google.javascript.rhino.jstype.UnionType unionType96 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry40, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList93);
        unionType16.alternates = jSTypeList93;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on unionType16 and unionType95", unionType16.equals(unionType95) ? unionType16.hashCode() == unionType95.hashCode() : true);
    }
}

