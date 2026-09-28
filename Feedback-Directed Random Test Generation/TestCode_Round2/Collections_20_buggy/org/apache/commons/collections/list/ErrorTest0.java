package org.apache.commons.collections.list;

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
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strItor5.previous();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        int int8 = strItor5.previousIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strItor5.previous();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        boolean boolean6 = strItor5.hasNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strItor5.previous();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasPrevious();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strItor5.previous();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int21 = strList16.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean30 = strList16.contains((java.lang.Object) int29);
        java.lang.String str31 = strList16.toString();
        strList16.clear();
        boolean boolean33 = strList11.addAll((java.util.Collection<java.lang.String>) strList16);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) (short) -1);
        boolean boolean36 = strItor35.hasPrevious();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = strItor35.next();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex;
        int int7 = strItor5.previousIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strItor5.previous();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode21 = strAVLNode19.remove((-2));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode19.remove(10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.previousIndex();
        int int9 = strItor5.nextIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strItor5.previous();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasNext();
        int int9 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = strItor5.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strItor5.previous();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        strAVLNode19.setValue("[]");
        java.lang.String str25 = strAVLNode19.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode19.remove((int) '#');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        strAVLNode19.setValue("[]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strAVLNode19.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on strList2 and strList2", strList2.equals(strList2) ? strList2.hashCode() == strList2.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode19.remove(3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.expectedModCount;
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = strItor5.current;
        int int11 = strItor5.nextIndex();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor17 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) '4');
        int int19 = strList14.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        boolean boolean25 = strList14.containsAll((java.util.Collection<java.lang.String>) strList23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) (byte) 1);
        java.lang.String str28 = strItor27.previous();
        strItor27.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode31 = strItor27.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strAVLNode31.insert((int) (byte) 0, "hi!");
        java.lang.String str35 = strAVLNode34.getValue();
        java.lang.String str36 = strAVLNode34.getValue();
        java.lang.String str37 = strAVLNode34.toString();
        strItor5.next = strAVLNode34;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode34.insert((-2), "AVLNode(1,true,hi!,false, faedelung true )");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strList2 and strList14.", strList2.equals(strList14) == strList14.equals(strList2));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        int int10 = strItor5.nextIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strItor5.previous();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode22.getValue();
        java.lang.String str24 = strAVLNode22.getValue();
        java.lang.String str25 = strAVLNode22.toString();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode28 = strAVLNode22.insert((int) (short) 1, "[]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on strList2 and strList2", strList2.equals(strList2) ? strList2.hashCode() == strList2.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        boolean boolean11 = strItor5.hasNext();
        strItor5.currentIndex = 52;
        boolean boolean14 = strItor5.hasNext();
        int int15 = strItor5.expectedModCount;
        boolean boolean16 = strItor5.hasPrevious();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList19.containsAll((java.util.Collection<java.lang.String>) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) (byte) 1);
        java.lang.String str33 = strItor32.previous();
        strItor32.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strItor32.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode39 = strAVLNode36.insert((int) (byte) 0, "hi!");
        java.lang.String str40 = strAVLNode39.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode39.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode39.insert(100, "[, hi!]");
        strItor5.current = strAVLNode39;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode39.remove(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode49 = strAVLNode39.remove(35);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.current;
        boolean boolean10 = strItor5.hasPrevious();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strItor5.previous();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        strAVLNode19.setValue("[]");
        java.lang.String str25 = strAVLNode19.toString();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode19.get((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = strAVLNode19.remove(34);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strItor5.previous();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode22.get(34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strAVLNode22.remove(10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        boolean boolean8 = strItor5.hasPrevious();
        boolean boolean9 = strItor5.hasNext();
        boolean boolean10 = strItor5.hasPrevious();
        strItor5.currentIndex = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strItor5.next();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode22.getValue();
        java.lang.String str24 = strAVLNode22.getValue();
        java.lang.String str25 = strAVLNode22.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode22.remove((int) (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList2.spliterator();
        java.lang.String str15 = strList2.toString();
        boolean boolean17 = strList2.add("[]");
        java.util.stream.Stream<java.lang.String> strStream18 = strList2.stream();
        boolean boolean20 = strList2.add("[hi!]");
        boolean boolean21 = strList2.isEmpty();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor23 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strItor23.current;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strItor23.previous();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList0 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList3 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor6 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList3, (int) '4');
        java.lang.Object obj7 = new java.lang.Object();
        int int8 = strList3.indexOf(obj7);
        int int9 = strList3.size();
        boolean boolean10 = strList0.contains((java.lang.Object) int9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor16 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) '4');
        strItor16.checkModCount();
        boolean boolean18 = strList0.equals((java.lang.Object) strItor16);
        strItor16.currentIndex = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strItor16.previous();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = 0;
        java.lang.String str18 = strItor15.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode21 = strAVLNode19.remove((int) (short) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        strItor5.expectedModCount = (short) -1;
        strItor5.nextIndex = (short) 0;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList18.containsAll((java.util.Collection<java.lang.String>) strList27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) (byte) 1);
        java.lang.String str32 = strItor31.previous();
        strItor31.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor31.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.insert((int) (byte) 0, "hi!");
        strAVLNode35.setValue("[]");
        strItor5.next = strAVLNode35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode35.remove((int) (short) 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList2.spliterator();
        java.lang.String str15 = strList2.toString();
        boolean boolean17 = strList2.add("[]");
        java.util.stream.Stream<java.lang.String> strStream18 = strList2.stream();
        boolean boolean19 = strList2.isEmpty();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList28, (int) '4');
        int int33 = strList28.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int41 = strList36.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean42 = strList28.contains((java.lang.Object) int41);
        java.lang.String str43 = strList28.toString();
        boolean boolean44 = strList22.containsAll((java.util.Collection<java.lang.String>) strList28);
        int int45 = strList28.size();
        java.util.stream.Stream<java.lang.String> strStream46 = strList28.parallelStream();
        boolean boolean47 = strList2.remove((java.lang.Object) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode50 = strItor49.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strItor49.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = strItor49.previous();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        strItor5.nextIndex = (short) -1;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor17 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) '4');
        int int19 = strList14.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        boolean boolean25 = strList14.containsAll((java.util.Collection<java.lang.String>) strList23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) (byte) 1);
        java.lang.String str28 = strItor27.previous();
        strItor27.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode31 = strItor27.current;
        strItor5.next = strAVLNode31;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strAVLNode31.remove(97);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strItor5.previous();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strAVLNode22.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strAVLNode22.insert((int) (short) 0, "AVLNode(1,true,hi!,false, faedelung true )");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on strList2 and strList2", strList2.equals(strList2) ? strList2.hashCode() == strList2.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        boolean boolean10 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        int int12 = strItor5.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode13 = strItor5.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strItor5.previous();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList2.spliterator();
        java.lang.String str15 = strList2.toString();
        boolean boolean17 = strList2.add("[]");
        java.util.stream.Stream<java.lang.String> strStream18 = strList2.stream();
        boolean boolean19 = strList2.isEmpty();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList28, (int) '4');
        int int33 = strList28.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int41 = strList36.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean42 = strList28.contains((java.lang.Object) int41);
        java.lang.String str43 = strList28.toString();
        boolean boolean44 = strList22.containsAll((java.util.Collection<java.lang.String>) strList28);
        int int45 = strList28.size();
        java.util.stream.Stream<java.lang.String> strStream46 = strList28.parallelStream();
        boolean boolean47 = strList2.remove((java.lang.Object) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = strItor49.previous();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList0 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList3 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor6 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList3, (int) '4');
        java.lang.Object obj7 = new java.lang.Object();
        int int8 = strList3.indexOf(obj7);
        int int9 = strList3.size();
        boolean boolean10 = strList0.contains((java.lang.Object) int9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor16 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) '4');
        strItor16.checkModCount();
        boolean boolean18 = strList0.equals((java.lang.Object) strItor16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = strList21.containsAll((java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) (byte) 1);
        java.lang.String str35 = strItor34.previous();
        strItor34.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strItor34.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode38.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode41.remove((int) (byte) 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList52 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor55 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList52, (int) '4');
        int int57 = strList52.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList60 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor63 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) '4');
        int int65 = strList60.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean66 = strList52.contains((java.lang.Object) int65);
        java.lang.String str67 = strList52.toString();
        boolean boolean68 = strList46.containsAll((java.util.Collection<java.lang.String>) strList52);
        java.util.stream.Stream<java.lang.String> strStream69 = strList52.parallelStream();
        int int71 = strAVLNode41.indexOf((java.lang.Object) strStream69, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode72 = strAVLNode41.previous();
        strItor16.next = strAVLNode41;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = strItor16.previous();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        int int10 = strItor5.expectedModCount;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor16 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) '4');
        int int18 = strList13.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor26 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) (byte) 1);
        java.lang.String str27 = strItor26.previous();
        strItor26.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode30 = strItor26.current;
        strItor5.current = strAVLNode30;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode33 = strAVLNode30.remove((-1));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strAVLNode19.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode23.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strAVLNode24.previous();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode25.remove((int) (short) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strList3.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = strList14.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList19);
        java.lang.String str22 = strList19.toString();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        java.lang.Object obj30 = new java.lang.Object();
        int int31 = strList26.indexOf(obj30);
        boolean boolean32 = strList19.addAll((int) (short) 1, (java.util.Collection<java.lang.String>) strList26);
        boolean boolean33 = strList8.equals((java.lang.Object) strList26);
        java.util.stream.Stream<java.lang.String> strStream34 = strList8.parallelStream();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList37 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList37, (int) '4');
        int int42 = strList37.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = strList37.containsAll((java.util.Collection<java.lang.String>) strList46);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor50 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList37, (int) (byte) 1);
        java.lang.String str51 = strItor50.previous();
        strItor50.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strItor50.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode57 = strAVLNode54.insert((int) (byte) 0, "hi!");
        java.lang.String str58 = strAVLNode57.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode59 = strAVLNode57.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode62 = strAVLNode57.insert(100, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode63 = strAVLNode57.next();
        int int64 = strList8.lastIndexOf((java.lang.Object) strAVLNode57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode66 = strAVLNode57.remove((int) (short) 100);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = (byte) 0;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = strItor15.parent;
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = strList21.containsAll((java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) (byte) 1);
        java.lang.String str35 = strItor34.previous();
        boolean boolean36 = strItor34.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strItor34.current;
        strItor15.next = strAVLNode37;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode37.insert(3, "AVLNode(0,false,,false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = strAVLNode41.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode45 = strAVLNode41.insert(51, "");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strList2 and strList21.", strList2.equals(strList21) == strList21.equals(strList2));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = (byte) 0;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        java.lang.Object obj25 = new java.lang.Object();
        int int26 = strList21.indexOf(obj25);
        int int27 = strList21.size();
        boolean boolean28 = strList18.contains((java.lang.Object) int27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) '4');
        strItor34.checkModCount();
        boolean boolean36 = strList18.equals((java.lang.Object) strItor34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor42 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) '4');
        int int44 = strList39.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = strList39.containsAll((java.util.Collection<java.lang.String>) strList48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) (byte) 1);
        java.lang.String str53 = strItor52.previous();
        strItor52.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strItor52.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode59 = strAVLNode56.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = strAVLNode59.remove((int) (byte) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList64 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor67 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList64, (int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList70 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor73 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList70, (int) '4');
        int int75 = strList70.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList78 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor81 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList78, (int) '4');
        int int83 = strList78.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean84 = strList70.contains((java.lang.Object) int83);
        java.lang.String str85 = strList70.toString();
        boolean boolean86 = strList64.containsAll((java.util.Collection<java.lang.String>) strList70);
        java.util.stream.Stream<java.lang.String> strStream87 = strList70.parallelStream();
        int int89 = strAVLNode59.indexOf((java.lang.Object) strStream87, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode90 = strAVLNode59.previous();
        strItor34.next = strAVLNode59;
        strItor15.next = strAVLNode59;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode95 = strAVLNode59.insert(10, "[, ]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode98 = strAVLNode95.insert((int) (byte) 10, "AVLNode(0,false,hi!,false, faedelung true )");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strList2 and strList39.", strList2.equals(strList39) == strList39.equals(strList2));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        boolean boolean14 = strList2.retainAll((java.util.Collection<java.lang.String>) strList10);
        boolean boolean15 = strList2.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator16 = strList2.spliterator();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList17 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList2);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, 52);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList20 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, 51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strItor22.previous();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode22.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strAVLNode22.remove((int) (byte) -1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode19.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strAVLNode19.remove((int) '4');
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode22.remove((int) (byte) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList27 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList27, (int) '4');
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList33 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor36 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) '4');
        int int38 = strList33.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList41 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor44 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList41, (int) '4');
        int int46 = strList41.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean47 = strList33.contains((java.lang.Object) int46);
        java.lang.String str48 = strList33.toString();
        boolean boolean49 = strList27.containsAll((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream50 = strList33.parallelStream();
        int int52 = strAVLNode22.indexOf((java.lang.Object) strStream50, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strAVLNode22.get(0);
        strAVLNode22.setValue("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode58 = strAVLNode22.remove(52);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode22.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode22.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode22.insert(100, "[, hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = strAVLNode27.remove(10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        boolean boolean14 = strList2.retainAll((java.util.Collection<java.lang.String>) strList10);
        strList10.clear();
        java.util.ListIterator<java.lang.String> strItor16 = strList10.listIterator();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        java.lang.Object obj23 = new java.lang.Object();
        int int24 = strList19.indexOf(obj23);
        boolean boolean25 = strList10.removeAll((java.util.Collection<java.lang.String>) strList19);
        boolean boolean26 = strList19.isEmpty();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, 51);
        boolean boolean29 = strItor28.hasNext();
        int int30 = strItor28.currentIndex;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = strItor28.previous();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        boolean boolean11 = strItor5.hasNext();
        strItor5.currentIndex = 52;
        boolean boolean14 = strItor5.hasNext();
        int int15 = strItor5.expectedModCount;
        boolean boolean16 = strItor5.hasPrevious();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList19.containsAll((java.util.Collection<java.lang.String>) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) (byte) 1);
        java.lang.String str33 = strItor32.previous();
        strItor32.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strItor32.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode39 = strAVLNode36.insert((int) (byte) 0, "hi!");
        java.lang.String str40 = strAVLNode39.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode39.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode39.insert(100, "[, hi!]");
        strItor5.current = strAVLNode39;
        java.lang.String str46 = strAVLNode39.getValue();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList49 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList49, (int) '4');
        int int54 = strList49.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList57, (int) '4');
        boolean boolean61 = strList49.retainAll((java.util.Collection<java.lang.String>) strList57);
        strList57.clear();
        boolean boolean63 = strList57.isEmpty();
        java.util.Iterator<java.lang.String> strItor64 = strList57.iterator();
        java.util.ListIterator<java.lang.String> strItor65 = strList57.listIterator();
        java.lang.Class<?> wildcardClass66 = strItor65.getClass();
        int int68 = strAVLNode39.indexOf((java.lang.Object) wildcardClass66, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode70 = strAVLNode39.remove((-2));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor11 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList8, (int) '4');
        int int12 = strItor11.nextIndex();
        strItor11.nextIndex = '#';
        int int15 = strItor11.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = strItor11.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = strItor11.next;
        strItor11.expectedModCount = (short) -1;
        strItor11.nextIndex = (short) 0;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = strList24.containsAll((java.util.Collection<java.lang.String>) strList33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) (byte) 1);
        java.lang.String str38 = strItor37.previous();
        strItor37.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strItor37.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode41.insert((int) (byte) 0, "hi!");
        strAVLNode41.setValue("[]");
        strItor11.next = strAVLNode41;
        java.lang.String str48 = strAVLNode41.toString();
        strItor5.current = strAVLNode41;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strAVLNode41.remove(51);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode19.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strAVLNode19.remove((int) (short) -1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        strItor5.expectedModCount = (short) -1;
        strItor5.nextIndex = (short) 0;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList18.containsAll((java.util.Collection<java.lang.String>) strList27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) (byte) 1);
        java.lang.String str32 = strItor31.previous();
        strItor31.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor31.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.insert((int) (byte) 0, "hi!");
        strAVLNode35.setValue("[]");
        strItor5.next = strAVLNode35;
        strAVLNode35.setValue("[hi!]");
        java.lang.String str44 = strAVLNode35.toString();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode46 = strAVLNode35.get((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode48 = strAVLNode35.remove((int) (byte) 10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        boolean boolean11 = strItor5.hasNext();
        strItor5.currentIndex = 52;
        boolean boolean14 = strItor5.hasNext();
        int int15 = strItor5.expectedModCount;
        boolean boolean16 = strItor5.hasPrevious();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList19.containsAll((java.util.Collection<java.lang.String>) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) (byte) 1);
        java.lang.String str33 = strItor32.previous();
        strItor32.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strItor32.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode39 = strAVLNode36.insert((int) (byte) 0, "hi!");
        java.lang.String str40 = strAVLNode39.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode39.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode39.insert(100, "[, hi!]");
        strItor5.current = strAVLNode39;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode39.get((int) (short) 100);
        strAVLNode39.setValue("AVLNode(1,true,hi!,false, faedelung true )");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strAVLNode39.remove((int) '#');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        boolean boolean11 = strItor5.hasNext();
        strItor5.currentIndex = 52;
        boolean boolean14 = strItor5.hasNext();
        int int15 = strItor5.expectedModCount;
        boolean boolean16 = strItor5.hasPrevious();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList19.containsAll((java.util.Collection<java.lang.String>) strList28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) (byte) 1);
        java.lang.String str33 = strItor32.previous();
        strItor32.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strItor32.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode39 = strAVLNode36.insert((int) (byte) 0, "hi!");
        java.lang.String str40 = strAVLNode39.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode39.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode39.insert(100, "[, hi!]");
        strItor5.current = strAVLNode39;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode39.remove(1);
        java.lang.String str48 = strAVLNode39.toString();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strAVLNode39.insert((int) (short) 1, "AVLNode(0,false,AVLNode(0,false,,false, faedelung true ),false, faedelung true )");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strList2 and strList19.", strList2.equals(strList19) == strList19.equals(strList2));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        java.lang.String str23 = strAVLNode22.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strAVLNode22.insert((int) (short) 100, "AVLNode(0,false,,false, faedelung true )");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode28 = strAVLNode22.remove((int) (byte) 100);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = (byte) 0;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = strItor15.parent;
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = strList21.containsAll((java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) (byte) 1);
        java.lang.String str35 = strItor34.previous();
        boolean boolean36 = strItor34.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strItor34.current;
        strItor15.next = strAVLNode37;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode37.insert(3, "AVLNode(0,false,,false, faedelung true )");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode37.remove((int) (short) 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.expectedModCount;
        strItor5.checkModCount();
        strItor5.nextIndex = (byte) 10;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = strItor5.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode13 = strItor5.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strItor5.previous();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        strItor5.expectedModCount = (short) -1;
        strItor5.nextIndex = (short) 0;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList18.containsAll((java.util.Collection<java.lang.String>) strList27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) (byte) 1);
        java.lang.String str32 = strItor31.previous();
        strItor31.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor31.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.insert((int) (byte) 0, "hi!");
        strAVLNode35.setValue("[]");
        strItor5.next = strAVLNode35;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = strItor5.next;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode42.remove(4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        java.lang.String str16 = strItor15.previous();
        strItor15.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strAVLNode19.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode24 = strAVLNode22.remove((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strAVLNode24.remove((int) (short) 10);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        strItor5.expectedModCount = (short) -1;
        strItor5.nextIndex = (short) 0;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList18.containsAll((java.util.Collection<java.lang.String>) strList27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) (byte) 1);
        java.lang.String str32 = strItor31.previous();
        strItor31.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor31.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.insert((int) (byte) 0, "hi!");
        strAVLNode35.setValue("[]");
        strItor5.next = strAVLNode35;
        strAVLNode35.setValue("[hi!]");
        strAVLNode35.setValue("");
        strAVLNode35.setValue("[, [, [, hi!]]]");
        java.lang.String str48 = strAVLNode35.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode50 = strAVLNode35.remove(97);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = (byte) 0;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        java.lang.Object obj25 = new java.lang.Object();
        int int26 = strList21.indexOf(obj25);
        int int27 = strList21.size();
        boolean boolean28 = strList18.contains((java.lang.Object) int27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) '4');
        strItor34.checkModCount();
        boolean boolean36 = strList18.equals((java.lang.Object) strItor34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor42 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) '4');
        int int44 = strList39.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = strList39.containsAll((java.util.Collection<java.lang.String>) strList48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) (byte) 1);
        java.lang.String str53 = strItor52.previous();
        strItor52.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strItor52.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode59 = strAVLNode56.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = strAVLNode59.remove((int) (byte) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList64 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor67 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList64, (int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList70 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor73 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList70, (int) '4');
        int int75 = strList70.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList78 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor81 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList78, (int) '4');
        int int83 = strList78.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean84 = strList70.contains((java.lang.Object) int83);
        java.lang.String str85 = strList70.toString();
        boolean boolean86 = strList64.containsAll((java.util.Collection<java.lang.String>) strList70);
        java.util.stream.Stream<java.lang.String> strStream87 = strList70.parallelStream();
        int int89 = strAVLNode59.indexOf((java.lang.Object) strStream87, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode90 = strAVLNode59.previous();
        strItor34.next = strAVLNode59;
        strItor15.next = strAVLNode59;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode95 = strAVLNode59.insert(10, "[, ]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode96 = strAVLNode59.next();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode98 = strAVLNode96.remove((int) (byte) 100);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        int int11 = strItor5.nextIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strItor5.previous();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.Object obj6 = new java.lang.Object();
        int int7 = strList2.indexOf(obj6);
        int int8 = strList2.size();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList11 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor14 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList11, (int) '4');
        int int15 = strItor14.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode16 = strItor14.current;
        strItor14.checkModCount();
        int int18 = strList2.indexOf((java.lang.Object) strItor14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strItor14.previous();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        strItor5.expectedModCount = (short) -1;
        strItor5.nextIndex = (short) 0;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList18.containsAll((java.util.Collection<java.lang.String>) strList27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) (byte) 1);
        java.lang.String str32 = strItor31.previous();
        strItor31.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor31.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.insert((int) (byte) 0, "hi!");
        strAVLNode35.setValue("[]");
        strItor5.next = strAVLNode35;
        strAVLNode35.setValue("[hi!]");
        strAVLNode35.setValue("");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode35.get((int) (byte) 100);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode50 = strAVLNode35.insert(100, "AVLNode(0,false,,true, faedelung false )");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode52 = strAVLNode35.remove(34);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = strList2.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 1);
        strItor15.currentIndex = (byte) 0;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = strItor15.parent;
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = strList21.containsAll((java.util.Collection<java.lang.String>) strList30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) (byte) 1);
        java.lang.String str35 = strItor34.previous();
        boolean boolean36 = strItor34.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strItor34.current;
        strItor15.next = strAVLNode37;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode37.insert(3, "AVLNode(0,false,,false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = strAVLNode41.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode41.get((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode46 = strAVLNode41.remove((-1));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        int int10 = strItor5.expectedModCount;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor16 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) '4');
        int int18 = strList13.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor26 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) (byte) 1);
        java.lang.String str27 = strItor26.previous();
        strItor26.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode30 = strItor26.current;
        strItor5.current = strAVLNode30;
        strAVLNode30.setValue("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strAVLNode30.insert(3, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode30.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = strAVLNode30.insert(10, "[, ]");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strList2 and strList13.", strList2.equals(strList13) == strList13.equals(strList2));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.previousIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strItor5.previous();
    }
}

